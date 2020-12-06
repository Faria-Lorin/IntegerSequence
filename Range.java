import java.util.NoSuchElementException;
public class Range implements IntegerSequence{
  private int start,end,current;
  public Range(int start, int end){
    this.start = start;
    current = start;
    this.end = end;
  }
  public void reset(){
    current = start;
  }
  public int length(){
    int length = end - start + 1;
    return length;
  }
  public boolean hasNext(){
    if (current <= end){
      return true;
    }
    else {return false;}
  }

  //@throws NoSuchElementException
  public int next(){
    int a = current;
    int b = current + 1;
    if (hasNext() == true){
      current = b;
      return a;
    }
    else {throw new NoSuchElementException("No More Values");}
  }
}
