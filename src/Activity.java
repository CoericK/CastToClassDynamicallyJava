
import java.lang.reflect.InvocationTargetException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Activity {
    
    public Fragment currentFragment;

    public Activity() {
    }

    public Activity(Fragment currentFragment) {
        this.currentFragment = currentFragment;
    }

    
    
    public Fragment getCurrentFragment() {
        return currentFragment;
    }

    public void setCurrentFragment(Fragment currentFragment) {
        this.currentFragment = currentFragment;
    }
    
    public void callSearch(String query){
        String classToCast = currentFragment.getClass().getSimpleName();
   
        if(classToCast.equals("FragmentA")){
            ((FragmentA) currentFragment).Search(query);
        }else if(classToCast.equals("FragmentB")){
            ((FragmentB) currentFragment).Search(query);
        }
    }
}
