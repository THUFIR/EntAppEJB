package ejb;

import javax.ejb.Stateless;

@Stateless//(mappedName="mySession")
public class MySession implements EJBRemoteInterface {

    @Override
    public String getResult() {
        return "This is My Session Bean";
    }
}
