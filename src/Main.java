import java.util.Scanner;


public class Main {


    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        boolean ValidSynax;
        Student student = new Student();
        while(true)
        {
            ValidSynax = false;
            String event = scan.nextLine();
            if(event.contains("/exam")) {
                String[] splitted = event.split(" ");
                if(splitted.length!=2) {
                    System.out.println("Bad Syntax - please use /exam <<grade>>");
                    ValidSynax = true;
                }
                else {
                    student.exam(Integer.parseInt(event.split(" ")[1]));
                    ValidSynax = true;
                }
            }
            if(event.equals("/read")) {
                student.read();
                ValidSynax = true;
            }
            if(event.contains("/post")) {
                String[] splitted = event.split(" ");
                if(splitted.length!=2){
                    System.out.println("Bad Syntax - please use /post <<text>>");
                    ValidSynax = true;
                }
                else {
                    student.post();
                    ValidSynax = true;
                }
            }
            if(event.equals("/answer")) {
                student.answer();
                ValidSynax = true;
            }
            if(event.equals("/next_week")) {
                student.next_week();
                ValidSynax = true;
            }
            if(event.contains("/status")) {
                String[] splitted = event.split(" ");
                if(splitted.length!=2){
                    System.out.println("Bad Syntax - please use /status <<text>>");
                    ValidSynax = true;
                }
                else {
                    student.status(event.split(" ")[1]);
                    ValidSynax = true;
                }
            }
            if(event.contains("/exit")) {
                break;
            }
            if(!ValidSynax && !event.equals(""))
                System.out.println("Bad Synax - Please use one of the following - \n" +
                        " /exam  <<grade>> \n /read \n /post <<text>> \n /answer \n /next_week \n /status <<text>> \n /exit");

        }
    }
}
