package guru.springframework.spring5webapp.repositories;

import guru.springframework.spring5webapp.model.Publisher;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by R112873 on 22/02/2018.
 */
public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
