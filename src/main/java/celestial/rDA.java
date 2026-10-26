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

import celestial.rKi_1;
import celestial.rUv_1;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rDA
implements rUv_1 {
    public static final Codec<rDA> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rKi_1.id_break.fieldOf("cap_provider").forGetter(rDA2 -> rDA2.id_break), (App)rKi_1.id_break.fieldOf("stem_provider").forGetter(rDA2 -> rDA2.id_byte), (App)Codec.INT.fieldOf("foliage_radius").orElse((Object)2).forGetter(rDA2 -> rDA2.id_protected)).apply((Applicative)instance, rDA::new));
    public final rKi_1 id_break;
    public final rKi_1 id_byte;
    public final int id_protected;

    public rDA(rKi_1 rKi_12, rKi_1 rKi_13, int n) {
        this.id_break = rKi_12;
        this.id_byte = rKi_13;
        this.id_protected = n;
    }
}

