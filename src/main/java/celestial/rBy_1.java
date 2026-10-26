/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.aA_2;
import celestial.dN_2;
import celestial.eX_2;
import celestial.iX_2;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rLA;
import celestial.rLC;
import celestial.rLq_1;
import celestial.rRP;
import celestial.rRr_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjU_2;
import celestial.rpc_3;
import celestial.rrEm_1;
import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BooleanSupplier;

public class rBy_1
extends rBk_1 {
    protected final aA_2 id_class;
    private final double id_break;
    private rLC id_byte;
    private rfH_2 id_protected;
    private final boolean id_throws;
    private final List<rfH_2> id_case = Lists.newArrayList();
    private final int id_catch;
    private final BooleanSupplier id_private;

    @Override
    public void id_byte() {
        this.id_class.id_public().id_class(this.id_byte, this.id_break);
    }

    public rBy_1(aA_2 aA_22, double d, boolean bl, int n, BooleanSupplier booleanSupplier) {
        this.id_class = aA_22;
        this.id_break = d;
        this.id_throws = bl;
        this.id_catch = n;
        this.id_private = booleanSupplier;
        this.id_class(EnumSet.of(rBW.MOVE));
        if (!rpc_3.id_class(aA_22)) {
            throw new IllegalArgumentException("Unsupported mob for MoveThroughVillageGoal");
        }
    }

    private boolean id_class(rfH_2 rfH_22) {
        for (rfH_2 rfH_23 : this.id_case) {
            if (!Objects.equals(rfH_22, rfH_23)) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean id_class() {
        if (!rpc_3.id_class(this.id_class)) {
            return false;
        }
        this.id_catch();
        if (this.id_throws && ((rYB)this.id_class.id_throws[7]).id_strictfp()) {
            return false;
        }
        rrEm_1 rrEm_12 = (rrEm_1)((rYB)this.id_class.id_throws[7]);
        rfH_2 rfH_22 = this.id_class.Bs();
        if (!rrEm_12.id_byte(rfH_22, 6)) {
            return false;
        }
        rjU_2 rjU_22 = iX_2.id_class(this.id_class, 15, 7, rfH_23 -> {
            if (!rrEm_12.id_throw((rfH_2)rfH_23)) {
                return Double.NEGATIVE_INFINITY;
            }
            Optional<rfH_2> optional = rrEm_12.d().id_byte(rRP.id_break, this::id_class, (rfH_2)rfH_23, 10, rRr_1.IS_OCCUPIED);
            return !optional.isPresent() ? Double.NEGATIVE_INFINITY : -optional.get().id_private(rfH_22);
        });
        if (rjU_22 == null) {
            return false;
        }
        Optional<rfH_2> optional = rrEm_12.d().id_byte(rRP.id_break, this::id_class, new rfH_2(rjU_22), 10, rRr_1.IS_OCCUPIED);
        if (!optional.isPresent()) {
            return false;
        }
        this.id_protected = optional.get().id_int();
        rLA rLA2 = (rLA)this.id_class.id_public();
        boolean bl = rLA2.id_throws();
        rLA2.id_class(this.id_private.getAsBoolean());
        this.id_byte = rLA2.id_class(this.id_protected, 0);
        rLA2.id_class(bl);
        if (this.id_byte == null) {
            rjU_2 rjU_23 = iX_2.id_break(this.id_class, 10, 7, rjU_2.id_protected(this.id_protected));
            if (rjU_23 == null) {
                return false;
            }
            rLA2.id_class(this.id_private.getAsBoolean());
            this.id_byte = this.id_class.id_public().id_class(rjU_23.id_break, rjU_23.id_byte, rjU_23.id_protected, 0);
            rLA2.id_class(bl);
            if (this.id_byte == null) {
                return false;
            }
        }
        for (int i = 0; i < this.id_byte.id_throws(); ++i) {
            rLq_1 rLq_12 = this.id_byte.id_class(i);
            rfH_2 rfH_24 = new rfH_2(rLq_12.id_class, rLq_12.id_break + 1, rLq_12.id_byte);
            if (!dN_2.id_class((rYB)this.id_class.id_throws[7], rfH_24)) continue;
            this.id_byte = this.id_class.id_public().id_class((double)rLq_12.id_class, (double)rLq_12.id_break, (double)rLq_12.id_byte, 0);
            break;
        }
        return this.id_byte != null;
    }

    @Override
    public boolean id_break() {
        if (this.id_class.id_public().id_native()) {
            return false;
        }
        return !this.id_protected.id_class((eX_2)this.id_class.Ps(), (double)(this.id_class.PN() + (float)this.id_catch));
    }

    private void id_catch() {
        if (this.id_case.size() > 15) {
            this.id_case.remove(0);
        }
    }

    @Override
    public void id_protected() {
        if (this.id_class.id_public().id_native() || this.id_protected.id_class((eX_2)this.id_class.Ps(), (double)this.id_catch)) {
            this.id_case.add(this.id_protected);
        }
    }
}

