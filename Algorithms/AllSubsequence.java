import java.util.ArrayList;
import java.util.Arrays;

/**
 * AllSubsequence
 */
public class AllSubsequence {

    public static void main(String[] args) {
        String str="abc";
        //PrintAllSubArrays(new int[]{1,2,3,4});
    //PrintAllSubString("abcde");        
    printAllSubsequence(new int[]{1,2,3,4});
    }

    static void PrintAllSubArrays(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
    static void PrintAllSubString(String str){
        for(int i=0;i<str.length();i++){
            for(int j=i;j<str.length();j++){
                for(int k=i;k<=j;k++){
                    System.out.print(str.charAt(k)+" ");
                }
                System.out.println();
            }
        }
    }
    // subsequence
    static void printAllSubsequence(int arr[]){
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        Helper(arr,0,ans,new ArrayList<>());
        System.out.println(Arrays.toString(ans.toArray()));
    }
    static void Helper(int arr[],int index, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> sub){
        if(index==arr.length){
            ans.add(sub);
            return;
        }
        ArrayList<Integer> temp=new ArrayList<>(sub);
        sub.add(arr[index]);
        Helper(arr, index+1, ans, sub);
        Helper(arr, index+1, ans, temp);
    }
}