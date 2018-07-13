package dynamic;

class DynamicArray {

	private int data[];
	private int nextIndex;
	public void dynamicArray()
	{
		data = new int[5];
		
	}
	public void add(int element)
	{
		if(nextIndex==data.length) {
			restructure();
		}
		data[nextIndex]=element;
		nextIndex++;
	}
	public void restructure()
	{
		int temp[] = data;
		data = new int[data.length*2];
		for(int i=0;i<temp.length;i++)
		{
			data[i] = temp[i];
		}
	}
	public void set(int index,int element)
	{
		if(index > nextIndex) {
			System.out.println("Enter a valid Index");
		}
		else if(index == nextIndex)
		{
			add(element);
		}
		else
		{
			data[index] = element;
		}
	}
	public boolean isEmpty() {
		if(size()==0)
			return true;
		else
			return false;
	}
	public int size() {
		return nextIndex;
	}
	public int removeLast()
	{
		if(nextIndex < 1) {
			return -1;
		}
		int val = data[nextIndex - 1];
		nextIndex--;
		return val;
	}
}
class Main
{
        public static void main(String[] args)
        {
          DynamicArray a=new DynamicArray();
          System.out.println("dynamic array size is:"+a.dynamicArray());
          System.out.println("add element to dynamic array:"+a.add());
          System.out.println("Restrcture dynamic array:"+a.restrcture());
          System.out.println("set element in dynamic array:"+a.set(5,4));             
          System.out.println("is this dynamic array is empty:"+a.isEmpty());
          System.out.println("tell me the size of this dynamic array:"+a.size());
          System.out.println("remove the element from the array:"+a.removeLast());
}
}