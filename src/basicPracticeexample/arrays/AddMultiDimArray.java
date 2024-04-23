package basicPracticeexample.arrays;

public class AddMultiDimArray {
    //add two 3x3 arrays
    //int[][] array1= {{54,12,4}, {2,36,40}, {6,4,5}} int[][] array2 = {{2,9,40}, {5,3,6}, {3,5,12}}
    int[][] arrayC = new int[3][3];
    public void addMultiDimArray(int[][] arrayA,int[][] arrayB){
        for (int i = 0; i < arrayA.length; i++) {
            for (int j = 0; j < arrayB.length; j++) {
            arrayC[i][j] = arrayA[i][j]+arrayB[i][j];
            System.out.print(arrayC[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arrayA= {{54,12,4}, {2,36,40}, {6,4,5}};
        int[][] arrayB = {{2,9,40}, {5,3,6}, {3,5,12}};

        AddMultiDimArray addMultiDimArray = new AddMultiDimArray();
        addMultiDimArray.addMultiDimArray(arrayA,arrayB);
    }


}
