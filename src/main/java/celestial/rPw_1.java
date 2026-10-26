/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.aA_2;
import celestial.eX_2;
import celestial.iB_2;
import celestial.iC_2;
import celestial.iH_2;
import celestial.iX_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rfK_2;
import celestial.rjU_2;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class rPw_1
extends rPm_1<aA_2> {
    private final il_3<rfK_2> id_class;
    private long id_byte;
    private final int id_protected;
    private float id_throws;

    public rPw_1(il_3<rfK_2> il_32, float f, int n) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_volatile, (Object)((Object)iC_2.REGISTERED), il_32, (Object)((Object)iC_2.VALUE_PRESENT)));
        this.id_class = il_32;
        this.id_throws = f;
        this.id_protected = n;
    }

    protected void id_class(rrEm_1 rrEm_12, aA_2 aA_22, long l) {
        if (l > this.id_byte) {
            Optional<rjU_2> optional = Optional.ofNullable(iX_2.id_break(aA_22, 8, 6));
            aA_22.SF().id_class(il_3.id_volatile, optional.map(rjU_22 -> new iH_2((rjU_2)rjU_22, this.id_throws, 1)));
            this.id_byte = l + 180L;
        }
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, aA_2 aA_22) {
        Optional<rfK_2> optional = aA_22.SF().id_byte(this.id_class);
        return optional.isPresent() && rrEm_12.E() == optional.get().id_class() && optional.get().id_break().id_class((eX_2)aA_22.Ps(), (double)this.id_protected);
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (aA_2)iB_22, l);
    }
}

