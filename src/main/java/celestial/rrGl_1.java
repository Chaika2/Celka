/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.fj_3;
import celestial.rAL;
import celestial.rqO_2;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.function.Function;

public interface rrGl_1 {
    default public boolean id_class(rAL rAL2, rqO_2 rqO_22) {
        return false;
    }

    default public boolean id_class(rAL rAL2, rqO_2 rqO_22, Function<rqO_2, fj_3> function) {
        return true;
    }

    default public Collection<rqO_2> id_instanceof() {
        return ImmutableList.of();
    }
}

