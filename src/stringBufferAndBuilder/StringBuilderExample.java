package stringBufferAndBuilder;

public class StringBuilderExample {

 public void stringAppend(){
    StringBuilder sb = new StringBuilder("Placement");
    System.out.println(" Old Text : " +sb);
    sb.append(" Training ");
    System.out.println("New Text : " +sb);
}
    public void stringInsert(){
        StringBuilder sb = new StringBuilder("Ja") ;
        sb.insert(1,"av") ;
        System.out.println("After insertion : " +sb);
    }
    public void stringReverse(){
        StringBuilder sb  = new StringBuilder("Core Java") ;
        sb.reverse();
        System.out.println("After reversing : " +sb);
    }

    public static void main(String[] args) {
        StringBuilderExample builderExample= new StringBuilderExample() ;
        builderExample.stringAppend();
        builderExample.stringInsert();
        builderExample.stringReverse();
    }

}
