package work;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import javax.management.Notification;

public class Test {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Hakan", "Ali", "Selçuk", "Hasan");

		list.forEach(System.out::println);

		
		
		
		
		
		System.out.println("--------------");
		List<String> newList = (List<String>) list.stream().filter(isim -> !isim.equals("Ali"))
				.collect(Collectors.toList());

		newList.forEach(System.out::println);

		
		
		
		
		
		
		
		
		System.out.println("--------------");
		Personel p = new Personel("Hakan", "Sandıkaya");
		Personel p1 = new Personel("Hasan", "Tekgül");
		List<Personel> personelList = Arrays.asList(p, p1);
		List<String> secilenpersonel = personelList
				.stream()
				.map(Personel::getAd).filter(ad -> ad.startsWith("H"))
				.limit(5).collect(Collectors.toList());

		secilenpersonel.stream().forEach(System.out::println);

		
		
		
		
		
		
		
		System.out.println("--------------");
		Random random = new Random();
		random.ints().limit(5).forEach(System.out::println);

		
		
		
		
		
		
		System.out.println("--------------");
		Notification notification1 = new Notification(Priority.LOW, "Bilgi", 0, "Hergün yeni bir bilgi!");
		Notification notification2 = new Notification(Priority.HIGH, "Hatırlatma", 0, "Alarm kurmayı unutma!");
		Notification notification3 = new Notification(Priority.LOW, "Bilgi Tekrar", 0, "Hergün yeni bir bilgi Tekrar!");
		Notification notification4 = new Notification(Priority.MEDIUM, "Spor", 0, "Sabah sporun var erken uyu!");

		List<Notification> notificationList = Arrays.asList(notification1, notification2, notification3, notification4);

		notificationList.stream().map(notification -> notification.getType().equals(Priority.LOW))
				.collect(Collectors.toList()).forEach(System.out::println);

		
		
		
		
		// Reduce

		System.out.println("--------------");
		Book book1 = new Book("Clean Code", "Robert Cecil Martin", 300);
		Book book2 = new Book("Test Driven Development", "Kent Beck", 450);
		Book book3 = new Book("Refactoring", "Martin Fowler", 200);

		List<Book> bookList = Arrays.asList(book1, book2, book3);

		List<Book> bookSortedListByPage = bookList
				.stream()
				.sorted(Comparator.comparingInt(Book::getSayfaSayisi))
				.collect(Collectors.toList());
		bookSortedListByPage
		.stream()
		.map(Book::getAd)
		.forEach(System.out::println);

		// burada map ile şartımızı sağladıktan sonra reduce ile map'in dışında kalan
		// sayfalarıda dahil ediyoruz.
		Integer sum = bookSortedListByPage.stream()
				.filter(book -> book.getSayfaSayisi() > 250)
				.map(Book::getSayfaSayisi).reduce(0, (Integer::sum)); // 0 başlangıç değeri
		System.out.println(sum);

	}

}
