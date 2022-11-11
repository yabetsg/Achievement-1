import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RomanToIntTranslator {

    public int romanToInt(String roman) {

        roman = roman.toUpperCase();
        String[] a = roman.split("");
        int sum = 0;
        List<String> storage = new ArrayList<>(Arrays.asList(a));

        for(int i =0; i<storage.size(); i++){
            int current = romanValue(storage.get(i));
            int next = 0;

            if(i+1<storage.size()) {
                 next = romanValue(storage.get(i+1));
            }
            if(current >= next){
                sum+=current;
            }else{
                sum-=current;
            }

        }

      return sum;
    }
    public int romanValue(String roman){
        switch (roman) {
            case "I":
                return 1;
            case "V":
                return 5;
            case "X":
                return 10;
            case "L":
                return 50;
            case "C":
                return 100;
            case "D":
                return 500;
            case "M":
                return 1000;
        }
        return 0;
    }


}
