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

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rYI {
    public static final Codec<rYI> id_class = RecordCodecBuilder.create(instance -> instance.group((App)Codec.DOUBLE.fieldOf("energy_budget").forGetter(rYI2 -> rYI2.id_break), (App)Codec.DOUBLE.fieldOf("charge").forGetter(rYI2 -> rYI2.id_byte)).apply((Applicative)instance, rYI::new));
    private final double id_break;
    private final double id_byte;

    public rYI(double d, double d2) {
        this.id_break = d;
        this.id_byte = d2;
    }

    public double id_class() {
        return this.id_break;
    }

    public double id_break() {
        return this.id_byte;
    }
}

