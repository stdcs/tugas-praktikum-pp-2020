import java.util.Scanner;
import java.util.ArrayList;

class FavouriteMovie {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		Scanner adding = new Scanner(System.in);

		ArrayList<String> title = new ArrayList<>();
		ArrayList<String> released = new ArrayList<>();
		ArrayList<String> duration = new ArrayList<>();
		ArrayList<String> genre = new ArrayList<>();
		ArrayList<String> sinopsis = new ArrayList<>();
		ArrayList<String> cast = new ArrayList<>();

	// initial list
		title.add("Avengers: Endgame");
		released.add("24 April 2019");
		duration.add("3 jam 1 menit");
		genre.add("Adventure, Sci-Fi, Action");
		sinopsis.add("Ini adalah sinopsis");
		cast.add("Robert Downey Jr., Chris Evan, Mark Ruffalo, dkk.");

		title.add("Spiderman: Far From Home");
		released.add("2 Juli 2019");
		duration.add("2 jam 9 menit");
		genre.add("Sci-Fi, Adventure");
		sinopsis.add("Itu adalah sinopsis");
		cast.add("Tom Holland, Zendaya, Jacob Batalon");

		title.add("Venom");
		released.add("5 Oktober 2018");
		duration.add("1 jam 52 menit");
		genre.add("Sci-Fi, Adventure, Action");
		sinopsis.add("Ini juga sinopsis");
		cast.add("Tom Hardy, Michelle Williams, Woody Harrelson");

		title.add("Thor: Ragnarok");
		released.add("3 November 2017");
		duration.add("2 jam 10 menit");
		genre.add("Sci-Fi, Adventure");
		sinopsis.add("Itu juga sinopsis");
		cast.add("Chris Hemsworth, Cate Blanchett, Tom Hiddleston");
	//

		while (true) {
			printList(title);
			while (obj.hasNext()) {
				String type = obj.next();
				int select = 0;
				System.out.print("\n");
				try {
					if (type.equalsIgnoreCase("d") && obj.hasNextInt()) {
						select = (obj.nextInt() - 1);
						System.out.println("DETAIL FILM");
						System.out.println("Judul \t\t: " + title.get(select));
						System.out.println("Rilis \t\t: " + released.get(select));
						System.out.println("Durasi \t\t: " + duration.get(select));
						System.out.println("Genre \t\t: " + genre.get(select));
						System.out.println("Sinopsis \t: " + sinopsis.get(select));
						System.out.println("Cast \t\t: " + cast.get(select));
					} else if (type.equalsIgnoreCase("s") && obj.hasNext()) {
						String search = obj.next();
						boolean available = false;
						System.out.println("HASIL PENCARIAN");
						for (String element : title) {
							if (element.contains(search)) {
								System.out.printf("%s (%d)\n", element, (title.indexOf(element) + 1));
								available = true;
							}
						}	
						if (!available) {
							System.out.println("Film not found!");
						}
					} else if (type.equalsIgnoreCase("a")) {
						System.out.println("TAMBAHKAN FILM!");
						System.out.print("Masukkan Judul: ");
						title.add(adding.nextLine());
						System.out.print("Masukkan Tanggal Rilis: ");
						released.add(adding.nextLine());
						System.out.print("Masukkan Durasi: ");
						duration.add(adding.nextLine());
						System.out.print("Masukkan Genre: ");
						genre.add(adding.nextLine());
						System.out.print("Masukkan Sinopsis: ");
						sinopsis.add(adding.nextLine());
						System.out.print("Masukkan Daftar Cast: ");
						cast.add(adding.nextLine());
					} else if (type.equalsIgnoreCase("r") && obj.hasNextInt()) {
						select = (obj.nextInt() - 1);
						title.remove(select);
						released.remove(select);
						duration.remove(select);
						genre.remove(select);
						sinopsis.remove(select);
						cast.remove(select);
					} else {
						System.out.println("Invalid Input!");
					}
				} catch(Exception outOfBounds) {
					System.out.println("Film Not Found!");
				}
				System.out.println("(type 'Y' to continue, else program will stop)");
				String confirm = obj.next();
				if (confirm.equalsIgnoreCase("Y")) {
					break;
				} else {
					return;
				}
			}
			System.out.print("\n");
		}
	}

	static void printList(ArrayList<String> title) {
		System.out.println("==== Favourite Movie ====");
			for (int i = 0; i < title.size(); i++) {
				System.out.printf("%d. %s\n", (i + 1), title.get(i));
			}	
			System.out.println("(d)Detail (s)Search (a)Add (r)Remove");
	}
}
