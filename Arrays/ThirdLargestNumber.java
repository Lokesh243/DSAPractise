public class ThirdLargestNumber {
   static void thirdLargest(int []k){
    int first=Integer.MIN_VALUE;
    int second=Integer.MIN_VALUE;
    int third=Integer.MIN_VALUE;
    for(int i:k){
        if(i>first){
            third=second;
            second=first;
            first=i;
        }else if(i>second){
            third=second;
            second=i;
        }
        else if(i>third)
            third=i;
    }
    System.out.println("Third Largest Number is:"+third);
}
    public static void main(String[]args){
        int arr[]={3,8,12,5,7,4};
        thirdLargest(arr);
    
    }
    
}
