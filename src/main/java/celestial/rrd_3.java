/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.an_3;
import celestial.au_3;
import celestial.iA_2;
import celestial.iB_2;
import celestial.iC_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rqb_3;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class rrd_3<E extends au_3>
extends rPm_1<E> {
    private final rqb_3 id_class;
    private final float id_byte;

    public rrd_3(rqb_3 rqb_32, float f) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_void, (Object)((Object)iC_2.VALUE_PRESENT), il_3.id_volatile, (Object)((Object)iC_2.VALUE_ABSENT)));
        this.id_class = rqb_32;
        this.id_byte = f;
    }

    private au_3 id_class(E e) {
        return ((iB_2)e).SF().id_byte(il_3.id_void).get();
    }

    protected void id_class(rrEm_1 rrEm_12, E e, long l) {
        iA_2.id_class(e, this.id_class(e), this.id_byte, this.id_class.id_class() - 1);
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, E e) {
        if (!((au_3)e).n_()) {
            return false;
        }
        au_3 au_32 = this.id_class(e);
        return ((an_3)e).id_class((an_3)au_32, (double)(this.id_class.id_break() + 1)) && !((an_3)e).id_class((an_3)au_32, (double)this.id_class.id_class());
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (au_3)iB_22, l);
    }
}

