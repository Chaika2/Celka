/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.au_3;
import celestial.iB_2;
import celestial.iZ_2;
import celestial.il_3;
import celestial.is_3;
import celestial.rEg_1;
import celestial.rSN;
import celestial.rbM_2;
import celestial.rbW_2;
import celestial.rbd_3;
import celestial.rbk_3;
import celestial.rbr_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rls_3;
import celestial.rpJ_2;
import celestial.rrEm_1;
import celestial.rrr_3;
import celestial.xc_3;
import celestial.xn_3;
import celestial.xu_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

public class ia_3
extends rrr_3<iB_2> {
    private static Optional<rfH_2> id_byte(rrEm_1 rrEm_12, iB_2 iB_22) {
        return rfH_2.id_class(iB_22.Bs(), 8, 4, rfH_22 -> ia_3.id_class(rrEm_12, rfH_22));
    }

    private static boolean id_class(rrEm_1 rrEm_12, rfH_2 rfH_22) {
        xc_3 xc_32 = rrEm_12.id_byte(rfH_22);
        boolean bl = xc_32.id_class(rls_3.id_boolean);
        return bl && xc_32.id_class(xu_3.XX) ? xn_3.id_private(xc_32) : bl;
    }

    @Override
    public Set<il_3<?>> id_class() {
        return ImmutableSet.of(il_3.id_private, il_3.id_catch, il_3.id_import, il_3.B, il_3.h, il_3.r, (Object[])new il_3[]{il_3.P, il_3.s, il_3.S, il_3.M, il_3.O, il_3.J});
    }

    @Override
    protected void id_class(rrEm_1 rrEm_12, iB_2 iB_22) {
        iZ_2<?> iZ_22 = iB_22.SF();
        iZ_22.id_class(il_3.J, ia_3.id_byte(rrEm_12, iB_22));
        Optional<Object> optional = Optional.empty();
        Optional<Object> optional2 = Optional.empty();
        Optional<Object> optional3 = Optional.empty();
        Optional<Object> optional4 = Optional.empty();
        Optional<Object> optional5 = Optional.empty();
        Optional<Object> optional6 = Optional.empty();
        Optional<Object> optional7 = Optional.empty();
        int n = 0;
        ArrayList arrayList = Lists.newArrayList();
        ArrayList arrayList2 = Lists.newArrayList();
        for (iB_2 iB_23 : iZ_22.id_byte(il_3.id_private).orElse((List<iB_2>)ImmutableList.of())) {
            iB_2 iB_24;
            if (iB_23 instanceof rEg_1) {
                iB_24 = (rEg_1)iB_23;
                if (((au_3)iB_24).n_() && !optional3.isPresent()) {
                    optional3 = Optional.of(iB_24);
                    continue;
                }
                if (!((rEg_1)iB_24).sJ()) continue;
                ++n;
                if (optional2.isPresent() || !((rEg_1)iB_24).sd()) continue;
                optional2 = Optional.of(iB_24);
                continue;
            }
            if (iB_23 instanceof rbd_3) {
                arrayList.add((rbd_3)iB_23);
                continue;
            }
            if (iB_23 instanceof rbk_3) {
                iB_24 = (rbk_3)iB_23;
                if (((rbk_3)iB_24).n_() && !optional4.isPresent()) {
                    optional4 = Optional.of(iB_24);
                    continue;
                }
                if (!((rbM_2)iB_24).sx()) continue;
                arrayList.add(iB_24);
                continue;
            }
            if (iB_23 instanceof rhd_3) {
                iB_24 = (rhd_3)iB_23;
                if (!optional6.isPresent() && rpJ_2.id_case.test(iB_23) && !rbW_2.id_class(iB_24)) {
                    optional6 = Optional.of(iB_24);
                }
                if (optional7.isPresent() || ((rhd_3)iB_24).id_native() || !rbW_2.id_break(iB_24)) continue;
                optional7 = Optional.of(iB_24);
                continue;
            }
            if (optional.isPresent() || !(iB_23 instanceof rbr_3) && !(iB_23 instanceof rSN)) {
                if (optional5.isPresent() || !rbW_2.id_class(iB_23.BC())) continue;
                optional5 = Optional.of(iB_23);
                continue;
            }
            optional = Optional.of((is_3)iB_23);
        }
        for (iB_2 iB_23 : iZ_22.id_byte(il_3.id_catch).orElse((List<iB_2>)ImmutableList.of())) {
            if (!(iB_23 instanceof rbM_2) || !((rbM_2)iB_23).sx()) continue;
            arrayList2.add((rbM_2)iB_23);
        }
        iZ_22.id_class(il_3.id_import, optional);
        iZ_22.id_class(il_3.r, optional2);
        iZ_22.id_class(il_3.P, optional3);
        iZ_22.id_class(il_3.b, optional5);
        iZ_22.id_class(il_3.B, optional6);
        iZ_22.id_class(il_3.h, optional7);
        iZ_22.id_class(il_3.S, arrayList2);
        iZ_22.id_class(il_3.s, arrayList);
        iZ_22.id_class(il_3.M, Integer.valueOf(arrayList.size()));
        iZ_22.id_class(il_3.O, Integer.valueOf(n));
    }
}

