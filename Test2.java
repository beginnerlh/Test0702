/*
请实现接口：
unsigned int  AddCandidate (char* pCandidateName);
功能：设置候选人姓名
输入： char* pCandidateName 候选人姓名
输出：无
返回：输入值非法返回0，已经添加过返回0 ，添加成功返回1


Void Vote(char* pCandidateName);
功能：投票
输入： char* pCandidateName 候选人姓名
输出：无
返回：无

unsigned int  GetVoteResult (char* pCandidateName);
功能：获取候选人的票数。如果传入为空指针，返回无效的票数，同时说明本次投票活动结束，释放资源
输入： char* pCandidateName 候选人姓名。当输入一个空指针时，返回无效的票数
输出：无
返回：该候选人获取的票数



void Clear()

// 功能：清除投票结果，释放所有资源
// 输入：
// 输出：无
// 返回

输入描述:
输入候选人的人数，第二行输入候选人的名字，第三行输入投票人的人数，第四行输入投票。
输出描述:
每行输出候选人的名字和得票数量。

示例1
输入
4
A B C D
8
A B C D E F G H
输出
A : 1
B : 1
C : 1
D : 1
Invalid : 4
*/
package written_test0702;

import java.util.*;
//记票统计
public class Test2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int n = Integer.parseInt(in.nextLine());
            String s = in.nextLine();
            int n1 = Integer.parseInt(in.nextLine());
            String ss = in.nextLine();
            String[] str = s.split(" ");
            String[] str1 = ss.split(" ");
            int[] sum = new int[n];
            for(int i =0;i<n;i++){
                for(int j = 0;j<n1;j++){
                    if(str[i].equals(str1[j])){
                        sum[i] ++;
                    }
                }
            }
            int count = 0;
            for(int i = 0;i<n;i++){
                System.out.println(str[i]+" : "+sum[i]);
                count += sum[i];
            }
            System.out.println("Invalid : " +(n1-count));
        }
    }
}