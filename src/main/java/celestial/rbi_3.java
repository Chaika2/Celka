/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rEi_1;
import celestial.rMi_1;
import celestial.rOQ;
import celestial.rbR_2;
import celestial.rba_3;
import celestial.rhd_3;
import java.util.function.Predicate;

public class rbi_3
implements Predicate<iB_2> {
    public final /* synthetic */ rba_3 id_class;

    public rbi_3(rba_3 rba_32) {
        this.id_class = rba_32;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((iB_2)object);
    }

    public boolean id_class(iB_2 iB_22) {
        if (iB_22 instanceof rba_3) {
            return false;
        }
        if (!(iB_22 instanceof rbR_2 || iB_22 instanceof rMi_1 || iB_22 instanceof rEi_1)) {
            if (iB_22 instanceof rOQ) {
                return !((rOQ)iB_22).sZ();
            }
            if (!(iB_22 instanceof rhd_3) || !iB_22.id_native() && !((rhd_3)iB_22).id_implements()) {
                if (this.id_class.id_byte(iB_22.ro())) {
                    return false;
                }
                return !iB_22.Sc() && !iB_22.Pw();
            }
            return false;
        }
        return true;
    }
}

