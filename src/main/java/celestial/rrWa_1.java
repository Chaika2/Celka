/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.lang.management.BufferPoolMXBean;
import java.util.function.LongSupplier;

public class rrWa_1
implements LongSupplier {
    public final /* synthetic */ BufferPoolMXBean id_class;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rrWa_1(BufferPoolMXBean bufferPoolMXBean) {
        this.id_class = bufferPoolMXBean;
    }

    @Override
    public long getAsLong() {
        return this.id_class.getMemoryUsed();
    }
}

