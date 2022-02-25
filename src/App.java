import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("pamela.dat"));
        int loop = scanner.nextInt();

        for(int i = 0; i < loop; i++) {
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();

            int[][] table = new int[rows][cols];
            System.out.println("Case: " + (i + 1));
            for(int k = 0; k < table.length; k++) {
                for(int j = 0; j < table[k].length; j++) {
                        table[k][j] = scanner.nextInt();
                        
                }

                

            }
            for(int l = 0; l < table.length; l++) {
                //System.out.println(rowSum(table[k]));
                //System.out.println(rowMin(table[k]));
                System.out.println(colSum(table, l));

            }

            

            System.out.println("====================");

        }


    }
    public static int rowSum(int[] rowNums){
        int sum = 0;
        for(int i = 0; i < rowNums.length; i++){
            sum = sum + rowNums[i];
        }


        return sum;

    }

    public static int rowMin(int[] rowNums){
        int min = 9999;

        Arrays.sort(rowNums);

        min = rowNums[0];


        return min;
    }
    public static int colSum(int[][] table, int colnum){
        int sum = 0;
        ArrayList<Integer> col = new ArrayList<Integer>();

        for(int zz = 0; zz < table.length; zz++){

            col.add(table[zz][colnum]);
            
            

        }


        System.out.println(col);



        return sum;


    }

}
