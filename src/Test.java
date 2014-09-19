public class Test {
    public static void main(String[] args) {
        Activity activity = new Activity();
        
        FragmentA fragmentA = new FragmentA();
        
        FragmentB fragmentB = new FragmentB();
        
        fragmentA.setAsCurrent(activity);
        
        activity.callSearch("Query");
        
        fragmentB.setAsCurrent(activity);
        
        activity.callSearch("Query");        
        
    }
    
}
