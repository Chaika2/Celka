/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.aI_2;
import celestial.iB_2;
import celestial.iC_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rbW_2;
import celestial.rbk_3;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class rbh_3<E extends rbk_3>
extends rPm_1<E> {
    public rbh_3() {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_package, (Object)((Object)iC_2.VALUE_PRESENT), il_3.id_for, (Object)((Object)iC_2.REGISTERED)));
    }

    private boolean id_class(E e) {
        iB_2 iB_22 = ((rbk_3)e).SF().id_byte(il_3.id_package).get();
        return iB_22.BC() == aI_2.id_long && iB_22.Sl();
    }

    protected void id_class(rrEm_1 rrEm_12, E e, long l) {
        if (this.id_class(e)) {
            rbW_2.id_byte(e);
        }
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (rbk_3)iB_22, l);
    }
}

