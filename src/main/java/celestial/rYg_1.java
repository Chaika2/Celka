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

import celestial.rqA_2;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rYg_1 {
    public static final Codec<rYg_1> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rqA_2.id_class.fieldOf("sound").forGetter(rYg_12 -> rYg_12.id_break), (App)Codec.DOUBLE.fieldOf("tick_chance").forGetter(rYg_12 -> rYg_12.id_byte)).apply((Applicative)instance, rYg_1::new));
    private rqA_2 id_break;
    private double id_byte;

    public rYg_1(rqA_2 rqA_22, double d) {
        this.id_break = rqA_22;
        this.id_byte = d;
    }

    public rqA_2 id_class() {
        return this.id_break;
    }

    public double id_break() {
        return this.id_byte;
    }
}

