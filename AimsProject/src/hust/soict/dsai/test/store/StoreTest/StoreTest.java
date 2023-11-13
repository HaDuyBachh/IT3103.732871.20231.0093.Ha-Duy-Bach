package hust.soict.dsai.test.store.StoreTest;
import hust.soict.dsai.aims.disc.DigitalVideoDisc.DVD;
import hust.soict.dsai.aims.store.Store.Store;

public class StoreTest {
	public static void main(String[] args) {
		Store store = new Store(10);
		
		//Thêm các DVD vào giỏ hàng
		DVD dvd1 = new DVD("The Lion King", 
				"Animation", "Roger Allers",87, 19.95f);
		store.AddDVD(dvd1);
		
		DVD dvd2 = new DVD("Star Wars", "Science Fiction",
				"George Lucas", 87, 24.95f);
		store.AddDVD(dvd2);
		
		DVD dvd3 = new DVD("Aladin", "Animation", 18.99f);
		store.AddDVD(dvd3);
		
		store.RemoveDVD(dvd2);
	}
}
