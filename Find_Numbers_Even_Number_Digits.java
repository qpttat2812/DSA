public class Find_Numbers_Even_Number_Digits {
    public static int findNumbers(int[] a) {
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if(countNumberofElement(a[i]) % 2 ==0) {
                count++;
            }  
        }
        return count;
    }

    public static int countNumberofElement(int value) {
        int result = 0;
        int count = 0;
        while (value > 0) {
            result = value / 10;
            value = result;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {12,345,20,6,7896};
        System.out.println(findNumbers(a));
    }
}
