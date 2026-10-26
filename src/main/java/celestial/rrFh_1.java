/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrFX;
import java.util.Comparator;

public class rrFh_1
implements Comparator<rrFX> {
    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.id_class((rrFX)object, (rrFX)object2);
    }

    public int id_class(rrFX rrFX2, rrFX rrFX3) {
        int n = Integer.compare(rrFX2.id_class().V(), rrFX3.id_class().V());
        if (n == 0) {
            return Integer.compare(-rrFX2.id_case(), -rrFX3.id_case());
        }
        return n;
    }
}

