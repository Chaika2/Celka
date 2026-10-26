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

import celestial.rDX;
import celestial.rUv_1;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rUV
implements rDX,
rUv_1 {
    public static final Codec<rUV> id_class = RecordCodecBuilder.create(instance -> instance.group((App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("probability").forGetter(rUV2 -> Float.valueOf(rUV2.id_break))).apply((Applicative)instance, rUV::new));
    public final float id_break;

    public rUV(float f) {
        this.id_break = f;
    }
}

