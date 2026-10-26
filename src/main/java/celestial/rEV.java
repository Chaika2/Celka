/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rEI;
import celestial.rOJ;
import celestial.rhd_3;
import java.util.function.Predicate;

public class rEV
implements Predicate<iB_2> {
    private final rEI id_class;

    public rEV(rEI rEI2) {
        this.id_class = rEI2;
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((iB_2)object);
    }

    public boolean id_class(iB_2 iB_22) {
        return (iB_22 instanceof rhd_3 || iB_22 instanceof rOJ) && iB_22.id_int(this.id_class) > 9.0;
    }
}

