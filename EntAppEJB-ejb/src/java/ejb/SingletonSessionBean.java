package ejb;

import javax.ejb.Singleton;

@Singleton
public class SingletonSessionBean implements SingletonSessionBeanRemoteInterface {

    private int i = 0;

    @Override
    public int next() {
        return i++;
    }

}
