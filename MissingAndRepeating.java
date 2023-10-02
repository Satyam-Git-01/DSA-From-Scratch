public class MissingAndRepeating {
    public static void main(String[] args) {
        int arr[]={3,1,2,5,3};
        CycleSort(arr);
        //System.out.println(Arrays.toString(arr));
        int repat=0;
        int missing=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                repat=arr[i];
                missing=i+1;
            }
        }
        System.out.println(missing+" "+repat);
    }

    static void CycleSort(int arr[]){
        int i=0;
        while(i<arr.length){
            int correctIndex=arr[i]-1;
            if(arr[i]!=arr[correctIndex]){
                int temp=arr[i];
                arr[i]=arr[correctIndex];
                arr[correctIndex]=temp;
            }
            else{
                i++;
            }
        }
    }
}
