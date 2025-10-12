package org.example.pg;

// 카드 뭉치
public class PG159994 {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int i = 0, j = 0, k = 0;
        String card1, card2;
        boolean result = true;

        while (i < cards1.length || j < cards2.length){
            if (k == goal.length) {
                break;
            }
            else if (i < cards1.length && cards1[i].equals(goal[k])) {
                card1 = cards1[i];
                i++;
                k++;
            }
            else if (j < cards2.length && cards2[j].equals(goal[k])) {
                card2 = cards2[j];
                j++;
                k++;
            }
            else {
                result = false;
                break;
            }
        }

        return result ? "Yes" : "No";
    }
}