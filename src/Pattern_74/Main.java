package Pattern_74;

public class Main {
    public static void main(String[] args) {
        for(int x =1; x<=5;x++){
            for (int z=x ;z>1; z--){
//                int n =65+Math.abs(z);
//                System.out.print(Character.toString((char) n));
                System.out.print(" ");
            }
            for (int z=x;z<=5 ; z++){
                int n =64+z;
                System.out.print(Character.toString((char) n));
//                System.out.print(z);
            }

            System.out.println();

        }
    }
}
