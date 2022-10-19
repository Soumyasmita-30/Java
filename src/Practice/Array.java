package Practice;

public class Array {
    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};
        char[] y = {'a', 'b', 'c', 'd', 'e'};
        String[] z = {"seema", "silu", "sita"};

        System.out.println(y[2]);
        System.out.println(x[0]);
        System.out.println(y.length);
        System.out.println(x.length);
        System.out.println(z[1].charAt(2));

        for (int i = 0; i < x.length; i++)
        { System.out.print(" " + x[i]);}
        System.out.println("\n");

        int[][] p ={ {1,2,3,4,5},
                    {4,5,6,7},
                    {8,9,10,12,13,14,15}};
        for(int i = 0 ;i<p.length;i++){
            for(int j = 0;j<p[i].length;j++){
                System.out.print( " " +p[i][j]);
            }
            System.out.println();
        }
        System.out.println(p[1][2]);
        for(String s : z){
            System.out.print(" " +s);
    }
} }
