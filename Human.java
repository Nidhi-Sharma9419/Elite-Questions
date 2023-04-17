package clssesobjconstrtor;
public abstract class Human {
    private int age;



    private float height;


    private String name;
    private Gender gender;
    public static final int Lifespan = 100; //also called class variable cuz it is not associated with instances but with the classes
    public Human(String name, int age, Gender gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


        public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public float getheight(){
        return height;
    }
    public void setheight(float height){
        this.height = height;
    }

//    public int getcomputeandprintTTL(){
//        int ttl = Lifespan - this.age;
//        //System.out.println("Time to live:" + ttl);
//        return ttl;
//         }
    public Human(String name, int age,Gender gender, float height){
        this(name, age, gender);
        this.height = height;
    }
    /*
    @return time to live
     */
    public abstract int getTimeToLive();


}

