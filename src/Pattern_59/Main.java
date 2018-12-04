package Pattern_59;

public class Main {
    public static void main(String[] args) {
        for(int x =-3; x<=3;x++){
            for (int z=Math.abs(x) ;z>0; z--){
//                int n =65+Math.abs(z);
//                System.out.print(Character.toString((char) n));
                System.out.print(" ");
            }
            for (int z=3;z>=Math.abs(x) ; z--){
//                int n =65+Math.abs(z);
//                System.out.print(Character.toString((char) n));
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
