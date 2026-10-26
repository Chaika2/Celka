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

import celestial.rrPJ;
import celestial.rrPL;
import celestial.xc_3;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Random;

public class rrPZ
extends rrPL {
    public static final Codec<rrPZ> id_class = RecordCodecBuilder.create(instance -> instance.group((App)xc_3.id_break.fieldOf("block_state").forGetter(rrPZ2 -> rrPZ2.id_break), (App)Codec.FLOAT.fieldOf("probability").forGetter(rrPZ2 -> Float.valueOf(rrPZ2.id_protected))).apply((Applicative)instance, rrPZ::new));
    private final xc_3 id_break;
    private final float id_protected;

    public rrPZ(xc_3 xc_32, float f) {
        this.id_break = xc_32;
        this.id_protected = f;
    }

    @Override
    public boolean id_class(xc_3 xc_32, Random random) {
        return xc_32 == this.id_break && random.nextFloat() < this.id_protected;
    }

    @Override
    protected rrPJ<?> id_class() {
        return rrPJ.id_case;
    }
}

