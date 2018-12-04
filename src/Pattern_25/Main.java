package Pattern_25;

public class Main {
    public static void main(String[] args) {
        for(int x =1; x<=5;x++){
            for (int z=5 ;z>x; z--){
                System.out.print(" ");
            }
            for(int y = 1; y<=x;y++){
                System.out.print(x);
            }
            System.out.println();

        }
    }
}
