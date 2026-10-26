/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKd_1;
import celestial.rYG;
import celestial.rYY;
import celestial.raD_2;
import celestial.raI_2;
import celestial.rfj_3;
import celestial.rqm_3;
import celestial.rrrZ;
import celestial.rrrv_1;
import com.mojang.serialization.Codec;

public class raK_2
extends rrrZ<raI_2> {
    public raK_2(Codec<raI_2> codec) {
        super(codec);
    }

    @Override
    public rrrv_1<raI_2> id_class() {
        return raD_2::new;
    }

    @Override
    protected boolean id_class(rKd_1 rKd_12, rYY rYY2, long l, rqm_3 rqm_32, int n, int n2, rYG rYG2, rfj_3 rfj_32, raI_2 raI_22) {
        rqm_32.id_byte(l, n, n2);
        double d = raI_22.id_break;
        return rqm_32.nextDouble() < d;
    }
}

