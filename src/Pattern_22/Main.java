package Pattern_22;

public class Main {
    public static void main(String[] args) {
        for(int i =5; i>=1;i--){
            for (int j=1 ;j<=i; j++){
                int x =64+i;
                System.out.print(Character.toString((char) x));
//                System.out.print(j);
            }
            System.out.println();

        }
    }
}
