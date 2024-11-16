import java.io.PrintStream;

public class PrintMessage {

	public String printMessage() {
		String string = "This is my first programming test";
		return string;

	}

	public static void main(String[] args) {
		PrintMessage printer = new PrintMessage();

		String message = printer.printMessage();
		System.out.print(message);

	}

}
