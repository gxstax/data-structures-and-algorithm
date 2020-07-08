#include <stdio.h>


int main(int argc, char* argv[]){
    int i = 0;
    int arr[3] = {0};
    for(; i<=3; i++){
        arr[i] = 0;
        printf("hello world\n");
    }
    return 0;

    // 在数组 a 中，查找 key ，返回 key 所在的位置
    // n： 数组 a 的长度
    int find(char* a, int n, char key) {
        // 边界条件处理，如果 a 为空，或者 n <= 0, 说明数组中没有数据
        if(a == null || n <= 0) {
            return -1;
        }

        int i = 0;
        while(i < n) {
            if(a[i] == key) {
                return i;
            }
            ++i;
        }
       return -1;
    }
}