/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.function.LongSupplier;

public class rrWi_1
implements LongSupplier {
    @Override
    public long getAsLong() {
        return Runtime.getRuntime().maxMemory();
    }
}

