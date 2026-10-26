/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.rdn_3;
import java.util.function.Predicate;

public class rpx_3
implements Predicate<an_3> {
    private final rdn_3 id_class;

    public rpx_3(rdn_3 rdn_32) {
        this.id_class = rdn_32;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((an_3)object);
    }

    public boolean id_class(an_3 an_32) {
        if (!an_32.BM()) {
            return false;
        }
        if (!(an_32 instanceof iB_2)) {
            return false;
        }
        iB_2 iB_22 = (iB_2)an_32;
        return iB_22.id_throws(this.id_class);
    }
}

