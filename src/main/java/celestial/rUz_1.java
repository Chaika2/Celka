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
import celestial.xc_3;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rUz_1
implements rUv_1 {
    public static final Codec<rUz_1> id_class = RecordCodecBuilder.create(instance -> instance.group((App)Codec.intRange((int)0, (int)255).fieldOf("height").forGetter(rUz_12 -> rUz_12.id_break), (App)xc_3.id_break.fieldOf("state").forGetter(rUz_12 -> rUz_12.id_byte)).apply((Applicative)instance, rUz_1::new));
    public final int id_break;
    public final xc_3 id_byte;

    public rUz_1(int n, xc_3 xc_32) {
        this.id_break = n;
        this.id_byte = xc_32;
    }
}

