public class questionnaireAvailable implements QuestionnaireState {


    public questionnaireAvailable(){
        printState();
    }

    @Override
    public void next_week(Student Student) {
        if(Student.questionnaireNum<12)
            Student.questionnaireNum++;

    }

    @Override
    public void printState() {
        System.out.println("Welcome to questionnaireAvailable state");
    }

    @Override
    public String status(String text) {
        return null;
    }

    @Override
    public void answer(Student Student) {
        Student.Points++;
        Student.QuestionnaireState = new questionnaireNotAvailable();

    }
}
