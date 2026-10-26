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
import celestial.rRu_1;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.BiPredicate;

public class rrN_2
extends rPm_1<iB_2> {
    private final int id_class;
    private final BiPredicate<iB_2, iB_2> id_byte;

    public rrN_2(int n, BiPredicate<iB_2, iB_2> biPredicate) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_package, (Object)((Object)iC_2.VALUE_PRESENT), il_3.id_short, (Object)((Object)iC_2.REGISTERED), il_3.id_double, (Object)((Object)iC_2.VALUE_ABSENT), il_3.id_switch, (Object)((Object)iC_2.REGISTERED)));
        this.id_class = n;
        this.id_byte = biPredicate;
    }

    private iB_2 id_class(iB_2 iB_22) {
        return iB_22.SF().id_byte(il_3.id_package).get();
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, iB_2 iB_22) {
        return this.id_class(iB_22).Sl();
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        iB_2 iB_23 = this.id_class(iB_22);
        if (this.id_byte.test(iB_22, iB_23)) {
            iB_22.SF().id_class(il_3.id_switch, true, this.id_class);
        }
        iB_22.SF().id_class(il_3.id_double, iB_23.Bs(), this.id_class);
        if (iB_23.BC() != aI_2.rM || rrEm_12.B().id_break(rRu_1.id_abstract)) {
            iB_22.SF().id_break(il_3.id_package);
            iB_22.SF().id_break(il_3.id_short);
        }
    }
}

