class Solution {
    public int solution(int k, int[][] dungeons) {
        boolean[] isVisit = new boolean[dungeons.length];

        return adventure(k, dungeons, isVisit);
    }
    public int adventure(int k, int[][] dungeons, boolean[] isVisit) {
        int max = 0;
        for (int i = 0; i < dungeons.length; i++) {
            if (!isVisit[i] && k >= dungeons[i][0]) {
                isVisit[i] = true;
                max = Math.max(max, adventure(k-dungeons[i][1], dungeons, isVisit));
                isVisit[i] = false;
            }
        }
        return Math.max(max, count(isVisit));
    }

    int count(boolean[] isVisit) {
        int visitedDungeonNumber = 0;
        for (int i = 0; i < isVisit.length; i++) {
            if (isVisit[i]) {
                visitedDungeonNumber++;
            }
        }
        return visitedDungeonNumber;
    }
}