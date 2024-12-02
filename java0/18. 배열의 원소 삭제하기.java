https://school.programmers.co.kr/learn/courses/30/lessons/181844

문제 설명
정수 배열 arr과 delete_list가 있습니다. arr의 원소 중 delete_list의 원소를 모두 삭제하고 남은 원소들은 기존의 arr에 있던 순서를 유지한 배열을 return 하는 solution 함수를 작성해 주세요.



import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
            boolean isDeleted = false;
            for(int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    isDeleted = true;
                    break; 
                }
            }
            if (!isDeleted) {
                answer.add(arr[i]);
            }
        }
        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}

//이건 챗지피티한테 스트림 사용한 코드인데 이해 안가서 그대로 가져옴
//anymatch가.. 좀 헷갈리는듯
// import java.util.stream.IntStream;

// class Solution {
//     public int[] solution(int[] arr, int[] delete_list) {
//         return IntStream.of(arr)  // arr 배열을 IntStream으로 변환
//             .filter(i -> !IntStream.of(delete_list).anyMatch(s -> s == i))  
                // delete_list에서 해당 값이 있는지 체크
                // i가 delete_list에 있으면 제외
//             .toArray();  // 결과를 int[] 배열로 반환
//     }
// }
