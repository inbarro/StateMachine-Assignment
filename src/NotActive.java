public class NotActive implements PostsState {

    public NotActive(){
        printState();
    }

    @Override
    public void post(Student Student) {
        Student.posts++;
        if(Student.posts == 2)
            Student.PostsState = new Active();

    }

    @Override
    public void next_week(Student Student) {
        Student.posts = 0;
    }

    @Override
    public void printState() {
        System.out.println("Welcome to NotActive State");
    }

    @Override
    public String status(String text) {
        return text;
    }
}
