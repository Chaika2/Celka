/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.rQz_1;
import celestial.rdn_3;
import celestial.rqO_2;
import celestial.rrEm_1;
import celestial.rzL_2;
import celestial.rzd_3;
import celestial.rzs_3;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;

public class rzr_3 {
    private final Random id_class;
    private final float id_break;
    private final rrEm_1 id_byte;
    private final Function<rqO_2, rzL_2> id_protected;
    private final Set<rzL_2> id_throws = Sets.newLinkedHashSet();
    private final Function<rqO_2, rQz_1> id_case;
    private final Set<rQz_1> id_catch = Sets.newLinkedHashSet();
    private final Map<rzd_3<?>, Object> id_private;
    private final Map<rqO_2, rzs_3> id_implements;

    public rrEm_1 id_byte() {
        return this.id_byte;
    }

    public rzr_3(Random random, float f, rrEm_1 rrEm_12, Function<rqO_2, rzL_2> function, Function<rqO_2, rQz_1> function2, Map<rzd_3<?>, Object> map, Map<rqO_2, rzs_3> map2) {
        this.id_class = random;
        this.id_break = f;
        this.id_byte = rrEm_12;
        this.id_protected = function;
        this.id_case = function2;
        this.id_private = ImmutableMap.copyOf(map);
        this.id_implements = ImmutableMap.copyOf(map2);
    }

    public boolean id_class(rzd_3<?> rzd_32) {
        return this.id_private.containsKey(rzd_32);
    }

    public boolean id_class(rQz_1 rQz_12) {
        return this.id_catch.add(rQz_12);
    }

    public rzL_2 id_class(rqO_2 rqO_22) {
        return this.id_protected.apply(rqO_22);
    }

    public Random id_class() {
        return this.id_class;
    }

    public void id_class(rqO_2 rqO_22, Consumer<rdn_3> consumer) {
        rzs_3 rzs_32 = this.id_implements.get(rqO_22);
        if (rzs_32 != null) {
            rzs_32.add(this, consumer);
        }
    }

    public boolean id_class(rzL_2 rzL_22) {
        return this.id_throws.add(rzL_22);
    }

    public void id_break(rQz_1 rQz_12) {
        this.id_catch.remove(rQz_12);
    }

    public float id_break() {
        return this.id_break;
    }

    public rQz_1 id_break(rqO_2 rqO_22) {
        return this.id_case.apply(rqO_22);
    }

    public <T> T id_break(rzd_3<T> rzd_32) {
        return (T)this.id_private.get(rzd_32);
    }

    public void id_break(rzL_2 rzL_22) {
        this.id_throws.remove(rzL_22);
    }
}

