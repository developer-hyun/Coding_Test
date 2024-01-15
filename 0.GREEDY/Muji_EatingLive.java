import java.util.PriorityQueue;

public class Muji_EatingLive {


    //회전판에는 N개의 음식이 있으며 각 음식에는 1부터 N까지의 번호가 있다. 각 음식은 먹는데 시간이 소요된다.
    //무지는 1번음식부터 먹기 시작하며 회전판은 번호가 증가하는 순서대로 음식을 무지앞에 놓는다.
    //마지막 번호의 음식을 먹은 후에는 1번 음식으로 다시 시작한다.
    //무지는 음식 하나를 1초 먹은 후 다음 음식을 먹는다.
    //무지가 먹방을 시작 한 후 K초 후에 방송이 중단되었다, 방송이 재개된 후 몇번 음식부터 먹어야하는지 알고자한다.
    //각 음식을 모두 먹는데 필요한 시간이 담겨져있는 food_times배열 , 네트워크 장애가 발생한 시간 K초가 주어질때 몇번 음식부터 다시 섭취하면되는지 return하도록 함수를 완성하라.
    //더 섭취할 음식이 없으면 -1을 리턴한다.
    //food_times는 100,000,000이하 , K는 2 X 10_13승 이하


    //food_times 배열을 처음부터 시작하여 해당 원소가 0 이상이면 -1을 해주고 K도 -1을 해준다.
    //배열이 끝에 도착하게되면 배열을 다시 처음부터 시작한다.(if문)
    //섭취할 음식이 없을 경우 -1을 리턴하기위해 한 변수를 foor_times배열의 길이만큼 정하고  무지가 먹을때마다 -1씩해주는데  food_times배열에 끝에 도달했을때 배열길이랑 똑같으면(음식을 다먹은것)-1을 리턴한다.
    //K초후에 해당 food_times의 배열 위치를 반환하면 된다.



    //ex)4 5 9  초가걸림..  1번음식은 4개  , 2번음식은 5개 , 3번음식은 9개
    //가장 적은 음식이 1번 4개이며 음식의 개수는 3개임.  가장 작은 음식을 다 먹기 위해서는 12초가필요함.
    //K가 15초라하면   K에서 가장 적게걸리는 음식을 뺀 15-12  = 3초가남음
    //이때 남은 음식은 2번음식 1개 3번음식 5개   가장 적게 걸리는 음식은 음식의 개수 2개 x 음식양 1개 = 2초.
    //K가 3초가남았음으로 3초 - 2초 = 1초.   이때 3번음식만 4개가남아있다. 음식의 개수1개  x 음식양 4개 = 4초
    //K가 남은 최소음식의 초수보다 작음으로 빼지않고 1초가남았음으로 그 다음에 음식을 선택하면된다.  3번음식.

    static class Collection implements Comparable<Collection> {

        private int time;
        private int index;

        public Collection(int time, int index) {
            this.time = time;
            this.index = index;
        }

        public int getTime(){
            return this.time;
        }
        public int getIndex() {
            return this.index;
        }

        //우선순위를 주어야함  이때 시간이 짧은것이 우선순위가 높음
        @Override
        public int compareTo(Collection col) {
            return Integer.compare(this.time, col.time);
        }
    }


    public static void main(String[] args) {

        soulution(new int[] {8,4,9},15);


    }
    public static int soulution(int[] food_times,long k) {

        //문제 조건에 중단된 이후에 섭취할 음식이 없으면 -1 반환 즉 food_times의 시간이 k보다 작으면 -1 반환
        long impossible_time =0;
        for ( int i =0 ; i< food_times.length ; i++ ) {
            impossible_time += food_times[i];
        }
        if(impossible_time <=k) {
            return -1;
        }

        //[음식시간, 음식번호] 형식으로 우선순위 큐에 넣는다.
        PriorityQueue<Collection> food = new PriorityQueue<>();
        for(int i=0 ; i< food_times.length ; i++) {
            food.offer(new Collection(food_times[i],i+1));
        }
        //원소에 들어갈때 시간이 적은순대로 들어간다.
       // System.out.println(food.peek().getTime());


        //K초 안에  남은음식을 다 먹을 수 있냐 여부를 체크함
        //큐의 원소를 수정할 수 없기 때문에  음식의 최소초수 x 남은음식개수 <= k  에서 음식의 최소초수에 변수를 추가해야함,
        //



        return 1;






    }

//    public int solution(int k) {
//        int[] food_times = {3,0,2};
//        int len = food_times.length;
//
//    }

//    class Solution {
//        public int solution(int[] food_times, long k) {
//            int len,lenC = food_times.length;
//
//            for ( int i=0 ; i==k ; i++) {
//                int j =i;
//                if (food_times.length-1 ==  i) {   //food_times에 끝에 도달했을때
//                    j =
//                }
//            }
//
//            int answer = 0;
//            return answer;
//        }
//    }

    class Solution {
        public int solution(int[] food_times, long k) {

            int answer = 0;
            return answer;
        }
    }



}
