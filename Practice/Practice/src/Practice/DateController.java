

import java.time.LocalDateTime;

public class DateController {


	public String getCurrentDateTime() {
		return LocalDateTime.now().toString();
	}
}
