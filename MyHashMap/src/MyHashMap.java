public class MyHashMap<K, V> {
	Object[] array;
	Object[] keys;
	Object[] values;

	public MyHashMap() {
		this.keys = new Object[0];
		this.values = new Object[0];
		this.array = new Object[0];
	}

	public void put(K key, V value) {
		Object[] tempKeys = new Object[keys.length + 1];
		Object[] tempValues = new Object[values.length + 1];
		Object[] tempArray = new Object[array.length + 1];

		for (int i = 0; i < keys.length - 1; i++) {
			tempKeys[i] = keys[i];
		}
		tempKeys[tempKeys.length - 1] = key;

		for (int i = 0; i < values.length - 1; i++) {
			tempValues[i] = values[i];
		}
		tempValues[tempValues.length - 1] = value;

		for (int i = 0; i < tempArray.length - 1; i++) {
			tempArray[i] = array[i];
		}
		tempArray[tempArray.length - 1] = key + " - " + value;

		array = new Object[tempArray.length];
		for (int i = 0; i < tempArray.length; i++) {
			array[i] = tempArray[i];
		}

		keys = new Object[tempKeys.length];
		for (int i = 0; i < tempKeys.length; i++) {
			keys[i] = tempKeys[i];
		}

		values = new Object[tempValues.length];
		for (int i = 0; i < tempValues.length; i++) {
			values[i] = tempValues[i];
		}

	}

	public void list() {
		for (Object arr : array) {
			System.out.println(arr);
		}

		
	}
	
	public Object getStringKey(K key) {
		String x=null;
		for (Object object : array) {
			if (object.toString().contains(key.toString())) {
			x=object.toString(); 
			x=x.replace(key.toString(),"");
			x=x.replace("= ", "");
			return x.trim();
			}
			
		}
		return null;
	}
	
	
	public Object getIntKey(K key) {
		return array[(int) key];
	}


	public void clear() {
		array = new Object[0];
		keys = new Object[0];
		values = new Object[0];

	}

	public void size() {
		System.out.println("Dizinin boyutu: " + array.length);
	}

	public void remove(K key) {
		Object[] tempArray = new Object[array.length];
		for (int i = 0; i < array.length; i++) {
			tempArray[i] = array[i];
		}

		Object[] tempKeys = new Object[keys.length];
		for (int i = 0; i < keys.length; i++) {
			tempKeys[i] = keys[i];
		}

		Object[] tempValues = new Object[values.length];
		for (int i = 0; i < values.length; i++) {
			tempValues[i] = values[i];
		}

		int count = 0;
		keys = new Object[tempKeys.length - 1];
		values = new Object[tempValues.length - 1];
		array = new Object[tempArray.length - 1];
		for (int i = 0; i < keys.length; i++) {
			if (keys[i] == key) {
				continue;
			} else {
				keys[count] = tempKeys[i];
				values[count] = tempValues[i];
				array[count] = tempArray[i];
				count++;
			}
		}

	}
}