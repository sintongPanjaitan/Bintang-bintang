package Pattern_53;

public class Main {
    public static void main(String[] args) {
        for(int x =4; x>0;x--){
            for (int z=4 ;z>x; z--){
                System.out.print(" ");
            }
            for(int y =1; y<=x*2-1;y++){
                int n =64+y;
                System.out.print(Character.toString((char) n));
//                System.out.print(y);
            }
//            for (int z=1 ;z<x; z++){
////                int e =65+z;
////                System.out.print(Character.toString((char) e));
//                System.out.print(x*2-1);
//            }
            System.out.println();

        }
    }
}
