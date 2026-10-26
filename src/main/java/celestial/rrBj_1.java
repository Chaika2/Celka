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

import celestial.rrSx_1;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrBj_1
implements rrSx_1 {
    public static final Codec<rrBj_1> id_class = RecordCodecBuilder.create(instance -> instance.group((App)Codec.INT.fieldOf("count").forGetter(rrBj_12 -> rrBj_12.id_break), (App)Codec.FLOAT.fieldOf("extra_chance").forGetter(rrBj_12 -> Float.valueOf(rrBj_12.id_byte)), (App)Codec.INT.fieldOf("extra_count").forGetter(rrBj_12 -> rrBj_12.id_protected)).apply((Applicative)instance, rrBj_1::new));
    public final int id_break;
    public final float id_byte;
    public final int id_protected;

    public rrBj_1(int n, float f, int n2) {
        this.id_break = n;
        this.id_byte = f;
        this.id_protected = n2;
    }
}

