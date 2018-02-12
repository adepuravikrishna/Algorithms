import java.util.HashMap;

public class SetDataStructure implements ISet {
	private HashMap<Object, Object> map;

	@Override
	public boolean add(Object obj) {
		if (map != null) {
			if (obj == null)
				return false;
			if (!map.containsKey(obj)) {
				map.put(obj, obj);
				return true;
			} else {
				return false;
			}

		} else {
			map = new HashMap<Object, Object>();
			map.put(obj, obj);
			return true;
		}

	}

	@Override
	public int size() {
		return map.size();
	}

	@Override
	public boolean isEmpty() {
		return map.isEmpty();
	}

	@Override
	public boolean contains(Object obj) {
		return map.get(obj) == null ? false : true;
	}

}
