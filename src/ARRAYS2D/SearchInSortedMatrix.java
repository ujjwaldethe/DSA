package ARRAYS2D;

public class SearchInSortedMatrix {
    public static boolean staircaseSearch(int arr[][],int key)
    {
        int row = 0, col=arr[0].length-1;
        while(row<arr.length && col>=0)
        {
            if(arr[row][col]==key){
                return true;
            }
            else if(key<arr[row][col])
            {
                col--;
            }
            else {
                row++;
            }
        }
        return false;
    }
    public static void main(String args[]){
        int key = 5;
        int arr[][]={{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}};
        if(staircaseSearch(arr,key))
        {
            System.out.print("Key Is Found");
        }
        else {
            System.out.print("Key Is Not Found");
        }

    }
}
