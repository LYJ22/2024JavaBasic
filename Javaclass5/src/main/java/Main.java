import java.util.ArrayList;

class KFCException extends RuntimeException{
    public KFCException(String message){
        System.out.println("Exception 떴다~");
    }
}

class BTS{
    public void run(int a) throws KFCException {
        if(a<0){
            throw new KFCException("hihi");
        }
        System.out.println("RUN");
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);

        BTS bts = new BTS();
        try{
            bts.run(-1);
        }catch (KFCException e){
            System.out.println(e);
        }

    }
}
