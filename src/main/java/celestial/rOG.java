/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rBp_1;
import celestial.rMi_1;
import celestial.rRR;
import celestial.rRu_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xl_3;
import celestial.xu_3;

public class rOG
extends rBp_1 {
    private final rMi_1 id_catch;
    private boolean id_private;
    private boolean id_implements;

    public rOG(rMi_1 rMi_12) {
        super(rMi_12, 0.7f, 16);
        this.id_catch = rMi_12;
    }

    @Override
    protected boolean id_class(rRR rRR2, rfH_2 rfH_22) {
        xc_3 xc_32;
        xd_3 xd_32 = rRR2.id_byte(rfH_22).id_break();
        if (xd_32 == xu_3.PS && this.id_private && !this.id_implements && (xd_32 = (xc_32 = rRR2.id_byte(rfH_22 = rfH_22.id_final())).id_break()) instanceof xl_3 && ((xl_3)xd_32).id_implements(xc_32)) {
            this.id_implements = true;
            return true;
        }
        return false;
    }

    @Override
    public boolean id_class() {
        if (this.id_byte <= 0) {
            if (!((rYB)this.id_catch.id_throws[7]).B().id_break(rRu_1.id_break)) {
                return false;
            }
            this.id_implements = false;
            this.id_private = this.id_catch.sZ();
            this.id_private = true;
        }
        return super.id_class();
    }

    @Override
    public boolean id_break() {
        return this.id_implements && super.id_break();
    }

    @Override
    public void id_throws() {
        super.id_throws();
        this.id_catch.id_continue().id_class((double)this.id_throws.b_() + 0.5, this.id_throws.c_() + 1, (double)this.id_throws.d_() + 0.5, 10.0f, this.id_catch.r());
        if (this.id_native()) {
            rYB rYB2 = (rYB)this.id_catch.id_throws[7];
            rfH_2 rfH_22 = this.id_throws.id_final();
            xc_3 xc_32 = rYB2.id_byte(rfH_22);
            xd_3 xd_32 = xc_32.id_break();
            if (this.id_implements && xd_32 instanceof xl_3) {
                Integer n = xc_32.id_byte(xl_3.id_final);
                if (n == 0) {
                    rYB2.id_class(rfH_22, xu_3.id_class.id_continue(), 2);
                    rYB2.id_class(rfH_22, true, this.id_catch);
                } else {
                    rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(xl_3.id_final, n - 1), 2);
                    rYB2.id_byte(2001, rfH_22, xd_3.id_finally(xc_32));
                }
                this.id_catch.id_goto = 40;
            }
            this.id_implements = false;
            this.id_byte = 10;
        }
    }
}

