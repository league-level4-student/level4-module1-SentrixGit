package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T> {
	T[] customArray;
	
	public <Template> Template calcStuff(Template t, int r) {
		for (int i = 0; i < r; i++) {
			System.out.println(t);
		}
		
		return t;
	}
	
	
	
	public ArrayList() {
		customArray = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		
		return customArray[loc];
	}
	
	public void add(T val) {
		T[] temp = customArray;
		
		customArray = (T[]) new Object[temp.length + 1];
		
		for (int i = 0; i < temp.length; i++) {
			customArray[i] = temp[i];
		}
		
		customArray[customArray.length - 1] = val;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		
	}
	
	public boolean contains(T val) {
		
		return false;
	}
}