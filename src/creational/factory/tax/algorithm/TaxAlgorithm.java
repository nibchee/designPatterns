package creational.factory.tax.algorithm;

import creational.factory.tax.SalaryDetails;

//Step-1 Create Interface
public interface TaxAlgorithm {
Double calculateTax(SalaryDetails details);
}

