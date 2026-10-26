/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.rNi_1;
import celestial.rNl_1;
import celestial.rQz_1;
import celestial.rca_3;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdn_3;
import celestial.rgB_2;
import celestial.rgP_2;
import celestial.rzB_2;
import celestial.rzO_2;
import celestial.rzd_3;
import celestial.rzr_3;
import celestial.rzx_3;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;
import java.util.function.UnaryOperator;

public class rND
extends rzO_2 {
    public final boolean id_break;
    public final List<rgP_2> id_byte;
    public final rzB_2 id_protected;

    public rND(rQz_1[] rQz_1Array, boolean bl, List<rgP_2> list, rzB_2 rzB_22) {
        super(rQz_1Array);
        this.id_break = bl;
        this.id_byte = ImmutableList.copyOf(list);
        this.id_protected = rzB_22;
    }

    private rcy_3 id_class(rdn_3 rdn_32, boolean bl) {
        rcd_3 rcd_32;
        rcd_3 rcd_33;
        if (rdn_32.id_final()) {
            rcd_33 = rdn_32.id_package();
        } else {
            if (!bl) {
                return null;
            }
            rcd_33 = new rcd_3();
            rdn_32.id_byte(rcd_33);
        }
        if (rcd_33.id_byte("display", 10)) {
            rcd_32 = rcd_33.id_int("display");
        } else {
            if (!bl) {
                return null;
            }
            rcd_32 = new rcd_3();
            rcd_33.id_class("display", rcd_32);
        }
        if (rcd_32.id_byte("Lore", 9)) {
            return rcd_32.id_protected("Lore", 8);
        }
        if (bl) {
            rcy_3 rcy_32 = new rcy_3();
            rcd_32.id_class("Lore", rcy_32);
            return rcy_32;
        }
        return null;
    }

    @Override
    public Set<rzd_3<?>> id_class() {
        return this.id_protected != null ? ImmutableSet.of(this.id_protected.id_class()) : ImmutableSet.of();
    }

    @Override
    public rdn_3 id_break(rdn_3 rdn_32, rzr_3 rzr_32) {
        rcy_3 rcy_32 = this.id_class(rdn_32, !this.id_byte.isEmpty());
        if (rcy_32 != null) {
            if (this.id_break) {
                rcy_32.clear();
            }
            UnaryOperator<rgP_2> unaryOperator = rNi_1.id_class(rzr_32, this.id_protected);
            this.id_byte.stream().map(unaryOperator).map(rgB_2::id_class).map(rca_3::id_class).forEach(rcy_32::add);
        }
        return rdn_32;
    }

    @Override
    public rzx_3 id_break() {
        return rNl_1.id_super;
    }
}

