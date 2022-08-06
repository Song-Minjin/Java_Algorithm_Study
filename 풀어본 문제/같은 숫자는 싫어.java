// 같은 숫자는 싫어

import java.util.*;
import java.util.ArrayList;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = new int[arr.length];
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(arr[0]);

        for(int i=1; i<arr.length; i++){
            if(arr[i] == arr[i-1])
                continue;
            else{
                list.add(arr[i]);
            }
        }
        answer = new int[list.size()];
        for(int i = 0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}

------------------------------------------------------------------------
preNum을 사용하여 preNum과 num의 값이 같지 않을때 list에 넣고,
num값을 preNum에 할당하여 비교한다.


import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        int preNum = 10;
        for(int num : arr) {
            if(preNum != num)
                tempList.add(num);
            preNum = num;
        }       
        int[] answer = new int[tempList.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = tempList.get(i).intValue();
        }
        return answer;
    }
}
