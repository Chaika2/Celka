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

public class rrSB
implements rrSx_1 {
    public static final Codec<rrSB> id_class = RecordCodecBuilder.create(instance -> instance.group((App)Codec.INT.fieldOf("baseline").forGetter(rrSB2 -> rrSB2.id_break), (App)Codec.INT.fieldOf("spread").forGetter(rrSB2 -> rrSB2.id_byte)).apply((Applicative)instance, rrSB::new));
    public final int id_break;
    public final int id_byte;

    public rrSB(int n, int n2) {
        this.id_break = n;
        this.id_byte = n2;
    }
}

