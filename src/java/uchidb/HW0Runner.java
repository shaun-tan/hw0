package uchidb;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author aelmore
 */
public class HW0Runner {
	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm
	private static Containers<Integer, String> cont = new Containers<Integer, String>() {

		private Map<String, Integer> storedMap;
		
		public Set<Integer> initSet(Integer[] tArray) {
			Set<Integer> set = new HashSet<Integer>();
			set.addAll(Arrays.asList(tArray));
			return set;
		}

		public List<Integer> initList(Integer[] tArray) {
			return Arrays.asList(tArray);
		}

		public Map<String, Integer> initEmptyMap() {
			Map<String, Integer> map = new HashMap<String, Integer>();
			return map;
		}

		public void storeMap(Map<String, Integer> mapToStoreInClass) {
			storedMap = mapToStoreInClass;
			
		}

		public boolean addToMap(String key, Integer value, boolean overwriteExistingKey) {
			if (overwriteExistingKey) {
				storedMap.put(key, value);
				return true;
			}
			else {
				return false;
			}
		}

		public Integer getValueFromMap(String key) {
			return storedMap.get(key);
		}

		public Integer getValueFromMap(String key, Integer defaultValue) {
			if (storedMap.containsKey(key)) {
				return storedMap.get(key);
			}
			else {
				return defaultValue;
			}
		}
		
	};
	
	public static Containers<Integer, String> getContainers() {
		return cont;
	}


	public static void main(String[] args){
		
	}
}
