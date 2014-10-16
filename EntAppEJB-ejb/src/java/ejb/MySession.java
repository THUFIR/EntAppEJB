package ejb;

import javax.ejb.Stateless;

@Stateless//(mappedName="mySession")
public class MySession implements EJBRemoteInterface {

    private int i;

    @Override
    public String getResult() {
        return "This is My Session Bean";
    }

    @Override
    public int getNext() {
        return i++;
    }
}
