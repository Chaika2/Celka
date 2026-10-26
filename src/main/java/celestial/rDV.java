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
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rDV
implements rUv_1 {
    public static final Codec<rDV> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rUX.id_class(0, 2, 1).fieldOf("reach").forGetter(rDV2 -> rDV2.id_break), (App)rUX.id_class(1, 5, 5).fieldOf("height").forGetter(rDV2 -> rDV2.id_byte)).apply((Applicative)instance, rDV::new));
    private final rUX id_break;
    private final rUX id_byte;

    public rDV(rUX rUX2, rUX rUX3) {
        this.id_break = rUX2;
        this.id_byte = rUX3;
    }

    public rUX id_class() {
        return this.id_break;
    }

    public rUX id_break() {
        return this.id_byte;
    }
}

