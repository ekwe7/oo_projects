public enum ElectionStatus {
    PENDING("Pending"),
    VOID("Void"),
    NULLIFIED("Nullified"),
    INCONCLUSIVE("Inconclusive"),
    CANCELLED("Cancelled"),
    VALID("VAlid");

    private String description;

    ElectionStatus(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }


}
