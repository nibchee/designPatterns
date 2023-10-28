package creational.builder.approach2;

public class Client {
    public static void main(String[] args) {
        UserExam userExam;
        try {
            UserExam.UserExamBuilder userExamBuilder = UserExam.getBuilder();
            userExamBuilder.setName("Nirbhay");
            userExamBuilder.setEnglishMarks(20);
            userExamBuilder.setMathMarks(40);

            userExam = userExamBuilder.build();

            //Method Chaining
            /*
           UserExam userExam= UserExam.getBuilder()
            .setEnglishMarks(12)
            .setMathMarks(12)
             */
            UserExam userExam1 = UserExam.getBuilder()
                    .setEnglishMarks(10)
                    .setScienceMarks(20)
                    .setName("Nirbhya2")
                    .build();


        } catch (Exception exception) {
            System.out.println("Some parameters are wrong");
        }

    }
}
