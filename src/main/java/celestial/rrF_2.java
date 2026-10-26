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
import celestial.iZ_2;
import celestial.il_3;
import celestial.rPm_1;
import celestial.rRP;
import celestial.rRr_1;
import celestial.rfH_2;
import celestial.rfK_2;
import celestial.rrEm_1;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.Optional;

public class rrF_2
extends rPm_1<iB_2> {
    private final float id_class;
    private final int id_byte;
    private final int id_protected;
    private Optional<rfH_2> id_throws = Optional.empty();

    public rrF_2(int n, float f, int n2) {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_volatile, (Object)((Object)iC_2.VALUE_ABSENT), il_3.id_break, (Object)((Object)iC_2.REGISTERED), il_3.id_instanceof, (Object)((Object)iC_2.REGISTERED)));
        this.id_byte = n;
        this.id_class = f;
        this.id_protected = n2;
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, iB_2 iB_22) {
        Optional<rfH_2> optional = rrEm_12.d().id_byte(rRP2 -> rRP2 == rRP.id_continue, rfH_22 -> true, iB_22.Bs(), this.id_protected + 1, rRr_1.ANY);
        this.id_throws = optional.isPresent() && optional.get().id_class((eX_2)iB_22.Ps(), (double)this.id_protected) ? optional : Optional.empty();
        return true;
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        Optional<rfK_2> optional;
        iZ_2<?> iZ_22 = iB_22.SF();
        Optional<rfH_2> optional2 = this.id_throws;
        if (!optional2.isPresent() && !(optional2 = rrEm_12.d().id_class(rRP2 -> rRP2 == rRP.id_continue, rfH_22 -> true, rRr_1.ANY, iB_22.Bs(), this.id_byte, iB_22.Sa())).isPresent() && (optional = iZ_22.id_byte(il_3.id_break)).isPresent()) {
            optional2 = Optional.of(optional.get().id_break());
        }
        if (optional2.isPresent()) {
            iZ_22.id_break(il_3.id_this);
            iZ_22.id_break(il_3.id_final);
            iZ_22.id_break(il_3.id_continue);
            iZ_22.id_break(il_3.id_new);
            iZ_22.id_class(il_3.id_instanceof, rfK_2.id_class(rrEm_12.E(), optional2.get()));
            if (!optional2.get().id_class((eX_2)iB_22.Ps(), (double)this.id_protected)) {
                iZ_22.id_class(il_3.id_volatile, new iH_2(optional2.get(), this.id_class, this.id_protected));
            }
        }
    }
}

