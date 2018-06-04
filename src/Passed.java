public class Passed implements TestState {
    public Passed(){
        printState();
    }
    @Override
    public void exam(int score) {

    }

    @Override
    public void next_week() {

    }

    @Override
    public void printState() {
        System.out.println("Welcome to Passed State ");

    }
}
