/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKd_1;
import celestial.rUt_1;
import celestial.rYG;
import celestial.rYY;
import celestial.rfj_3;
import celestial.rqm_3;
import celestial.rrrZ;
import celestial.rrrm_1;
import celestial.rrrv_1;
import com.mojang.serialization.Codec;

public class rrru_1
extends rrrZ<rUt_1> {
    public rrru_1(Codec<rUt_1> codec) {
        super(codec);
    }

    @Override
    protected boolean id_class(rKd_1 rKd_12, rYY rYY2, long l, rqm_3 rqm_32, int n, int n2, rYG rYG2, rfj_3 rfj_32, rUt_1 rUt_12) {
        return rKd_12.id_class(new rfj_3(n, n2));
    }

    @Override
    public rrrv_1<rUt_1> id_class() {
        return rrrm_1::new;
    }
}

