package stringBufferAndBuilder;

public class BufferBuilderPerformance {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis() ;
        StringBuffer stringBuffer = new StringBuffer("Placement") ;
        for(int i= 0 ; i < 200000 ; i++){
            stringBuffer.append(" Training ") ;}
        System.out.println("Time taken by string buffer : " +(System.currentTimeMillis() - startTime) + "ms");

        StringBuilder stringBuilder = new StringBuilder("Placement") ;
        for(int i= 0 ; i < 200000 ; i++){
            stringBuilder.append(" Training ") ;}
        System.out.println("Time taken by string builder : " +(System.currentTimeMillis() - startTime) + "ms");
    }
}
