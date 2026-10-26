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

import celestial.rDg_1;
import celestial.rKd_1;
import celestial.rRI;
import celestial.rfH_2;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;
import java.util.function.Supplier;

public class rDR {
    public static final Codec<rDR> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rDg_1.id_break.fieldOf("feature").forGetter(rDR2 -> rDR2.id_break), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("chance").forGetter(rDR2 -> Float.valueOf(rDR2.id_byte))).apply((Applicative)instance, rDR::new));
    public final Supplier<rDg_1<?, ?>> id_break;
    public final float id_byte;

    public rDR(rDg_1<?, ?> rDg_12, float f) {
        this(() -> rDg_12, f);
    }

    private rDR(Supplier<rDg_1<?, ?>> supplier, float f) {
        this.id_break = supplier;
        this.id_byte = f;
    }

    public boolean id_class(rRI rRI2, rKd_1 rKd_12, Random random, rfH_2 rfH_22) {
        return this.id_break.get().id_class(rRI2, rKd_12, random, rfH_22);
    }
}

