public class Movie implements Movie_interface, Comparable<Movie> {
	
	String title;
	String director;
	Integer rating;

	public Movie(String t, String d, Integer r) {
		title = t;
		director = d;
		rating = r;
	}
	
	public int compareTo(Movie m) {
		return title.compareTo(m.getDirector());
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getDirector() {
		return director;
	}
	
	public Integer getRating() {
		return rating;
	}
	
	public boolean mustWatch() {
		if(rating>3) {
			System.out.println(title +" is a must watch movie!!");
			return true;
		} else {
			System.out.println("Watch " +title +" at your own risk!!");
			return false;
		}
	}
	
	public static void main(String[] args) {
		Movie m1 = new Movie("Don", "Shyam", 4);
		Movie m2 = new Movie("Ra-one", "Shekar", 3);
		System.out.println("Title of movie 1: " + m1.getTitle());
		m1.mustWatch();
		System.out.println("Title of movie 2: " + m2.getTitle());
		m2.mustWatch();
		
	
		if (m1.compareTo(m2) == 0) {
			System.out.println("Director of movie 1 is SAME as director of movie 2 ");
		} else {
			System.out.println("Director of movie 1 is NOT SAME as director of movie 2 ");
		}
	}
}
