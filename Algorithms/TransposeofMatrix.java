public class TransposeofMatrix {
    public static void main(String[] args) {
        int arr[][]=new int[][]{{1,2,3},{4,5,6}};
        int row=arr.length;
        int col=arr[0].length;
        int trasn[][]=new int[col][row];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                trasn[j][i]=arr[i][j];
            }
        }

        // for(int i=0;i<col;i++){
        //     for(int j=0;j<row;j++){
        //        System.out.print(trasn[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        // IN PLACE works well for n*n size only
        for(int i=0;i<col;i++){
            for(int j=i;j<row;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
               System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
