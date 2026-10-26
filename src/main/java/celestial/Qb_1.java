/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.xc_3;
import celestial.xd_3;
import java.util.function.Predicate;

public class Qb_1
implements Predicate<xc_3> {
    private final xd_3 id_class;

    public Qb_1(xd_3 xd_32) {
        this.id_class = xd_32;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((xc_3)object);
    }

    public static Qb_1 id_class(xd_3 xd_32) {
        return new Qb_1(xd_32);
    }

    public boolean id_class(xc_3 xc_32) {
        return xc_32 != null && xc_32.id_class(this.id_class);
    }
}

