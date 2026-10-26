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
import celestial.rav_3;
import celestial.rfj_3;
import celestial.rqm_3;
import celestial.rrrZ;
import celestial.rrrv_1;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.Codec;
import java.util.List;

public class raZ_2
extends rrrZ<rUt_1> {
    private static final List<rYf_1> id_else = ImmutableList.of((Object)new rYf_1(aI_2.id_case, 10, 2, 3), (Object)new rYf_1(aI_2.rb, 5, 4, 4), (Object)new rYf_1(aI_2.rr, 8, 5, 5), (Object)new rYf_1(aI_2.A, 2, 5, 5), (Object)new rYf_1(aI_2.id_double, 3, 4, 4));

    @Override
    public List<rYf_1> id_byte() {
        return id_else;
    }

    public raZ_2(Codec<rUt_1> codec) {
        super(codec);
    }

    @Override
    public rrrv_1<rUt_1> id_class() {
        return rav_3::new;
    }

    @Override
    protected boolean id_class(rKd_1 rKd_12, rYY rYY2, long l, rqm_3 rqm_32, int n, int n2, rYG rYG2, rfj_3 rfj_32, rUt_1 rUt_12) {
        return rqm_32.nextInt(5) < 2;
    }
}

