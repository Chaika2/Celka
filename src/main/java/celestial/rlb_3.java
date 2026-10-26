/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 */
package celestial;

import celestial.rlW_2;
import celestial.rlm_3;
import celestial.rqO_2;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.Supplier;

public interface rlb_3<T> {
    public static <T> rlb_3<T> id_class(Set<T> set) {
        return rlm_3.id_break(set);
    }

    public static <T> Codec<rlb_3<T>> id_class(Supplier<rlW_2<T>> supplier) {
        return rqO_2.id_class.flatXmap(rqO_22 -> Optional.ofNullable(((rlW_2)supplier.get()).id_class((rqO_2)rqO_22)).map(DataResult::success).orElseGet(() -> DataResult.error((String)("Unknown tag: " + rqO_22))), rlb_32 -> Optional.ofNullable(((rlW_2)supplier.get()).id_class(rlb_32)).map(DataResult::success).orElseGet(() -> DataResult.error((String)("Unknown tag: " + rlb_32))));
    }

    public boolean id_class(T var1);

    public List<T> id_class();

    default public T id_class(Random random) {
        List<T> list = this.id_class();
        return list.get(random.nextInt(list.size()));
    }
}

