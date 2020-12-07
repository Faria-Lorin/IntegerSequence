import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int []data;

  /*Construct the sequence by copying values from the other array into the data array*/
  public ArraySequence(int [] other){
    data = other;
  }

  public void reset(){
    currentIndex = 0;
  }
  public int length(){
    return data.length;
  }
  public boolean hasNext(){
    if (currentIndex < length()){
      return true;
    }
    else {return false;}
  }

  //@throws NoSuchElementException
  public int next(){
    int a = currentIndex;
    int b = currentIndex + 1;
    if (hasNext() == true){
      currentIndex = b;
      return data[a];
    }
    else {throw new NoSuchElementException("No More Values");}
  }
}
