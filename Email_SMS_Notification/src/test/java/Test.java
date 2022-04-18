import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        while (true) {
            SubscriptionSubject subscriptionSubject = new SubscriptionSubject();
            System.out.println("Please enter you first name:");
            Scanner input = new Scanner(System.in);
            String firstName = input.nextLine();
            System.out.println("Please enter you login name:");
            String loginName = input.nextLine();
            System.out.println("Please enter your preference(Email / SMS):");
            String preference = input.nextLine();

            Customer customer = new Customer(firstName, loginName, preference);
            subscriptionSubject.attach(customer);

            MessageSender sender = new MessageSender();
            sender.setCustomer(customer);

            if (customer.getPreference().equals("Email")) {
                sender.setFactory(new EmailMessageFactory());

            } else if (customer.getPreference().equals("SMS")) {
                sender.setFactory(new SmsMessageFactory());
            } else {
                throw new RuntimeException("Wrong Input !");
            }

            Message message = sender.customerMessage();

            subscriptionSubject.notify(message);

            System.out.println("Do you want to quit (Y/N): ");
            String ans = input.nextLine();
            if(ans.equals("Y")){
                break;
            }

        }
    }
}

