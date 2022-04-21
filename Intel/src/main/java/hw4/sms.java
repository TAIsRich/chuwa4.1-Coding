package hw4;

import java.util.List;

public class sms implements iyoutube {
    private checktype a;
    private static List<iviewer> smsList;

    sms() {
        check();
    }

    public void check() {
        a = checktype.getinstance();
        smsList = a.check(smsList);
    }

    @Override
    public void attach(iviewer iview) {
        int length = String.valueOf(iview.getphone()).length();
        try {
            if (!("sms".equals(iview.getPreference())))
                throw new preferenceException(iview.getname() + " the preference mismatched, this is for sms only\n");
            else if ((length == 10 && phoneoremail.instance.isnum(iview.getphone()))) {
                smsList.add(iview);
                System.out.println("hi! " + iview.getname() + " thank you for subscribing, we ll notify you in "
                        + iview.getPreference() + " in the future\n");
            } else
                throw new preferenceException(
                        "ops" + iview.getname() + " it must be all numeric value and at 10 digits numbers\n");
        } catch (preferenceException e) {
            System.out.print(e);
        }
    }

    @Override
    public void detach(iviewer iview) {
        smsList.remove(iview);
    }

    @Override
    public void Notify(String message) {

        for (iviewer i : smsList) {

            if (i.getPreference() == "sms") {
                i.update(message);

            }
        }

        //

    }
}