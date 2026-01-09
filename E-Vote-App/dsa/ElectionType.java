public enum ElectionType {
    LOCAL_GOVERNMENT_CHAIRMAN("Local Government Chairman"),
    SENATE("Senate"),
    PRESIDENCIAL("Presincy");
    private String description;
    ElectionType(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
}
