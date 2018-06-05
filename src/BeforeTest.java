public class BeforeTest implements TestState {
    public BeforeTest(){
        printState();
    }

    @Override
    public void exam(int score,Student Student) {
        if(Student.articles>0){
            if(score>89)
                Student.TestState = new Excellent();
            if(score>56 && score<90)
                Student.TestState = new Passed();
            if(score<57)
                Student.TestState = new Failed();
        }

    }

    @Override
    public void next_week(Student Student) {

    }

    @Override
    public void printState() {
        System.out.println("Welcome to BeforeTest State");

    }

    @Override
    public String status(String text) {
        return text;
    }
}
