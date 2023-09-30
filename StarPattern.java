public class StarPattern {
    public static void main(String[] args) {
        int n = 5;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            for (int k = 0; k < n - (i - 1); k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j + " ");
                sum += j;
            }
            System.out.println();
        }
        System.out.print(sum);
    }
}
