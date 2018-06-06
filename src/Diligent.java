public class Diligent implements ArticleState {

    public Diligent()
    {
        printState();
    }

    @Override
    public void read(Student Student) {
        Student.articles++;

        if(Student.articles>7)
            Student.ArticleState = new Researcher();
        else
            Student.ArticleState = new Diligent();

    }

    @Override
    public void next_week(Student Student) {

    }

    @Override
    public void printState() {
        System.out.println("Welcome to Diligent state");


    }

    @Override
    public String statusArt(String text) {
        return '*' + text + '*';
    }
}
