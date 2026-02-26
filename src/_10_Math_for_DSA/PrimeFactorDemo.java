package _10_Math_for_DSA;

import java.util.ArrayList;

public class PrimeFactorDemo {
    public ArrayList<Integer> findUniqueFactor(int num){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num%i==0){
                res.add(i);
                while (num%i==0){
                    num = num / i;
                }
            }
        }
        if (num > 1){
            res.add(num);
        }
        return res;
    }
//********************************************************************
    public ArrayList<Integer> findAllPrimeFactors(int num){
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 2; i <= Math.sqrt(num); i++){

                while (num%i==0) {
                    res.add(i);
                    num = num / i;
                }
        }
        if (num > 1){
            res.add(num);
        }
        return res;
    }

    void main(){
        PrimeFactorDemo pf = new PrimeFactorDemo();
        ArrayList<Integer> res = pf.findUniqueFactor(60);
        System.out.println(res);

        ArrayList<Integer> res1 = pf.findAllPrimeFactors(60);
        System.out.println(res1);
    }
}
