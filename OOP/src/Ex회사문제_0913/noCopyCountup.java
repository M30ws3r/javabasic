package Ex회사문제_0913;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class noCopyCountup{
    public static void main(String[] args) {
        int[] arr  = {2, 1, 3, 3};
        int[] arr1 = {3, 4, 4, 2, 5, 2, 5, 5};
        int[] arr2 = {3, 5, 3, 5, 7, 5, 7};
        
        solution(arr);
        solution(arr1);
        solution(arr2);
    }
    
    public static void solution(int[] arr) {
        // 배열을 순회 > 각 요소 개수를 세어 countMap에 저장.
        Map<Integer, Integer> countMap = new HashMap<>();
        
        for(int num : arr){
            countMap.put(num, countMap.getOrDefault(num, 0)+1);
        }
        
        //  개수가 1인 요소들만 필터링하여 리스트로 수집
        List<Integer> uniqueElements = countMap.entrySet().stream()
            .filter(entry -> entry.getValue() == 1)
            .map(Map.Entry::getKey)
            .sorted()
            .collect(Collectors.toList());
        
        // 결과 출력
        System.out.println("원본 배열: " + java.util.Arrays.toString(arr));
        System.out.println("정렬된 고유 요소들: " + uniqueElements);
    }
}