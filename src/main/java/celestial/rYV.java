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

import celestial.rLQ;
import celestial.rLx_1;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;

public class rYV {
    public static final Codec<rYV> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rLQ.L.fieldOf("options").forGetter(rYV2 -> rYV2.id_break), (App)Codec.FLOAT.fieldOf("probability").forGetter(rYV2 -> Float.valueOf(rYV2.id_byte))).apply((Applicative)instance, rYV::new));
    private final rLx_1 id_break;
    private final float id_byte;

    public rYV(rLx_1 rLx_12, float f) {
        this.id_break = rLx_12;
        this.id_byte = f;
    }

    public rLx_1 id_class() {
        return this.id_break;
    }

    public boolean id_class(Random random) {
        return random.nextFloat() <= this.id_byte;
    }
}

