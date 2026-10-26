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
import celestial.rpB_2;
import celestial.rpG_2;
import celestial.rpr_3;
import celestial.rrPX;
import celestial.rrPc_1;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;

public class rrPs_1
extends rrPc_1 {
    public static final Codec<rrPs_1> id_class = RecordCodecBuilder.create(instance -> instance.group((App)Codec.FLOAT.fieldOf("min_chance").orElse((Object)Float.valueOf(0.0f)).forGetter(rrPs_12 -> Float.valueOf(rrPs_12.id_break)), (App)Codec.FLOAT.fieldOf("max_chance").orElse((Object)Float.valueOf(0.0f)).forGetter(rrPs_12 -> Float.valueOf(rrPs_12.id_protected)), (App)Codec.INT.fieldOf("min_dist").orElse((Object)0).forGetter(rrPs_12 -> rrPs_12.id_throws), (App)Codec.INT.fieldOf("max_dist").orElse((Object)0).forGetter(rrPs_12 -> rrPs_12.id_case), (App)rpB_2.CODEC.fieldOf("axis").orElse((Object)rpB_2.Y).forGetter(rrPs_12 -> rrPs_12.id_catch)).apply((Applicative)instance, rrPs_1::new));
    private final float id_break;
    private final float id_protected;
    private final int id_throws;
    private final int id_case;
    private final rpB_2 id_catch;

    public rrPs_1(float f, float f2, int n, int n2, rpB_2 rpB_22) {
        if (n >= n2) {
            throw new IllegalArgumentException("Invalid range: [" + n + "," + n2 + "]");
        }
        this.id_break = f;
        this.id_protected = f2;
        this.id_throws = n;
        this.id_case = n2;
        this.id_catch = rpB_22;
    }

    @Override
    public boolean id_class(rfH_2 rfH_22, rfH_2 rfH_23, rfH_2 rfH_24, Random random) {
        rpr_3 rpr_32 = rpr_3.id_class(rpG_2.POSITIVE, this.id_catch);
        float f = Math.abs((rfH_23.b_() - rfH_24.b_()) * rpr_32.id_implements());
        float f2 = Math.abs((rfH_23.c_() - rfH_24.c_()) * rpr_32.id_finally());
        float f3 = Math.abs((rfH_23.d_() - rfH_24.d_()) * rpr_32.id_extends());
        int n = (int)(f + f2 + f3);
        float f4 = random.nextFloat();
        return (double)f4 <= rfU_2.id_break((double)this.id_break, (double)this.id_protected, rfU_2.id_byte((double)n, (double)this.id_throws, (double)this.id_case));
    }

    @Override
    protected rrPX<?> id_class() {
        return rrPX.id_byte;
    }
}

