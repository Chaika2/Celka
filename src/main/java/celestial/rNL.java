/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rWo_1;
import celestial.rdn_3;
import celestial.rzr_3;
import celestial.rzx_3;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public interface rNL
extends BiFunction<rdn_3, rzr_3, rdn_3>,
rWo_1 {
    public static Consumer<rdn_3> id_class(BiFunction<rdn_3, rzr_3, rdn_3> biFunction, Consumer<rdn_3> consumer, rzr_3 rzr_32) {
        return rdn_32 -> consumer.accept((rdn_3)biFunction.apply((rdn_3)rdn_32, rzr_32));
    }

    public rzx_3 id_break();
}

