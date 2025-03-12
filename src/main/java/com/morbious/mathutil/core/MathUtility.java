package com.morbious.mathutil.core;

public class MathUtility {
    // class này là b thư viện chứa các hàm tính toán học giống class Math trong JDK

    // thư viện chưa hàm tính toán mà ko cần lưu trữ kết quả, chỉ trả về kết quả, th nên được thiết kế là hàm static, ví dụ Math.sqrt()
    // Math.abs()
    // class này tạm làm hàm tính giai thừa n!

    //n! = 1.2.3.4 ... n
    //0! = 1
    // 20! vừa đủ kiểu long, 21! kiểu long chứa ko nổi, tràn
    // quy ước hàm này chỉ tính n từ 0 ... 20
    //code hàm th cx đồng thời phải kiểm thử hàm, muốn kiểm thử phải có test case !!!!

    public static long getFactorial (int n) {

        if (n < 0 || n > 20){
            throw new IllegalArgumentException("Invalid n, n must be between 0 and 20");
        }
        if (n == 0){
            return 1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

}
