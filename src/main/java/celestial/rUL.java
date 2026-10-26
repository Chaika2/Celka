/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rDN;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rUa_1;
import celestial.rfH_2;
import celestial.xu_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rUL
extends rDN {
    public rUL(Codec<rUa_1> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUa_1 rUa_12) {
        while (rRI2.id_finally(rfH_22) && rfH_22.c_() > 2) {
            rfH_22 = rfH_22.id_break();
        }
        return !rRI2.id_byte(rfH_22).id_class(xu_3.Pt) ? false : super.id_class(rRI2, rKd_12, random, rfH_22, rUa_12);
    }
}

