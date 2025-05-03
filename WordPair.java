public class WordPair
{
String pair;
String first;
String second;
public WordPair(String f, String s)
{ 
    first = f;
    second = s;
    pair = first + ", " + second;
}

public String getFirst()
{return first; }

public String getSecond()
{ return second; }

public String toString(){
    return(first + "," + second);
}
}
