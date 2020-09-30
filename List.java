package defaultpackage;

public class List {

	private final int MAXSIZE = 50;
	private String[] list;
	private int dataSize;
	private int top;
	
	//default constructor
	public List() {
		list = new String[MAXSIZE];
		dataSize = 0;
		top = 0;
	}
	
	//returns the content at a given position
	public String get(int pos) {
		if(pos <= dataSize)
		return list[pos-1];
		else
			return null;
	}
	
	//inserts a string at a given position (no overlap)
	public void insert(String content, int pos) {
		if(pos < dataSize+1) {
			for(int i = dataSize; i > pos; i--) {
				list[i] = list[i-1];
			}
			list[pos-1] = content;
			dataSize++;
		}
		else if(pos == dataSize+1) {
			String[] temp = new String[list.length + MAXSIZE];
			for(int i = top; i < dataSize; i++) {
				list[i] = temp[i];
			}
			temp[pos-1] = content;
			dataSize++;
			list = temp;
		}
	}
	
	//returns the position at which a given string is at in the list
	public int findString(String content) {
		int pos = 0;
		for(int i = top; i < dataSize; i++) {
			if(list[i].equals(content))
				pos = i + 1;
		}
		return pos;
	}
	
	public String toString() {
		String str = "Contents of list:";
		for(int i = 0; i < list.length; i++) {
			str += "\n" + list[i];
		}
		return str;
	}
}
