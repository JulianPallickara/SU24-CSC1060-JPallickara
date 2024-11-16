public class TimeClass {
	private int hour;
	private int minute;
	private double second;

	public TimeClass() {
		this.hour = 0;
		this.minute = 0;
		this.second = 0.0;
	}

	public TimeClass(int hour, int minute, double second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public double getSecond() {
		return second;
	}

	public void setSecond(double second) {
		this.second = second;
	}

	public TimeClass add(TimeClass time2) {
		TimeClass sum = new TimeClass();
		sum.hour = this.hour + time2.hour;
		sum.minute = this.minute + time2.minute;
		sum.second = this.second + time2.second;
		
		if (sum.second >= 60.0) {
			sum.second -= 60.0;
			sum.minute += 1;
		}
		
		if (sum.minute >= 60) {
			sum.minute -= 60;
			sum.hour += 1;
		}
		
		if (sum.hour >= 24) {
			sum.hour -= 24;
		}
		
		return sum;
	}

	public void printTime(TimeClass time) {
		System.out.printf("%02d:%02d:%04.1f\n", time.hour, time.minute, time.second);
		TimeClass time1 = new TimeClass(9, 30, 0.0);
		TimeClass time2 = time1;
		TimeClass time3 = new TimeClass(9, 30, 0.0);
	}

	public TimeClass add(TimeClass timer1, TimeClass timer2) {
		//TimeClass sum = new TimeClass();
		//sum.hour = timer1.hour + timer2.hour;
		//sum.minute = timer1.minute + timer2.minute;
		//sum.second = timer1.second + timer2.second;		
		
		return timer1.add(timer2);
	}

	@Override
	public String toString() {
		String timeString = "TimeClass [hour = " + hour + ", minute = " + minute + ", second = " + second + "]";
		return timeString;
	}

	
	public static void main(String[] args) {
		TimeClass time1 = new TimeClass(9, 30, 0.0);
		TimeClass time2 = time1;
		TimeClass time3 = new TimeClass(1, 30, 0.0);

		TimeClass time = new TimeClass(11, 59, 59.9);
		String setTime = time.toString();

		TimeClass endTime = time1.add(time1, time3);
		String endTimeString = endTime.toString();
		System.out.println(endTimeString);
	}

}
