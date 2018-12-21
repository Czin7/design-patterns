package adapter;

public class EuropeanPlugAdapter implements Plug {
    private Plug notCompatiblePlug;

    public EuropeanPlugAdapter(Plug notCompatiblePlug) {
        this.notCompatiblePlug = notCompatiblePlug;
    }

    @Override
    public boolean plugIn() {
        //...
        return !notCompatiblePlug.plugIn();
    }

    @Override
    public boolean plugOut() {
        //...
        return !notCompatiblePlug.plugOut();
    }
}
