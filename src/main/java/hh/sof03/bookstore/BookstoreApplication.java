package hh.sof03.bookstore;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import hh.sof03.bookstore.domain.Book;
import hh.sof03.bookstore.domain.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	private static final Logger log = LoggerFactory.getLogger(BookstoreApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner bookDemo(BookRepository bookRepo) {
		return (args) -> {
			bookRepo.save(new Book("The Lord of the Rings", "J.R.R. Tolkien", 1955, "9780618640157", 24.0));
			bookRepo.save(new Book("The Hobbit", "J.R.R. Tolkien", 1937, "9780547928241", 19.8));
			log.info("succesful");
		};
	}

}
