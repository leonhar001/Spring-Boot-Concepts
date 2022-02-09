package leonhar001.github.sbexercices.model.repositories;
/*USING CRUD*/
import org.springframework.data.repository.CrudRepository;
/*MOST COMPLETE CONSULTS*/
import org.springframework.data.repository.PagingAndSortingRepository;
import leonhar001.github.sbexercices.model.entities.Product;

public interface ProductRepository extends PagingAndSortingRepository<Product, Integer> {
	
	public Iterable<Product> findByNameContaining(String name);
	/*Other default methods and custom queries:
	 * 
	 * https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods
	 * 
	 * */
}
