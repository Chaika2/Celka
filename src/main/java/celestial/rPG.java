/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.iB_2;
import celestial.iC_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class rPG
extends rPm_1<iB_2> {
    private final int id_class;

    public rPG(il_3<?> il_32, int n) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_package, (Object)((Object)iC_2.REGISTERED), il_3.x, (Object)((Object)iC_2.VALUE_ABSENT), il_32, (Object)((Object)iC_2.VALUE_PRESENT)));
        this.id_class = n;
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        iB_22.SF().id_class(il_3.x, true, this.id_class);
        iB_22.SF().id_break(il_3.id_package);
    }
}

