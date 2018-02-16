//Thanakorn Pasangthien Section 1 6088109
public class Song {
	private String title;
	private double duration;
	
	public Song(String title,double duration) {
		this.title = title;
		this.duration = duration;
	}
	public String geTitle() {
		return this.title;
	}
	public double getDuration() {
		return this.duration;
	}
	public double getDurationInSec() {
		return ((int)this.duration*60)+((this.duration-(int)this.duration)*100);
	}
	public String toString() {
		return geTitle()+","+getDuration()+" minutes"+"("+Math.round(getDurationInSec())+"seconds"+")";
	}
}
