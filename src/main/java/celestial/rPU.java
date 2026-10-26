/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ay_3;
import celestial.rBW;
import celestial.rBk_1;
import celestial.rOH;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhd_3;
import celestial.rpm_3;
import java.util.EnumSet;

public class rPU
extends rBk_1 {
    private final rOH id_class;
    private rhd_3 id_break;
    private final rYB id_byte;
    private final float id_protected;
    private int id_throws;
    private final ay_3 id_case;

    @Override
    public void id_byte() {
        this.id_class.id_this(true);
        this.id_throws = 40 + this.id_class.Sa().nextInt(40);
    }

    public rPU(rOH rOH2, float f) {
        this.id_class = rOH2;
        this.id_byte = (rYB)rOH2.id_throws[7];
        this.id_protected = f;
        this.id_case = new ay_3().id_class(f).id_class().id_break().id_protected();
        this.id_class(EnumSet.of(rBW.LOOK));
    }

    private boolean id_class(rhd_3 rhd_32) {
        for (rpm_3 rpm_32 : rpm_3.values()) {
            rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
            if (this.id_class.sZ() && rdn_32.id_break() == rdy_3.XR) {
                return true;
            }
            if (!this.id_class.id_extends(rdn_32)) continue;
            return true;
        }
        return false;
    }

    @Override
    public boolean id_class() {
        this.id_break = this.id_byte.id_class(this.id_case, this.id_class);
        return this.id_break == null ? false : this.id_class(this.id_break);
    }

    @Override
    public boolean id_break() {
        if (!this.id_break.BM()) {
            return false;
        }
        if (this.id_class.id_int(this.id_break) > (double)(this.id_protected * this.id_protected)) {
            return false;
        }
        return this.id_throws > 0 && this.id_class(this.id_break);
    }

    @Override
    public void id_throws() {
        this.id_class.id_continue().id_class(this.id_break.rx(), this.id_break.rH(), this.id_break.BO(), 10.0f, this.id_class.r());
        --this.id_throws;
    }

    @Override
    public void id_protected() {
        this.id_class.id_this(false);
        this.id_break = null;
    }
}

