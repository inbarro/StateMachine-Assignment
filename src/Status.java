public class Status {

    public Status()
    {

    }

    public void status(String text,Student Student)
    {
        String status = text;
        status = Student.ArticleState.statusArt(text);
        status = Student.PostsState.StatusPost(status);
        status = Student.TestState.statusTest(status);
        System.out.println(status);
    }

}
