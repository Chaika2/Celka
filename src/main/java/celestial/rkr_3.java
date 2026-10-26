/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rXQ;
import celestial.rYB;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rls_3;
import celestial.xc_3;
import celestial.xu_3;

public class rkr_3
extends rdb_3 {
    public rkr_3(rdO_2 rdO_22) {
        super(rdO_22);
    }

    @Override
    public float id_class(rdn_3 rdn_32, xc_3 xc_32) {
        if (!xc_32.id_class(xu_3.U) && !xc_32.id_class(rls_3.id_void)) {
            return xc_32.id_class(rls_3.id_break) ? 5.0f : super.id_class(rdn_32, xc_32);
        }
        return 15.0f;
    }

    @Override
    public boolean id_class(rdn_3 rdn_32, rYB rYB2, xc_3 xc_32, rfH_2 rfH_22, iB_2 iB_23) {
        if (!rYB2.id_continue && !xc_32.id_break().id_class(rls_3.N)) {
            rdn_32.id_class(1, iB_23, (T iB_22) -> iB_22.id_break(rXQ.MAINHAND));
        }
        return !xc_32.id_class(rls_3.id_void) && !xc_32.id_class(xu_3.U) && !xc_32.id_class(xu_3.e) && !xc_32.id_class(xu_3.a) && !xc_32.id_class(xu_3.i) && !xc_32.id_class(xu_3.BD) && !xc_32.id_class(xu_3.SQ) && !xc_32.id_class(rls_3.id_break) ? super.id_class(rdn_32, rYB2, xc_32, rfH_22, iB_23) : true;
    }

    @Override
    public boolean id_break(xc_3 xc_32) {
        return xc_32.id_class(xu_3.U) || xc_32.id_class(xu_3.ra) || xc_32.id_class(xu_3.SQ);
    }
}

