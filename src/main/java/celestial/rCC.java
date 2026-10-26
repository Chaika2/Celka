/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rCZ;
import java.util.Map;
import java.util.function.Function;

public class rCC
implements Function<Map.Entry<rCZ<?>, Comparable<?>>, String> {
    @Override
    public /* synthetic */ Object apply(Object object) {
        return this.id_class((Map.Entry)object);
    }

    public String id_class(Map.Entry<rCZ<?>, Comparable<?>> entry) {
        if (entry == null) {
            return "<NULL>";
        }
        rCZ<?> rCZ2 = entry.getKey();
        return rCZ2.id_throws() + "=" + this.id_class(rCZ2, entry.getValue());
    }

    private <T extends Comparable<T>> String id_class(rCZ<T> rCZ2, Comparable<?> comparable) {
        return rCZ2.id_class(comparable);
    }
}

