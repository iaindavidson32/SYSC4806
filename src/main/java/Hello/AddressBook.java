package Hello;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AddressBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @OneToMany
    private List<BuddyInfo> buddies = new ArrayList<>();
    /*private String name;
    private String phoneNumber;*/

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public List<BuddyInfo> getBuddies() {
        return buddies;
    }

    public void setBuddies(List<BuddyInfo> buddies) {
        this.buddies = buddies;
    }

    public void addBuddy(BuddyInfo b){
        buddies.add(b);
    }

    public void removeBuddy(BuddyInfo b){
        buddies.remove(b);
    }

}