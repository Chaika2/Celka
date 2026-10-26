/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKd_1;
import celestial.rRI;
import celestial.rUO;
import celestial.rUt_1;
import celestial.rfH_2;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xu_3;
import celestial.zg_3;
import java.util.Random;

public class rUs_1
extends rUO<rUt_1> {
    public static final rfH_2 id_class = rfH_2.id_protected;
    private final boolean b;

    public rUs_1(boolean bl) {
        super(rUt_1.id_class);
        this.b = bl;
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUt_1 rUt_12) {
        for (rfH_2 object : rfH_2.id_class(new rfH_2(rfH_22.b_() - 4, rfH_22.c_() - 1, rfH_22.d_() - 4), new rfH_2(rfH_22.b_() + 4, rfH_22.c_() + 32, rfH_22.d_() + 4))) {
            boolean rpr_32 = object.id_class(rfH_22, 2.5);
            if (!rpr_32 && !object.id_class(rfH_22, 3.5)) continue;
            if (object.c_() < rfH_22.c_()) {
                if (rpr_32) {
                    this.id_class(rRI2, object, xu_3.id_while.id_continue());
                    continue;
                }
                if (object.c_() >= rfH_22.c_()) continue;
                this.id_class(rRI2, object, xu_3.Sh.id_continue());
                continue;
            }
            if (object.c_() > rfH_22.c_()) {
                this.id_class(rRI2, object, xu_3.id_class.id_continue());
                continue;
            }
            if (!rpr_32) {
                this.id_class(rRI2, object, xu_3.id_while.id_continue());
                continue;
            }
            if (this.b) {
                this.id_class(rRI2, new rfH_2(object), xu_3.SM.id_continue());
                continue;
            }
            this.id_class(rRI2, new rfH_2(object), xu_3.id_class.id_continue());
        }
        for (int i = 0; i < 4; ++i) {
            this.id_class(rRI2, rfH_22.id_break(i), xu_3.id_while.id_continue());
        }
        rfH_2 rfH_23 = rfH_22.id_break(2);
        for (rpr_3 rpr_32 : rpb_3.HORIZONTAL) {
            this.id_class(rRI2, rfH_23.id_break(rpr_32), (xc_3)xu_3.rY.id_continue().id_class(zg_3.id_volatile, rpr_32));
        }
        return true;
    }
}

