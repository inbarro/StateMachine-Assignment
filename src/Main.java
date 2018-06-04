public class Main {

    public static void main(String []args)
    {
        Student student = new Student();
        for (int i = 0 ; i<10 ; i++) {
            student.read();
            student.post();
        }
        student.exam(85);
        student.status("Noam");
    }
}
