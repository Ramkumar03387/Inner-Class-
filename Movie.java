
public class Movie {
	
	public void start() {
		System.out.println("run,hd360");
	}
	public class HMovie{
		public void play() {
			System.out.println("hollywood,grafics are so good,very intresting story");
		}
	}
	public static void main(String args[]) {
		Movie m = new Movie(); 
		m.start();
		Movie.HMovie h = m.new HMovie();
		h.play();
	}

}
