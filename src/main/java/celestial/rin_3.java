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

import celestial.rUv_1;
import celestial.rip_3;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rin_3
implements rUv_1 {
    public static final Codec<rin_3> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rip_3.field_236998_c_.fieldOf("biome_temp").forGetter(rin_32 -> rin_32.id_break), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("large_probability").forGetter(rin_32 -> Float.valueOf(rin_32.id_byte)), (App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("cluster_probability").forGetter(rin_32 -> Float.valueOf(rin_32.id_protected))).apply((Applicative)instance, rin_3::new));
    public final rip_3 id_break;
    public final float id_byte;
    public final float id_protected;

    public rin_3(rip_3 rip_32, float f, float f2) {
        this.id_break = rip_32;
        this.id_byte = f;
        this.id_protected = f2;
    }
}

