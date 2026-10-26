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
import celestial.iZ_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rfK_2;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class rPT
extends rPm_1<aA_2> {
    private final il_3<rfK_2> id_class;
    private final int id_byte;
    private final int id_protected;
    private final float id_throws;
    private long id_case;

    public rPT(il_3<rfK_2> il_32, float f, int n, int n2) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_volatile, (Object)((Object)iC_2.REGISTERED), il_32, (Object)((Object)iC_2.VALUE_PRESENT)));
        this.id_class = il_32;
        this.id_throws = f;
        this.id_byte = n;
        this.id_protected = n2;
    }

    protected void id_class(rrEm_1 rrEm_12, aA_2 aA_22, long l) {
        if (l > this.id_case) {
            iZ_2<?> iZ_22 = aA_22.SF();
            Optional<rfK_2> optional = iZ_22.id_byte(this.id_class);
            optional.ifPresent(rfK_22 -> iZ_22.id_class(il_3.id_volatile, new iH_2(rfK_22.id_break(), this.id_throws, this.id_byte)));
            this.id_case = l + 80L;
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

