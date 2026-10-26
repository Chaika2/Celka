/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rWR;
import celestial.rzr_3;
import java.util.Objects;
import java.util.function.Consumer;

@FunctionalInterface
public interface rWV {
    public static final rWV id_class = (rzr_32, consumer) -> false;
    public static final rWV id_break = (rzr_32, consumer) -> true;

    public boolean expand(rzr_3 var1, Consumer<rWR> var2);

    default public rWV id_class(rWV rWV2) {
        Objects.requireNonNull(rWV2);
        return (rzr_32, consumer) -> this.expand(rzr_32, consumer) && rWV2.expand(rzr_32, consumer);
    }

    default public rWV id_break(rWV rWV2) {
        Objects.requireNonNull(rWV2);
        return (rzr_32, consumer) -> this.expand(rzr_32, consumer) || rWV2.expand(rzr_32, consumer);
    }
}

