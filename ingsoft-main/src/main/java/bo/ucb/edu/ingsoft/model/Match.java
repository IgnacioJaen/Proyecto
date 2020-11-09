package bo.ucb.edu.ingsoft.model;


public class Match {
    private Integer matchId;
    private Integer profile1Id;
    private Integer profile2Id;
    private Integer dateMatches;
    private Integer accepted;
    private Integer status;
    private Transaction transaction;

    public Match() {
    }

    public Integer getMatchId() {
        return matchId;
    }

    public void setMatchId(Integer matchId) {
        this.matchId = matchId;
    }

    public Integer getProfile1Id() {
        return profile1Id;
    }

    public void setProfile1Id(Integer profile1Id) {
        this.profile1Id = profile1Id;
    }

    public Integer getProfile2Id() {
        return profile2Id;
    }

    public void setProfile2Id(Integer profile2Id) {
        this.profile2Id = profile2Id;
    }

    public Integer getDateMatches() {
        return dateMatches;
    }

    public void setDateMatches(Integer dateMatches) {
        this.dateMatches = dateMatches;
    }

    public Integer getAccepted() {
        return accepted;
    }

    public void setAccepted(Integer accepted) {
        this.accepted = accepted;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    @Override
    public String toString() {
        return "Match{" +
                "matchId=" + matchId +
                ", profile1Id=" + profile1Id +
                ", profile2Id=" + profile2Id +
                ", dateMatches=" + dateMatches +
                ", accepted=" + accepted +
                ", status=" + status +
                ", transaction=" + transaction +
                '}';
    }
}
