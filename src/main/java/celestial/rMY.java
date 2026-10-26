/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.is_3;
import celestial.rMR;
import java.util.function.Predicate;

public class rMY
implements Predicate<is_3> {
    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((is_3)object);
    }

    public boolean id_class(is_3 is_32) {
        return is_32 != null && rMR.id_throw.containsKey(is_32.BC());
    }
}

