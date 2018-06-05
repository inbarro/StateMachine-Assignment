public class Excellent implements TestState {
    public Excellent(){
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
        System.out.println("Welcome To Excellent State");

    }

    @Override
    public String status(String text) {
        return "^^^" + text+ "^^^";
    }
}
