package Pattern_43;

public class Main {
    public static void main(String[] args) {
        for(int x =0; x<5;x++){
            for (int z=x ;z<5; z++){
                System.out.print(" ");
            }
            for(int y =x; y>=0;y--){
//                int n =64+y;
//                System.out.print(Character.toString((char) n));
                System.out.print(y);
            }
            for (int z=1 ;z<1+x; z++){
                System.out.print(z);
            }
            System.out.println();

        }
    }
}
