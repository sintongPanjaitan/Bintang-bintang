package Pattern_28;

public class Main {
    public static void main(String[] args) {
        for(int x =1; x<=5;x++){
            for (int z=5 ;z>x; z--){
                System.out.print(" ");
            }
            for(int y = 1; y<=x;y++){
                int n =64+y;
                System.out.print(Character.toString((char) n));
//                System.out.print(y);
            }
            System.out.println();

        }
    }
}
