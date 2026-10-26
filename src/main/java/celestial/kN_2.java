/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Je_1;
import celestial.Jq_1;
import celestial.kJ_2;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rXs_1;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rlG_2;
import celestial.rpr_3;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public class kN_2
extends Je_1
implements kJ_2 {
    protected static final rjC_2 id_new = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 9.0, 16.0);

    protected kN_2(Jq_1 jq_1) {
        super(jq_1, rpr_3.UP, id_new, true, 0.14);
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rXE rXE2 = rxx_32.id_int().id_break(rxx_32.id_class());
        return rXE2.id_class(rlG_2.id_break) && rXE2.id_throws() == 8 ? super.id_class(rxx_32) : null;
    }

    @Override
    public boolean id_class(rRg_1 rRg_12, rfH_2 rfH_22, xc_3 xc_32, rXE rXE2) {
        return false;
    }

    @Override
    public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, rXs_1 rXs_12) {
        return false;
    }

    @Override
    protected int id_class(Random random) {
        return 1;
    }

    @Override
    protected boolean id_class(xd_3 xd_32) {
        return xd_32 != xu_3.bV;
    }

    @Override
    protected xd_3 id_break() {
        return xu_3.OO;
    }

    @Override
    public rXE id_throws(xc_3 xc_32) {
        return rXG.id_byte.id_class(false);
    }

    @Override
    protected boolean id_private(xc_3 xc_32) {
        return xc_32.id_class(xu_3.id_try);
    }
}

