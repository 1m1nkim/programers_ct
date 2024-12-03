https://school.programmers.co.kr/learn/courses/30/lessons/181898

정수 배열 arr가 주어집니다. 이때 arr의 원소는 1 또는 0입니다. 정수 idx가 주어졌을 때, idx보다 크면서 배열의 값이 1인 가장 작은 인덱스를 찾아서 반환하는 solution 함수를 완성해 주세요.

단, 만약 그러한 인덱스가 없다면 -1을 반환합니다.


근데 이건 문제가 좀 이상함,.,
//idx 인덱스 이후에 1이 나오냐, 나오면 그 인덱스 안나오면 -1
이렇게 풀어야 문제가 풀림

class Solution {
    public int solution(int[] arr, int idx){
         for(int i=idx; i<arr.length; i++){
             if(arr[i] == 1){
                 return i;
             }
         }
        return -1;
    }
}


//처음에 
class Solution {
    public int solution(int[] arr, int idx){
        int answer = -1;
         for(int i=idx; i<arr.length; i++){
             if(arr[i] == 1){
                 answer = i;
             }
         }
        return answer;
    }
}

//이렇게 했는데 이렇게 하면 최소 인덱스가 나오는게 아니라서 틀린정답 같음 
//answer = i; break; 하면 잘 됨
// 문제를,,, 잘읽자,,,,, ,,