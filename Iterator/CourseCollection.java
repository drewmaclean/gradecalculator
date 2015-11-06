package Iterator;

import java.util.ArrayList;
import java.util.List;

public class CourseCollection implements Collection {
	List courseList = new ArrayList();
	
	@Override
	public Iterator addIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator removeIterator() {
		// TODO Auto-generated method stub
		return null;
	}	

	@Override
	public Iterator getIterator() {
		return new ItemIterator();
	}
	
	private class ItemIterator implements Iterator {

	      int index;

	      @Override
	      public boolean hasNext() {
	      
	         if(index < names.length){
	            return true;
	         }
	         return false;
	      }

	      @Override
	      public Object next() {
	      
	         if(this.hasNext()){
	            return names[index++];
	         }
	         return null;
	      }		
	   }

}
