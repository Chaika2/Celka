/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rYB;
import celestial.rfH_2;
import celestial.rpT_2;
import celestial.rpt_3;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public interface rpq_3 {
    public static final rpq_3 id_class = new rpT_2();

    default public void id_class(BiConsumer<rYB, rfH_2> biConsumer) {
        this.id_class((rYB rYB2, rfH_2 rfH_22) -> {
            biConsumer.accept((rYB)rYB2, (rfH_2)rfH_22);
            return Optional.empty();
        });
    }

    public static rpq_3 id_class(rYB rYB2, rfH_2 rfH_22) {
        return new rpt_3(rYB2, rfH_22);
    }

    default public <T> T id_class(BiFunction<rYB, rfH_2, T> biFunction, T t) {
        return this.id_class(biFunction).orElse(t);
    }

    public <T> Optional<T> id_class(BiFunction<rYB, rfH_2, T> var1);
}

