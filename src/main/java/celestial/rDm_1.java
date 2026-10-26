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

public class rDm_1
implements rUv_1 {
    public static final Codec<rDm_1> id_class = RecordCodecBuilder.create(instance -> instance.group((App)xc_3.id_break.fieldOf("contents").forGetter(rDm_12 -> rDm_12.id_break), (App)xc_3.id_break.fieldOf("rim").forGetter(rDm_12 -> rDm_12.id_byte), (App)rUX.id_class(0, 8, 8).fieldOf("size").forGetter(rDm_12 -> rDm_12.id_protected), (App)rUX.id_class(0, 8, 8).fieldOf("rim_size").forGetter(rDm_12 -> rDm_12.id_throws)).apply((Applicative)instance, rDm_1::new));
    private final xc_3 id_break;
    private final xc_3 id_byte;
    private final rUX id_protected;
    private final rUX id_throws;

    public rUX id_byte() {
        return this.id_protected;
    }

    public rDm_1(xc_3 xc_32, xc_3 xc_33, rUX rUX2, rUX rUX3) {
        this.id_break = xc_32;
        this.id_byte = xc_33;
        this.id_protected = rUX2;
        this.id_throws = rUX3;
    }

    public xc_3 id_class() {
        return this.id_break;
    }

    public xc_3 id_break() {
        return this.id_byte;
    }

    public rUX id_protected() {
        return this.id_throws;
    }
}

