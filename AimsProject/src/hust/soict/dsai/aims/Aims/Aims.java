package hust.soict.dsai.aims.Aims;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import hust.soict.dsai.aims.cart.Cart.Cart;
import hust.soict.dsai.aims.exception.PlayerException;
import hust.soict.dsai.aims.media.Book;
import hust.soict.dsai.aims.media.CompactDisc;
import hust.soict.dsai.aims.media.DVD;
import hust.soict.dsai.aims.media.Media;
import hust.soict.dsai.aims.media.Track;
import hust.soict.dsai.aims.screen.CartScreen;
import hust.soict.dsai.aims.screen.StoreScreen;
import hust.soict.dsai.aims.store.Store.Store;

// Hà Duy Bách 20210093
public class Aims {
	static Scanner scanner = new Scanner(System.in);
	private static Cart current_cart = new Cart();
	private static StoreScreen storeScreen;
	private static CartScreen cartScreen;
	
	static Store store = new Store(); 
	
	enum Option {
		showMenu,
		storeMenu,
		updateStore,
		mediaDetailsMenu,
		cartMenu,
		exit,
		addMediaToCart, 
		playMedia,
		filterMedias,
		sortMedias,
		removeMediaFromCart,
		playMediaFromCart,
		placeOrder
	}
	private static Stack<Option> optionStack = new Stack<>();
	
	public static void initStore()
	{	
		List<Track> tracks = new ArrayList<Track>();
		tracks.add(new Track("track1",10));
		tracks.add(new Track("track2",8));
		
		CompactDisc cd = new CompactDisc("album chill", "Music chill", 100, tracks);
		DVD dvd = new DVD("Life Of Human", "Romantic", "Even Jams", 120, 60);
		DVD dvd1 = new DVD("Life Of Human1", "Romantic", "Even Jams", 120, 60);
		DVD dvd2 = new DVD("Life Of Human2", "Romantic", "Even Jams", 120, 60);
		DVD dvd3 = new DVD("Life Of Human3", "Romantic", "Even Jams", 120, 60);
		DVD dvd4 = new DVD("Life Of Human4", "Romantic", "Even Jams", 120, 60);
		DVD dvd5 = new DVD("Life Of Human5", "Romantic", "Even Jams", 120, 60);
		DVD dvd6 = new DVD("Life Of Human6", "Romantic", "Even Jams", 120, 60);
		DVD dvd7 = new DVD("Life Of Human7", "Romantic", "Even Jams", 120, 60);
		
		List<String> au = new ArrayList<String>();
		au.add("Athur");
		au.add("Ghether");
		Book book = new Book("NeverLand", "Gim", 120, au);
		
		store.addMedia(book);
		store.addMedia(cd);
		store.addMedia(dvd);
		store.addMedia(dvd1);
		store.addMedia(dvd2);
		store.addMedia(dvd3);
		store.addMedia(dvd4);
		store.addMedia(dvd5);
		store.addMedia(dvd6);
		store.addMedia(dvd7);
		
		
//		new StoreScreen(store);
		
		openStoreScreen();
	}
	
	public static void main(String[] args)
	{
		initStore();
		
//		optionStack.push(Option.showMenu);
//		
//		while (optionStack.size() > 0)
//		{
//			switch (optionStack.peek())
//			{
//				case showMenu: showMenu(); break;
//				case cartMenu: cartMenu(); break;
//				case mediaDetailsMenu: mediaDetailsMenu(0); break;
//				case storeMenu: storeMenu(); break;
//				case playMedia: mediaDetailsMenu(1); break;
//				case addMediaToCart: mediaDetailsMenu(2); break;
//				case filterMedias: filterMedias(); break;
//				case placeOrder: placeOrder(); break;
//				case playMediaFromCart: playMediaFromCart(); break;
//				case removeMediaFromCart: removeMediaFromCart(); break;
//				case sortMedias: sortMedias(); break;
//				default:
//					System.out.println("Chương trình gặp lỗi mất mát dữ liệu option stack");
//					return;
//			}
//		}
//		
//		System.out.println("Đang thoát chương trình"); return;
	}
	
	
	public static Store getStore() {
		return store;
	}

	public static Cart getCart() {
		return current_cart;
	}

	public static StoreScreen getStoreScreen() {
		return storeScreen;
	}

	public static CartScreen getCartScreen() {
		return cartScreen;
	}
	
	public static void openStoreScreen() {
		storeScreen = new StoreScreen(store);
	}
	
	public static void closeStoreScreen() {
		storeScreen.setVisible(false);
		storeScreen = null;
	}
	
	public static void openCartScreen() {
		cartScreen = new CartScreen(current_cart);
	}
	
	public static void closeCartScreen() {
		cartScreen.setVisible(false);
		cartScreen = null;
	}
	
	
	
	/**
	 * Xác định xem nhận giá trị nào để đẩy vào optionStack
	 * @param Op - Một list các giá trị Option
	 * @apiNote Giá trị đầu tiên của Op phải luôn là Option.exit nếu không sẽ không nhận giá trị
	 */
	static void decision(Option[] Op)
	{
		try{
			if (Op[0]!= Option.exit) throw new IllegalStateException("Phần tử Option ban đầu khác Option.exit!");	
		}
		catch (Exception e)
		{
			 System.out.println(e.getMessage());
		}
		
		while (true)
		{
			if (scanner.hasNextInt())
			{
				int opt = scanner.nextInt();
				if (opt < 0 || opt >= Op.length) 
				{
					System.out.println("Xin hãy nhập các số từ 0 đến " + Op.length);
					continue;
				}
				
				//Không được thêm vào khi gặp exit nếu không sẽ lặp vô hạn
				if (Op[opt] == Option.exit) 
					optionStack.pop();
				else
					optionStack.push(Op[opt]);
				
				return;
			}
		}
	}
	
	public static void showMenu() 
	{
		System.out.println("AIMS: ");
		System.out.println("--------------------------------");
		System.out.println("1. View store");
		System.out.println("2. Update store");
		System.out.println("3. See current cart");
		System.out.println("0. Exit");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3");
		
		decision(new Option[]{
				Option.exit,
				Option.storeMenu,
				Option.updateStore,
				Option.cartMenu});
	}
	
	public static void storeMenu() 
	{
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. See a media’s details");
		System.out.println("2. Add a media to cart");
		System.out.println("3. Play a media");
		System.out.println("4. See current cart");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4");
				
		decision(new Option[]{
				Option.exit,
				Option.mediaDetailsMenu,
				Option.addMediaToCart,
				Option.playMedia,
				Option.cartMenu});
	}
	
	/**
	 * Sử dụng để lấy chi tiết media hiện tại
	 * @param type <br> 0: Thực hiện như bình thường; <br> 1: thực hiện chơi nhạc;<br> 2:thực hiện thêm phương tiện vào giỏ hàng
	 */
	public static void mediaDetailsMenu(int type) 
	{
		System.out.print("Nhập tiêu đề của phương tiện:  ");
		
		///Đọc Phương tiện nhập vào obj
		Media obj = null;
		scanner.nextLine();
		while (true)
		{
			if (scanner.hasNextLine()) 
			{
				String s = scanner.nextLine();
				
				//Nếu gặp dấu kết thức thì thoát ra
				if (s.equals("$$$")) 
				{
					optionStack.pop();
					return;
				}
				
				obj = store.findByTitle(s);
				
				//Nếu tìm thấy thì thoát ra
				if (obj != null) break;
				
				//Không tìm thấy
				System.out.println("Không tìm thấy title, để thoát ra bấm: \"$$$\" ");
			}
		}
		
		//thực hiện các kiểu khác trước
		if (type == 1)
		{
			if (obj instanceof CompactDisc)
				try {
					((CompactDisc)obj).Play();
				} catch (PlayerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			else
			if (obj instanceof DVD)
				try {
					((DVD)obj).Play();
				} catch (PlayerException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			else 
				System.out.println
				("Không sử dụng được tính năng này do không phải là DVD và CD");
			optionStack.pop();
			return;
		}
		else
		if (type == 2)
		{
			 current_cart.addMedia(obj);
			 optionStack.pop();
			 return;
		}
		
		//In ra thông tin phương tiện
		System.out.println(obj.Info());
		
		//Các option
		while (true)
		{	
		
			System.out.println("Options: ");
			System.out.println("--------------------------------");
			System.out.println("1. Add to cart");
			if (obj instanceof CompactDisc || obj instanceof DVD) System.out.println("2. Play");
			System.out.println("0. Back");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2");
		
			switch (scanner.nextInt()) 
			{
				case 1: current_cart.addMedia(obj); break;
				case 2: 
					if (obj instanceof CompactDisc)
						try {
							((CompactDisc)obj).Play();
						} catch (PlayerException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					else
					if (obj instanceof DVD)
						try {
							((DVD)obj).Play();
						} catch (PlayerException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					else 
						System.out.println
						("Không sử dụng được tính năng này do không phải là DVD và CD");
					break;
				case 0: optionStack.pop(); return;
				default: System.out.println("Nhập sai giá trị, hãy nhập lại"); break;
			}
		}
		
	}
		
	public static void cartMenu() 
	{
		System.out.println("Options: ");
		System.out.println("--------------------------------");
		System.out.println("1. Filter medias in cart");
		System.out.println("2. Sort medias in cart");
		System.out.println("3. Remove media from cart");
		System.out.println("4. Play a media");
		System.out.println("5. Place order");
		System.out.println("0. Back");
		System.out.println("--------------------------------");
		System.out.println("Please choose a number: 0-1-2-3-4-5");
		
		decision(new Option[] {
				Option.exit,
				Option.filterMedias,
				Option.sortMedias,
				Option.removeMediaFromCart,
				Option.playMedia,
				Option.placeOrder,
		});
	}
	
	public static void filterMedias()
	{
		while (true)
		{
			System.out.println("Filter Options: ");
			System.out.println("--------------------------------");
			System.out.println("1. Filter By ID: ");
			System.out.println("2. Filter By Title: ");
			System.out.println("0. Back ");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2");
			
			while (!scanner.hasNextInt());
			switch (scanner.nextInt())
			{
				//Lọc với ID
				case 1: 
					System.out.println("Enter Id :");
					while (!scanner.hasNextInt());
					int id = scanner.nextInt();
					for (Media media : current_cart.getItemsOrder()) {
						if (media.getId() == id) 
							System.out.println(media.Info());
					} ;
					break;
					
				//Lọc với Tiêu đề
				case 2:
					System.out.println("Enter Title :");
					scanner.nextLine();
					while (!scanner.hasNextLine());
					String title = scanner.nextLine();
					for (Media media : current_cart.getItemsOrder()) {
						if (media.getTitle().equals(title)) 
							System.out.println(media.Info());
					} ;
					break;
				case 0:
					optionStack.pop();
					return;
				default:
					System.out.println("Syntax error!");
					break;
			}
		}
	}

	public static void sortMedias()
	{
		while (true)
		{
			System.out.println("Sort Options: ");
			System.out.println("--------------------------------");
			System.out.println("1. Sort By Cost: ");
			System.out.println("2. Sort By Title: ");
			System.out.println("0. Back ");
			System.out.println("--------------------------------");
			System.out.println("Please choose a number: 0-1-2");
			
			switch (scanner.nextInt())
			{
				//sắp xếp với giá
				case 1: 
					current_cart.SortByCost();
					current_cart.InfoInCart();
					break;
					
				//sắp xếp với Tiêu đề
				case 2:
					current_cart.SortByTitle();
					current_cart.InfoInCart();
					break;
				case 0:
					optionStack.pop();
					return;
				default:
					System.out.println("Syntax error!");
					break;
			}
	}
}

	public static void removeMediaFromCart()
	{
		optionStack.pop();
	}
	
	public static void playMediaFromCart()
	{
		optionStack.pop();
	}

	public static void placeOrder()
	{
		System.out.println("Đặt hàng thành công");
		optionStack.pop();
	}

}
