package ejb;

import java.util.logging.Logger;
import javax.ejb.Singleton;

@Singleton
public class SingletonSessionBean implements SingletonSessionBeanRemoteInterface {

    private static final Logger log = Logger.getLogger(SingletonSessionBean.class.getName());
    private int i = 1003;
    private ClientFacade cf;

    @Override
    public int next() {
        log.info(cf.find(i).toString());
        return i++;
    }

}
