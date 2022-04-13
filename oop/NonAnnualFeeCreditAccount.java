import java.math.BigDecimal;

public class NonAnnualFeeCreditAccount extends CreditAccount {

    public NonAnnualFeeCreditAccount(BigDecimal maxLoan) {
        super(BigDecimal.ZERO, maxLoan);
    }
}
