// main class
public class mothod {
    public static void main(String[] args) {
        Morning m = new Morning();
        m.morning();
    }
}

// second class (not public)
class Morning {
    void morning() {
        System.out.println("Good Morning");
    }
}