public class FragmentB extends Fragment {
    public void setAsCurrent(Activity a){
        
        a.setCurrentFragment(this);
        
    }
    
    public void Search(String query){
        System.out.println("Qurying "+query+ " from FragmentB");
    }     
    
}
