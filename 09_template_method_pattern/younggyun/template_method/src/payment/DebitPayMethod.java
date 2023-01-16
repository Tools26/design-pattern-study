package payment;

import java.util.Optional;

public class DebitPayMethod extends AbstractPayMethod {
    private final String accountId;

    public DebitPayMethod(String accountId) {
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
            return Optional.of(ViewType.DEBIT);
        }
        return Optional.of(ViewType.EMPTY);
    }
}
