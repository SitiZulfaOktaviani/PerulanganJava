public class Segitiga_1 {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if(i == 5){
                    System.out.print("1");
                }
                else if (i == 4){
                    System.out.print("2");
                }else {
                    System.out.print("3");
                }
            }
            System.out.println();
        }
    }
}