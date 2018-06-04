public class Failed implements TestState {
    public Failed(){
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
        System.out.println("Welcome to Failed State");

    }
}
