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

import celestial.rDv_1;
import celestial.rKH;
import celestial.rUX;
import celestial.rfH_2;
import celestial.rfi_3;
import celestial.rrPR;
import celestial.rrPY;
import celestial.rrPo_1;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.Set;

public class rrPe_1
extends rrPR {
    public static final Codec<rrPe_1> id_class = RecordCodecBuilder.create(instance -> rrPe_1.id_break(instance).and((App)rUX.id_class(0, 16, 8).fieldOf("trunk_height").forGetter(rrPe_12 -> rrPe_12.id_break)).apply((Applicative)instance, rrPe_1::new));
    private final rUX id_break;

    public rrPe_1(rUX rUX2, rUX rUX3, rUX rUX4) {
        super(rUX2, rUX3);
        this.id_break = rUX4;
    }

    @Override
    protected boolean id_class(Random random, int n, int n2, int n3, int n4, boolean bl) {
        return n == n4 && n3 == n4 && n4 > 0;
    }

    @Override
    protected rrPo_1<?> id_class() {
        return rrPo_1.id_break;
    }

    @Override
    public int id_class(Random random, int n, rDv_1 rDv_12) {
        return Math.max(4, n - this.id_break.id_class(random));
    }

    @Override
    protected void id_class(rKH rKH2, Random random, rDv_1 rDv_12, int n, rrPY rrPY2, int n2, int n3, Set<rfH_2> set, int n4, rfi_3 rfi_32) {
        rfH_2 rfH_22 = rrPY2.id_class();
        int n5 = random.nextInt(2);
        int n6 = 1;
        int n7 = 0;
        for (int i = n4; i >= -n2; --i) {
            this.id_class(rKH2, random, rDv_12, rfH_22, n5, set, i, rrPY2.id_byte(), rfi_32);
            if (n5 >= n6) {
                n5 = n7;
                n7 = 1;
                n6 = Math.min(n6 + 1, n3 + rrPY2.id_break());
                continue;
            }
            ++n5;
        }
    }
}

