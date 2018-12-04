package Pattern_86;

public class Main {
    public static void main(String[] args) {
        //Upper pyramid
        for(int x =5; x>=1;x--){
            for (int z=x ;z>1; z--){
//                int n =65+Math.abs(z);
//                System.out.print(Character.toString((char) n));
                System.out.print(" ");
            }
            for (int z=5;z>=x ; z--){
                int n =64+x;
//                System.out.print(Character.toString((char) n));
                if(z==5 || z==x){
//                    System.out.print(x);
                    System.out.print(Character.toString((char) n));
                }
                else{
                    System.out.print(" ");
//                    System.out.print(Character.toString((char) n));
                }
//                System.out.print(z);
            }

            System.out.println();

        }

    }
}
