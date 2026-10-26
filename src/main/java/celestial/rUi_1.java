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
import celestial.rlG_2;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rUi_1
extends rDN {
    public rUi_1(Codec<rUa_1> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUa_1 rUa_12) {
        return !rRI2.id_break(rfH_22).id_class(rlG_2.id_break) ? false : super.id_class(rRI2, rKd_12, random, rfH_22, rUa_12);
    }
}

