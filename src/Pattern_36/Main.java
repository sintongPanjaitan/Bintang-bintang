package Pattern_36;

public class Main {
    public static void main(String[] args) {
        for(int x =1; x<=5;x++){
            for (int z=x ;z<5; z++){
                System.out.print(" ");
            }
            for(int y = 1; y<=x*2-1;y++){
//                int n =64+y;
//                System.out.print(Character.toString((char) n));
                System.out.print(x*2-1);
            }
//            for (int z=x ;z<5; z++){
//                System.out.print("*");
//            }
            System.out.println();

        }
    }
}
