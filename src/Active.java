public class Active implements PostsState {

    public Active(){
        printState();
    }
    @Override
    public void post(String text) {
        Student.posts++;
    }

    @Override
    public void next_week() {
        Student.posts = 0;
        Student.PostsState = new NotActive();
    }

    @Override
    public void printState() {
        System.out.println("Welcome to Active State");

    }
}
