/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.JC;
import celestial.WL;
import celestial.rDr_1;
import celestial.rKi_1;
import celestial.rfH_2;
import celestial.rpB_2;
import celestial.xc_3;
import celestial.xd_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rKa_1
extends rKi_1 {
    public static final Codec<rKa_1> id_class = xc_3.id_break.fieldOf("state").xmap(JC::id_break, xd_3::id_continue).xmap(rKa_1::new, rKa_12 -> rKa_12.id_byte).codec();
    private final xd_3 id_byte;

    public rKa_1(xd_3 xd_32) {
        this.id_byte = xd_32;
    }

    @Override
    protected rDr_1<?> id_class() {
        return rDr_1.id_throws;
    }

    @Override
    public xc_3 id_class(Random random, rfH_2 rfH_22) {
        rpB_2 rpB_22 = rpB_2.id_class(random);
        return (xc_3)this.id_byte.id_continue().id_class(WL.id_new, rpB_22);
    }
}

