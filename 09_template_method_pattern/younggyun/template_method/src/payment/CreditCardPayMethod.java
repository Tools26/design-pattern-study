package payment;

import java.util.Optional;

public class CreditCardPayMethod extends AbstractPayMethod {
    private final String accountId;

    public CreditCardPayMethod(String accountId) {
        this.accountId = accountId;
    }

    @Override
    protected boolean makeVisible() {
//        if condition {
//            return false;
//        }
        return true;
    }

    @Override
    protected boolean makeEnable() {
//        if condition {
//            return false;
//        }
        return true;
    }

    @Override
    protected boolean makeSelectable() {
//        if condition {
//            return false;
//        }
        return true;
    }

    @Override
    protected boolean makeChecked() {
//        if condition {
//            return false;
//        }
        return true;
    }

    @Override
    protected Optional<ViewType> create(boolean enable, boolean visible, boolean selectable, boolean checked) {
        if (enable && visible && selectable && checked) {
            return Optional.of(ViewType.CREDIT_CARD);
        }
        return Optional.of(ViewType.EMPTY);
    }
}
