import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int start, int end){
    start = start;
    current = start;
    end = end;
  }
  public void reset(){
    current = start;
  }
  public int length(){
  }
  public boolean hasNext(){
  }

  //@throws NoSuchElementException
  public int next(){
  }

}
