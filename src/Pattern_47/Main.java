package Pattern_47;

public class Main {
    public static void main(String[] args) {
        for(int x =0; x<5;x++){
            for (int z=x ;z>0; z--){
                System.out.print(" ");
            }
            for(int y =x; y<4;y++){
//                int n =64+y;
//                System.out.print(Character.toString((char) n));
                System.out.print("*");
            }
            for (int z=x ;z<3; z++){
//                int e =65+z;
//                System.out.print(Character.toString((char) e));
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
