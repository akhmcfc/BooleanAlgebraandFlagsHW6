public class Main {
    public static void main(String[] args) {
        int x = 38;
        double y = Math.sqrt(x);
        int n = 2;
        boolean prime = true;
        while (n <= y) {
            if (x % n == 0) {
                prime = false;
            }
            n++;
        }
        System.out.println(prime);
    }
}