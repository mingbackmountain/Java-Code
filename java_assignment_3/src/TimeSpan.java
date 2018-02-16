//Thanakorn Pasangthien Section1 6088109 
public class TimeSpan {
	private int hours;
	private int minute;
	public TimeSpan(int hours,int minute) {
		this.hours = hours;
		this.minute = minute;
	}
	public int getHours() {
		return hours;
	}
	public int getMinutes() {
		return minute;
	}
	public void add(int hours, int minute) {
		if(hours>0) {
			this.hours += hours;
		}
		if(minute>=0&&minute<=59) {
			int totalminute = this.minute+minute;
			if(this.minute+minute>59) {
				this.minute = totalminute-60;
				this.hours++;
			}else {
				this.minute += minute;
			}
		}
	}
	public void add(TimeSpan x) {
		if(x.hours>0) {
			this.hours += x.hours;
		}
		if(x.minute>=0&&x.minute<=59) {
			int totalminute = this.minute+minute;
			if(this.minute+x.minute>59) {
				this.minute = totalminute-60;
				this.hours++;
			}else {
				this.minute += x.minute;
			}
		}
	}
	public double getTotalHours() {
		double totalhours = hours+(minute/60.0);
		return totalhours;
	}
	public String toString() {
		return getHours()+"h"+getMinutes()+"m";
	}
	
}
