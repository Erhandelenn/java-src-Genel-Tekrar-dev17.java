package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PerformanceTest {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < 100000; i++) {
            map.put(i, i);
        }

        long listTotalTime = 0;
        for (int i = 0; i < 1000000; i++) {
            long listStartTime = System.nanoTime();
            int listValue = list.get(99999);
            long listEndTime = System.nanoTime();
            listTotalTime += (listEndTime - listStartTime);
        }
        double listAvgTime = listTotalTime / 1000000.0;
        System.out.println("List'ten eleman bulma süresi : " + listAvgTime + " ns");

        long mapTotalTime = 0;
        for (int i = 0; i < 1000000; i++) {
            long mapStartTime = System.nanoTime();
            int mapValue = map.get(99999);
            long mapEndTime = System.nanoTime();
            mapTotalTime += (mapEndTime - mapStartTime);
        }
        double mapAvgTime = mapTotalTime / 1000000.0;
        System.out.println("Map'ten eleman bulma süresi : " + mapAvgTime + " ns");
    }
}