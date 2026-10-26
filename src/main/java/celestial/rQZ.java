/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.XN;
import celestial.Xc_1;
import celestial.rQF;
import celestial.rQQ;
import celestial.rQz_1;
import celestial.rWi_1;
import celestial.rfH_2;
import celestial.rjU_2;
import celestial.rzQ_2;
import celestial.rzr_3;

public class rQZ
implements rQz_1 {
    public final XN id_class;
    public final rfH_2 id_break;

    public rQZ(XN xN, rfH_2 rfH_22) {
        this.id_class = xN;
        this.id_break = rfH_22;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((rzr_3)object);
    }

    public static rQQ id_class(Xc_1 xc_1) {
        return () -> new rQZ(xc_1.id_break(), rfH_2.id_protected);
    }

    public static rQQ id_class(Xc_1 xc_1, rfH_2 rfH_22) {
        return () -> new rQZ(xc_1.id_break(), rfH_22);
    }

    public boolean id_class(rzr_3 rzr_32) {
        rjU_2 rjU_22 = rzr_32.id_break(rzQ_2.id_case);
        return rjU_22 != null && this.id_class.id_class(rzr_32.id_byte(), rjU_22.id_class() + (double)this.id_break.b_(), rjU_22.id_break() + (double)this.id_break.c_(), rjU_22.id_byte() + (double)this.id_break.d_());
    }

    @Override
    public rWi_1 id_break() {
        return rQF.id_volatile;
    }
}

