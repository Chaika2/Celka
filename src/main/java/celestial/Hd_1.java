/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Ok_1;
import celestial.lD_2;
import celestial.rqO_2;
import celestial.rrxy_3;
import celestial.rrzJ_2;
import celestial.yr_3;
import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Hd_1
implements Hx_1 {
    protected final lD_2 id_class;
    protected final Map<HU, lD_2> id_break;
    protected HU id_byte = null;
    protected final Set<lD_2> id_protected = Sets.newIdentityHashSet();
    private final Ok_1 id_throws = new rrxy_3(this);

    public HU id_byte() {
        return this.id_byte;
    }

    protected Hd_1(lD_2 lD_22, Map<HU, lD_2> map) {
        this.id_class = lD_22;
        this.id_break = map;
        this.id_class.id_class(this);
        for (lD_2 lD_23 : map.values()) {
            lD_23.id_class(this);
        }
    }

    @Override
    public void id_class() {
        HU hU = this.id_byte;
        this.id_break();
        if (hU != null) {
            this.getBuffer(hU);
        }
    }

    public Ok_1 id_class(rqO_2 rqO_22, Ok_1 ok_1) {
        if (!(this.id_byte instanceof yr_3)) {
            return ok_1;
        }
        rqO_22 = HU.id_continue(rqO_22);
        yr_3 yr_32 = (yr_3)this.id_byte;
        yr_3 yr_33 = yr_32.id_super(rqO_22);
        return this.getBuffer(yr_33);
    }

    public void id_class(HU hU) {
        lD_2 lD_22 = this.id_break(hU);
        boolean bl = Objects.equals(this.id_byte, hU);
        if ((bl || lD_22 != this.id_class) && this.id_protected.remove(lD_22)) {
            hU.id_class(lD_22, 0, 0, 0);
            if (bl) {
                this.id_byte = null;
            }
        }
    }

    public void id_break() {
        if (!this.id_protected.isEmpty()) {
            Object object;
            if (this.id_byte != null && (object = this.getBuffer(this.id_byte)) == this.id_class) {
                this.id_class(this.id_byte);
            }
            if (!this.id_protected.isEmpty()) {
                for (HU hU : this.id_break.keySet()) {
                    this.id_class(hU);
                    if (!this.id_protected.isEmpty()) continue;
                    break;
                }
            }
        }
    }

    private lD_2 id_break(HU hU) {
        return this.id_break.getOrDefault(hU, this.id_class);
    }

    @Override
    public Ok_1 getBuffer(HU hU) {
        lD_2 lD_22 = this.id_break(hU);
        if (!Objects.equals(this.id_byte, hU)) {
            HU hU2;
            if (this.id_byte != null && !this.id_break.containsKey(hU2 = this.id_byte)) {
                this.id_class(hU2);
            }
            if (this.id_protected.add(lD_22)) {
                lD_22.id_class(hU);
                lD_22.id_class(hU.id_try(), hU.id_while());
            }
            this.id_byte = hU;
        }
        return hU.id_float() == rrzJ_2.id_while ? this.id_throws : lD_22;
    }

    public Ok_1 id_protected() {
        return this.id_throws;
    }
}

