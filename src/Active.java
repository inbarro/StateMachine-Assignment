public class Active implements PostsState {

    public Active(){
        printState();
    }
    @Override
    public void post(Student Student) {
        Student.posts++;
    }

    @Override
    public void next_week(Student Student) {
        Student.posts = 0;
        Student.PostsState = new NotActive();
    }

    @Override
    public void printState() {
        System.out.println("Welcome to Active State");

    }

    @Override
    public String status(String text) {
        return text + "(active)";
    }
}
