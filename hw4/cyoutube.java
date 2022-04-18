import java.util.ArrayList;
import java.util.List;
import java.util.Random;

abstract public class cyoutube implements iyoutube {
    protected String ChannelName;
    protected List<iviewer> YoutuberList;
    protected String preference;
    Random rand = new Random();
    int r = rand.nextInt(1000);

    cyoutube() {
        this.ChannelName = "user" + r;
        this.YoutuberList = new ArrayList<iviewer>();
    }

    cyoutube(String ChannelName) {
        this.ChannelName = ChannelName;
        this.YoutuberList = new ArrayList<iviewer>();
    }

    @Override
    public void detach(iviewer iview) {
        YoutuberList.remove(iview);
    }

    @Override
    public String getChannelName() {
        return ChannelName;
    }

}
