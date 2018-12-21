package proxy;

import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

public class TransactionManager {
    private final static ConcurrentMap<Integer, Transaction> transactions = new ConcurrentHashMap<>();
    private final AtomicInteger atomicInteger = new AtomicInteger(0);

    public int beginTransaction(){
        int primitiveId = atomicInteger.getAndIncrement();
        transactions.put(primitiveId, new Transaction(primitiveId));
        return primitiveId;
    }
    public boolean commit(int transactionId){
        //...
        transactions.remove(transactionId);
        return true;
    }
}
