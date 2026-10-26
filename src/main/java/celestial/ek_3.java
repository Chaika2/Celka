/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Uq_1;
import celestial.rfH_2;
import celestial.rrEm_1;
import celestial.ryO_2;
import celestial.xc_3;

public class ek_3
implements Uq_1 {
    private final rrEm_1 id_class;
    private final rfH_2 id_break;

    @Override
    public double id_byte() {
        return (double)this.id_break.d_() + 0.5;
    }

    public ek_3(rrEm_1 rrEm_12, rfH_2 rfH_22) {
        this.id_class = rrEm_12;
        this.id_break = rfH_22;
    }

    @Override
    public double id_class() {
        return (double)this.id_break.b_() + 0.5;
    }

    @Override
    public double id_break() {
        return (double)this.id_break.c_() + 0.5;
    }

    @Override
    public xc_3 id_throws() {
        return this.id_class.id_byte(this.id_break);
    }

    @Override
    public rrEm_1 id_catch() {
        return this.id_class;
    }

    @Override
    public <T extends ryO_2> T id_case() {
        return (T)this.id_class.id_class(this.id_break);
    }

    @Override
    public rfH_2 id_protected() {
        return this.id_break;
    }
}

