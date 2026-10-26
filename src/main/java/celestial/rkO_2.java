/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.au_3;
import celestial.dj_3;
import celestial.iO_2;
import celestial.is_3;
import celestial.rHU;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdH_2;
import celestial.rdO_2;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rjG_2;
import celestial.rjM_2;
import celestial.rjU_2;
import celestial.rjs_3;
import celestial.rlB_2;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.rrEy_1;
import celestial.ryO_2;
import celestial.ryZ_2;
import celestial.rym_3;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class rkO_2
extends rdb_3 {
    private static final Map<aI_2<?>, rkO_2> id_class = Maps.newIdentityHashMap();
    private final int id_break;
    private final int id_byte;
    private final aI_2<?> id_protected;

    public rkO_2(aI_2<?> aI_22, int n, int n2, rdO_2 rdO_22) {
        super(rdO_22);
        this.id_protected = aI_22;
        this.id_break = n;
        this.id_byte = n2;
        id_class.put(aI_22, this);
    }

    @Override
    public ryZ_2 id_class(rdH_2 rdH_22) {
        Object object;
        rYB rYB2 = rdH_22.id_int();
        if (!(rYB2 instanceof rrEm_1)) {
            return ryZ_2.SUCCESS;
        }
        rdn_3 rdn_32 = rdH_22.id_volatile();
        rfH_2 rfH_22 = rdH_22.id_class();
        rpr_3 rpr_32 = rdH_22.id_finally();
        xc_3 xc_32 = rYB2.id_byte(rfH_22);
        if (xc_32.id_class(xu_3.rD) && (object = rYB2.id_class(rfH_22)) instanceof rHU) {
            rrEy_1 rrEy_12 = ((rHU)object).id_catch();
            aI_2<?> aI_22 = this.id_class(rdn_32.id_package());
            rrEy_12.id_class(aI_22);
            ((ryO_2)object).id_break();
            rYB2.id_class(rfH_22, xc_32, xc_32, 3);
            rdn_32.id_catch(1);
            return ryZ_2.CONSUME;
        }
        object = xc_32.id_extends(rYB2, rfH_22).id_break() ? rfH_22 : rfH_22.id_break(rpr_32);
        aI_2<?> aI_23 = this.id_class(rdn_32.id_package());
        if (aI_23.id_class((rrEm_1)rYB2, rdn_32, rdH_22.id_final(), (rfH_2)object, iO_2.SPAWN_EGG, true, !Objects.equals(rfH_22, object) && rpr_32 == rpr_3.UP) != null) {
            rdn_32.id_catch(1);
        }
        return ryZ_2.CONSUME;
    }

    public static rkO_2 id_class(aI_2<?> aI_22) {
        return id_class.get(aI_22);
    }

    public aI_2<?> id_class(rcd_3 rcd_32) {
        rcd_3 rcd_33;
        if (rcd_32 != null && rcd_32.id_byte("EntityTag", 10) && (rcd_33 = rcd_32.id_int("EntityTag")).id_byte("id", 8)) {
            return aI_2.id_class(rcd_33.id_native("id")).orElse(this.id_protected);
        }
        return this.id_protected;
    }

    public Optional<is_3> id_class(rhd_3 rhd_32, is_3 is_32, aI_2<? extends is_3> aI_22, rrEm_1 rrEm_12, rjU_2 rjU_22, rdn_3 rdn_32) {
        if (!this.id_class(rdn_32.id_package(), aI_22)) {
            return Optional.empty();
        }
        is_3 is_33 = is_32 instanceof au_3 ? ((au_3)is_32).id_class(rrEm_12, (au_3)is_32) : aI_22.id_class(rrEm_12);
        if (is_33 == null) {
            return Optional.empty();
        }
        is_33.id_class(true);
        if (!is_33.n_()) {
            return Optional.empty();
        }
        is_33.id_class(rjU_22.id_class(), rjU_22.id_break(), rjU_22.id_byte(), 0.0f, 0.0f);
        rrEm_12.id_class((an_3)is_33);
        if (rdn_32.id_this()) {
            is_33.id_break(rdn_32.id_continue());
        }
        if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
            rdn_32.id_catch(1);
        }
        return Optional.of(is_33);
    }

    @Override
    public rym_3<rdn_3> id_class(rYB rYB2, rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        rff_3 rff_32 = rkO_2.id_class(rYB2, rhd_32, rjs_3.SOURCE_ONLY);
        if (((rjG_2)rff_32).id_byte() != rjM_2.BLOCK) {
            return rym_3.id_byte(rdn_32);
        }
        if (!(rYB2 instanceof rrEm_1)) {
            return rym_3.id_class(rdn_32);
        }
        rff_3 rff_33 = rff_32;
        rfH_2 rfH_22 = rff_33.id_class();
        if (!(rYB2.id_byte(rfH_22).id_break() instanceof dj_3)) {
            return rym_3.id_byte(rdn_32);
        }
        if (rYB2.id_class(rhd_32, rfH_22) && rhd_32.id_class(rfH_22, rff_33.id_break(), rdn_32)) {
            aI_2<?> aI_22 = this.id_class(rdn_32.id_package());
            if (aI_22.id_class((rrEm_1)rYB2, rdn_32, rhd_32, rfH_22, iO_2.SPAWN_EGG, false, false) == null) {
                return rym_3.id_byte(rdn_32);
            }
            if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
                rdn_32.id_catch(1);
            }
            rhd_32.id_class(rlB_2.id_byte.id_break(this));
            return rym_3.id_break(rdn_32);
        }
        return rym_3.id_protected(rdn_32);
    }

    public boolean id_class(rcd_3 rcd_32, aI_2<?> aI_22) {
        return Objects.equals(this.id_class(rcd_32), aI_22);
    }

    public int id_class(int n) {
        return n == 0 ? this.id_break : this.id_byte;
    }

    public static Iterable<rkO_2> id_catch() {
        return Iterables.unmodifiableIterable(id_class.values());
    }
}

