package clssesobjconstrtor;

public enum Gender {
    FEMALE(1,"F"),
    MALE(2,"M"),
    UNDEFINED(3,"U") {
        //adding a method called getComment
        @Override
        public String comment() {
            return "to be decided later: " + getRepr() + ", " + getDescr();
        }
    };
    private final int repr;
    private final String descr;
    Gender(int repr, String descr){
        this.descr=descr;
        this.repr=repr;
    }
    public int getRepr(){
        return repr;
    }
    public String getDescr(){
        return descr;
    }
    public String comment(){
        return repr + ": " + descr;
    }
}
