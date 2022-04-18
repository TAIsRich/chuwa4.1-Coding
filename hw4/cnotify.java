public class cnotify extends cyoutube {

    cnotify(String message) {
        super(message);
    }

    @Override
    public void attach(iviewer iview) {
        try {
            if (iview.getPreference() == "native" || iview.getPreference() == "email") {
                YoutuberList.add(iview);
                System.out.println(
                        iview.getPreference() + ": " + iview.getname() + " thank you for subscribing to " + ChannelName
                                + " 's Youtube Channel");
            } else {
                throw new preferenceException("hi " + iview.getname());
            }

        } catch (preferenceException e) {
            System.out.println(e + " preference should be either 'native' or 'email'");
        }

    }

    @Override
    public void Notify(String message) {
        // try{
        for (iviewer i : YoutuberList) {

            if (i.getPreference() == "native") {
                i.update(message);
            } else if (i.getPreference() == "email") {
                i.update(message);
            }
        }
    }
    //

}
