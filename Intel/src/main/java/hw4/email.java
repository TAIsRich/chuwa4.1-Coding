package hw4;

import java.util.List;

public class email implements iyoutube {
    private checktype a;
    private List<iviewer> emailList;

    email() {
        check();
    }

    public void check() {
        a = checktype.getinstance();
        emailList = a.check(emailList);
    }

    @Override
    public void attach(iviewer iview) {

        try {
            if (!("email".equals(iview.getPreference())))
                throw new preferenceException(
                        "ops " + iview.getname() + " preference mismatched, this is for email preference only\n");


            else if (iview.getEmail().contains("@")) {
                emailList.add(iview);
                System.out.println("hi! " + iview.getname() + " thank you for subscribing, we ll notify you in "
                        + iview.getPreference() + " in the future\n");
            } else if (!iview.getEmail().contains("@"))
                throw new preferenceException("ops " + iview.getname() + " you must type in an email\n");
        } catch (preferenceException e) {
            System.out.print(e);
        }

    }

    @Override
    public void detach(iviewer iview) {
        emailList.remove(iview);
    }

    @Override
    public void Notify(String message) {

        for (iviewer i : emailList) {

            if (i.getPreference() == "email") {
                i.update(message);

            }
        }

        //

    }
}
