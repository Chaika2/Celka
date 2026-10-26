/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import celestial.rKY;
import celestial.rKo_1;
import celestial.rRg_1;
import celestial.rfH_2;
import celestial.rfw_3;
import celestial.rpr_3;
import celestial.xc_3;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;

public class rKK
extends rKY {
    public static final Codec<rKK> id_break = RecordCodecBuilder.create(instance -> instance.group((App)Codec.INT.fieldOf("min_size").forGetter(rKK2 -> rKK2.id_byte), (App)Codec.INT.fieldOf("extra_size").forGetter(rKK2 -> rKK2.id_protected)).apply((Applicative)instance, rKK::new));
    private final int id_byte;
    private final int id_protected;

    public rKK(int n, int n2) {
        this.id_byte = n;
        this.id_protected = n2;
    }

    @Override
    protected rKo_1<?> id_class() {
        return rKo_1.id_byte;
    }

    @Override
    public void id_class(rRg_1 rRg_12, rfH_2 rfH_22, xc_3 xc_32, Random random) {
        rfw_3 rfw_32 = rfH_22.id_new();
        int n = this.id_byte + random.nextInt(random.nextInt(this.id_protected + 1) + 1);
        for (int i = 0; i < n; ++i) {
            rRg_12.id_class((rfH_2)rfw_32, xc_32, 2);
            rfw_32.id_class(rpr_3.UP);
        }
    }
}

