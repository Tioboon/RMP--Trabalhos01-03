import java.util.ArrayList;
import java.util.List;

public class ListHelper {
    public static List<Integer> CreateIntArray(int start, int end, boolean removeStart, boolean removeEnd){
        int size = end - start;
        size -= removeStart && removeEnd ? 2 :
                removeStart || removeEnd ? 1 : 0;
        List<Integer> newList = new ArrayList<>(size);
        int trueStart = removeStart ? start + 1 : start;
        int trueEnd = removeEnd ?  end - 1 : end;

        for (int i = trueStart; i <= trueEnd; i++){
            newList.add(i);
        }
        return newList;
    }

    public static List<Integer> GetIntersection(List<Integer> a, List<Integer> b){
        List<Integer> intersection = new ArrayList<>();
        for (int aV: a){
            for (int aB : b){
                if(aV == aB)
                    if(!intersection.contains(aV))
                        intersection.add(aV);
            }
        }
        return intersection;
    }

    public static float GetMost(float[] list, String higher){
        var max = higher == "HIGH" ? Double.NEGATIVE_INFINITY : Double.POSITIVE_INFINITY;
        for (float value : list) {
            max = higher == "HIGH" ? value > max ? value : max : value < max ? value : max;
        }

        return (float)max;
    }
}
