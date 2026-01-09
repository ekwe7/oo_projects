import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Election {
    private String electionId;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private ElectionStatus status;
    private ElectionType type;
    private List<Vote> voteList;
    private ElectionResult result;

    public Election(String electionId, String name, LocalDate startDate, LocalDate endDate, ElectionType type){
        this.electionId = electionId;
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.type = type;
        this.voteList = new ArrayList<>();
        this.result = null;

    }
    public boolean startElection(){
        if(status == ElectionStatus.PENDING){
            status = ElectionStatus.VALID;
            return true;
        }
        return false;
    }
    public boolean endElection(){
        if(isActive()){
            status = ElectionStatus.VOID;
            return true;
        }
       return false;
    }
    public boolean isActive(){
        return status == ElectionStatus.VALID;
    }
    public String getElectionId(){
        return electionId;
    }
    public ElectionStatus getStatus(){
        return status;
    }
    public void setStatus(ElectionStatus status){
        this.status = status;
    }
    public String getName(){
        return name;
    }
    public ElectionType getType(){
        return type;
    }
    public void addVote(Vote vote){
        if(isActive()){
            voteList.add(vote);
        }
    }
    public List<Vote> getVoteList(){
        return voteList;
    }
    public void setResult(ElectionResult result){
        this.result = result;
    }
    public ElectionResult getResult(){
        return result;
    }
    public LocalDate getStartDate(){
        return startDate;
    }
    public LocalDate getEndDate(){
        return endDate;
    }
}
