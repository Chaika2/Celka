/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.rCF;
import celestial.rCZ;
import celestial.xc_3;
import celestial.xd_3;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.Predicate;

public class Qd_1
implements Predicate<xc_3> {
    public static final Predicate<xc_3> id_class = xc_32 -> true;
    private final rCF<xd_3, xc_3> id_break;
    private final Map<rCZ<?>, Predicate<Object>> id_byte = Maps.newHashMap();

    private Qd_1(rCF<xd_3, xc_3> rCF2) {
        this.id_break = rCF2;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((xc_3)object);
    }

    public <V extends Comparable<V>> Qd_1 id_class(rCZ<V> rCZ2, Predicate<Object> predicate) {
        if (!this.id_break.id_protected().contains(rCZ2)) {
            throw new IllegalArgumentException(this.id_break + " cannot support property " + rCZ2);
        }
        this.id_byte.put(rCZ2, predicate);
        return this;
    }

    public boolean id_class(xc_3 xc_32) {
        if (xc_32 != null && xc_32.id_break().equals(this.id_break.id_byte())) {
            if (this.id_byte.isEmpty()) {
                return true;
            }
            for (Map.Entry<rCZ<?>, Predicate<Object>> entry : this.id_byte.entrySet()) {
                if (this.id_class(xc_32, entry.getKey(), entry.getValue())) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public static Qd_1 id_class(xd_3 xd_32) {
        return new Qd_1(xd_32.id_new());
    }

    protected <T extends Comparable<T>> boolean id_class(xc_3 xc_32, rCZ<T> rCZ2, Predicate<Object> predicate) {
        T t = xc_32.id_byte(rCZ2);
        return predicate.test(t);
    }
}

