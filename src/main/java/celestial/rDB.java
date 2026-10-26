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
import celestial.rqR_2;
import celestial.xc_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rDB
extends rKi_1 {
    public static final Codec<rDB> id_class;
    public static final rDB id_byte;
    private static final xc_3[] id_protected;
    private static final xc_3[] id_throws;

    static {
        id_byte = new rDB();
        id_protected = new xc_3[]{xu_3.rA.id_continue(), xu_3.rL.id_continue(), xu_3.rC.id_continue(), xu_3.rn.id_continue()};
        id_throws = new xc_3[]{xu_3.rm.id_continue(), xu_3.rF.id_continue(), xu_3.rl.id_continue(), xu_3.rH.id_continue()};
        id_class = Codec.unit(() -> id_byte);
    }

    @Override
    protected rDr_1<?> id_class() {
        return rDr_1.id_byte;
    }

    @Override
    public xc_3 id_class(Random random, rfH_2 rfH_22) {
        double d = rYG.id_case.id_class((double)rfH_22.b_() / 200.0, (double)rfH_22.d_() / 200.0, false);
        if (d < -0.8) {
            return rqR_2.id_class(id_protected, random);
        }
        return random.nextInt(3) > 0 ? rqR_2.id_class(id_throws, random) : xu_3.ru.id_continue();
    }
}

