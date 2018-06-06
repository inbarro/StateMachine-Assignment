public class questionnaireNotAvailable implements QuestionnaireState {

    public questionnaireNotAvailable(){
        printState();
    }

    @Override
    public void next_week(Student Student) {
        if(Student.questionnaireNum<12)
            Student.questionnaireNum++;
        Student.QuestionnaireState = new questionnaireAvailable();


    }

    @Override
    public void printState() {
        System.out.println("Welcome to questionnaireNotAvailable state");
    }

    @Override
    public void answer(Student Student) {

    }
}
