public class Normal implements ArticleState {

    public Normal(){
        printState();
    }


    @Override
    public void read() {
        Student.articles++;
        if(Student.articles>2)
            Student.ArticleState = new Diligent();

    }

    @Override
    public void next_week() {

    }

    @Override
    public void printState() {
        System.out.println("Welcome to Normal state");
    }

    @Override
    public String status(String text) {
        return text;
    }


}
