public class IT18172256Lab7Q2C {
    public static void main(String[] args) {
        for (int digit = 5; digit >= 1; digit--) {
            for (int col = 1; col <= digit; col++) {
                System.out.print(digit);
            }
            System.out.println();
        }
    }
}