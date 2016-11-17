/**
 *
 */
package com.eptent.firewall;

import org.apache.commons.cli.*;

/**
 * @author psoto6
 *
 */
public class TrumpsWall {
	private static Options options;
	private static CommandLine cmd;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		setUpOptions();
		handleCommandLine(args);


	}

	private static void setUpOptions() {
		options = new Options();
		options.addOption("v", false, "display current version");
	}

	private static void handleCommandLine(String[] args) {
		CommandLineParser parser = new DefaultParser();
		try {
				cmd = parser.parse( options, args);
		}
		catch(ParseException pex) {
			System.out.println(pex.getMessage());
		}

	}

}
