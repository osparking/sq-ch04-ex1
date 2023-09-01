package utility;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.io.PrintStream;

public class InOut {
	public static PrintStream console = new PrintStream(System.out, true, UTF_8);
}
