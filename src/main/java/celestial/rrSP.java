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

import celestial.rrBo_1;
import celestial.rrSx_1;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public class rrSP
implements rrSx_1 {
    public static final Codec<rrSP> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rrBo_1.id_class.fieldOf("outer").forGetter(rrSP::id_class), (App)rrBo_1.id_class.fieldOf("inner").forGetter(rrSP::id_break)).apply((Applicative)instance, rrSP::new));
    private final rrBo_1<?> id_break;
    private final rrBo_1<?> id_byte;

    public rrSP(rrBo_1<?> rrBo_12, rrBo_1<?> rrBo_13) {
        this.id_break = rrBo_12;
        this.id_byte = rrBo_13;
    }

    public rrBo_1<?> id_class() {
        return this.id_break;
    }

    public rrBo_1<?> id_break() {
        return this.id_byte;
    }
}

