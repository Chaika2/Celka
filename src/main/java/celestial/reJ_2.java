/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKd_1;
import celestial.rRI;
import celestial.red_3;
import celestial.rem_3;
import celestial.rev_3;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rqd_3;
import celestial.rrPp_1;
import celestial.rrPt_1;
import celestial.rrrA;
import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class reJ_2
extends rev_3 {
    public static final Codec<reJ_2> id_class;
    public static final reJ_2 id_break;

    private reJ_2() {
        super(rem_3.TERRAIN_MATCHING);
    }

    static {
        id_break = new reJ_2();
        id_class = Codec.unit(() -> id_break);
    }

    public String toString() {
        return "Empty";
    }

    @Override
    public red_3<?> id_class() {
        return red_3.id_protected;
    }

    @Override
    public rfi_3 id_class(rrPt_1 rrPt_12, rfH_2 rfH_22, rqd_3 rqd_32) {
        return rfi_3.id_class();
    }

    @Override
    public List<rrPp_1> id_class(rrPt_1 rrPt_12, rfH_2 rfH_22, rqd_3 rqd_32, Random random) {
        return Collections.emptyList();
    }

    @Override
    public boolean id_class(rrPt_1 rrPt_12, rRI rRI2, rrrA rrrA2, rKd_1 rKd_12, rfH_2 rfH_22, rfH_2 rfH_23, rqd_3 rqd_32, rfi_3 rfi_32, Random random, boolean bl) {
        return true;
    }
}

