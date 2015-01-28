package com.aptosstbbq.bbqapp.util;

public class Logger {

	public static final Logger ERROR = new Logger("error");
	public static final Logger DEFAULT = new Logger("log");
	public static final Logger MENU_CHANGES = new Logger("menu_changes");
	public static final Logger SELL_OUT = new Logger("sell_out");
	public static final Logger WEB = new Logger("web");

	private static final String PATH_PREFIX = "/log";
	private static final String PATH_SUFFIX = ".txt";
	
	private final String LOG_FILE;
	
	/**
	 * Creates a new logger with the given filename. Don't provide a file
	 * extension with the filename because it adds the file extension on its
	 * own.
	 * 
	 * @param logFile
	 */
	private Logger(String logFile) {
		LOG_FILE = PATH_PREFIX + logFile + PATH_SUFFIX;
	}

	public void log(String s) {
		ThreadedWriter.write(LOG_FILE, Utils.time() + " \t " + s, true);
	}
}
