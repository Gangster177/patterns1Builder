package tasks2;

import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source){
        Logger logger = Logger.getInstance();
        return source.stream()
                .filter(x -> x < treshold)
                .collect(Collectors.toList());
    }
}
