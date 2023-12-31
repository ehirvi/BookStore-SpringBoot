package hh.sof03.bookstore.domain;

import org.springframework.data.repository.CrudRepository;


public interface BookRepository extends CrudRepository<Book, Long> {

    Book findByTitle(String title);
    Book findByAuthor(String author);
}
