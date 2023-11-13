// Hà Duy Bách 20210093
public class TestPassingParameter {
	public static void main(String[] args) 
	{
		DVD jungleDVD = new DVD("Jungle");
		DVD cinderellaDVD = new DVD("Cinderella");
		
		swapDVD(jungleDVD, cinderellaDVD);
		System.out.print("Jungle DVD title: " + jungleDVD.getTitle() +'\n');
		System.out.print("Cinderella DVD title: " + cinderellaDVD.getTitle() + '\n');
		
		//changeTitle(jungleDVD, cinderellaDVD.getTitle());
		//System.out.print("Jungle DVD title: " + jungleDVD.getTitle() +'\n');
	}
	
	//Kiểm tra xem ngôn ngữ lập trình đang đi qua giá trị hay đi qua tham chiếu
	public static void swap(Object o1, Object o2)
	{
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}
	
	public static void changeTitle(DVD dvd, String title)
	{
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DVD(oldTitle);
	}
	
	//Phương thức swap thật sự
	public static void swapDVD(DVD dvd1, DVD dvd2)
	{
		DVD dvd_t = new DVD(dvd1.getTitle(),dvd1.getCategory(),dvd1.getDirector(),dvd1.getLenght(),dvd1.getCost());
		dvd1 = new DVD(dvd2.getTitle(),dvd2.getCategory(),dvd2.getDirector(),dvd2.getLenght(),dvd2.getCost());
		dvd2 = new DVD(dvd_t.getTitle(),dvd_t.getCategory(),dvd_t.getDirector(),dvd_t.getLenght(),dvd_t.getCost());
	}
}
