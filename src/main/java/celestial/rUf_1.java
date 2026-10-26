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
import celestial.rrPL;
import celestial.xc_3;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rUf_1
implements rUv_1 {
    public static final Codec<rUf_1> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rrPL.id_byte.fieldOf("target").forGetter(rUf_12 -> rUf_12.id_break), (App)xc_3.id_break.fieldOf("state").forGetter(rUf_12 -> rUf_12.id_protected), (App)Codec.intRange((int)0, (int)64).fieldOf("size").forGetter(rUf_12 -> rUf_12.id_byte)).apply((Applicative)instance, rUf_1::new));
    public final rrPL id_break;
    public final int id_byte;
    public final xc_3 id_protected;

    public rUf_1(rrPL rrPL2, xc_3 xc_32, int n) {
        this.id_byte = n;
        this.id_protected = xc_32;
        this.id_break = rrPL2;
    }
}

