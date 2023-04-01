public enum Faculty {
    ENGINEERING("Engineering"),
    BUSINESS("Business"),
    COMPUTER("Computer"),
    POST_GRADUATE_DEPARTMENT("Post Graduate Department");

    private String value;

    Faculty(String value){
        this.value = value;
    }

    public String getValue(){
        return value;
    }

}
