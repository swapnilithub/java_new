//hashmap vs hashset vs treeset
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int arr[] = {1,2,3,5,6,2,1,2,4};
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for(int i:arr){
            hMap.put(i, hMap.getOrDefault(i, 0)+1);
        }
        System.out.println(hMap);
        System.out.println(hMap.size());
        
        int arr1[] = {1,2,3,5,6,2,1,2,4};
        HashSet<Integer> hSet = new HashSet<>();
        for(int j:arr){
            hSet.add(j);
        }
        System.out.println(hSet);
        System.out.println(hSet.size());
        
        int arr2[] = {1,2,3,5,6,2,1,2,4};
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        for (int k : arr) {
            treeMap.put(k, treeMap.getOrDefault(k, 0) + 1); // Count frequency of elements
        }
        System.out.println(treeMap);
        System.out.println(treeMap.size());
    }
}
