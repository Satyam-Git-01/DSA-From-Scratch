package SlidingWindow;

class KBeautyOfNumber {
    public static void main(String[] args) {
        String number="240";
        int k=2;
        int i=0;
        int j=i+k;
        for ( i = 0; j<= number.length(); i++,j++) {
            System.out.println(number.substring(i, j));
        }
    }
}