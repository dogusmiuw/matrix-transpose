import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Row number:");
        int row = sc.nextInt();
        System.out.println("Column number:");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.println("Enter the arr["+i+"]["+j+"] element:");
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        print2dArr(arr);
        System.out.println();

        print2dArr(tranpose(arr));

        sc.close();
    }

static void print2dArr(int[][] arr){
    for(int i = 0; i < arr.length; i++){
        for(int j = 0; j < arr[0].length; j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
}

    static int[][] tranpose(int[][] arr){
        int[][] ret = new int[arr.length][arr[0].length];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                ret[j][i] = arr[i][j];
            }
        }

        return ret;
    }
}
