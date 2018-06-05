public class Passed implements TestState {
    public Passed(){
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
        System.out.println("Welcome to Passed State ");

    }

    @Override
    public String status(String text) {
        return text + "(-:";
    }
}
