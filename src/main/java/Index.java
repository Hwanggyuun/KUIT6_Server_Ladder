public class Index {
    private int index;

    public Index(NaturalNum s){
        if(s.getNaturalNum() < 0){
            throw new IllegalArgumentException(ErrorMessage.OUT_OF_NATURE_NUMBER.getMessage());
        }
        this.index = s.getNaturalNum()-1;
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

}
