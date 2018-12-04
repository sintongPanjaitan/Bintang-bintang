package Pattern_34;

public class Main {
    public static void main(String[] args) {
        for(int x =5; x>=1;x--){
            for (int z=1 ;z<x; z++){
                System.out.print(" ");
            }
            for(int y = x; y<=5;y++){
//                int n =64+y;
//                System.out.print(Character.toString((char) n));
                System.out.print("*");
            }
            for (int z=x ;z<5; z++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
