/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ig_1;
import celestial.fJ_2;
import celestial.fj_3;
import celestial.rqO_2;
import java.util.Collection;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class fp_3
implements AutoCloseable {
    private final Map<rqO_2, fJ_2> id_class;

    public fp_3(Collection<fJ_2> collection) {
        this.id_class = collection.stream().collect(Collectors.toMap(fJ_2::id_protected, Function.identity()));
    }

    public fj_3 id_class(Ig_1 ig_1) {
        return this.id_class.get(ig_1.id_class()).id_break(ig_1.id_break());
    }

    public fJ_2 id_class(rqO_2 rqO_22) {
        return this.id_class.get(rqO_22);
    }

    @Override
    public void close() {
        this.id_class.values().forEach(fJ_2::id_byte);
        this.id_class.clear();
    }
}

