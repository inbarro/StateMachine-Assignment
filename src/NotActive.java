public class NotActive implements PostsState {

    public NotActive(){
        printState();
    }

    @Override
    public void post(String text) {
        Student.posts++;
        if(Student.posts == 2)
            Student.PostsState = new Active();

    }

    @Override
    public void next_week() {
        Student.posts = 0;
    }

    @Override
    public void printState() {
        System.out.println("Welcome to NotActive State");
    }
}
