/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrEG;
import celestial.rrEL;
import celestial.rrEx_1;
import java.util.concurrent.Executor;

public class rrEz_1
extends rrEL {
    public final /* synthetic */ rrEx_1 id_class;

    protected rrEz_1(rrEx_1 rrEx_12, Executor executor, Executor executor2) {
        this.id_class = rrEx_12;
        super(executor, executor2);
    }

    @Override
    protected rrEG id_class(long l, int n, rrEG rrEG2, int n2) {
        return this.id_class.id_class(l, n, rrEG2, n2);
    }

    @Override
    protected boolean id_class(long l) {
        return this.id_class.id_final.contains(l);
    }

    @Override
    protected rrEG id_break(long l) {
        return this.id_class.id_class(l);
    }
}

