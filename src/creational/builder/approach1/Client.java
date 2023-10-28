package creational.builder.approach1;

public class Client {
    public static void main(String[] args) {
        UserExamParameters parameters = new UserExamParameters();
        parameters.englishMarks = 20;
        parameters.name = "Nirbhay";

        try {
            UserExam userExam = new UserExam(parameters);
        } catch (Exception exception) {
            System.out.println("Some parameters are wrong.");
        }
//        UserExam userExam1=new UserExam();
//        userExam1.setName("Rohan");

    }
}
