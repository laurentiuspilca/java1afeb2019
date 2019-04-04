import java.util.*;

public class Exemplu8 {

    public static void main(String [] args) {
        List<?> list1 = new ArrayList<Integer>();
        List<?> list2 = new ArrayList<String>();
        List<?> list3 = new ArrayList<Double>();
        
        List<? extends Number> list4 = new ArrayList<Number>();
        List<? extends Number> list5 = new ArrayList<Integer>();
        List<? extends Number> list6 = new ArrayList<Double>();
        
        List<? super Number> list7 = new ArrayList<Object>();
        List<? super Number> list8 = new ArrayList<Number>();
        
        List<String> list9 = new ArrayList<String>();
        List<Object> list10 = new ArrayList<Object>();
        List<Number> list11 = new ArrayList<Number>();
        
        List<? extends Object> list12 = new ArrayList<Object>();
    }
}