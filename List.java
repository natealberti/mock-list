package defaultpackage;

public class List {

	private final int MAXSIZE = 50;
	private String[] list;
	
	//default constructor
	public List() {
		list = new String[MAXSIZE];
	}
	
	//returns the content at a given position
	public String get(int pos) {
		return list[pos-1];
	}
	
	//inserts a string at a given position (no overlap)
	public void insert(String content, int pos) {
		String[] temp = new String[list.length + MAXSIZE];
		for(int i = 0; i < pos-2; i++) {
			temp[i] = list[i];
		}
		temp[pos-1] = content;
		for(int i = pos-1; i < list.length; i++) {
			temp[i+1] = list[i];
		}
		list = temp;
	}
	
	//returns the position at which a given string is at in the list
	public int findString(String content) {
		int pos = -1;
		for(int i = 0; i < list.length; i++) {
			if(list[i].equals(content))
				pos = i + 1;	
		}
		if(pos == -1)
			return 0;
		else
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
