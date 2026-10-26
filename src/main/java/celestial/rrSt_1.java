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

public class rrSt_1 {
    private static final Codec<Double> id_break = Codec.doubleRange((double)0.001, (double)1000.0);
    public static final Codec<rrSt_1> id_class = RecordCodecBuilder.create(instance -> instance.group((App)id_break.fieldOf("xz_scale").forGetter(rrSt_1::id_class), (App)id_break.fieldOf("y_scale").forGetter(rrSt_1::id_break), (App)id_break.fieldOf("xz_factor").forGetter(rrSt_1::id_byte), (App)id_break.fieldOf("y_factor").forGetter(rrSt_1::id_protected)).apply((Applicative)instance, rrSt_1::new));
    private final double id_byte;
    private final double id_protected;
    private final double id_throws;
    private final double id_case;

    public double id_byte() {
        return this.id_throws;
    }

    public rrSt_1(double d, double d2, double d3, double d4) {
        this.id_byte = d;
        this.id_protected = d2;
        this.id_throws = d3;
        this.id_case = d4;
    }

    public double id_class() {
        return this.id_byte;
    }

    public double id_break() {
        return this.id_protected;
    }

    public double id_protected() {
        return this.id_case;
    }
}

