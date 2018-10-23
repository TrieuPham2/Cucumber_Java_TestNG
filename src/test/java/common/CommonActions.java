package common;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class CommonActions {

	/**
	 * Get the current date time
	 * 
	 * @return String
	 */
	public String getDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("yyMMddHHmmss");
		Date date = new Date();
		String getText = dateFormat.format(date);
		return getText;
	}

	/**
	 * Get random text
	 * 
	 * @param prefixText
	 * @return String
	 */
	public String getRandomText(String prefixText) {
		Random rand = new Random();
		int num = rand.nextInt(1000);
		return prefixText + "_" + num;
	}

	/**
	 * Get file path
	 * 
	 * @param fileName
	 *            String
	 * @return true/false
	 */
	public String getPathFile(String fileName) {
		File file = new File(fileName);
		return file.getAbsolutePath();
	}
}
