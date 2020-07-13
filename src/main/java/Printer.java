public class Printer {
    private int paper;

    public Printer(int paper){
        this.paper = paper;
    }

    public int paper(){
        return this.paper;
    }

    public int print(int pages, int copies){
        return this.paper -= (pages * copies);
    }
}
