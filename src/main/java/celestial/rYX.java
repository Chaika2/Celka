/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import celestial.rYJ;
import celestial.rYx_1;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rYX {
    public static final MapCodec<rYX> id_class = RecordCodecBuilder.mapCodec(instance -> instance.group((App)rYJ.CODEC.fieldOf("precipitation").forGetter(rYX2 -> rYX2.id_break), (App)Codec.FLOAT.fieldOf("temperature").forGetter(rYX2 -> Float.valueOf(rYX2.id_byte)), (App)rYx_1.CODEC.optionalFieldOf("temperature_modifier", (Object)rYx_1.NONE).forGetter(rYX2 -> rYX2.id_protected), (App)Codec.FLOAT.fieldOf("downfall").forGetter(rYX2 -> Float.valueOf(rYX2.id_throws))).apply((Applicative)instance, rYX::new));
    public final rYJ id_break;
    public final float id_byte;
    public final rYx_1 id_protected;
    public final float id_throws;

    public rYX(rYJ rYJ2, float f, rYx_1 rYx_12, float f2) {
        this.id_break = rYJ2;
        this.id_byte = f;
        this.id_protected = rYx_12;
        this.id_throws = f2;
    }
}

