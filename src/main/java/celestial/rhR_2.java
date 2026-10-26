/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jj_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.iB_2;
import celestial.is_3;
import celestial.rRu_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rfo_3;
import celestial.rhv_3;
import celestial.rjG_2;
import celestial.rye_3;

public class rhR_2
extends rhv_3 {
    public rhR_2(rYB rYB2, double d, double d2, double d3, double d4, double d5, double d6) {
        super((aI_2<? extends rhv_3>)aI_2.l, d, d2, d3, d4, d5, d6, rYB2);
    }

    public rhR_2(rYB rYB2, iB_2 iB_22, double d, double d2, double d3) {
        super((aI_2<? extends rhv_3>)aI_2.l, iB_22, d, d2, d3, rYB2);
    }

    public rhR_2(aI_2<? extends rhR_2> aI_22, rYB rYB2) {
        super((aI_2<? extends rhv_3>)aI_22, rYB2);
    }

    @Override
    protected void id_class(rjG_2 rjG_22) {
        super.id_class(rjG_22);
        if (!((rYB)this.id_throws[7]).id_continue) {
            this.PD();
        }
    }

    @Override
    protected void id_class(rff_3 rff_32) {
        rfH_2 rfH_22;
        an_3 an_32;
        super.id_class(rff_32);
        if (!((rYB)this.id_throws[7]).id_continue && ((an_32 = this.id_else()) == null || !(an_32 instanceof is_3) || ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_break)) && ((rYB)this.id_throws[7]).id_finally(rfH_22 = rff_32.id_class().id_break(rff_32.id_break()))) {
            ((rYB)this.id_throws[7]).id_break(rfH_22, Jj_1.id_class((rYB)this.id_throws[7], rfH_22));
        }
    }

    @Override
    protected void id_class(rfo_3 rfo_32) {
        an_3 an_32;
        super.id_class(rfo_32);
        if (!((rYB)this.id_throws[7]).id_continue && !(an_32 = rfo_32.id_class()).q()) {
            an_3 an_33 = this.id_else();
            int n = an_32.ru();
            an_32.id_case(5);
            boolean bl = an_32.id_break(rye_3.id_class(this, an_33), 5.0f);
            if (!bl) {
                an_32.id_protected(n);
            } else if (an_33 instanceof iB_2) {
                this.id_class((iB_2)an_33, an_32);
            }
        }
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        return false;
    }

    @Override
    public boolean rY() {
        return false;
    }
}

