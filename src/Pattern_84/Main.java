package Pattern_84;

public class Main {
    public static void main(String[] args) {
        //Upper pyramid
        for(int x =1; x<=5;x++){
            for (int z=x ;z<5; z++){
//                int n =65+Math.abs(z);
//                System.out.print(Character.toString((char) n));
                System.out.print(" ");
            }
            for (int z=1;z<=x ; z++){
                int n =64+x;
//                System.out.print(Character.toString((char) n));
                if(z==1 || z==x){
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
