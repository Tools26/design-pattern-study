public class PbList implements Aggregate{ // Aggregate
    private PrivateBrand[] pb;
    private int size = 0;

    public PbList(int size) {
        pb = new PrivateBrand[size];
    }

    public PrivateBrand getPb(int index) {
        return pb[index];
    }

    public void addPB(PrivateBrand pb){
        this.pb[size] = pb;
        size++;
    }

    public int getSize() {
        return size;
    }


    @Override
    public PbListIterator iterator() {
        return new PbListIterator(this);
    }
}
