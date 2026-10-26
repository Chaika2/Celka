/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.mN_2;
import celestial.rKT;
import celestial.rKW;
import celestial.rKd_1;
import celestial.rRJ;
import celestial.rVF;
import celestial.rVL;
import celestial.rVv_1;
import celestial.rYG;
import celestial.rYl_1;
import celestial.ror_3;
import celestial.rrSp_1;

public class mF_2
extends mN_2 {
    public mF_2(String string) {
        super(string);
    }

    @Override
    protected rKd_1 id_class(rVL<rYG> rVL2, rVL<rKW> rVL3, long l) {
        return new rKT(new ror_3(rVL2.id_byte(rYl_1.id_break)), l, () -> rVL3.id_byte(rKW.id_catch));
    }

    @Override
    public rrSp_1 id_class(rVv_1 rVv_12, long l, boolean bl, boolean bl2) {
        rVF<rYG> rVF2 = rVv_12.id_break(rVL.n);
        rVF<rRJ> rVF3 = rVv_12.id_break(rVL.id_void);
        rVF<rKW> rVF4 = rVv_12.id_break(rVL.u);
        return new rrSp_1(l, bl, bl2, rrSp_1.id_class(rRJ.id_class(rVF3, rVF2, rVF4, l), () -> rVF3.id_byte(rRJ.id_native), this.id_class(rVF2, rVF4, l)));
    }
}

