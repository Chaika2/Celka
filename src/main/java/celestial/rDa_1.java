/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rDH;
import celestial.rRg_1;
import celestial.rUN;
import celestial.rUv_1;
import celestial.rfH_2;
import celestial.xc_3;
import com.mojang.serialization.Codec;
import java.util.Random;

public class rDa_1
extends rUN<rDH> {
    public rDa_1(Codec<rDH> codec) {
        super(codec);
    }

    @Override
    public /* synthetic */ xc_3 id_class(Random random, rfH_2 rfH_22, rUv_1 rUv_12) {
        return this.id_break(random, rfH_22, (rDH)rUv_12);
    }

    @Override
    public boolean id_class(rRg_1 rRg_12, rfH_2 rfH_22, rDH rDH2) {
        return !rDH2.id_throws.contains(rRg_12.id_byte(rfH_22));
    }

    @Override
    public int id_class(rDH rDH2) {
        return rDH2.id_case;
    }

    public rfH_2 id_class(Random random, rfH_2 rfH_22, rDH rDH2) {
        return rfH_22.id_break(random.nextInt(rDH2.id_catch) - random.nextInt(rDH2.id_catch), random.nextInt(rDH2.id_private) - random.nextInt(rDH2.id_private), random.nextInt(rDH2.id_implements) - random.nextInt(rDH2.id_implements));
    }

    public xc_3 id_break(Random random, rfH_2 rfH_22, rDH rDH2) {
        return rDH2.id_break.id_class(random, rfH_22);
    }

    @Override
    public /* synthetic */ rfH_2 id_break(Random random, rfH_2 rfH_22, rUv_1 rUv_12) {
        return this.id_class(random, rfH_22, (rDH)rUv_12);
    }
}

