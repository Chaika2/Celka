/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.aI_2;
import celestial.rKd_1;
import celestial.rYG;
import celestial.rYY;
import celestial.rYf_1;
import celestial.ral_3;
import celestial.rfj_3;
import celestial.rqm_3;
import celestial.rrSI;
import celestial.rrrI;
import celestial.rrrZ;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;

public class riT_2
extends ral_3 {
    private static final List<rYf_1> id_else = ImmutableList.of((Object)new rYf_1(aI_2.W, 1, 1, 1));

    @Override
    public List<rYf_1> id_byte() {
        return id_else;
    }

    public riT_2(Codec<rrrI> codec) {
        super(codec, 0, true, true);
    }

    @Override
    protected boolean id_class(rKd_1 rKd_12, rYY rYY2, long l, rqm_3 rqm_32, int n, int n2, rYG rYG2, rfj_3 rfj_32, rrrI rrrI2) {
        int n3 = n >> 4;
        int n4 = n2 >> 4;
        rqm_32.setSeed((long)(n3 ^ n4 << 4) ^ l);
        rqm_32.nextInt();
        if (rqm_32.nextInt(5) != 0) {
            return false;
        }
        return !this.id_class(rKd_12, l, rqm_32, n, n2);
    }

    private boolean id_class(rKd_1 rKd_12, long l, rqm_3 rqm_32, int n, int n2) {
        rrSI rrSI2 = rKd_12.id_break().id_class(rrrZ.id_new);
        if (rrSI2 == null) {
            return false;
        }
        for (int i = n - 10; i <= n + 10; ++i) {
            for (int j = n2 - 10; j <= n2 + 10; ++j) {
                rfj_3 rfj_32 = rrrZ.id_new.id_class(rrSI2, l, rqm_32, i, j);
                if (i != rfj_32.id_break || j != rfj_32.id_byte) continue;
                return true;
            }
        }
        return false;
    }
}

