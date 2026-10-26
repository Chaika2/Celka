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

public class rrPU
extends rrPR {
    public static final Codec<rrPU> id_class = RecordCodecBuilder.create(instance -> rrPU.id_break(instance).and((App)rUX.id_class(0, 16, 8).fieldOf("height").forGetter(rrPU2 -> rrPU2.id_break)).apply((Applicative)instance, rrPU::new));
    private final rUX id_break;

    public rrPU(rUX rUX2, rUX rUX3, rUX rUX4) {
        super(rUX2, rUX3);
        this.id_break = rUX4;
    }

    @Override
    protected boolean id_class(Random random, int n, int n2, int n3, int n4, boolean bl) {
        return n == n4 && n3 == n4 && n4 > 0;
    }

    @Override
    public int id_class(Random random, int n, rDv_1 rDv_12) {
        return this.id_break.id_class(random);
    }

    @Override
    protected rrPo_1<?> id_class() {
        return rrPo_1.id_byte;
    }

    @Override
    public int id_class(Random random, int n) {
        return super.id_class(random, n) + random.nextInt(n + 1);
    }

    @Override
    protected void id_class(rKH rKH2, Random random, rDv_1 rDv_12, int n, rrPY rrPY2, int n2, int n3, Set<rfH_2> set, int n4, rfi_3 rfi_32) {
        int n5 = 0;
        for (int i = n4; i >= n4 - n2; --i) {
            this.id_class(rKH2, random, rDv_12, rrPY2.id_class(), n5, set, i, rrPY2.id_byte(), rfi_32);
            if (n5 >= 1 && i == n4 - n2 + 1) {
                --n5;
                continue;
            }
            if (n5 >= n3 + rrPY2.id_break()) continue;
            ++n5;
        }
    }
}

