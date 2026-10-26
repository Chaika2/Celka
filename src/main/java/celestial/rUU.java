/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rDg_1;
import celestial.rUv_1;
import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class rUU
implements rUv_1 {
    public static final Codec<rUU> id_class = rDg_1.id_byte.fieldOf("features").xmap(rUU::new, rUU2 -> rUU2.id_break).codec();
    public final List<Supplier<rDg_1<?, ?>>> id_break;

    public rUU(List<Supplier<rDg_1<?, ?>>> list) {
        this.id_break = list;
    }

    @Override
    public Stream<rDg_1<?, ?>> ae_() {
        return this.id_break.stream().flatMap(supplier -> ((rDg_1)supplier.get()).id_protected());
    }
}

