package _17_Hashing;

import java.util.HashMap;
import java.util.Objects;

public class MyHashMap {
    void main(){
//        HashMap<Integer, Integer> collegeRankingMap = new HashMap<>();
//        collegeRankingMap.put(111, 001);
//        collegeRankingMap.put(112, 002);
//        collegeRankingMap.put(113, 003);
//        System.out.println(collegeRankingMap);
//        System.out.println(collegeRankingMap.get(111));


        HashMap<MyCollege, MyRanking> collegeRankedMap2 = new HashMap<>();
        collegeRankedMap2.put(new MyCollege(111), new MyRanking(1));
        collegeRankedMap2.put(new MyCollege(112), new MyRanking(2));
        collegeRankedMap2.put(new MyCollege(113), new MyRanking(3));
        collegeRankedMap2.put(new MyCollege(114), new MyRanking(4));
        System.out.println(collegeRankedMap2.get(new MyCollege(111)));

    }
}

class MyCollege{
    int regNo;
    private int hashCode;

    MyCollege(int regNo){
        this.regNo = regNo;
        this.hashCode = Objects.hashCode(regNo);
    }

    @Override
    public int hashCode(){
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        MyCollege college = (MyCollege) obj;
        return this.regNo == college.regNo;

    }
}

class MyRanking{
    int rank;

    MyRanking(int rank){
        this.rank = rank;
    }

    @Override
    public String toString() {
        return ""+this.rank;
    }
}
