package Pattern_71;

public class Main {
    public static void main(String[] args) {
        for(int x =5; x>=1;x--){
            for (int z=5 ;z>x; z--){
//                int n =65+Math.abs(z);
//                System.out.print(Character.toString((char) n));
                System.out.print(" ");
            }
            for (int z=x;z>0 ; z--){
//                int n =64+Math.abs(z);
//                System.out.print(Character.toString((char) n));
                System.out.print(z);
            }

            System.out.println();

        }
    }
}
