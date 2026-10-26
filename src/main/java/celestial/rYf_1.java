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

import celestial.aH_2;
import celestial.aI_2;
import celestial.rTG;
import celestial.rVL;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rYf_1
extends rTG {
    public static final Codec<rYf_1> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rVL.id_transient.fieldOf("type").forGetter(rYf_12 -> rYf_12.id_break), (App)Codec.INT.fieldOf("weight").forGetter(rYf_12 -> rYf_12.id_byte), (App)Codec.INT.fieldOf("minCount").forGetter(rYf_12 -> rYf_12.id_protected), (App)Codec.INT.fieldOf("maxCount").forGetter(rYf_12 -> rYf_12.id_throws)).apply((Applicative)instance, rYf_1::new));
    public final aI_2<?> id_break;
    public final int id_protected;
    public final int id_throws;

    public rYf_1(aI_2<?> aI_22, int n, int n2, int n3) {
        super(n);
        this.id_break = aI_22.id_throws() == aH_2.MISC ? aI_2.x : aI_22;
        this.id_protected = n2;
        this.id_throws = n3;
    }

    public String toString() {
        return aI_2.id_class(this.id_break) + "*(" + this.id_protected + "-" + this.id_throws + "):" + this.id_byte;
    }
}

