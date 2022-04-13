import java.math.BigDecimal;

public class AnnualFeeCreditAccount extends CreditAccount {

    private final BigDecimal annualFee;

    public AnnualFeeCreditAccount(BigDecimal annualFee, BigDecimal maxLoan) {
        super(annualFee, maxLoan);
        this.annualFee = annualFee;
    }

    public BigDecimal getAnnualFee() {
        return annualFee;
    }

    public void renew() {
        loan = loan.add(annualFee);
    }
}

