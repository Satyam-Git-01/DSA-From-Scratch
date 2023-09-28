import java.util.ArrayList;
import java.util.List;

public class Nby3Times {
    public static void main(String[] args) {
        int arr[]={5,5,5,5,5,7,7,1,1,1,1,1,5,5,5,5};
        System.out.println(Nby2Method(arr));
        System.out.println(Nby3Method(arr));
    }
    private static List<Integer> Nby3Method(int[] arr) {
        List<Integer> ans=new ArrayList<>();
        int cn1=0;
        int cn2=0;
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(cn1==0 && ele2!=arr[i]){
                cn1=1;
                ele1=arr[i];
            }
            else if(cn2==0 && ele1!=arr[i]){
                cn2=1;
                ele2=arr[i];
            }
            else if(ele1==arr[i]){
                cn1++;
            }
            else if(ele2==arr[i]){
                cn2++;
            }
            else{
                cn1--;
                cn2--;
            }
        }
        int count1=0,count2=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele1){
                count1++;
            }
            if(arr[i]==ele2){
                count2++;
            }
        }
        int mini=(int)arr.length/3+1;
        if(count1>=mini){
            ans.add(ele1);
        }
        if(count2>=mini){
            ans.add(ele2);
        }


        return ans;
    }
    //Voting Algorithm
    static int Nby2Method(int arr[]){

        int cnt=0;
        int ele=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(cnt==0){
                cnt=1;
                ele=arr[i];
            }
            else if(ele==arr[i]){
                cnt++;
            }
            else{
                cnt--;
            }
        }
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                count++;
            }
        }
        int mini=(int)arr.length/2+1;
        if(count>=mini){
            return ele;
        }
        return -1;
    }
}
