public class questionnaireAvailable implements QuestionnaireState {


    public questionnaireAvailable(){
        printState();
    }

    @Override
    public void next_week(Student Student) {
        if(Student.questionnaireNum<12) {
            Student.QuestionnaireState = new questionnaireAvailable();
        }

        if(Student.questionnaireNum==12)
        {
            Student.QuestionnaireState = new questionnaireNotAvailable();
        }

        Student.questionnaireNum++;


    }

    @Override
    public void printState() {
        System.out.println("Welcome to questionnaireAvailable state");
    }

        @Override
    public void answer(Student Student) {
        Student.Points++;
        Student.QuestionnaireState = new questionnaireNotAvailable();

    }
}
