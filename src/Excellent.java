public class Excellent implements TestState {
    public Excellent(){
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
        System.out.println("Welcome To Excellent State");

    }
}
