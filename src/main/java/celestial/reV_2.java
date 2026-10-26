/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKd_1;
import celestial.rUV;
import celestial.rYG;
import celestial.rYY;
import celestial.reg_3;
import celestial.rfj_3;
import celestial.rqm_3;
import celestial.rrrZ;
import celestial.rrrv_1;
import com.mojang.serialization.Codec;

public class reV_2
extends rrrZ<rUV> {
    public reV_2(Codec<rUV> codec) {
        super(codec);
    }

    @Override
    public rrrv_1<rUV> id_class() {
        return reg_3::new;
    }

    @Override
    protected boolean id_class(rKd_1 rKd_12, rYY rYY2, long l, rqm_3 rqm_32, int n, int n2, rYG rYG2, rfj_3 rfj_32, rUV rUV2) {
        rqm_32.id_class(l, n, n2, 10387320);
        return rqm_32.nextFloat() < rUV2.id_break;
    }
}

