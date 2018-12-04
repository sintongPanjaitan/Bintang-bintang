package Pattern_30;

public class Main {
    public static void main(String[] args) {
        for(int x =5; x>=1;x--){
            for (int z=x ;z<5; z++){
                System.out.print(" ");
            }
            for(int y = 1; y<=x;y++){
//                int n =64+y;
//                System.out.print(Character.toString((char) n));
                System.out.print(x);
            }
            System.out.println();

        }
    }
}
