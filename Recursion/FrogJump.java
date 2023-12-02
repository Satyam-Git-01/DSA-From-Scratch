package Recursion;

public class FrogJump {
    public static void main(String[] args) {
        int heights[]=new int[]{10,20,30,40};
        System.out.println(energyonJump(heights,0,heights.length));
    }
    private static int energyonJump(int heights[],int index,int n){
        if(index==n-1){
            return 0;
        }
        if(index==n-2){
            return energyonJump(heights, index+1, n)+Math.abs(heights[index]-heights[index+1]);
        }
        return Math.min(energyonJump(heights, index+1, n)+Math.abs(heights[index]-heights[index+1])
        ,energyonJump(heights, index+2, n)+Math.abs(heights[index+2]-heights[index]));
    }
}
