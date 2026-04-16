public class method2 {
    public static void main(String[] args) {
        Add a = new Add();
        
        int result = a.add();   // method call
        System.out.println("Sum = " + result);
    }
}

class Add {
    int add() {   // no parameter
        int a = 4;
        int b = 6;
        return a + b;   // return value
    }
}