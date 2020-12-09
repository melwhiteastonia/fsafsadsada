import java.util.Comparator;

public interface comparator<T> {
	
	
	
	class sortArray implements Comparator<Person>{

		@Override
		public int compare(Person o1, Person o2) {
			// TODO Auto-generated method stub
			int ageCompare = o1.getAge2().compareTo(o2.getAge2());
			
			return ageCompare; 
		}
		
		
		
		
		
	}

}
