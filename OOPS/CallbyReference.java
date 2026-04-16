class test{
    int marks;
}
public class CallbyReference {
    public static void changeMarks (test s){

        s.marks = 90;
    }
    public static void main(String[] args) {
        test t = new test();

        t.marks = 75 ;
        changeMarks(t);
        System.out.println(t.marks);

    }
}
