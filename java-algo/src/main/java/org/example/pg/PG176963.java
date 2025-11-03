package org.example.pg;

import java.util.HashMap;

// 추억 점수
public class PG176963 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        int total;
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            hashMap.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            total = 0;
            for (int j = 0; j < photo[i].length; j++) {
                total = total + hashMap.getOrDefault(photo[i][j], 0);
            }
            answer[i] = total;
        }

        return answer;
    }
}
