/* Implementing the String class
The string class is provided in the Java library.
Provide your own implementation for the following methods(name the crew class MyString2):
  public MyString2(String s);
  public int compare(String s);
  public MyString2 substring(int begin);
  public MyString2 to UpperCase();
  public char[] toChars();
  public static MyString2 valueOf(boolean b)

 */
public class MyString2 {
    public static void main(String[] args){

        // Create two MyString2 objects
        MyString2 stringOne = new MyString2("This is first object");
        MyString2 stringTwo = new MyString2("Another object");


        // Test compare
        System.out.println("Compare:" + stringOne.compare("This is first object"));

        // Test substring
        //System.out.println("\nDisplay a substring if str2 beginning at index 5:");
        MyString2 str = stringTwo.substring(5);
        System.out.print( " Substring:");
        System.out.print( str.toChars());

        // Test toUpperCase()
        System.out.print("\n Convert into upper case letters: ");
        MyString2 str1 = stringOne.toUpperCase();
        System.out.print(str1.toChars());

        // Test valueOf
        System.out.println("\n Test valueOf() as objects:");
        MyString2 stringObject1 = MyString2.valueOf(true);
        System.out.println(stringObject1.toChars());
        MyString2 stringObject2 = MyString2.valueOf(false);
        System.out.print(stringObject2.toChars());

    }


//////////////////////////////////////////////////////////////////////////////////

    private String s;

    //constructor
    public MyString2(String otherStr){
        this.s="";
        for(int i = 0; i< otherStr.length();i++){
           this.s += otherStr.charAt(i)+"";
        }
    }

    //compare 2 string objects
    public int compare(String otherStr){
        int value =0;
        if (this.s.length() < otherStr.length())
            value = -1;
        if (this.s.length() > otherStr.length())
            value = 1;
        return value;
    }

    //returns a substring from a given string with a given begin index
    public MyString2 substring(int begin){
        String subStr = " ";
        for(int i = begin; i< s.length(); i++){
            subStr += s.charAt(i) + "";
        }
        return new MyString2(subStr);
    }

    //returns a new object with all upper case letters
    public MyString2 toUpperCase(){
        String newStr = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
                newStr += String.valueOf((char)(s.charAt(i) - 32));
            else
                newStr += String.valueOf(s.charAt(i));
        }
        return new MyString2(newStr);
    }

    //returns a string as an array
    public char[] toChars(){
        char[] chArray = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chArray[i] = s.charAt(i);
        }
        return chArray;
    }

    //returns the boolean values true or false as MyString2 objects
    public static MyString2 valueOf(boolean b){
        if(b ) return (new MyString2("true"));
         else  return (new MyString2("false"));
    }

}
