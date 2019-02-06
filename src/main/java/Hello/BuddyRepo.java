package Hello;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "buddy", path = "buddy")
public interface BuddyRepo extends PagingAndSortingRepository<BuddyInfo, Long> {

    //List<AddressBook> findByLastName(@Param("name") String name);

}