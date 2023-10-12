import java.util.Arrays;

public class MoveZerosToStart {
    public static void main(String[] args) {
        int arr[]={0,1,-1,3,45,40,0,6,0,6,3,1,0,0,6,0,1,4,6,0};
        Start(arr, arr.length);
        End(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    public static void End(int arr[],int n){
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
    }

    public static void Start(int arr[],int n){
        int j=n-1;
        for(int i=n-1;i>=0;i--){
            if(arr[i]!=0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
}
