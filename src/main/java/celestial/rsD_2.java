/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rLR;
import celestial.rdI_2;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rkJ_2;
import celestial.rsR_2;
import java.util.Random;

public class rsD_2
implements rsR_2 {
    public final rLR id_class;
    public final int id_break;
    public final int id_byte;
    private final float id_protected;

    public rsD_2(rLR rLR2, int n, int n2) {
        this.id_class = rLR2;
        this.id_break = n;
        this.id_byte = n2;
        this.id_protected = 0.05f;
    }

    @Override
    public rdI_2 id_class(an_3 an_32, Random random) {
        rdn_3 rdn_32 = new rdn_3(rdy_3.ke, 1);
        rkJ_2.id_class(rdn_32, this.id_class, this.id_break);
        return new rdI_2(new rdn_3(rdy_3.dP, 1), rdn_32, 12, this.id_byte, this.id_protected);
    }
}

