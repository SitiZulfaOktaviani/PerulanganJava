public class Segitiga_3 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            for (int l = i-1; l >= 1; l--){
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
