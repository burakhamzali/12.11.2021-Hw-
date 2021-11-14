
public class Main {

	public static void main(String[] args) {
	
		
		MyHashMap<String, String> myHashMap = new MyHashMap<String, String>();

		myHashMap.put("Burak", "Hamzalı");
		myHashMap.put("Engin", "Demiroğ");
		myHashMap.put("Berkay", "Yıldız");
		
		myHashMap.list();
		myHashMap.size();
		
		System.out.println("*************");
		System.out.println(myHashMap.getStringKey("Burak"));
		System.out.println(myHashMap.getStringKey("Engin"));
		
		
		System.out.println("*************");
		
		myHashMap.remove("Burak");
		myHashMap.list();
		System.out.println("*************");
		
		MyHashMap<String, Integer> myHashMap2 = new MyHashMap<String, Integer>();

		
		myHashMap2.put("Burak", 26);
		myHashMap2.put("Berkay", 24);
		myHashMap2.list();
	
		
		System.out.println("************");
		myHashMap2.size();
		myHashMap2.remove("Burak");
		myHashMap2.list();
		
		System.out.println("***********");
		myHashMap2.clear();
		myHashMap2.list();
		
		MyHashMap<Integer, String> myHashMap3 = new MyHashMap<Integer, String>();
		myHashMap3.put(1881, "Atatürk");
		System.out.println(myHashMap3.getIntKey(0));
		
		
		
		
		

	}

}