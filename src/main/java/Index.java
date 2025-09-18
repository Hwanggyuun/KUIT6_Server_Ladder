public class Index {
    private int index;

    public Index(int index){
        if(index < 0){
            throw new IllegalArgumentException("Index must be greater than zero");
        }
        this.index = index-1;
    }
    public Index(SelectedIndex s){
        if(s.getSelectedIndex() < 0){
            throw new IllegalArgumentException("Index must be greater than zero");
        }
        this.index = s.getSelectedIndex()-1;
    }

    public int getResult(){
        return index+1;
    }

    public int readValue(int[] line) {
        return line[index];
    }

    public void add(){
        this.index++;
    }
    public void sub(){
        this.index--;
    }
    public static void checkIndex(int i, Index index){
        if (i == Rows.LEFT) {
            index.sub();
            return;
        }
        if (i == Rows.RIGHT) {
            index.add();
        }
    }
}
