import javax.swing.*;

public class String_Compression {



    // 어피치가 문자열을 자르는 알고리즘을 연습한다.
    //ex) "aabbaccc" 는 2a2ba3c
    // "abcabcdede" 는 2abcdede
    // "ababcdcdababcdcd"는 2ababcdcd
    // "abcabcdede" 는 2abcdede
    //문자열 s가 주어질때 문자열을 잘라 압축하여 표현한 문자열 중 가장 짧은 것의 길이를 return하는 함수를 만드시오.
    //s는 1000이하 O(N2)

    //문자열은 제일 앞에서 부터 정해진 길이만큼만 잘라야함!  xabcabcdede는 앞에서부터 못자름으로 압축이 불가함 3개면 3개로만 잘라야하며 2개면 2개로만 잘라야함!

    //길이가 1000이므로 완전 탐색으로 한다.
    //1개로 자르는경우 , 2개로 자르는경우 , 3개로 자르는경우 , 4개로 자르는경우 ~~~~   자르는 경우의 수가 최대 2/N까지임으로 2/N까지 확인한다
    public static void main(String[] args) {

        String s = "abcabcdede";
        Solution solution = new Solution();
        System.out.println(solution.solution(s));

    }

    public static class Solution {
        public int solution(String s) {
            int answer = s.length(); //최종답!
            int count =1;  //압축횟수  aaaa면 2aa로 나타내기위한 압축횟수 저장

            //for문으로 문자열을을 1개부터 2개,3개~~~~  2/N까지 정해진 길이만큼 자르는 부분
            for(int i=1; i<=(s.length() / 2) +1 ; i++ ) {
                String com = ""; //최종 압축된 문자열을 위한 변수
                String str_seq = s.substring(0,i); //1개로 자르는 것 부터 2/N까지 자른 문자열을 담는 변수 + 비교하기위한 변수
                for(int step = i ; step<=s.length(); step +=i) {   //문자열을 위에서 정한 길이만큼 탐색하면서 압축이 가능한지 확인  //2개씩 자르면 계속 2개씩 잘라야함!!
                    int max_index = Math.min(step+i,s.length()); //해당변수는 비교중에 마지막 부분에서 s의길이를 넘어버리는 경우의 수가 생기기 때문에 넘지못하게 해둔다.ex) aabcd면 2개씩 비교하면 bd / d?를 비교해야하는데 이러면 안되기때문에 제한이 필요!
                    String compare = s.substring(step,max_index); //앞과 뒤의 문자열을 비교해야함!
                    if(str_seq.equals(compare)) {   //전에 문자열과 뒤에 문자열이 같다면 count를 더해주어 압축이 가능하다
                        count ++;
                    }
                    else { //압축이 불가능하다면(문자열이 다르다면)  count가 2이상이면 숫자+문자열  // 1이면 그대로 문자열만
                        if(count >= 2) {
                            com += count + str_seq;
                        }
                        else {
                            com += str_seq;
                        }
                        //압축된거를 최종 문자열에 넣어놨기 때문에 count변수와 다음 문자열 재정의 필요
                        count =1;
                        str_seq = compare ;
                    }
                }
                com += str_seq;  //ex) aaaabcd면 2개씩비교했을때 2a / bc / d 가 남게되어 d부분은 위에 for문을 통하지않게된다. 그러므로 남은 문자열까지 합쳐줘야된다.
                answer = Math.min(answer,com.length()); //압축한 문자열 com과 기존s의 길이인 answer중에 짧은 길이만 저장한다. 그 후 다시 s/2까지 비교한다.

             //   System.out.println(str_seq);

//                for(int j=i ; j<s.length(); j+=i) { //각 단위별로 앞뒤로 비교해야하니까  3개로 자르면 s의 끝까지 3개로 비교해야함
//                    if ( str_seq.equals(s.substring(j,j+i))) {  //앞과 뒤의 문자열이 같다면 압축이 가능함으로 압축횟수에 1을 더한다
//                        count += 1;
//                    }
//
//                    //앞과 뒤의 문자열이 다르다면 -> 압축불가
//                    else {
//                        if (count >=2) {
//                            com += count + str_seq; //압축이 되었다면 현재 압축된 문자열을 추가한다.
//                        }
//                        else {
//                            com += str_seq ; //안되었다면 문자열을 그대로 추가한다
//                        }
//                        //여기까지는 ex) aaaacde면 2aacde인상태 2개로 잘랐을때 뒤에 문자열로 2개씩 자를수 있는지 확인해야하기 때문에 count와 str_seq를 초기화할 필요가 있다.
//                        count =1;
//                        str_seq = s.substring(j,j+i);
//                    }
//                }
//               // com += s.substring(A);
//                answer = Math.min(answer, com.length());  //최소길이 갱신


            }
            return answer;
        }
    }
}
