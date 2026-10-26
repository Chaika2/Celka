/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rDt_1;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rUO;
import celestial.rfH_2;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rDw_1
extends rUO<rDt_1> {
    public rDw_1(Codec<rDt_1> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rDt_1 rDt_12) {
        if (rDt_12.id_byte.contains(rRI2.id_byte(rfH_22.id_break())) && rDt_12.id_protected.contains(rRI2.id_byte(rfH_22)) && rDt_12.id_throws.contains(rRI2.id_byte(rfH_22.id_final()))) {
            rRI2.id_class(rfH_22, rDt_12.id_break, 2);
            return true;
        }
        return false;
    }
}

