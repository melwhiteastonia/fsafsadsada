import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Person {
	
	private String name; 
    private int age; 
    
    public Person(String name, int age) {
    	
    	this.name = name; 
    	this.age = age; 
    	
   }


public String getName() {
	
	return name; 
	
}

public int getAge() {
	
	return age; 
}

public void setName( String name) {
	
	this.name = name; 
	
}


public void setAge(int age) {
	
	this.age = age; 
}


public boolean equals(Object o) {
	
	if (this == o) {
        return true;
    }
    if (o == null || getClass() != o.getClass()) {
        return false;
    }
    Person person = (Person) o;
    if (name != null ? !name.equals(person.name) : person.name != null) {
        return false;
    }
    return true;
}
	
	
	
	
	

public String toString() {
    return "Person(" + name + "," + age + ")";
}



		

public static List<Person> readPersons(String fileName)
throws FileNotFoundException {
    
    
    
    List<Person> content = new ArrayList<>(); 
    try(BufferedReader cv = new BufferedReader(new FileReader(fileName))){
        
        
        String line = "";
        while(( line = cv.readLine( )) != null)
        {
          // Get the data from the CSV object
          String[] csvData = line.split( "," );
          
          // Create a Person object with the retrieved data
          Person personFromCsvLine = new Person( csvData[0], Integer.parseInt( csvData[3] ));
          
          // Now you can add the person object to your list
          content.add( personFromCsvLine );
        }  
        
        
    
        
    }
    
    catch (IOException e) {
    	
    	e.printStackTrace();
        
        
    }
    
    return content; 
    
    
    
}}





	


	

