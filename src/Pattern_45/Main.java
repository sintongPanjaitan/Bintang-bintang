package Pattern_45;

public class Main {
    public static void main(String[] args) {
        for(int x =1; x<5;x++){
            for (int z=x ;z<5; z++){
                System.out.print(" ");
            }
            for(int y =1; y<=x;y++){
//                int n =65+y;
//                System.out.print(Character.toString((char) n));
                System.out.print(y);
            }
            for (int z=x-1 ;z>0; z--){
//                int e =65+z;
//                System.out.print(Character.toString((char) e));
                System.out.print(z);
            }
            System.out.println();

        }
    }
}
