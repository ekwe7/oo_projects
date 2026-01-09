public enum PoliticalParty {
    PDP("Peoples Democratic Party"),
    ANPP("All Nigeria peoples Party"),
    LPP("All Nigeria peoples Party"),
    APC("All Nigeria peoples Party"),
    APGA("All Nigeria peoples Party");


    private String fullName;

    private PoliticalParty(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }

}
