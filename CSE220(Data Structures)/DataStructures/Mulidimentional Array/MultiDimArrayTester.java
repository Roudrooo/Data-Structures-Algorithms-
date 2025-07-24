
import java.util.Arrays;

public class MultiDimArrayTester {
    public static void main(String[] args) {
        MultiDimArray arr2D=new MultiDimArray();
        int[][] array2D1=MultiDimArray.creat2Darray(2,3,1);

        arr2D.iteraterows(array2D1);
        System.out.println();

        arr2D.iteratecolums(array2D1);
        System.out.println();

        arr2D.print2D(array2D1);
        System.out.println();

        System.out.println("Sum="+arr2D.sumAllVal(array2D1));
        System.out.println();

        System.out.println("Sum of all rows="+Arrays.toString(arr2D.sumRows(array2D1)));
        System.out.println();

        System.out.println("Sum of all columns="+Arrays.toString(arr2D.sumColumns(array2D1)));
        System.out.println();

        int[][] arr1={{3,7,1,3},{4,8,5,9},{2,1,7,8}};
        int[][] array2D2=MultiDimArray.creat2Darray(arr1.length,arr1[0].length,0);
        arr2D.print2D(arr1);
        arr2D.swapColumns(arr1);
        arr2D.print2D(arr1);
        System.out.println();

        int[][] arr2={{3,7,1,3},{4,8,5,9},{2,1,7,8},{1,2,3,4}};
        int[][] array2D3=MultiDimArray.creat2Darray(4,4,0);
        arr2D.print2D(arr2);

        System.out.println("Primary Diagonal sum="+arr2D.sumPrimaryDiagonal(arr2));
        System.out.println();

        System.out.println("Secondary Diagonal sum="+arr2D.sumSecondaryDiagonal(arr2));
        System.out.println();

        int[][] arr3={{1,2,3,4},{5,6,7,8},{9,0,1,3},{5,7,9,2}};
        int[][] addRes=arr2D.addMatrices(arr2, arr3);
        System.out.println("Sum of two matrices:\n"+Arrays.deepToString(addRes));
        System.out.println("Matrix Formate:");
        for(int i=0;i<addRes.length;++i){
            for(int j=0;j<addRes[0].length;++j){
                System.out.print(addRes[i][j]+"     ");
            }
            System.out.println();
            System.out.println();
        }
        System.out.println();
        
        int[][] array2D4=MultiDimArray.creat2Darray(3,2,1);
        int[][] arr4={
            {1,2,3},
            {4,5,6}
        };
        int[][] arr5={
            {7,8},
            {9,0},
            {1,3}
        };
        int[][] podRes=arr2D.multiplyMatrices(arr4, arr5);
        System.out.println("Product of two matrices:\n"+Arrays.deepToString(podRes));
        System.out.println("Matrix Formate:");
        for(int i=0;i<podRes.length;++i){
            for(int j=0;j<podRes[0].length;++j){
                System.out.print(podRes[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
        
    }
}