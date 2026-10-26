/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rTh_1;
import celestial.rfj_3;
import celestial.roN_2;
import celestial.roq_3;
import java.util.concurrent.Executor;

public class rop_3
implements roq_3 {
    private final roq_3 id_class;
    private final rTh_1<Runnable> id_break;

    public rop_3(roq_3 roq_32, Executor executor) {
        this.id_class = roq_32;
        this.id_break = rTh_1.id_class(executor, "progressListener");
    }

    @Override
    public void id_class() {
        this.id_break.id_class(this.id_class::id_class);
    }

    @Override
    public void id_class(rfj_3 rfj_32, roN_2 roN_22) {
        this.id_break.id_class(() -> this.id_class.id_class(rfj_32, roN_22));
    }

    @Override
    public void id_class(rfj_3 rfj_32) {
        this.id_break.id_class(() -> this.id_class.id_class(rfj_32));
    }
}

