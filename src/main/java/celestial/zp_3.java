/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Je_1;
import celestial.Jq_1;
import celestial.Wr_1;
import celestial.rjC_2;
import celestial.rpr_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public class zp_3
extends Je_1 {
    public static final rjC_2 id_new = xd_3.id_class(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

    public zp_3(Jq_1 jq_1) {
        super(jq_1, rpr_3.UP, id_new, false, 0.1);
    }

    @Override
    protected int id_class(Random random) {
        return Wr_1.id_class(random);
    }

    @Override
    protected xd_3 id_break() {
        return xu_3.Xy;
    }

    @Override
    protected boolean id_private(xc_3 xc_32) {
        return Wr_1.id_class(xc_32);
    }
}

