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
import celestial.rqn_3;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rYj_1 {
    public static final Codec<rYj_1> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rqA_2.id_class.fieldOf("sound").forGetter(rYj_12 -> rYj_12.id_byte), (App)Codec.INT.fieldOf("tick_delay").forGetter(rYj_12 -> rYj_12.id_protected), (App)Codec.INT.fieldOf("block_search_extent").forGetter(rYj_12 -> rYj_12.id_throws), (App)Codec.DOUBLE.fieldOf("offset").forGetter(rYj_12 -> rYj_12.id_case)).apply((Applicative)instance, rYj_1::new));
    public static final rYj_1 id_break = new rYj_1(rqn_3.id_class, 6000, 8, 2.0);
    private rqA_2 id_byte;
    private int id_protected;
    private int id_throws;
    private double id_case;

    public int id_byte() {
        return this.id_throws;
    }

    public rYj_1(rqA_2 rqA_22, int n, int n2, double d) {
        this.id_byte = rqA_22;
        this.id_protected = n;
        this.id_throws = n2;
        this.id_case = d;
    }

    public rqA_2 id_class() {
        return this.id_byte;
    }

    public int id_break() {
        return this.id_protected;
    }

    public double id_protected() {
        return this.id_case;
    }
}

