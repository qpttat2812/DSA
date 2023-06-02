public class Find_Even_Number_Digits {

    public static int findNumbers(int[] nums) {
        
        int bienDem = 0;

        for(int a: nums) {
            // kiem tra so chu so cua a
            // neu so chu so = chan => tang bien diem len 1
            int soLuongChuSo = tinhSoChuSo(a);
            if(soLuongChuSo % 2 == 0) {
                bienDem++;
            }
        }
        return bienDem;
    }


    private static int tinhSoChuSo(int a) {

        int count = 0;
        int kq = a ;
        while (kq != 0) {
            kq = a / 10;
            a = kq;
            count++;
        }
        return count;
    }


    public static void main(String[] args) {
        int [] a = {23, 456, 222, 4778, 4543, 90909};
       System.out.println(findNumbers(a));
    }
}
