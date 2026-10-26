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

public class rrSH
implements rrSx_1 {
    public static final Codec<rrSH> id_class = RecordCodecBuilder.create(instance -> instance.group((App)Codec.INT.fieldOf("noise_to_count_ratio").forGetter(rrSH2 -> rrSH2.id_break), (App)Codec.DOUBLE.fieldOf("noise_factor").forGetter(rrSH2 -> rrSH2.id_byte), (App)Codec.DOUBLE.fieldOf("noise_offset").orElse((Object)0.0).forGetter(rrSH2 -> rrSH2.id_protected)).apply((Applicative)instance, rrSH::new));
    public final int id_break;
    public final double id_byte;
    public final double id_protected;

    public rrSH(int n, double d, double d2) {
        this.id_break = n;
        this.id_byte = d;
        this.id_protected = d2;
    }
}

