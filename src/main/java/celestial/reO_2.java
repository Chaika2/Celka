/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rKd_1;
import celestial.rRI;
import celestial.rUO;
import celestial.rUt_1;
import celestial.rfH_2;
import celestial.rfj_3;
import celestial.rfw_3;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class reO_2
extends rUO<rUt_1> {
    private static final rfH_2 id_class = new rfH_2(8, 3, 8);
    private static final rfj_3 b = new rfj_3(id_class);

    public reO_2(Codec<rUt_1> codec) {
        super(codec);
    }

    private static int id_class(int n, int n2, int n3, int n4) {
        return Math.max(Math.abs(n - n3), Math.abs(n2 - n4));
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUt_1 rUt_12) {
        rfj_3 rfj_32 = new rfj_3(rfH_22);
        if (reO_2.id_class(rfj_32.id_break, rfj_32.id_byte, reO_2.b.id_break, reO_2.b.id_byte) > 1) {
            return true;
        }
        rfw_3 rfw_32 = new rfw_3();
        for (int i = rfj_32.id_byte(); i <= rfj_32.id_throws(); ++i) {
            for (int j = rfj_32.id_break(); j <= rfj_32.id_protected(); ++j) {
                if (reO_2.id_class(id_class.b_(), id_class.d_(), j, i) > 16) continue;
                rfw_32.id_class(j, id_class.c_(), i);
                if (rfw_32.equals(id_class)) {
                    rRI2.id_class((rfH_2)rfw_32, xu_3.id_volatile.id_continue(), 2);
                    continue;
                }
                rRI2.id_class((rfH_2)rfw_32, xu_3.id_break.id_continue(), 2);
            }
        }
        return true;
    }
}

