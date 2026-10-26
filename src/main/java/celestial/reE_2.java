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
import celestial.rUv_1;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class reE_2
implements rUv_1 {
    public static final Codec<reE_2> id_class = RecordCodecBuilder.create(instance -> instance.group((App)rDg_1.id_break.fieldOf("feature_true").forGetter(reE_22 -> reE_22.id_break), (App)rDg_1.id_break.fieldOf("feature_false").forGetter(reE_22 -> reE_22.id_byte)).apply((Applicative)instance, reE_2::new));
    public final Supplier<rDg_1<?, ?>> id_break;
    public final Supplier<rDg_1<?, ?>> id_byte;

    public reE_2(Supplier<rDg_1<?, ?>> supplier, Supplier<rDg_1<?, ?>> supplier2) {
        this.id_break = supplier;
        this.id_byte = supplier2;
    }

    @Override
    public Stream<rDg_1<?, ?>> ae_() {
        return Stream.concat(this.id_break.get().id_protected(), this.id_byte.get().id_protected());
    }
}

