package stringBufferAndBuilder;

public class StringBufferExample {
    public void stringAppend(){
        StringBuffer sb = new StringBuffer("Placement");
        System.out.println(" Old Text : " +sb);
        sb.append(" Training ");
        System.out.println("New Text : " +sb);
    }
    public void stringInsert(){
        StringBuffer sb = new StringBuffer("Ja") ;
        sb.insert(1,"av") ;
        System.out.println("After insertion : " +sb);
    }
    public void stringReverse(){
        StringBuffer sb  = new StringBuffer("Core Java") ;
        sb.reverse();
        System.out.println("After reversing : " +sb);
    }

    public static void main(String[] args) {
        StringBufferExample bufferExample = new StringBufferExample() ;
        bufferExample.stringAppend();
        bufferExample.stringInsert();
        bufferExample.stringReverse();
    }

}
