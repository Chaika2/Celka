/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HN;
import celestial.QY;
import celestial.Qa_1;
import celestial.Qg_1;
import celestial.ys_3;

public final class yh_3
implements AutoCloseable {
    private final QY id_class;
    private final HN id_break;

    public yh_3(QY qY) {
        this.id_class = qY;
        this.id_break = new HN(Qa_1::new);
    }

    public Qg_1 id_class(ys_3 ys_32, String string, String string2) {
        return new Qg_1(this.id_class, this.id_break, ys_32, string, string2);
    }

    @Override
    public void close() {
        this.id_break.id_class();
    }
}

