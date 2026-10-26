/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package celestial;

import celestial.rDR;
import celestial.rDg_1;
import celestial.rUv_1;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class rUy_1
implements rUv_1 {
    public static final Codec<rUy_1> id_class = RecordCodecBuilder.create(instance -> instance.apply2(rUy_1::new, (App)rDR.id_class.listOf().fieldOf("features").forGetter(rUy_12 -> rUy_12.id_break), (App)rDg_1.id_break.fieldOf("default").forGetter(rUy_12 -> rUy_12.id_byte)));
    public final List<rDR> id_break;
    public final Supplier<rDg_1<?, ?>> id_byte;

    public rUy_1(List<rDR> list, rDg_1<?, ?> rDg_12) {
        this(list, () -> rDg_12);
    }

    private rUy_1(List<rDR> list, Supplier<rDg_1<?, ?>> supplier) {
        this.id_break = list;
        this.id_byte = supplier;
    }

    @Override
    public Stream<rDg_1<?, ?>> ae_() {
        return Stream.concat(this.id_break.stream().flatMap(rDR2 -> rDR2.id_break.get().id_protected()), this.id_byte.get().id_protected());
    }
}

