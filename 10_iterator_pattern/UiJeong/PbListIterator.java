public class PbListIterator implements Iterator{
    private PbList pbList;
    private int index;

    public PbListIterator(PbList pbList) {
        this.pbList = pbList;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < pbList.getSize();
    }

    @Override
    public Object next() {
        PrivateBrand privateBrand = pbList.getPb(index);
        index++;
        return privateBrand;
    }

}
