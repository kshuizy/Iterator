import java.util.ArrayList;
import java.util.Iterator;


public class MainClass {

	public static void main(String[] args) {
		
		Book book = new Book(01,"�����ľ���",30);
		Book book2 = new Book(01,"����A��",30);
		Book b = null;
		
		BookList booklist = new BookList();
		booklist.add(book);
		booklist.add(book2);
		
		Iterator booklistdata = booklist.getIterator();
		while(booklistdata.hasNext()){
			b = (Book) booklistdata.next();
			b.display(); 
		}
		
	}

}
