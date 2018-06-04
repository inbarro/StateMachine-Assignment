public class Diligent implements ArticleState {

    public Diligent()
    {
        printState();
    }

    @Override
    public void read() {
        Student.articles++;
        if(Student.articles>7)
            Student.ArticleState = new Researcher();

    }

    @Override
    public void next_week() {

    }

    @Override
    public void printState() {
        System.out.println("Welcome to Diligent state");


    }

    @Override
    public String status(String text) {
        return '*' + text + '*';
    }
}
