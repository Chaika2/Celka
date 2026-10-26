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

import celestial.rUX;
import celestial.rUv_1;
import celestial.xc_3;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;

public class rUa_1
implements rUv_1 {
    public static final Codec<rUa_1> id_class = RecordCodecBuilder.create(instance -> instance.group((App)xc_3.id_break.fieldOf("state").forGetter(rUa_12 -> rUa_12.id_break), (App)rUX.id_class(0, 4, 4).fieldOf("radius").forGetter(rUa_12 -> rUa_12.id_byte), (App)Codec.intRange((int)0, (int)4).fieldOf("half_height").forGetter(rUa_12 -> rUa_12.id_protected), (App)xc_3.id_break.listOf().fieldOf("targets").forGetter(rUa_12 -> rUa_12.id_throws)).apply((Applicative)instance, rUa_1::new));
    public final xc_3 id_break;
    public final rUX id_byte;
    public final int id_protected;
    public final List<xc_3> id_throws;

    public rUa_1(xc_3 xc_32, rUX rUX2, int n, List<xc_3> list) {
        this.id_break = xc_32;
        this.id_byte = rUX2;
        this.id_protected = n;
        this.id_throws = list;
    }
}

