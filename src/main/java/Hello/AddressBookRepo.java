package Hello;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "book", path = "book")
public interface AddressBookRepo extends PagingAndSortingRepository<AddressBook, Long> {

    //List<AddressBook> findByLastName(@Param("name") String name);

}