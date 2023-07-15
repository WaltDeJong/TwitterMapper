package filters;

import twitter4j.Status;

import java.util.ArrayList;
import java.util.List;

public class AndFilter implements Filter {
    private final Filter child1;
    private final Filter child2;

    public AndFilter(Filter child1, Filter child2) {
        this.child1 = child1;
        this.child2 = child2;
    }


    @Override
    public boolean matches(Status s) {
        return (child1.matches(s) && child2.matches(s));
    }

    @Override
    public List<String> terms() {
        List<String> ans = new ArrayList<>(1);
        ans.add(child1.toString());
        ans.add(child2.toString());
        return ans;
    }

    public String toString() {
        return "("+ child1.toString() + " and " + child2.toString() +")";
    }

}
