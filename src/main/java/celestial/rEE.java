/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.eX_2;
import celestial.iX_2;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rEB;
import celestial.rRP;
import celestial.rRr_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjU_2;
import celestial.rrEm_1;
import com.google.common.collect.Lists;
import java.util.EnumSet;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class rEE
extends rBk_1 {
    private final rEB id_class;
    private final double id_break;
    private rfH_2 id_byte;
    private final List<rfH_2> id_protected = Lists.newArrayList();
    private final int id_throws;
    private boolean id_case;

    @Override
    public void id_byte() {
        super.id_byte();
        this.id_class.id_native(0);
        this.id_class.id_public().id_class((double)this.id_byte.b_(), (double)this.id_byte.c_(), (double)this.id_byte.d_(), this.id_break);
        this.id_case = false;
    }

    public rEE(rEB rEB2, double d, int n) {
        this.id_class = rEB2;
        this.id_break = d;
        this.id_throws = n;
        this.id_class(EnumSet.of(rBW.MOVE));
    }

    private boolean id_class(rfH_2 rfH_22) {
        for (rfH_2 rfH_23 : this.id_protected) {
            if (!Objects.equals(rfH_22, rfH_23)) continue;
            return false;
        }
        return true;
    }

    @Override
    public boolean id_class() {
        this.id_finally();
        return this.id_catch() && this.id_private() && this.id_class.I_() == null;
    }

    @Override
    public boolean id_break() {
        if (this.id_class.id_public().id_native()) {
            return false;
        }
        return this.id_class.I_() == null && !this.id_byte.id_class((eX_2)this.id_class.Ps(), (double)(this.id_class.PN() + (float)this.id_throws)) && !this.id_case;
    }

    @Override
    public void id_throws() {
        if (this.id_class.id_public().id_native()) {
            rjU_2 rjU_22 = rjU_2.id_protected(this.id_byte);
            rjU_2 rjU_23 = iX_2.id_class(this.id_class, 16, 7, rjU_22, 0.3141592741012573);
            if (rjU_23 == null) {
                rjU_23 = iX_2.id_break(this.id_class, 8, 7, rjU_22);
            }
            if (rjU_23 == null) {
                this.id_case = true;
                return;
            }
            this.id_class.id_public().id_class(rjU_23.id_break, rjU_23.id_byte, rjU_23.id_protected, this.id_break);
        }
    }

    private void id_finally() {
        if (this.id_protected.size() > 2) {
            this.id_protected.remove(0);
        }
    }

    private boolean id_catch() {
        return this.id_class.sd() && !this.id_class.sx().id_class();
    }

    @Override
    public void id_protected() {
        if (this.id_byte.id_class((eX_2)this.id_class.Ps(), (double)this.id_throws)) {
            this.id_protected.add(this.id_byte);
        }
    }

    private boolean id_private() {
        rrEm_1 rrEm_12 = (rrEm_1)((rYB)this.id_class.id_throws[7]);
        rfH_2 rfH_22 = this.id_class.Bs();
        Optional<rfH_2> optional = rrEm_12.d().id_class(rRP2 -> rRP2 == rRP.id_continue, this::id_class, rRr_1.ANY, rfH_22, 48, rEB.id_case(this.id_class));
        if (!optional.isPresent()) {
            return false;
        }
        this.id_byte = optional.get().id_int();
        return true;
    }
}

