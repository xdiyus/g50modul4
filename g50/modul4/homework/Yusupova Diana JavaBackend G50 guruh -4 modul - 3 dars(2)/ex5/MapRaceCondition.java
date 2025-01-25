package modul4.homework.less3.ex5;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.concurrent.ConcurrentHashMap;
//
//public class MapRaceCondition {
//
//    public static void main(String[] args) {
//        Map<Integer, String> simpleMap = new HashMap<>();
//        Map<Integer, String> concurrentMap = new ConcurrentHashMap<>();
//
//        Runnable add = () -> {
//            for (int i = 0; i < 1000; i++) {
//                simpleMap.put(i, "Yigindi: " + i);
//                concurrentMap.put(i, "Yigindi: " + i);
//            }
//        };
//
//        Thread thread1 = new Thread(add);
//        Thread thread2 = new Thread(add);
//
//        thread1.start();
//        thread2.start();
//
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Simple map size: " + simpleMap.size());
//        System.out.print("Concurrent map size: " + concurrentMap.size());
//    }
//}
