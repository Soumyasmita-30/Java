package Array;

public class MDArray {
    public static void main(String[] args) {
        int[][] numbers = {{1, 2, 3, 4},
                           {5, 6, 7, 8},
                           {9, 8, 7, 6}};
        System.out.println(numbers[0][1]);
        for(int i =0 ;i<3 ;i++){
            for(int j = 0 ;j<4 ;j++){
                System.out.print("  " +numbers[i][j]);
            }
            System.out.println();
        }
int[][] myNumbers = {{1,2,3,4},
                     {5,6,7},
                     {9,8,7,6,5,4}} ;
        for(int i = 0 ; i<myNumbers.length;i++){
            for(int j = 0 ;j<myNumbers[i].length ;j++){
                System.out.print(" " +myNumbers[i][j]);
            }
            System.out.println();
        }
    }
}