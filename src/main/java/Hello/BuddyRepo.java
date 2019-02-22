package Hello;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "buddy", path = "buddy")
public interface BuddyRepo extends PagingAndSortingRepository<BuddyInfo, Long> {

    List<BuddyInfo> findByName(String name);

}