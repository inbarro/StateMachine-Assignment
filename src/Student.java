public class Student {
    static QuestionnaireState QuestionnaireState;
    static PostsState PostsState;
    static ArticleState ArticleState;
    static TestState TestState;
    static int questionnaireNum,posts,Points,articles;

    public Student()
    {
        questionnaireNum = 0;
        posts = 0;
        Points = 0;
        articles = 0;
        QuestionnaireState = new questionnaireAvailable();
        ArticleState = new Normal();
        PostsState = new NotActive();
    }
    public void exam(int score){
        TestState.exam(score);
    }

    public void read(){
        ArticleState.read();
    }

    public void post(String text){
        PostsState.post(text);
    }

    public void answer(){
        QuestionnaireState.answer();
    }

    public void next_week(){
        //this.status();

    }

    public void status(String text){

    }






}