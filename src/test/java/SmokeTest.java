import static org.assertj.core.api.Assertions.assertThat;

import Hello.AddressBookController;
import Hello.Application;
import Hello.BuddyController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class SmokeTest {

    @Autowired
    private AddressBookController book;

    @Autowired
    private BuddyController buddo;

    @Test
    public void bookContextLoads() throws Exception {
        assertThat(book).isNotNull();
    }

    @Test
    public void buddyContextLoads() throws Exception {
        assertThat(buddo).isNotNull();
    }
}