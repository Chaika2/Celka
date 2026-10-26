/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  org.apache.commons.lang3.mutable.MutableBoolean
 */
package celestial;

import celestial.rDe_1;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rUO;
import celestial.rVL;
import celestial.reX_2;
import celestial.rfH_2;
import com.mojang.serialization.Codec;
import java.util.Random;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class rDU
extends rUO<rDe_1> {
    public rDU(Codec<rDe_1> codec) {
        super(codec);
    }

    public String toString() {
        return String.format("< %s [%s] >", this.getClass().getSimpleName(), rVL.q.id_break(this));
    }

    @Override
    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_23, rDe_1 rDe_12) {
        MutableBoolean mutableBoolean = new MutableBoolean();
        rDe_12.id_byte.id_class(new reX_2(rRI2, rKd_12), random, rfH_23).forEach(rfH_22 -> {
            if (rDe_12.id_break.get().id_class(rRI2, rKd_12, random, (rfH_2)rfH_22)) {
                mutableBoolean.setTrue();
            }
        });
        return mutableBoolean.isTrue();
    }
}

