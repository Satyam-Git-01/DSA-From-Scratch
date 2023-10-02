public class MaximumProductSubArray {
    public static void main(String[] args) {
        int arr[]={1,2,-3,0,-4,-5};
        //Brute Forece Generate All SubArrays and Maintain Max Product

        //can be reduced to o(n2)
        int Product=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int pr=1;
                for(int k=i;k<=j;k++){
                    pr=pr*arr[k];
                    Product=Math.max(Product, pr);
                }
            }
        }
        System.out.println(Product);

        System.out.println(KadaneAlgoforProduct(arr));
    }

    public static int KadaneAlgoforProduct(int arr[]){
        int prod1=arr[0],prod2=arr[0],result=arr[0];
        for(int i=0;i<arr.length;i++){
            int temp=Math.max(arr[i],Math.max(prod1*arr[i], prod2*arr[i]));
            prod2= Math.min(arr[i], Math.min(arr[i]*prod1, prod2*arr[i]));
            prod1=temp;
            result=Math.max(result, prod1);

        }
        return result;
    }
}
