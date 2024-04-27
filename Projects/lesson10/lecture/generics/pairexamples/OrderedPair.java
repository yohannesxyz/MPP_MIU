package lesson11.lecture.generics.pairexamples;


//This version implements the generic class Pair<K,V>
public class OrderedPair<K, V> implements Pair<K, V> {
    private K key;
    private V value;

    public OrderedPair(K key, V value) {
		this.key = key;
		this.value = value;
    }

    public K getKey()	{ return key; }
    public V getValue() { return value; }
    
    @Override
	public String toString() {
		return defaultToString();
	}
    
    public static void main(String[] args) {
    	Pair<String, Integer> p = new OrderedPair<>("Bob", 1001);
    	Pair<Integer,String> p1 = new OrderedPair<>(10,"Tom");
    	System.out.println(p);
    	System.out.println(p1);
    }
    
    
    
}