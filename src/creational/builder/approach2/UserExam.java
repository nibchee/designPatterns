package creational.builder.approach2;

import java.security.InvalidParameterException;

public class UserExam {
    private int englishMarks;
    private int mathMarks;
    private int scienceMarks;
    private String name;

    private UserExam() {

    }

    public static UserExamBuilder getBuilder() {
        return new UserExamBuilder();
    }

    static class UserExamBuilder {
        //Setting defualt values
        public int englishMarks = 10;
        public int mathMarks = 12;
        public int scienceMarks = 35;
        public String name = "Default Name";

        public int getEnglishMarks() {
            return englishMarks;
        }

        public UserExamBuilder setEnglishMarks(int englishMarks) {
            this.englishMarks = englishMarks;
            return this;
        }

        public int getMathMarks() {
            return mathMarks;
        }

        public UserExamBuilder setMathMarks(int mathMarks) {
            this.mathMarks = mathMarks;
            return this;
        }

        public int getScienceMarks() {
            return scienceMarks;
        }

        public UserExamBuilder setScienceMarks(int scienceMarks) {
            this.scienceMarks = scienceMarks;
            return this;
        }

        public String getName() {
            return name;
        }

        public UserExamBuilder setName(String name) {
            this.name = name;
            return this;

        }

        public UserExam build() {
            //Step1. Validate the attributes
            if (englishMarks > 100 || scienceMarks > 100 ||
                    mathMarks > 100) {
                throw new InvalidParameterException("Marks cannot be greater than 100");
            }

            //cross validations
            if (mathMarks + englishMarks > 150) {
                throw new InvalidParameterException("Maths + English can't be greater than 150");
            }

            if (name.startsWith("0")) {
                throw new InvalidParameterException("Name can't start with zero");
            }

            //Step2. Create Parent
            UserExam userExam = new UserExam();
            userExam.englishMarks = englishMarks;
            userExam.mathMarks = this.mathMarks;
            userExam.scienceMarks = this.scienceMarks;
            userExam.name = this.name;
            return userExam;
        }
    }
}

/*
A static class only means that you can access this class
without creating an object of User Exam
 */