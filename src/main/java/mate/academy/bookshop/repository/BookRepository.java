package mate.academy.bookshop.repository;

import java.util.List;
import mate.academy.bookshop.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BookRepository extends JpaRepository<Book, Long>, JpaSpecificationExecutor<Book> {
    List<Book> findAllByCategoriesId(Long categoriesId);
}
