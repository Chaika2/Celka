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

public class rrSN
implements rrSx_1 {
    public static final Codec<rrSN> id_class = RecordCodecBuilder.create(instance -> instance.group((App)Codec.DOUBLE.fieldOf("noise_level").forGetter(rrSN2 -> rrSN2.id_break), (App)Codec.INT.fieldOf("below_noise").forGetter(rrSN2 -> rrSN2.id_byte), (App)Codec.INT.fieldOf("above_noise").forGetter(rrSN2 -> rrSN2.id_protected)).apply((Applicative)instance, rrSN::new));
    public final double id_break;
    public final int id_byte;
    public final int id_protected;

    public rrSN(double d, int n, int n2) {
        this.id_break = d;
        this.id_byte = n;
        this.id_protected = n2;
    }
}

