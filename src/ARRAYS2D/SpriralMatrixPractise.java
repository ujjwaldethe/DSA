package ARRAYS2D;

public class SpriralMatrixPractise {
    public static void SpiralMatrix(int arr[][])
    {
        int startRow=0,startCol=0,endRow= arr.length-1,endCol=arr[0].length-1;
        while(startRow<=endRow && startCol<=endCol)
        {
            for(int j=startCol;j<=endCol;j++)
            {
                System.out.print(arr[startCol][j]+" ");
            }
            for(int i=startRow+1;i<=endRow;i++)
            {
                System.out.print(arr[i][endCol]+" ");
            }
            for(int j=endCol-1;j>=startCol;j--)
            {
                if(startRow==startRow)
                {
                    break;
                }
                System.out.print(arr[endRow][j]+" ");
            }
            for(int i=endRow-1;i>=startCol+1;i--)
            {
                if(startCol==endCol)
                {
                    break;
                }
                System.out.print(arr[i][startRow]+" ");
            }
            startRow++;
            startCol++;
            endCol--;
            endRow--;
        }
    }
    public static void main(String args[])
    {
        int arr[][]={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        SpiralMatrix(arr);
    }
}
