/**
 *
 */
package com.eptent.firewall;

import org.apache.commons.cli.*;

/**
 * Javadoc text.
 *
 * @author Peter L Sotos
 * This class bans domains for countries on a configurable "bad" list.
 */
public class TrumpsWall {
	final static Logger logger = LoggerFactory.getLogger(TrumpsWall.class);
	private static Options options;
	private static CommandLine cmd;

	/**
	 * @param args  the command line arguments, may be null
	 */
	public static void main(String[] args) {
		setUpOptions();
		handleCommandLine(args);


	}

/**
* Javadoc text.
*
* This class sets up the Command Line argument options.
*/
	private static void setUpOptions() {
		options = new Options();
		options.addOption("v", false, "display current version");
	}

/**
* Javadoc text.
*
* This class parses the command line according to the configuration created in
* the setUpOptions() method.

@param args the arguments parameter which was passed in from the command line, not null
*/
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
