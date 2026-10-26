/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Queues
 */
package celestial;

import celestial.rTk_1;
import celestial.rTx_1;
import com.google.common.collect.Queues;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public final class rTd_1
implements rTx_1<rTk_1, Runnable> {
    private final List<ConcurrentLinkedQueue<Runnable>> id_class;

    public Runnable id_byte() {
        for (ConcurrentLinkedQueue<Runnable> concurrentLinkedQueue : this.id_class) {
            Runnable runnable = concurrentLinkedQueue.poll();
            if (runnable == null) continue;
            return runnable;
        }
        return null;
    }

    public rTd_1(int n2) {
        this.id_class = IntStream.range(0, n2).mapToObj(n -> Queues.newConcurrentLinkedQueue()).collect(Collectors.toList());
    }

    @Override
    public /* synthetic */ Object id_class() {
        return this.id_byte();
    }

    @Override
    public boolean id_class(rTk_1 rTk_12) {
        int n = rTk_12.id_class();
        this.id_class.get(n).add(rTk_12);
        return true;
    }

    @Override
    public boolean id_break() {
        return this.id_class.stream().allMatch(Collection::isEmpty);
    }
}

