public class Student {
     QuestionnaireState QuestionnaireState;
     PostsState PostsState;
     ArticleState ArticleState;
     TestState TestState;
     int questionnaireNum,posts,Points,articles;

    public Student()
    {
        questionnaireNum = 0;
        posts = 0;
        Points = 0;
        articles = 0;
        QuestionnaireState = new questionnaireAvailable();
        ArticleState = new Normal();
        PostsState = new NotActive();
        TestState = new BeforeTest();
    }
    public void exam(int score){
        TestState.exam(score,this);
    }

    public void read(){
        ArticleState.read(this);
    }

    public void post(){
        PostsState.post(this);
    }

    public void answer(){
        QuestionnaireState.answer(this);
    }

    public void next_week(){
        QuestionnaireState.next_week(this);
        PostsState.next_week(this);
        ArticleState.next_week(this);
        TestState.next_week(this);
    }

    public void status(String text){
        String status = text;
        status = ArticleState.status(text);
        status = PostsState.status(status);
        status = TestState.status(status);

        System.out.println(status);


    }






}
