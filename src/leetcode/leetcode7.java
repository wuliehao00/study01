package leetcode;

/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 *
 * 如果反转后整数超过 32 位的有符号整数的范围[−2^31,2^31− 1] ，就返回 0。
 *
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 *  
 *
 * 示例 1：
 *
 * 输入：x = 123
 * 输出：321
 * 示例 2：
 *
 * 输入：x = -123
 * 输出：-321
 * 示例 3：
 *
 * 输入：x = 120
 * 输出：21
 * 示例 4：
 *
 * 输入：x = 0
 * 输出：0
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class leetcode7 {
    public int reverse(int x) {
        long y = x;
        String z = "";
        if(y == 0){
            return 0;
        }
        if(y>0) {
            while (y != 0) {
                z += y % 10 + "";
                y = y / 10;
            }
            long c =Long.parseLong(z);
            if(c > Math.pow(2,31)-1){
                return 0;
            }
            return Integer.parseInt(z);
        }else{
            y = Math.abs(y);
            while (y != 0) {
                z += y % 10 + "";
                y = y / 10;
            }
            z = "-"+z;
            long c =Long.parseLong(z);
            if(c < Math.pow(-2,31)){
                return 0;
            }
            return Integer.parseInt(z);

        }

    }
}
