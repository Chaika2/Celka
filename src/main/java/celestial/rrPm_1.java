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

import celestial.rVL;
import celestial.rrPJ;
import celestial.rrPL;
import celestial.xc_3;
import celestial.xd_3;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;

public class rrPm_1
extends rrPL {
    public static final Codec<rrPm_1> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rVL.id_strictfp.fieldOf("block").forGetter(rrPm_12 -> rrPm_12.id_break), (App)Codec.FLOAT.fieldOf("probability").forGetter(rrPm_12 -> Float.valueOf(rrPm_12.id_protected))).apply((Applicative)instance, rrPm_1::new));
    private final xd_3 id_break;
    private final float id_protected;

    public rrPm_1(xd_3 xd_32, float f) {
        this.id_break = xd_32;
        this.id_protected = f;
    }

    @Override
    public boolean id_class(xc_3 xc_32, Random random) {
        return xc_32.id_class(this.id_break) && random.nextFloat() < this.id_protected;
    }

    @Override
    protected rrPJ<?> id_class() {
        return rrPJ.id_throws;
    }
}

