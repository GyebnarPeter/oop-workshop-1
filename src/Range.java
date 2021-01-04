public class Range {

    public Range(int range) {
        this.start = 0;
        this.end = range;

        if(start > end) {
            this.start = end;
            this.end = start;
        }
    }

    private int start;
    private int end;

    private void setStart(int start) {
        this.start = start;
    }

    public int getStart() {
        return start;
    }

    private void setEnd(int end) {
        this.end = end;
    }

    public int getEnd() {
        return end;
    }

    public int length() {
        return end - start;
    }
}
