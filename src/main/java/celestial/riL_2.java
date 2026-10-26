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
import celestial.rUt_1;
import celestial.rYG;
import celestial.rYY;
import celestial.rYf_1;
import celestial.rYh_1;
import celestial.rfj_3;
import celestial.riA_2;
import celestial.rqm_3;
import celestial.rrrZ;
import celestial.rrrv_1;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;

public class riL_2
extends rrrZ<rUt_1> {
    private static final List<rYf_1> id_else = ImmutableList.of((Object)new rYf_1(aI_2.id_abstract, 1, 2, 4));

    @Override
    public List<rYf_1> id_byte() {
        return id_else;
    }

    public riL_2(Codec<rUt_1> codec) {
        super(codec);
    }

    @Override
    public rrrv_1<rUt_1> id_class() {
        return riA_2::new;
    }

    @Override
    protected boolean id_class(rKd_1 rKd_12, rYY rYY2, long l, rqm_3 rqm_32, int n, int n2, rYG rYG2, rfj_3 rfj_32, rUt_1 rUt_12) {
        for (rYG rYG3 : rYY2.id_class(n * 16 + 9, rKd_12.id_case(), n2 * 16 + 9, 16)) {
            if (rYG3.id_throws().id_class(this)) continue;
            return false;
        }
        for (rYG rYG3 : rYY2.id_class(n * 16 + 9, rKd_12.id_case(), n2 * 16 + 9, 29)) {
            if (rYG3.id_this() == rYh_1.OCEAN || rYG3.id_this() == rYh_1.RIVER) continue;
            return false;
        }
        return true;
    }

    @Override
    protected boolean id_break() {
        return false;
    }
}

