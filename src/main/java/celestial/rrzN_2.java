/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.yM_2;
import java.util.Comparator;

public class rrzN_2
implements Comparator<yM_2> {
    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.id_class((yM_2)object, (yM_2)object2);
    }

    public int id_class(yM_2 yM_22, yM_2 yM_23) {
        int n;
        if (yM_22.id_class() != yM_23.id_class()) {
            return yM_22.id_class() - yM_23.id_class();
        }
        if (yM_22.id_break() != yM_23.id_break()) {
            return yM_22.id_break() - yM_23.id_break();
        }
        if (yM_22.id_case() != yM_23.id_case()) {
            return yM_22.id_case() - yM_23.id_case();
        }
        int n2 = yM_22.id_byte() + yM_22.id_protected() + yM_22.id_throws();
        return n2 != (n = yM_23.id_byte() + yM_23.id_protected() + yM_23.id_throws()) ? n2 - n : 0;
    }
}

