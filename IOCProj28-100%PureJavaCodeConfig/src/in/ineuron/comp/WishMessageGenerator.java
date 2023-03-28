package in.ineuron.comp;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value = "wmg")
public class WishMessageGenerator {

	static {
		System.out.println("WishMessageGenerator.class file is loading...");
	}

	public WishMessageGenerator() {
		System.out.println("WishMessageGenertor :: Zero param constructor...");
	}

	@Autowired
	@Qualifier("dt")
	private LocalDateTime date;

	// Business Logic
	public String greetMessage(String user) {
		int hour = date.getHour();
		if (hour < 12) {
			return "Good Morning " + user;
		} else if (hour < 16) {
			return "Good Afternoon " + user;
		} else if (hour < 20) {
			return "Good Evening " + user;
		} else {
			return "Good Night " + user;
		}
	}

	@Override
	public String toString() {
		return "WishMessageGenerator [date=" + date + "]";
	}

}
