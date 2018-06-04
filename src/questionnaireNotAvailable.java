public class questionnaireNotAvailable implements QuestionnaireState {

    public questionnaireNotAvailable(){
        printState();
    }

    @Override
    public void next_week() {
        if(Student.questionnaireNum<12)
            Student.questionnaireNum++;
        Student.QuestionnaireState = new questionnaireAvailable();


    }

    @Override
    public void printState() {
        System.out.println("Welcome to questionnaireNotAvailable state");
    }

    @Override
    public String status(String text) {
        return null;
    }

    @Override
    public void answer() {

    }
}
