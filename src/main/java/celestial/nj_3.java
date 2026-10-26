/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CL;
import celestial.an_3;
import celestial.gm_3;
import celestial.rLx_1;
import celestial.rjU_2;

public class nj_3
extends CL {
    private final an_3 id_class;
    private int id_break;
    private final int id_instanceof;
    private final rLx_1 id_throw;

    private nj_3(gm_3 gm_32, an_3 an_32, rLx_1 rLx_12, int n, rjU_2 rjU_22) {
        super(gm_32, an_32.rx(), an_32.id_byte(0.5), an_32.BO(), rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
        this.id_class = an_32;
        this.id_instanceof = n;
        this.id_throw = rLx_12;
        this.id_case();
    }

    public nj_3(gm_3 gm_32, an_3 an_32, rLx_1 rLx_12, int n) {
        this(gm_32, an_32, rLx_12, n, an_32.rv());
    }

    public nj_3(gm_3 gm_32, an_3 an_32, rLx_1 rLx_12) {
        this(gm_32, an_32, rLx_12, 3);
    }

    @Override
    public void id_case() {
        for (int i = 0; i < 16; ++i) {
            double d;
            double d2;
            double d3 = this.id_continue.nextFloat() * 2.0f - 1.0f;
            if (d3 * d3 + (d2 = (double)(this.id_continue.nextFloat() * 2.0f - 1.0f)) * d2 + (d = (double)(this.id_continue.nextFloat() * 2.0f - 1.0f)) * d > 1.0) continue;
            double d4 = this.id_class.id_catch(d3 / 4.0);
            double d5 = this.id_class.id_byte(0.5 + d2 / 4.0);
            double d6 = this.id_class.id_throws(d / 4.0);
            this.id_byte.id_class(this.id_throw, false, d4, d5, d6, d3, d2 + 0.2, d);
        }
        ++this.id_break;
        if (this.id_break >= this.id_instanceof) {
            this.id_finally();
        }
    }
}

