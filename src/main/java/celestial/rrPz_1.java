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

import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rrPX;
import celestial.rrPc_1;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;

public class rrPz_1
extends rrPc_1 {
    public static final Codec<rrPz_1> id_class = RecordCodecBuilder.create(instance -> instance.group((App)Codec.FLOAT.fieldOf("min_chance").orElse((Object)Float.valueOf(0.0f)).forGetter(rrPz_12 -> Float.valueOf(rrPz_12.id_break)), (App)Codec.FLOAT.fieldOf("max_chance").orElse((Object)Float.valueOf(0.0f)).forGetter(rrPz_12 -> Float.valueOf(rrPz_12.id_protected)), (App)Codec.INT.fieldOf("min_dist").orElse((Object)0).forGetter(rrPz_12 -> rrPz_12.id_throws), (App)Codec.INT.fieldOf("max_dist").orElse((Object)0).forGetter(rrPz_12 -> rrPz_12.id_case)).apply((Applicative)instance, rrPz_1::new));
    private final float id_break;
    private final float id_protected;
    private final int id_throws;
    private final int id_case;

    public rrPz_1(float f, float f2, int n, int n2) {
        if (n >= n2) {
            throw new IllegalArgumentException("Invalid range: [" + n + "," + n2 + "]");
        }
        this.id_break = f;
        this.id_protected = f2;
        this.id_throws = n;
        this.id_case = n2;
    }

    @Override
    public boolean id_class(rfH_2 rfH_22, rfH_2 rfH_23, rfH_2 rfH_24, Random random) {
        int n = rfH_23.id_implements(rfH_24);
        float f = random.nextFloat();
        return (double)f <= rfU_2.id_break((double)this.id_break, (double)this.id_protected, rfU_2.id_byte((double)n, (double)this.id_throws, (double)this.id_case));
    }

    @Override
    protected rrPX<?> id_class() {
        return rrPX.id_break;
    }
}

