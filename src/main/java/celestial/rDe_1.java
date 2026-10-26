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

import celestial.rDg_1;
import celestial.rUO;
import celestial.rUv_1;
import celestial.rVL;
import celestial.rrBo_1;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class rDe_1
implements rUv_1 {
    public static final Codec<rDe_1> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rDg_1.id_break.fieldOf("feature").forGetter(rDe_12 -> rDe_12.id_break), (App)rrBo_1.id_class.fieldOf("decorator").forGetter(rDe_12 -> rDe_12.id_byte)).apply((Applicative)instance, rDe_1::new));
    public final Supplier<rDg_1<?, ?>> id_break;
    public final rrBo_1<?> id_byte;

    public rDe_1(Supplier<rDg_1<?, ?>> supplier, rrBo_1<?> rrBo_12) {
        this.id_break = supplier;
        this.id_byte = rrBo_12;
    }

    public String toString() {
        return String.format("< %s [%s | %s] >", this.getClass().getSimpleName(), rVL.q.id_break((rUO<?>)this.id_break.get().id_break()), this.id_byte);
    }

    @Override
    public Stream<rDg_1<?, ?>> ae_() {
        return this.id_break.get().id_protected();
    }
}

