package exam2.dictionaryHashMap;

public class Main {
    public static void main(String[] args) {
        Dictionary<Integer,String> map = new Dictionary<>();
        map.put(2,"Diana");
        map.put(41,"Eldor");
        map.put(4,"Daniel");
        map.put(81,"Zulayhi");
        System.out.println(map);
        System.out.println(map.get(2));
        System.out.println("Remove: " +map.remove(81));
        System.out.println(map);
    }
}
