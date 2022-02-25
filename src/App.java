import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
import java.util.ArrayList;

public class App {
    // initialization of global vaiables
    public static ArrayList<Integer> RowSums = new ArrayList<Integer>();
    public static ArrayList<Integer> RowMins = new ArrayList<Integer>();
    public static ArrayList<Integer> ColSums = new ArrayList<Integer>();
    public static ArrayList<Integer> ColMaxs = new ArrayList<Integer>();
    public static int MinMins = 0;
    public static int MaxMaxs = 0;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("pamela.dat"));
        int loop = scanner.nextInt();

        for (int i = 0; i < loop; i++) {
            int rows = scanner.nextInt();
            int cols = scanner.nextInt();

            int[][] table = new int[rows][cols];
            System.out.println("Case: " + (i + 1));
            for (int k = 0; k < table.length; k++) {
                for (int j = 0; j < table[k].length; j++) {
                    table[k][j] = scanner.nextInt();

                }

            }
            for (int l = 0; l < table.length; l++) {
                rowSum(table[l]);
                rowMin(table[l]);
                if (!(l > cols - 1)){
                    colSum(table, l);
                    colMax(table, l);
                }
                    


            }

            System.out.println("====================");

        }

    }

    public static void rowSum(int[] rowNums) {
        int sum = 0;
        for (int i = 0; i < rowNums.length; i++) {
            sum = sum + rowNums[i];
        }

        RowSums.add(sum);

    }

    public static void rowMin(int[] rowNums) {
        int min = 9999;

        Arrays.sort(rowNums);

        min = rowNums[0];
        RowMins.add(min);

    }

    public static void colSum(int[][] table, int colnum) {
        int sum = 0;
        ArrayList<Integer> col = new ArrayList<Integer>();

        for (int zz = 0; zz < table.length; zz++) {

            col.add(table[zz][colnum]);

        }

        for (int yy = 0; yy < col.toArray().length; yy++) {

            sum = sum + col.get(yy);
        }

        ColSums.add(sum);

    }

    public static void colMax(int [][] table, int colnum){
        int Max = 0;
        ArrayList<Integer> col = new ArrayList<Integer>();

        for (int zz = 0; zz < table.length; zz++) {

            col.add(table[zz][colnum]);

        }

        int[] temp = toanarray(col);
        

        ColMaxs.add(temp);

    }
    
    public static int[] toanarray(ArrayList<Integer> input){
        int[] output = new int[input.size()-1];


        for(int www = 0;www < input.size(); www++){
            output[www] = input.get(www);
        }


        return output;



    }

}
