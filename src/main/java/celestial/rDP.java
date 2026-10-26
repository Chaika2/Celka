/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rDr_1;
import celestial.rKi_1;
import celestial.rYG;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.xc_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rDP
extends rKi_1 {
    public static final Codec<rDP> id_class;
    private static final xc_3[] id_protected;
    public static final rDP id_byte;

    static {
        id_protected = new xc_3[]{xu_3.ru.id_continue(), xu_3.rm.id_continue(), xu_3.rv.id_continue(), xu_3.rF.id_continue(), xu_3.rL.id_continue(), xu_3.rA.id_continue(), xu_3.rn.id_continue(), xu_3.rC.id_continue(), xu_3.rl.id_continue(), xu_3.rH.id_continue(), xu_3.rp.id_continue()};
        id_byte = new rDP();
        id_class = Codec.unit(() -> id_byte);
    }

    @Override
    protected rDr_1<?> id_class() {
        return rDr_1.id_protected;
    }

    @Override
    public xc_3 id_class(Random random, rfH_2 rfH_22) {
        double d = rfU_2.id_class((1.0 + rYG.id_case.id_class((double)rfH_22.b_() / 48.0, (double)rfH_22.d_() / 48.0, false)) / 2.0, 0.0, 0.9999);
        return id_protected[(int)(d * (double)id_protected.length)];
    }
}

