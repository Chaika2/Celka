/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.eX_2;
import celestial.iB_2;
import celestial.iC_2;
import celestial.iH_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rfK_2;
import celestial.rrEm_1;
import celestial.rsq_3;
import com.google.common.collect.ImmutableMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class rPt_1
extends rPm_1<rsq_3> {
    private final il_3<List<rfK_2>> id_class;
    private final il_3<rfK_2> id_byte;
    private final float id_protected;
    private final int id_throws;
    private final int id_case;
    private long id_catch;
    private rfK_2 id_private;

    public rPt_1(il_3<List<rfK_2>> il_32, float f, int n, int n2, il_3<rfK_2> il_33) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_volatile, (Object)((Object)iC_2.REGISTERED), il_32, (Object)((Object)iC_2.VALUE_PRESENT), il_33, (Object)((Object)iC_2.VALUE_PRESENT)));
        this.id_class = il_32;
        this.id_protected = f;
        this.id_throws = n;
        this.id_case = n2;
        this.id_byte = il_33;
    }

    protected void id_class(rrEm_1 rrEm_12, rsq_3 rsq_32, long l) {
        if (l > this.id_catch && this.id_private != null) {
            rsq_32.SF().id_class(il_3.id_volatile, new iH_2(this.id_private.id_break(), this.id_protected, this.id_throws));
            this.id_catch = l + 100L;
        }
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, rsq_3 rsq_32) {
        List<rfK_2> list;
        Optional<List<rfK_2>> optional = rsq_32.SF().id_byte(this.id_class);
        Optional<rfK_2> optional2 = rsq_32.SF().id_byte(this.id_byte);
        if (optional.isPresent() && optional2.isPresent() && !(list = optional.get()).isEmpty()) {
            this.id_private = list.get(rrEm_12.id_long().nextInt(list.size()));
            return this.id_private != null && rrEm_12.E() == this.id_private.id_class() && optional2.get().id_break().id_class((eX_2)rsq_32.Ps(), (double)this.id_case);
        }
        return false;
    }

    @Override
    protected /* synthetic */ void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_class(rrEm_12, (rsq_3)iB_22, l);
    }
}

