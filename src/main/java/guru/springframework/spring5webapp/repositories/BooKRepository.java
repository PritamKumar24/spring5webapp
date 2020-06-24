package repositories;

import guru.springframework.spring5webapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BooKRepository extends CrudRepository<Book, Long> {
}
