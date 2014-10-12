package ejb;

import javax.ejb.Singleton;

@Singleton
public class NewSessionBean implements NewSessionBeanRemote {

    int i = 0;

    @Override
    public int nextInt() {
        return i++;
    }

}
