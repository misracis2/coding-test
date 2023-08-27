import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        for (int p : people) {
            list.add(p);
        }
        list.sort(Comparator.naturalOrder());
        Deque<Integer> deque = new ArrayDeque<>(list.size());
        deque.addAll(list);

        while (!deque.isEmpty()) {
            int person = deque.pollLast();
            //보트에 탈 수 있는 건 최대 2명. 무게 남아도 상관 없음
            if(!deque.isEmpty() && person + deque.peekFirst() <= limit){deque.pollFirst();}
            answer++;
        }

        return answer;
    }
}