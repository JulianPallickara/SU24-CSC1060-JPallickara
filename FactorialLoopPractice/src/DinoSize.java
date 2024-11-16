import java.util.Scanner;

public class DinoSize {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("What is the dinosaur you would like to house?");
		String dino = scn.next();

		switch (dino) {
		case "Anchiornis", "Oculudentavis", "Compsognathus":
			System.out.println("This dinosaur will be in the extra small housing.");
			break;
		case "Edmontonia", "Pachycephalosaurus", "Dilophosaurus":
			System.out.println("This dinosaur will be in the small housing.");
			break;
		case "Albertosaurous", "Ankylosaurous", "Ceratosaurus":
			System.out.println("This dinosaur will be in the medium housing.");
			break;
		case "Carnotaurus", "Nigersaurus", "Sauroposeidon":
			System.out.println("This dinosaur will be in the large housing.");
			break;
		default:
			System.out.println("We do not have housing for your dinosaur.");
			break;
		}

	}

}
