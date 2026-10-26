/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.iB_2;
import celestial.iC_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rbk_3;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class rbN_2<E extends rbk_3>
extends rPm_1<E> {
    private final int id_class;
    private final int id_byte;

    public rbN_2(int n, int n2) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_const, (Object)((Object)iC_2.VALUE_PRESENT), il_3.id_static, (Object)((Object)iC_2.VALUE_PRESENT), il_3.id_strictfp, (Object)((Object)iC_2.REGISTERED), il_3.id_boolean, (Object)((Object)iC_2.REGISTERED)));
        this.id_class = n;
        this.id_byte = n2;
    }

    protected void id_class(rrEm_1 rrEm_12, E e, long l) {
        iZ_2<rbk_3> iZ_22 = ((rbk_3)e).SF();
        Optional<Integer> optional = iZ_22.id_byte(il_3.id_strictfp);
        if (!optional.isPresent()) {
            iZ_22.id_class(il_3.id_strictfp, Integer.valueOf(0));
        } else {
            int n = optional.get();
            if (n > this.id_class) {
                iZ_22.id_break(il_3.id_const);
                iZ_22.id_break(il_3.id_strictfp);
                iZ_22.id_class(il_3.id_boolean, true, this.id_byte);
            } else {
                iZ_22.id_class(il_3.id_strictfp, Integer.valueOf(n + 1));
            }
        }
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, E e) {
        return ((iB_2)e).Sn().id_class();
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (rbk_3)iB_22, l);
    }
}

