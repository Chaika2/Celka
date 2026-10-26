/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rFy_1;
import celestial.rHF;
import celestial.rHm_1;
import celestial.rHv_1;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.ryO_2;
import celestial.ryW_2;
import celestial.xK_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;

public class rHZ
extends ryO_2 {
    private boolean id_class;
    private boolean id_break;
    private boolean id_byte;
    private boolean id_protected;
    private final rHm_1 id_throws = new rHv_1(this);

    public void id_byte(boolean bl) {
        this.id_protected = bl;
    }

    @Override
    public void id_int() {
        this.id_float();
        super.id_int();
    }

    public rHZ() {
        super(ryW_2.id_synchronized);
    }

    @Override
    public void id_class(xc_3 xc_32, rcd_3 rcd_32) {
        super.id_class(xc_32, rcd_32);
        this.id_throws.id_break(rcd_32);
        this.id_class = rcd_32.id_new("powered");
        this.id_byte = rcd_32.id_new("conditionMet");
        this.id_break(rcd_32.id_new("auto"));
    }

    @Override
    public rcd_3 id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        this.id_throws.id_class(rcd_32);
        rcd_32.id_class("powered", this.id_catch());
        rcd_32.id_class("conditionMet", this.id_extends());
        rcd_32.id_class("auto", this.id_private());
        return rcd_32;
    }

    public void id_class(boolean bl) {
        this.id_class = bl;
    }

    public void id_break(boolean bl) {
        boolean bl2 = this.id_break;
        this.id_break = bl;
        if (!bl2 && bl && !this.id_class && this.id_extends != null && this.id_final() != rHF.SEQUENCE) {
            this.id_new();
        }
    }

    public rHm_1 id_throws() {
        return this.id_throws;
    }

    public void id_finally() {
        rHF rHF2 = this.id_final();
        if (rHF2 == rHF.AUTO && (this.id_class || this.id_break) && this.id_extends != null) {
            this.id_new();
        }
    }

    public boolean id_catch() {
        return this.id_class;
    }

    public boolean id_extends() {
        return this.id_byte;
    }

    private void id_new() {
        xd_3 xd_32 = this.id_abstract().id_break();
        if (xd_32 instanceof xK_2) {
            this.id_native();
            this.id_extends.id_finally().id_class(this.id_native, xd_32, 1);
        }
    }

    public boolean id_package() {
        xc_3 xc_32 = this.id_extends.id_byte(this.id_char());
        return xc_32.id_break() instanceof xK_2 ? xc_32.id_byte(xK_2.id_final) : false;
    }

    public boolean id_private() {
        return this.id_break;
    }

    public rHF id_final() {
        xc_3 xc_32 = this.id_abstract();
        if (xc_32.id_class(xu_3.SZ)) {
            return rHF.REDSTONE;
        }
        if (xc_32.id_class(xu_3.bI)) {
            return rHF.AUTO;
        }
        return xc_32.id_class(xu_3.bf) ? rHF.SEQUENCE : rHF.REDSTONE;
    }

    public boolean id_volatile() {
        return this.id_protected;
    }

    public boolean id_native() {
        this.id_byte = true;
        if (this.id_package()) {
            ryO_2 ryO_22;
            rfH_2 rfH_22 = this.id_native.id_break(this.id_extends.id_byte(this.id_native).id_byte(xK_2.id_volatile).id_case());
            this.id_byte = this.id_extends.id_byte(rfH_22).id_break() instanceof xK_2 ? (ryO_22 = this.id_extends.id_class(rfH_22)) instanceof rHZ && ((rHZ)ryO_22).id_throws().id_case() > 0 : false;
        }
        return this.id_byte;
    }

    @Override
    public boolean ac_() {
        return true;
    }

    @Override
    public rFy_1 Y_() {
        if (this.id_volatile()) {
            this.id_byte(false);
            rcd_3 rcd_32 = this.id_class(new rcd_3());
            return new rFy_1(this.id_native, 2, rcd_32);
        }
        return null;
    }
}

