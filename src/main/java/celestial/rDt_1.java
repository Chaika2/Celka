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
import java.util.List;

public class rDt_1
implements rUv_1 {
    public static final Codec<rDt_1> id_class = RecordCodecBuilder.create(instance -> instance.group((App)xc_3.id_break.fieldOf("to_place").forGetter(rDt_12 -> rDt_12.id_break), (App)xc_3.id_break.listOf().fieldOf("place_on").forGetter(rDt_12 -> rDt_12.id_byte), (App)xc_3.id_break.listOf().fieldOf("place_in").forGetter(rDt_12 -> rDt_12.id_protected), (App)xc_3.id_break.listOf().fieldOf("place_under").forGetter(rDt_12 -> rDt_12.id_throws)).apply((Applicative)instance, rDt_1::new));
    public final xc_3 id_break;
    public final List<xc_3> id_byte;
    public final List<xc_3> id_protected;
    public final List<xc_3> id_throws;

    public rDt_1(xc_3 xc_32, List<xc_3> list, List<xc_3> list2, List<xc_3> list3) {
        this.id_break = xc_32;
        this.id_byte = list;
        this.id_protected = list2;
        this.id_throws = list3;
    }
}

