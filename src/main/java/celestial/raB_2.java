/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKd_1;
import celestial.rKv_1;
import celestial.rUt_1;
import celestial.rYG;
import celestial.rYY;
import celestial.raS_2;
import celestial.rfj_3;
import celestial.rqd_3;
import celestial.rqm_3;
import celestial.rrrZ;
import celestial.rrrv_1;
import com.mojang.serialization.Codec;
import java.util.Random;

public class raB_2
extends rrrZ<rUt_1> {
    public raB_2(Codec<rUt_1> codec) {
        super(codec);
    }

    @Override
    public rrrv_1<rUt_1> id_class() {
        return raS_2::new;
    }

    public static int id_class(int n, int n2, rKd_1 rKd_12) {
        Random random = new Random(n + n2 * 10387313);
        rqd_3 rqd_32 = rqd_3.id_class(random);
        int n3 = 5;
        int n4 = 5;
        if (rqd_32 == rqd_3.CLOCKWISE_90) {
            n3 = -5;
        } else if (rqd_32 == rqd_3.CLOCKWISE_180) {
            n3 = -5;
            n4 = -5;
        } else if (rqd_32 == rqd_3.COUNTERCLOCKWISE_90) {
            n4 = -5;
        }
        int n5 = (n << 4) + 7;
        int n6 = (n2 << 4) + 7;
        int n7 = rKd_12.id_byte(n5, n6, rKv_1.WORLD_SURFACE_WG);
        int n8 = rKd_12.id_byte(n5, n6 + n4, rKv_1.WORLD_SURFACE_WG);
        int n9 = rKd_12.id_byte(n5 + n3, n6, rKv_1.WORLD_SURFACE_WG);
        int n10 = rKd_12.id_byte(n5 + n3, n6 + n4, rKv_1.WORLD_SURFACE_WG);
        return Math.min(Math.min(n7, n8), Math.min(n9, n10));
    }

    @Override
    protected boolean id_class(rKd_1 rKd_12, rYY rYY2, long l, rqm_3 rqm_32, int n, int n2, rYG rYG2, rfj_3 rfj_32, rUt_1 rUt_12) {
        return raB_2.id_class(n, n2, rKd_12) >= 60;
    }

    @Override
    protected boolean id_break() {
        return false;
    }
}

