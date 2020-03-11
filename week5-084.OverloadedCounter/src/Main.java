public class Main {
    public static void main(String[] args) {
        // write testcode here

        Counter A = new Counter(10, true);
        System.out.println("A: " + A.value());

        for(int i = 0; i < 12; i++){
            A.decrease(-1);
            System.out.println("A: " + A.value());


        }

    }
}
