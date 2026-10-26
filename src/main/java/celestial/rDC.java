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

public class rDC
implements rUv_1 {
    public static final Codec<rDC> id_class = RecordCodecBuilder.create(instance -> instance.group((App)xc_3.id_break.fieldOf("target").forGetter(rDC2 -> rDC2.id_break), (App)xc_3.id_break.fieldOf("state").forGetter(rDC2 -> rDC2.id_byte), (App)rUX.id_class.fieldOf("radius").forGetter(rDC2 -> rDC2.id_protected)).apply((Applicative)instance, rDC::new));
    public final xc_3 id_break;
    public final xc_3 id_byte;
    private final rUX id_protected;

    public rDC(xc_3 xc_32, xc_3 xc_33, rUX rUX2) {
        this.id_break = xc_32;
        this.id_byte = xc_33;
        this.id_protected = rUX2;
    }

    public rUX id_class() {
        return this.id_protected;
    }
}

