package ejb;

import java.util.logging.Logger;
import javax.ejb.Singleton;

@Singleton
public class SingletonSessionBean implements SingletonSessionBeanRemoteInterface {

    private static final Logger log = Logger.getLogger(SingletonSessionBean.class.getName());
    private int i = 1003;

    @Override
    public int next() {
        return i++;
    }

}
