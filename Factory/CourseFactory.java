package Factory;

public class CourseFactory {
	
	public Course getCourse(String course) {
		if (course == null) {
				return null;
		}
		else if(course == "undergradcourse") {
			return new ConcreteCourse();
		}
		return null;
		
	}

}
