/*
对于给定的正整数 n，计算其十进制形式下所有位置数字之和，并计算其平方的各位数字之和。

输入描述:
每行输入数据包括一个正整数n(0<n<40000)


输出描述:
对于每个输入数据，计算其各位数字之和，以及其平方值的数字之和，输出在一行中，之间用一个空格分隔，但行末不要有空格。
示例1
输入
4
12
97
39999
输出
4 7
3 9
16 22
39 36
*/
package written_test0702;

import java.util.Scanner;
//数字之和
public class Test1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            int a = in.nextInt();
            System.out.println(sum(a)+" "+sum(a*a));
        }
    }
    public static int sum(int a){
        if(a<10){
            return a;
        }
        return a%10+sum(a/10);
    }
}
