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
import celestial.rUR;
import celestial.rfH_2;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rUY
extends rUO<rUR> {
    public rUY(Codec<rUR> codec) {
        super(codec);
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22, rUR rUR2) {
        if (rRI2.id_byte(rfH_22).id_class(rUR2.id_break.id_break())) {
            rRI2.id_class(rfH_22, rUR2.id_byte, 2);
        }
        return true;
    }
}

