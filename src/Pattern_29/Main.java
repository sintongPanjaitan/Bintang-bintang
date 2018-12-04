package Pattern_29;

public class Main {
    public static void main(String[] args) {
        for(int x =1; x<=5;x++){
            for (int z=1 ;z<x; z++){
                System.out.print(" ");
            }
            for(int y = 5; y>=x;y--){
//                int n =64+y;
//                System.out.print(Character.toString((char) n));
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
