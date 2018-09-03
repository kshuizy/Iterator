import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class BookList {
	
	List<Book> booklist = new ArrayList();
	
	public void add(Book e){
		booklist.add(e);
	}
	
	public Iterator getIterator() {
		return new Iter();
	}
	
	//内部类继承Iterator接口
	public class Iter implements Iterator{
		
		int index;
		public boolean hasNext() {
			if(index < booklist.size())
				return true;
			else
				return false;
		}

		public Object next() {
			return booklist.get(index++);
		}

		public void remove() {
			
		}
	}
	
	
	
}
