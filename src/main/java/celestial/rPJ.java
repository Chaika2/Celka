/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import celestial.aY_2;
import celestial.aa_3;
import celestial.iA_2;
import celestial.iB_2;
import celestial.iC_2;
import celestial.il_3;
import celestial.is_3;
import celestial.rPm_1;
import celestial.rPx_1;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfY_2;
import celestial.rhj_3;
import celestial.rrEm_1;
import celestial.rxm_3;
import com.google.common.collect.ImmutableMap;
import java.util.Map;

public class rPJ<E extends is_3, T extends iB_2>
extends rPm_1<E> {
    private int id_class;
    private rPx_1 id_byte = rPx_1.UNCHARGED;

    @Override
    protected /* synthetic */ void id_byte(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_break(rrEm_12, (E)((is_3)iB_22), l);
    }

    @Override
    protected void id_byte(rrEm_1 rrEm_12, E e, long l) {
        if (((iB_2)e).id_return()) {
            ((iB_2)e).id_throw();
        }
        if (((iB_2)e).id_class(rdy_3.kU)) {
            ((aY_2)e).id_break(false);
            rxm_3.id_class(((iB_2)e).sX(), false);
        }
    }

    public rPJ() {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_final, (Object)((Object)iC_2.REGISTERED), il_3.id_package, (Object)((Object)iC_2.VALUE_PRESENT)), 1200);
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, E e) {
        iB_2 iB_22 = rPJ.id_class(e);
        return ((iB_2)e).id_class(rdy_3.kU) && iA_2.id_byte(e, iB_22) && iA_2.id_class(e, iB_22, 0);
    }

    private static iB_2 id_class(iB_2 iB_22) {
        return iB_22.SF().id_byte(il_3.id_package).get();
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, E e, long l) {
        return ((iB_2)e).SF().id_class(il_3.id_package) && this.id_class(rrEm_12, e);
    }

    private void id_class(E e, iB_2 iB_22) {
        if (this.id_byte == rPx_1.UNCHARGED) {
            ((iB_2)e).id_break(rhj_3.id_class(e, rdy_3.kU));
            this.id_byte = rPx_1.CHARGING;
            ((aY_2)e).id_break(true);
        } else if (this.id_byte == rPx_1.CHARGING) {
            rdn_3 rdn_32;
            int n;
            if (!((iB_2)e).id_return()) {
                this.id_byte = rPx_1.UNCHARGED;
            }
            if ((n = ((iB_2)e).SU()) >= rxm_3.id_private(rdn_32 = ((iB_2)e).sX())) {
                ((iB_2)e).SC();
                this.id_byte = rPx_1.CHARGED;
                this.id_class = 20 + ((iB_2)e).Sa().nextInt(20);
                ((aY_2)e).id_break(false);
            }
        } else if (this.id_byte == rPx_1.CHARGED) {
            --this.id_class;
            if (this.id_class == 0) {
                this.id_byte = rPx_1.READY_TO_ATTACK;
            }
        } else if (this.id_byte == rPx_1.READY_TO_ATTACK) {
            ((aa_3)e).id_break(iB_22, 1.0f);
            rdn_3 rdn_33 = ((iB_2)e).id_protected(rhj_3.id_class(e, rdy_3.kU));
            rxm_3.id_class(rdn_33, false);
            this.id_byte = rPx_1.UNCHARGED;
        }
    }

    @Override
    protected /* synthetic */ void id_break(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        this.id_byte(rrEm_12, (E)((is_3)iB_22), l);
    }

    private void id_break(is_3 is_32, iB_2 iB_22) {
        is_32.SF().id_class(il_3.id_final, new rfY_2(iB_22, true));
    }

    @Override
    protected void id_break(rrEm_1 rrEm_12, E e, long l) {
        iB_2 iB_22 = rPJ.id_class(e);
        this.id_break((is_3)e, iB_22);
        this.id_class(e, iB_22);
    }
}

