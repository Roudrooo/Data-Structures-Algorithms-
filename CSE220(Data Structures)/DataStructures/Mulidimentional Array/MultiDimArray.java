
public class MultiDimArray {

    private static int row,column;


    public static int[][] creat2Darray(int row,int column,int initialValue){
        MultiDimArray.row=row;
        MultiDimArray.column=column;
        int[][] array2D=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                array2D[i][j]=initialValue;
            }
        }
        return array2D;
    }


    public void iteraterows(int[][] array2D){
        System.out.println("Iterating row wise.");
        for(int r=0;r<row;++r){
            for(int c=0;c<column;++c){
                System.out.print(array2D[r][c]+"("+r+","+c+") ");
            }
            System.out.println();
        }
    }


    public void iteratecolums(int[][] array2D){
        System.out.println("Iterating column wise.");
        for(int c=0;c<column;++c){
            for(int r=0;r<row;++r){
                System.out.print(array2D[r][c]+"("+r+","+c+") ");
            }
            System.out.println();
        }
    }


    public void print2D(int[][] array2D){
        System.out.println("Printing the array.");
        for(int r=0;r<row;++r){
            for(int c=0;c<column;++c){
                System.out.print(array2D[r][c]+" ");
            }
            System.out.println();
        }
    }


    public int sumAllVal(int[][] array2D){
        int sum=0;
        System.out.println("Summing all the values.");
        for(int r=0;r<row;++r){
            for(int c=0;c<column;++c){
                sum+=array2D[r][c];
            }
        }
        return sum;
    }


    public int[] sumRows(int[][] array2D){
        System.out.println("Summing all the row values.");
        int[] rowSums=new int[row];
        for(int r=0;r<row;++r){
            int sum=0;
            for(int c=0;c<column;++c){
                sum+=array2D[r][c];
            }
            rowSums[r]=sum;
        }
        return rowSums;
    }


    public int[] sumColumns(int[][] array2D){
        System.out.println("Summing all the column values.");
        int[] columnSums=new int[column];
        for(int c=0;c<column;++c){
            int sum=0;
            for(int r=0;r<row;++r){
                sum+=array2D[r][c];
            }
            columnSums[c]=sum;
        }
        return columnSums;
    }


    public int[][] swapColumns(int[][] array2D){
        System.out.println("Swapping the column values.");
        int mid=column/2;
        for(int c=0;c<mid;++c){
            for(int r=0;r<row;++r){
                int temp=array2D[r][c];
                array2D[r][c]=array2D[r][column-c-1];
                array2D[r][column-c-1]=temp;
            }
        }
        return array2D;
    }


    public int sumPrimaryDiagonal(int[][] array2D){
        System.out.println("Summing the primary diagonal value.");
        int sum=0;
        for(int r=0;r<row;++r){
            sum+=array2D[r][r];
        }
        return sum;
    }


    public int sumSecondaryDiagonal(int[][] array2D){
        System.out.println("Summing the secondary diagonal value.");
        int sum=0;
        for(int r=0;r<row;++r){
            sum+=array2D[r][row-r-1];
        }
        return sum;
    }


    public int[][] addMatrices(int[][] arr1,int[][] arr2){
        System.out.println("Adding two matrices of same dimension.");
        int row=arr1.length,column=arr1[0].length;
        int[][] resultArr=new int[row][column];
        for(int r=0;r<row;++r){
            for(int c=0;c<column;++c){
                resultArr[r][c]=arr1[r][c]+arr2[r][c];
            }
        }
        return resultArr;
    }

    
    public int[][] multiplyMatrices(int[][] arr1,int[][] arr2){
        System.out.println("Multiplying two matrices.");
        int row1=arr1.length,column1=arr1[0].length,row2=arr2.length,column2=arr2[0].length;
        int[][] resultArr=new int[row1][column2];
        for(int r=0;r<resultArr.length;++r){
            for(int c=0;c<resultArr[0].length;++c){
                for(int k=0;k<column1;++k){
                    resultArr[r][c]+=arr1[r][k]*arr2[k][c];
                }
            }
        }
        return resultArr;
    }
}