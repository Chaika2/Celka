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
import celestial.raU_2;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class raI_2
implements rUv_1 {
    public static final Codec<raI_2> id_class = RecordCodecBuilder.create(instance -> instance.group((App)Codec.floatRange((float)0.0f, (float)1.0f).fieldOf("probability").forGetter(raI_22 -> Float.valueOf(raI_22.id_break)), (App)raU_2.field_236324_c_.fieldOf("type").forGetter(raI_22 -> raI_22.id_byte)).apply((Applicative)instance, raI_2::new));
    public final float id_break;
    public final raU_2 id_byte;

    public raI_2(float f, raU_2 raU_22) {
        this.id_break = f;
        this.id_byte = raU_22;
    }
}

