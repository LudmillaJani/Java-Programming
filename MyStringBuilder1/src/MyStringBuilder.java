/* Implement the StringBuilder class
The stringBuilder class is provided in the Java library.
Provide your own implementation for the following methods(name the new class MyStringBuilder1):
  public MyStringBuilder1(String s);
  public MyStringBuilder1 append(MyStringBuilder1 s);
  public MyStringBuilder append(int i);
  public int length();
  public charAt(int index);
 */
public class MyStringBuilder {
    public static void main(String[] args){
        System.out.println("Test class MyStringBuilder. ");
        MyStringBuilder builder1  = new MyStringBuilder("First string builder");
        MyStringBuilder builder2 = new MyStringBuilder(" and Second string builder");

        System.out.println("Test one of the methods: " + builder1.append(builder2));
    }


    private String s;

    public MyStringBuilder(String otherString){
        this.s = otherString;
    }

    public MyStringBuilder append(MyStringBuilder otherString){
        String newString = this.s;
        newString += otherString;
        return new MyStringBuilder(newString);
    }

    public MyStringBuilder append(int i){
        String newString = this.s;
        newString += i + "";
        return new MyStringBuilder(newString);
    }

    public int length(){
        return s.length();
    }

    public char charAt(int index){
        return s.charAt(index);
    }

    public MyStringBuilder toLowerCase(){
        String newString = "";
        for (int i = 0; i < s.length(); i++) {
            if ( 'A'<= s.charAt(i) && s.charAt(i) <= 'Z') {
                newString += (char)(s.charAt(i) + 32) + "";
            }
        }
        return new MyStringBuilder(newString);
    }

    public MyStringBuilder substring(int begin, int end){
        String newString = "";
        for (int i = begin; i < end; i ++) {
            newString += s.charAt(i) + "";
        }
        return new MyStringBuilder(newString);
    }

    public String toString(){
        return s;
    }
}


