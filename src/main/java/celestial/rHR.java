/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.gV_2;
import celestial.gy_3;
import celestial.kv_3;
import celestial.rHY;
import celestial.rHo_1;
import celestial.rJZ;
import celestial.rJr_1;
import celestial.rJv_1;
import celestial.rXc_1;
import celestial.rXu_1;
import celestial.rcd_3;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfU_2;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rhz_3;
import celestial.rjK_2;
import celestial.rjU_2;
import celestial.rkZ_2;
import celestial.rpF_2;
import celestial.rrEm_1;
import celestial.ryO_2;
import celestial.ryW_2;
import celestial.xc_3;

public class rHR
extends ryO_2
implements rJZ,
rXc_1 {
    private final rXu_1 id_class = new rHY(this);
    private final rpF_2 id_break = new rHo_1(this);
    public rdn_3 id_byte = rdn_3.id_break;
    public int id_protected;
    private int id_throws;

    public rHR() {
        super(ryW_2.id_throw);
    }

    @Override
    public void id_class(xc_3 xc_32, rcd_3 rcd_32) {
        super.id_class(xc_32, rcd_32);
        this.id_byte = rcd_32.id_byte("Book", 10) ? this.id_break(rdn_3.id_class(rcd_32.id_int("Book")), (rhd_3)null) : rdn_3.id_break;
        this.id_throws = rkZ_2.id_catch(this.id_byte);
        this.id_protected = rfU_2.id_class(rcd_32.id_private("Page"), 0, this.id_throws - 1);
    }

    public void id_class(rdn_3 rdn_32, rhd_3 rhd_32) {
        this.id_byte = this.id_break(rdn_32, rhd_32);
        this.id_protected = 0;
        this.id_throws = rkZ_2.id_catch(this.id_byte);
        this.id_break();
    }

    public void id_class(int n) {
        int n2 = rfU_2.id_class(n, 0, this.id_throws - 1);
        if (n2 != this.id_protected) {
            this.id_protected = n2;
            this.id_break();
            kv_3.id_class(this.id_while(), this.id_char(), this.id_abstract());
        }
    }

    private gy_3 id_class(rhd_3 rhd_32) {
        rgP_2 rgP_22;
        String string;
        if (rhd_32 == null) {
            string = "Lectern";
            rgP_22 = new rgN_2("Lectern");
        } else {
            string = rhd_32.g().getString();
            rgP_22 = rhd_32.L_();
        }
        rjU_2 rjU_22 = rjU_2.id_class(this.id_native);
        return new gy_3(gV_2.id_byte, rjU_22, rjK_2.id_class, (rrEm_1)this.id_extends, 2, string, rgP_22, this.id_extends.id_const(), rhd_32);
    }

    public void id_class(rdn_3 rdn_32) {
        this.id_class(rdn_32, (rhd_3)null);
    }

    @Override
    public rcd_3 id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        if (!this.id_throws().id_class()) {
            rcd_32.id_class("Book", this.id_throws().id_break(new rcd_3()));
            rcd_32.id_break("Page", this.id_protected);
        }
        return rcd_32;
    }

    private rdn_3 id_break(rdn_3 rdn_32, rhd_3 rhd_32) {
        if (this.id_extends instanceof rrEm_1 && rdn_32.id_break() == rdy_3.dr) {
            rkZ_2.id_class(rdn_32, this.id_class(rhd_32), rhd_32);
        }
        return rdn_32;
    }

    public rdn_3 id_throws() {
        return this.id_byte;
    }

    public int id_finally() {
        float f = this.id_throws > 1 ? (float)this.id_private() / ((float)this.id_throws - 1.0f) : 1.0f;
        return rfU_2.id_protected(f * 14.0f) + (this.id_catch() ? 1 : 0);
    }

    public boolean id_catch() {
        rdb_3 rdb_32 = this.id_byte.id_break();
        return rdb_32 == rdy_3.xi || rdb_32 == rdy_3.dr;
    }

    public void id_extends() {
        this.id_protected = 0;
        this.id_throws = 0;
        kv_3.id_class(this.id_while(), this.id_char(), this.id_abstract(), false);
    }

    @Override
    public void id_public() {
        this.id_class(rdn_3.id_break);
    }

    public int id_private() {
        return this.id_protected;
    }

    @Override
    public boolean ac_() {
        return true;
    }

    @Override
    public rgP_2 L_() {
        return new rgn_3("container.lectern");
    }

    @Override
    public rJr_1 createMenu(int n, rhz_3 rhz_32, rhd_3 rhd_32) {
        return new rJv_1(n, this.id_class, this.id_break);
    }
}

