/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.dN_2;
import celestial.eX_2;
import celestial.iB_2;
import celestial.iC_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.rLC;
import celestial.rLq_1;
import celestial.rPm_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfK_2;
import celestial.rls_3;
import celestial.rrEm_1;
import celestial.xc_3;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class rrg_3
extends rPm_1<iB_2> {
    private rLq_1 id_class;
    private int id_byte;

    private void id_byte(rrEm_1 rrEm_12, iB_2 iB_22, rfH_2 rfH_22) {
        iZ_2<?> iZ_22 = iB_22.SF();
        rfK_2 rfK_22 = rfK_2.id_class(rrEm_12.E(), rfH_22);
        if (iZ_22.id_byte(il_3.id_synchronized).isPresent()) {
            iZ_22.id_byte(il_3.id_synchronized).get().add(rfK_22);
        } else {
            iZ_22.id_class(il_3.id_synchronized, Sets.newHashSet((Object[])new rfK_2[]{rfK_22}));
        }
    }

    public rrg_3() {
        super((Map<il_3<?>, iC_2>)ImmutableMap.of(il_3.id_this, (Object)((Object)iC_2.VALUE_PRESENT), il_3.id_synchronized, (Object)((Object)iC_2.REGISTERED)));
    }

    private static boolean id_class(rrEm_1 rrEm_12, iB_2 iB_22, rfK_2 rfK_22) {
        return rfK_22.id_class() != rrEm_12.E() || !rfK_22.id_break().id_class((eX_2)iB_22.Ps(), 2.0);
    }

    private static boolean id_class(rrEm_1 rrEm_12, iB_2 iB_24, rfH_2 rfH_22) {
        iZ_2<List<iB_2>> iZ_22 = iB_24.SF();
        return !iZ_22.id_class(il_3.id_catch) ? false : iZ_22.id_byte(il_3.id_catch).get().stream().filter(iB_23 -> iB_23.BC() == iB_24.BC()).filter(iB_22 -> rfH_22.id_class((eX_2)iB_22.Ps(), 2.0)).anyMatch(iB_22 -> rrg_3.id_break(rrEm_12, iB_22, rfH_22));
    }

    public static void id_class(rrEm_1 rrEm_12, iB_2 iB_22, rLq_1 rLq_12, rLq_1 rLq_13) {
        iZ_2<Set<rfK_2>> iZ_22 = iB_22.SF();
        if (iZ_22.id_class(il_3.id_synchronized)) {
            Iterator<rfK_2> iterator = iZ_22.id_byte(il_3.id_synchronized).get().iterator();
            while (iterator.hasNext()) {
                rfK_2 rfK_22 = iterator.next();
                rfH_2 rfH_22 = rfK_22.id_break();
                if (rLq_12 != null && rLq_12.id_byte().equals(rfH_22) || rLq_13 != null && rLq_13.id_byte().equals(rfH_22)) continue;
                if (rrg_3.id_class(rrEm_12, iB_22, rfK_22)) {
                    iterator.remove();
                    continue;
                }
                xc_3 xc_32 = rrEm_12.id_byte(rfH_22);
                if (!xc_32.id_class(rls_3.id_private)) {
                    iterator.remove();
                    continue;
                }
                dN_2 dN_22 = (dN_2)xc_32.id_break();
                if (!dN_22.id_private(xc_32)) {
                    iterator.remove();
                    continue;
                }
                if (rrg_3.id_class(rrEm_12, iB_22, rfH_22)) {
                    iterator.remove();
                    continue;
                }
                dN_22.id_class((rYB)rrEm_12, xc_32, rfH_22, false);
                iterator.remove();
            }
        }
    }

    @Override
    protected boolean id_class(rrEm_1 rrEm_12, iB_2 iB_22) {
        rLC rLC2 = iB_22.SF().id_byte(il_3.id_this).get();
        if (!rLC2.id_break() && !rLC2.id_byte()) {
            if (!Objects.equals(this.id_class, rLC2.id_private())) {
                this.id_byte = 20;
                return true;
            }
            if (this.id_byte > 0) {
                --this.id_byte;
            }
            return this.id_byte == 0;
        }
        return false;
    }

    private static boolean id_break(rrEm_1 rrEm_12, iB_2 iB_22, rfH_2 rfH_22) {
        if (!iB_22.SF().id_class(il_3.id_this)) {
            return false;
        }
        rLC rLC2 = iB_22.SF().id_byte(il_3.id_this).get();
        if (rLC2.id_byte()) {
            return false;
        }
        rLq_1 rLq_12 = rLC2.id_implements();
        if (rLq_12 == null) {
            return false;
        }
        rLq_1 rLq_13 = rLC2.id_private();
        return rfH_22.equals(rLq_12.id_byte()) || rfH_22.equals(rLq_13.id_byte());
    }

    @Override
    protected void id_protected(rrEm_1 rrEm_12, iB_2 iB_22, long l) {
        dN_2 dN_22;
        xc_3 xc_32;
        Object object;
        rLC rLC2 = iB_22.SF().id_byte(il_3.id_this).get();
        this.id_class = rLC2.id_private();
        rLq_1 rLq_12 = rLC2.id_implements();
        rLq_1 rLq_13 = rLC2.id_private();
        rfH_2 rfH_22 = rLq_12.id_byte();
        xc_3 xc_33 = rrEm_12.id_byte(rfH_22);
        if (xc_33.id_class(rls_3.id_private)) {
            object = (dN_2)xc_33.id_break();
            if (!((dN_2)object).id_private(xc_33)) {
                ((dN_2)object).id_class((rYB)rrEm_12, xc_33, rfH_22, true);
            }
            this.id_byte(rrEm_12, iB_22, rfH_22);
        }
        if ((xc_32 = rrEm_12.id_byte((rfH_2)(object = rLq_13.id_byte()))).id_class(rls_3.id_private) && !(dN_22 = (dN_2)xc_32.id_break()).id_private(xc_32)) {
            dN_22.id_class((rYB)rrEm_12, xc_32, (rfH_2)object, true);
            this.id_byte(rrEm_12, iB_22, (rfH_2)object);
        }
        rrg_3.id_class(rrEm_12, iB_22, rLq_12, rLq_13);
    }
}

