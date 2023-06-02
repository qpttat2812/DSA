public class Max_Consecutive_Ones {

    public static int findMaxConsecutiveOnes(int[] a) {
        int max_value = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0){
                count = 0;
            }
            else {
                count++;
                max_value = (max_value > count) ? max_value : count;
            }
        }
        return max_value;          
}


    public static void main(String[] args) {
        int[] a = {1,1,0,1,1,1};
        int[] b = {0};
        int[] c = {1};
        System.out.println(findMaxConsecutiveOnes(a));
        System.out.println(findMaxConsecutiveOnes(b));
        System.out.println(findMaxConsecutiveOnes(c));
    }
    
}
