/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.aA_2;
import celestial.iB_2;
import celestial.iC_2;
import celestial.iH_2;
import celestial.iX_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rjU_2;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class rPC
extends rPm_1<aA_2> {
    private final float id_class;
    private final int id_byte;
    private final int id_protected;

    public rPC(float f) {
        this(f, 10, 7);
    }

    public rPC(float f, int n, int n2) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_volatile, (Object)((Object)iC_2.VALUE_ABSENT)));
        this.id_class = f;
        this.id_byte = n;
        this.id_protected = n2;
    }

    protected void id_class(rrEm_1 rrEm_12, aA_2 aA_22, long l) {
        Optional<rjU_2> optional = Optional.ofNullable(iX_2.id_break(aA_22, this.id_byte, this.id_protected));
        aA_22.SF().id_class(il_3.id_volatile, optional.map(rjU_22 -> new iH_2((rjU_2)rjU_22, this.id_class, 0)));
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (aA_2)iB_22, l);
    }
}

