import java.util.ArrayList;
import java.util.List;

public class MaxFreqInSorted {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList();
        //dfs(root, values);
         int maxStreak = 0;
        int currStreak = 0;
        int currNum = 0;
        List<Integer> ans = new ArrayList();

        for (int num : values) {
            if (num == currNum) {
                currStreak++;
            } else {
                currStreak = 1;
                currNum = num;
            }
            
            if (currStreak > maxStreak) {
                ans = new ArrayList();
                maxStreak = currStreak;
            }
            
            if (currStreak == maxStreak) {
                ans.add(num);
            }
        }
    }
}
