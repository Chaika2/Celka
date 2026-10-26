/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rlQ_2;
import celestial.ruS_2;
import celestial.ruu_3;
import java.io.IOException;

public class rFN
implements ruS_2<At_1> {
    private rlQ_2 id_class;

    public rFN() {
    }

    public rFN(rlQ_2 rlQ_22) {
        this.id_class = rlQ_22;
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = rlQ_2.id_break(ruu_32);
    }

    public rlQ_2 id_break() {
        return this.id_class;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        this.id_class.id_class(ruu_32);
    }
}

