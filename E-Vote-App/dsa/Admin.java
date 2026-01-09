import java.util.ArrayList;
import java.util.List;

public class Admin extends User{
    private int adminLevel;
    private List<PoliticalParty> politicalPartyList;
    private List<ElectionStatus> electionList;

    public Admin(String id, String name, String email, String password, int adminLevel) {
        super(id, name, email, password);
        this.adminLevel = adminLevel;
        this.politicalPartyList = new ArrayList<>();
        this.electionList = new ArrayList<>();
    }
    public boolean addPoliticalParty(PoliticalParty Party) {
        if (politicalPartyList.contains(Party)) {
            politicalPartyList.add(Party);
            return true;
        }
        return false;
    }
    public boolean canStartElection(ElectionStatus election) {
        if(politicalPartyList.contains(election)) {
            electionList.add(election);
            return true;
        }
        return false;
    }
    public boolean cancelElection(ElectionStatus election) {
        return electionList.remove(election);
    }
    public boolean nullifyElection(ElectionStatus election) {
        return true;
    }
    public List<PoliticalParty> getPoliticalPartyList() {
        return politicalPartyList;
    }
    public List<ElectionStatus> getElectionList() {
        return electionList;
    }
    public int getAdminLevel() {
        return adminLevel;
    }
}
