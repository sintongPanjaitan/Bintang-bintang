package Pattern_4;

public class Main {
    public static void main(String[] args) {
        for(int i =0; i<5;i++){
            for (int j=0 ;j<5 ; j++){
//                char asciiCode = 65;
                int x =65+i;
                System.out.print(Character.toString((char) x));
            }
            System.out.println();

        }
    }
}
