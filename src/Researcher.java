public class Researcher implements ArticleState {

    public Researcher(){
        printState();
    }

    @Override
    public void read(Student Student) {
        Student.articles++;
    }

    @Override
    public void next_week(Student Student) {

    }

    @Override
    public void printState() {
        System.out.println("Welcome to Researcher state");
    }

    @Override
    public String status(String text) {
        return "**" + text + "**";
    }
}
