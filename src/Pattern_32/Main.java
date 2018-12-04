package Pattern_32;

public class Main {
    public static void main(String[] args) {
        for(int x =5; x>=1;x--){
            for (int z=x ;z<5; z++){
                System.out.print(" ");
            }
            for(int y = 1; y<=x;y++){
                int n =64+x;
                System.out.print(Character.toString((char) n));
//                System.out.print(y);
            }
            System.out.println();

        }
    }
}
