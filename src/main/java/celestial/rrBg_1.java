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

import celestial.rKu_1;
import celestial.rrSx_1;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrBg_1
implements rrSx_1 {
    public static final Codec<rrBg_1> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rKu_1.field_236074_c_.fieldOf("step").forGetter(rrBg_12 -> rrBg_12.id_break), (App)Codec.FLOAT.fieldOf("probability").forGetter(rrBg_12 -> Float.valueOf(rrBg_12.id_byte))).apply((Applicative)instance, rrBg_1::new));
    protected final rKu_1 id_break;
    protected final float id_byte;

    public rrBg_1(rKu_1 rKu_12, float f) {
        this.id_break = rKu_12;
        this.id_byte = f;
    }
}

