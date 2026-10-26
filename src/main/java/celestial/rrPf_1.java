/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Products$P3
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Mu
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
import com.mojang.datafixers.Products;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.Set;

public class rrPf_1
extends rrPR {
    public static final Codec<rrPf_1> id_class = RecordCodecBuilder.create(instance -> rrPf_1.id_class(instance).apply((Applicative)instance, rrPf_1::new));
    protected final int id_break;

    public rrPf_1(rUX rUX2, rUX rUX3, int n) {
        super(rUX2, rUX3);
        this.id_break = n;
    }

    protected static <P extends rrPf_1> Products.P3<RecordCodecBuilder.Mu<P>, rUX, rUX, Integer> id_class(RecordCodecBuilder.Instance<P> instance) {
        return rrPf_1.id_break(instance).and((App)Codec.intRange((int)0, (int)16).fieldOf("height").forGetter(rrPf_12 -> rrPf_12.id_break));
    }

    @Override
    protected boolean id_class(Random random, int n, int n2, int n3, int n4, boolean bl) {
        return n == n4 && n3 == n4 && (random.nextInt(2) == 0 || n2 == 0);
    }

    @Override
    public int id_class(Random random, int n, rDv_1 rDv_12) {
        return this.id_break;
    }

    @Override
    protected void id_class(rKH rKH2, Random random, rDv_1 rDv_12, int n, rrPY rrPY2, int n2, int n3, Set<rfH_2> set, int n4, rfi_3 rfi_32) {
        for (int i = n4; i >= n4 - n2; --i) {
            int n5 = Math.max(n3 + rrPY2.id_break() - 1 - i / 2, 0);
            this.id_class(rKH2, random, rDv_12, rrPY2.id_class(), n5, set, i, rrPY2.id_byte(), rfi_32);
        }
    }

    @Override
    protected rrPo_1<?> id_class() {
        return rrPo_1.id_class;
    }
}

