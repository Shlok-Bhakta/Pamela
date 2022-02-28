import java.util.Scanner;
import java.io.File;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class App {
    
    
    
    // initialization of global vaiables
    public static ArrayList<Integer> TABLE = new ArrayList<Integer>();
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
                    int num = scanner.nextInt();
                    table[k][j] = num;
                    TABLE.add(num);
                }
                
            }
            
            for (int l = 0; l < table.length; l++) {
/*                 rowSum(table[l]);
                rowMin(table[l]); */
                
                    colSum(l, cols, rows);
                    colMax(table, l);
                

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

    public static void colSum(int colnum, int length, int width) {
        
        
        int sum = 0;
        int counter = 0;
        ArrayList<Integer> col = new ArrayList<Integer>();
        int[][] table = new int[width][length];
        for (int k = 0; k < table.length; k++) {
            for (int j = 0; j < table[k].length; j++) {
                
                table[k][j] = TABLE.get(counter);
                counter++;
                System.out.println(Arrays.toString(table[colnum]));
            }
            
        }
        
         for(int i = 0; i <= table.length; i++) {
          col.add(table[i][colnum]);

        }
        System.out.println(col); 
        for (int yy = 0; yy < col.size(); yy++) {

            sum = sum + col.get(yy);
        }
        
        ColSums.add(sum);

    }

    public static void colMax(int[][] table, int colnum){
        
        ArrayList<Integer> col = new ArrayList<Integer>();

        for (int zz = 0; zz < table.length; zz++) {

            col.add(table[zz][colnum]);

        }
//        System.out.println(col);
        Collections.sort(col);
//        System.out.println(col);
        ColMaxs.add(col.get(col.size() - 1));

    }
    
/*     public static int[] toanarray(ArrayList<Integer> input){
        int[] output = new int[input.size()-1];


        for(int www = 0;www < input.size()-1; www++){
            output[www] = input.get(www);
        }

        
        return output;



    } */

}
