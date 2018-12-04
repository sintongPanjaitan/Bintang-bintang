package Pattern_58;

public class Main {
    public static void main(String[] args) {
        for(int x =3; x>=-3;x--){
            for (int z=Math.abs(x) ;z<=3; z++){
                int n =65+Math.abs(z);
                System.out.print(Character.toString((char) n));
//                System.out.print(Math.abs(z));
            }
//            for(int y =1; y<=x*2-1;y++){
//                int n =64+y;
//                System.out.print(Character.toString((char) n));
//                System.out.print("*");
//            }
//            for (int z=1 ;z<x; z++){
////                int e =65+z;
////                System.out.print(Character.toString((char) e));
//                System.out.print(x*2-1);
//            }
            System.out.println();

        }
    }
}
