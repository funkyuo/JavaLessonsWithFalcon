 public class Counter {
    public String name;
    public int counter;

    public Counter(String name){
        this(name,0);
    }
    public Counter(String name,int counter){
        this.name=name;
        this.counter=counter;
    }
    public int increment(){
        counter++;
        return counter;
    }
    public int increment(int counter){
        this.counter+=counter;
        return this.counter;
    }
    public int decrement(){
        counter--;
        return counter;
    }
    public int decrement(int counter){
        this.counter-=counter;
        return this.counter;
    }
}
