package Pattern_64;

public class Main {
    public static void main(String[] args) {
        for(int x =1; x<=5;x++){
            for (int z=4 ;z>=x; z--){
//                int n =65+Math.abs(z);
//                System.out.print(Character.toString((char) n));
                System.out.print(" ");
            }
            for (int z=1;z<=x ; z++){
//                int n =65+Math.abs(z);
//                System.out.print(Character.toString((char) n));
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
