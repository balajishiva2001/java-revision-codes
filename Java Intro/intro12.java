enum Status{
    INITIALIZED(200),IN_PROGRESS(201),PENDING(202),SUCCESS(203);

    private int numericalValue;
    
    Status(int numericalValue){
        this.numericalValue = numericalValue;
    }

    public int getNumericalValue() {
        return numericalValue;
    }

    public void setNumericalValue(int numericalValue) {
        this.numericalValue = numericalValue;
    }

}


public class intro12 {
    public static void main(String[] args) {
        System.out.println("Length: " + Status.values().length); //length
        // get all the enum values
        Status ss[] = Status.values();
        for (Status s : ss) {
            System.out.println(String.format("Status: %s Index: %d Numerical value: %d",s.name(), s.ordinal(),s.getNumericalValue()));
        }
        System.out.println(ss[3]);

        Status k = Status.valueOf("PENDING");
        
        /*
         * Enum with if
         */
        if(Status.PENDING.equals(k)){
            System.out.println("They are equal");
        }else{
            System.out.println("They are not equal");
        }

        /*
         * Enum with Swith
         */
        switch (k) {
            case INITIALIZED:
                    System.out.println("INITIALIZED");
                break;
        
            case IN_PROGRESS:
                    System.out.println("IN_PROGRESS");
                break;
            
            case PENDING:
                    System.out.println("PENDING");
                break;
    
            case SUCCESS:
                    System.out.println("SUCCESS");
                break;
            default:
                System.out.println("not a valid status");
                break;
        }
        

    }
}
