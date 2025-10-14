package org.example.pg;

import java.util.HashMap;

// 달리기 경주
public class PG178871 {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = new String[players.length];
        String bfPlayer; // 해설진이 부른 사람의 앞 선수
        int curr = 0;
        HashMap<String, Integer> playersHashMap = new HashMap<String, Integer>();
        HashMap<Integer, String> playersHashMap_rv = new HashMap<Integer, String>();

        for (int i = 0; i < players.length; i++) {
            playersHashMap.put(players[i], i);
            playersHashMap_rv.put(i, players[i]);
        }

        for (String afPlayer : callings) {
            curr = playersHashMap.get(afPlayer);
            bfPlayer = playersHashMap_rv.get(curr - 1);
            playersHashMap.put(afPlayer, curr - 1);
            playersHashMap.put(bfPlayer, curr);
            playersHashMap_rv.put(curr - 1, afPlayer);
            playersHashMap_rv.put(curr, bfPlayer);
        }

        for (String player : playersHashMap.keySet()) {
            answer[playersHashMap.get(player)] = player;
        }

        return answer;
    }
}
