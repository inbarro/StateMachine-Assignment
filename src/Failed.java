public class Failed implements TestState {
    public Failed(){
        printState();
    }

    @Override
    public void exam(int score,Student Student) {

    }

    @Override
    public void next_week(Student Student) {

    }

    @Override
    public void printState() {
        System.out.println("Welcome to Failed State");

    }

    @Override
    public String statusTest(String text) {
        return text;
    }
}
