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

public class rUR
implements rUv_1 {
    public static final Codec<rUR> id_class = RecordCodecBuilder.create(instance -> instance.group((App)xc_3.id_break.fieldOf("target").forGetter(rUR2 -> rUR2.id_break), (App)xc_3.id_break.fieldOf("state").forGetter(rUR2 -> rUR2.id_byte)).apply((Applicative)instance, rUR::new));
    public final xc_3 id_break;
    public final xc_3 id_byte;

    public rUR(xc_3 xc_32, xc_3 xc_33) {
        this.id_break = xc_32;
        this.id_byte = xc_33;
    }
}

