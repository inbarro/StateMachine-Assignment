public class Researcher implements ArticleState {

    public Researcher(){
        printState();
    }

    @Override
    public void read() {
        Student.articles++;
    }

    @Override
    public void next_week() {

    }

    @Override
    public void printState() {
        System.out.println("Welcome to Researcher state");


    }
}
