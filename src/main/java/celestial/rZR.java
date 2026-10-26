/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.At_1;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.ruS_2;
import celestial.ruu_3;
import celestial.xc_3;
import celestial.xd_3;
import java.io.IOException;

public class rZR
implements ruS_2<At_1> {
    private rfH_2 id_class;
    private xc_3 id_break;

    public rfH_2 id_byte() {
        return this.id_class;
    }

    public rZR(rRq_1 rRq_12, rfH_2 rfH_22) {
        this(rfH_22, rRq_12.id_byte(rfH_22));
    }

    public rZR(rfH_2 rfH_22, xc_3 xc_32) {
        this.id_class = rfH_22;
        this.id_break = xc_32;
    }

    public rZR() {
    }

    @Override
    public void id_class(At_1 at_1) {
        at_1.id_class(this);
    }

    @Override
    public void id_class(ruu_3 ruu_32) throws IOException {
        this.id_class = ruu_32.id_byte();
        this.id_break = xd_3.id_char.id_class(ruu_32.id_case());
    }

    public xc_3 id_break() {
        return this.id_break;
    }

    @Override
    public void id_break(ruu_3 ruu_32) throws IOException {
        ruu_32.id_class(this.id_class);
        ruu_32.id_protected(xd_3.id_finally(this.id_break));
    }
}

