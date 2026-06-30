package level02.day01;

public class Prob01 {
    void main(String[] args) {
    Solution s = new Solution();
    Solution2 t = new Solution2();
    int result = s.solution(4,5);
        System.out.println(result);



    }



    static class Solution {
        public int solution(int num1, int num2) {
            int answer = num1 + num2;
            return answer;
        }
    }
    static class Solution2 {
        public int solution(int num1, int num2) {
            int answer = num1 - num2;
            return answer;
        }
    }

}
