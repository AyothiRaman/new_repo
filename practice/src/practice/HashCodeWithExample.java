package practice;

import java.util.HashMap;

class CustomKey{
	
	private String keys;
	
	public String getKeys() {
		return keys;
	}

	public void setKeys(String keys) {
		this.keys = keys;
	}
	   @Override
	    public boolean equals(Object o) {
	        if (this == o) return true;
	        if (o == null || getClass() != o.getClass()) return false;
	        CustomKey customKey = (CustomKey) o;
	        return keys.equals(customKey.keys);
	    }

	    @Override
	    public int hashCode() {
	        return keys.hashCode();
	    }

	    @Override
	    public String toString() {
	        return "CustomKey{" +
	                "keyName='" + keys + '\'' +
	                '}';
	    }

		public CustomKey(String keys) {
			super();
			this.keys = keys;
		}

}


public class HashCodeWithExample {
	
	  public static void main(String[] args) {
	        HashMap<CustomKey, String> customMap = new HashMap<>();

	        CustomKey key1 = new CustomKey("key1");
	        CustomKey key2 = new CustomKey("key2");

	        customMap.put(key1, "Value 1");
	        customMap.put(key2, "Value 2");

	        // Retrieving values using the custom keys
	        System.out.println("Value associated with key1: " + customMap.get(key1));
	        System.out.println("Value associated with key2: " + customMap.get(key2));
	    

}

}