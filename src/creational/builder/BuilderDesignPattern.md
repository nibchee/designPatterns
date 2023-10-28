![](https://miro.medium.com/v2/resize:fit:600/0*goKNd3fBuTXe4Lpe.png)

## When To Use Builder Design Pattern

* When there are enormous number of attributes
* When we want some validations on parameters before creation of object
* When class is immutable

## Basic Template of Builder Design Pattern

```
class Target{
 DataType attribute1;
 DataType attribute2;
 .
 .
 .
 DataType attributeN;
 
 //private constructor so no other class can create object directly
 private Target(){}
 
 public static Builder getBuilder(){
 return new Builder();
 }
 
 public static class Builder{
 DataType attribute1;
 DataType attribute2;
 .
 .
 .
 DataType attributeN;
 
 public Builder setAttribute1(DataType attribute1){
  this.attribute1=attribute1;
  return this;
 }
 .
 .
 .
 public Builder setAttributeN(DataType attributeN){
  this.attributeN=attributeN;
  return this;
 }
 
 public DataType getAttribute1(){
 return this.attribute1;
 }
 .
 .
 .
 public DataType getAttributeN(){
 return this.attributeN;
 }
 
 public Target build(){
 //apply validations here
 ...
 Target t=new Target();
 //coping values
 t.attribute1=this.attribute1;
 .
 .
 .
 t.attributeN=this.attributeN;
 
 return t;
 }
 }
 
}
```

### Key Points to Keep In Mind

1. Target Constructor is private so can't be directly accessed.
2. getBuilder() is made static as object can't be created so called directly with class
3. All the setters methods Return Types are of Builder , to create objects using method chaining
   for eg:

  ```
Target t=Target.getBuilder()
         .setAttribute1(a1)
         .
         .
         .
         .setAttributeN(aN)
         .build();
 ```

4.build() method return Type is of Target.
