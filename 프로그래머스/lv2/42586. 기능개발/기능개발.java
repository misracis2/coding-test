import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> deployedJob = new ArrayList<>();
        int indexOfJob = 0;
        Stack<Integer> completedJobs = new Stack<>();
        while (indexOfJob < progresses.length) {
            for (int i = indexOfJob; i < progresses.length; i++) {
                progresses[i] += speeds[i];
                if (i == indexOfJob && progresses[indexOfJob] >= 100) {
                    completedJobs.push(i);
                    indexOfJob++;
                }
            }
            if (completedJobs.size() > 0) {
                deployedJob.add(completedJobs.size());
                completedJobs.clear();
            }

        }
        int[] answer = new int[deployedJob.size()];
        for (int i = 0; i<deployedJob.size(); i++) {
            answer[i] = deployedJob.get(i);
        }
        return answer;
    }

    private int[] dailyWorkload(int[] progresses, int[] speeds) {
        for (int i = 0; i < progresses.length; i++) {
            progresses[i] += speeds[i];
        }
        return progresses;
    }
}