/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package celestial;

import celestial.Oo_1;
import celestial.kW_2;
import celestial.rJT;
import celestial.rJZ;
import celestial.rRg_1;
import celestial.rRl_1;
import celestial.rYB;
import celestial.rZM;
import celestial.rdH_2;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhN_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.rvY_2;
import celestial.rvg_3;
import celestial.rvj_3;
import celestial.ryO_2;
import celestial.ryZ_2;
import celestial.rym_3;
import celestial.xK_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.zx_3;
import java.util.Objects;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rni_3 {
    private static final Logger id_byte = LogManager.getLogger();
    public rrEm_1 id_class;
    public rhN_2 id_break;
    private rRl_1 id_protected = rRl_1.NOT_SET;
    private rRl_1 id_throws = rRl_1.NOT_SET;
    private boolean id_case;
    private int id_catch;
    private rfH_2 id_private = rfH_2.id_protected;
    private int id_implements;
    private boolean id_finally;
    private rfH_2 id_extends = rfH_2.id_protected;
    private int id_native;
    private int id_volatile = -1;

    public rRl_1 id_byte() {
        return this.id_throws;
    }

    public rni_3(rrEm_1 rrEm_12) {
        this.id_class = rrEm_12;
    }

    public boolean id_class(rfH_2 rfH_22) {
        xc_3 xc_32 = this.id_class.id_byte(rfH_22);
        if (!this.id_break.ss().id_break().id_class(xc_32, (rYB)this.id_class, rfH_22, this.id_break)) {
            return false;
        }
        ryO_2 ryO_22 = this.id_class.id_class(rfH_22);
        xd_3 xd_32 = xc_32.id_break();
        if ((xd_32 instanceof xK_2 || xd_32 instanceof zx_3 || xd_32 instanceof kW_2) && !this.id_break.sU()) {
            this.id_class.id_class(rfH_22, xc_32, xc_32, 3);
            return false;
        }
        if (this.id_break.id_class((rYB)this.id_class, rfH_22, this.id_protected)) {
            return false;
        }
        xd_32.id_class((rYB)this.id_class, rfH_22, xc_32, (rhd_3)this.id_break);
        boolean bl = this.id_class.id_class(rfH_22, false);
        if (bl) {
            xd_32.id_class((rRg_1)this.id_class, rfH_22, xc_32);
        }
        if (this.id_throws()) {
            return true;
        }
        rdn_3 rdn_32 = this.id_break.ss();
        rdn_3 rdn_33 = rdn_32.id_implements();
        boolean bl2 = this.id_break.id_byte(xc_32);
        rdn_32.id_class((rYB)this.id_class, xc_32, rfH_22, this.id_break);
        if (bl && bl2) {
            xd_32.id_class(this.id_class, this.id_break, rfH_22, xc_32, ryO_22, rdn_33);
        }
        return true;
    }

    public void id_class(rfH_2 rfH_22, rZM rZM2, String string) {
        if (this.id_class(rfH_22)) {
            this.id_break.id_class.id_class(new rvj_3(rfH_22, this.id_class.id_byte(rfH_22), rZM2, true, string));
        } else {
            this.id_break.id_class.id_class(new rvj_3(rfH_22, this.id_class.id_byte(rfH_22), rZM2, false, string));
        }
    }

    public void id_class() {
        ++this.id_implements;
        if (this.id_finally) {
            xc_3 xc_32 = this.id_class.id_byte(this.id_extends);
            if (xc_32.id_catch()) {
                this.id_finally = false;
            } else {
                float f = this.id_class(xc_32, this.id_extends, this.id_native);
                if (f >= 1.0f) {
                    this.id_finally = false;
                    this.id_class(this.id_extends);
                }
            }
        } else if (this.id_case) {
            xc_3 xc_33 = this.id_class.id_byte(this.id_private);
            if (xc_33.id_catch()) {
                this.id_class.id_class(this.id_break.V(), this.id_private, -1);
                this.id_volatile = -1;
                this.id_case = false;
            } else {
                this.id_class(xc_33, this.id_private, this.id_catch);
            }
        }
    }

    private float id_class(xc_3 xc_32, rfH_2 rfH_22, int n) {
        int n2 = this.id_implements - n;
        float f = xc_32.id_class(this.id_break, (rYB)this.id_break.id_throws[7], rfH_22) * (float)(n2 + 1);
        int n3 = (int)(f * 10.0f);
        if (n3 != this.id_volatile) {
            this.id_class.id_class(this.id_break.V(), rfH_22, n3);
            this.id_volatile = n3;
        }
        return f;
    }

    public ryZ_2 id_class(rhN_2 rhN_22, rYB rYB2, rdn_3 rdn_32, rpm_3 rpm_32) {
        if (this.id_protected == rRl_1.SPECTATOR) {
            return ryZ_2.PASS;
        }
        if (rhN_22.sK().id_class(rdn_32.id_break())) {
            return ryZ_2.PASS;
        }
        int n = rdn_32.id_char();
        int n2 = rdn_32.id_catch();
        rym_3<rdn_3> rym_32 = rdn_32.id_class(rYB2, (rhd_3)rhN_22, rpm_32);
        rdn_3 rdn_33 = rym_32.id_break();
        if (rdn_33 == rdn_32 && rdn_33.id_char() == n && rdn_33.id_extends() <= 0 && rdn_33.id_catch() == n2) {
            return rym_32.id_class();
        }
        if (rym_32.id_class() == ryZ_2.FAIL && rdn_33.id_extends() > 0 && !rhN_22.id_return()) {
            return rym_32.id_class();
        }
        rhN_22.id_class(rpm_32, rdn_33);
        if (this.id_throws()) {
            rdn_33.id_throws(n);
            if (rdn_33.id_throws() && rdn_33.id_catch() != n2) {
                rdn_33.id_break(n2);
            }
        }
        if (rdn_33.id_class()) {
            rhN_22.id_class(rpm_32, rdn_3.id_break);
        }
        if (!rhN_22.id_return()) {
            rhN_22.id_class((rJT)rhN_22.id_implements[3]);
        }
        return rym_32.id_class();
    }

    public ryZ_2 id_class(rhN_2 rhN_22, rYB rYB2, rdn_3 rdn_32, rpm_3 rpm_32, rff_3 rff_32) {
        Object object;
        rfH_2 rfH_22 = rff_32.id_class();
        xc_3 xc_32 = rYB2.id_byte(rfH_22);
        if (this.id_protected == rRl_1.SPECTATOR) {
            rJZ rJZ2 = xc_32.id_break(rYB2, rfH_22);
            if (rJZ2 != null) {
                rhN_22.id_class(rJZ2);
                return ryZ_2.SUCCESS;
            }
            return ryZ_2.PASS;
        }
        boolean bl = !rhN_22.ss().id_class() || !rhN_22.Sn().id_class();
        boolean bl2 = rhN_22.sN() && bl;
        rdn_3 rdn_33 = rdn_32.id_implements();
        if (!bl2 && (object = xc_32.id_class(rYB2, rhN_22, rpm_32, rff_32)).id_class()) {
            Oo_1.id_default.id_class(rhN_22, rfH_22, rdn_33);
            return object;
        }
        if (!rdn_32.id_class() && !rhN_22.sK().id_class(rdn_32.id_break())) {
            ryZ_2 ryZ_22;
            object = new rdH_2(rhN_22, rpm_32, rff_32);
            if (this.id_throws()) {
                int n = rdn_32.id_char();
                ryZ_22 = rdn_32.id_class((rdH_2)object);
                rdn_32.id_throws(n);
            } else {
                ryZ_22 = rdn_32.id_class((rdH_2)object);
            }
            if (ryZ_22.id_class()) {
                Oo_1.id_default.id_class(rhN_22, rfH_22, rdn_33);
            }
            return ryZ_22;
        }
        return ryZ_2.PASS;
    }

    public void id_class(rrEm_1 rrEm_12) {
        this.id_class = rrEm_12;
    }

    public void id_class(rRl_1 rRl_12, rRl_1 rRl_13) {
        this.id_throws = rRl_13;
        this.id_protected = rRl_12;
        rRl_12.id_class((rhx_3)this.id_break.id_implements[18]);
        this.id_break.G();
        this.id_break.id_break.x().id_class(new rvg_3(rvY_2.UPDATE_GAME_MODE, this.id_break));
        this.id_class.id_private();
    }

    public void id_class(rfH_2 rfH_22, rZM rZM2, rpr_3 rpr_32, int n) {
        double d;
        double d2;
        double d3 = this.id_break.rx() - ((double)rfH_22.b_() + 0.5);
        double d4 = d3 * d3 + (d2 = this.id_break.re() - ((double)rfH_22.c_() + 0.5) + 1.5) * d2 + (d = this.id_break.BO() - ((double)rfH_22.d_() + 0.5)) * d;
        if (d4 > 36.0) {
            this.id_break.id_class.id_class(new rvj_3(rfH_22, this.id_class.id_byte(rfH_22), rZM2, false, "too far"));
        } else if (rfH_22.c_() >= n) {
            this.id_break.id_class.id_class(new rvj_3(rfH_22, this.id_class.id_byte(rfH_22), rZM2, false, "too high"));
        } else if (rZM2 == rZM.START_DESTROY_BLOCK) {
            if (!this.id_class.id_class(this.id_break, rfH_22)) {
                this.id_break.id_class.id_class(new rvj_3(rfH_22, this.id_class.id_byte(rfH_22), rZM2, false, "may not interact"));
                return;
            }
            if (this.id_throws()) {
                this.id_class(rfH_22, rZM2, "creative destroy");
                return;
            }
            if (this.id_break.id_class((rYB)this.id_class, rfH_22, this.id_protected)) {
                this.id_break.id_class.id_class(new rvj_3(rfH_22, this.id_class.id_byte(rfH_22), rZM2, false, "block action restricted"));
                return;
            }
            this.id_catch = this.id_implements;
            float f = 1.0f;
            xc_3 xc_32 = this.id_class.id_byte(rfH_22);
            if (!xc_32.id_catch()) {
                xc_32.id_class((rYB)this.id_class, rfH_22, this.id_break);
                f = xc_32.id_class(this.id_break, (rYB)this.id_break.id_throws[7], rfH_22);
            }
            if (!xc_32.id_catch() && f >= 1.0f) {
                this.id_class(rfH_22, rZM2, "insta mine");
            } else {
                if (this.id_case) {
                    this.id_break.id_class.id_class(new rvj_3(this.id_private, this.id_class.id_byte(this.id_private), rZM.START_DESTROY_BLOCK, false, "abort destroying since another started (client insta mine, server disagreed)"));
                }
                this.id_case = true;
                this.id_private = rfH_22.id_int();
                int n2 = (int)(f * 10.0f);
                this.id_class.id_class(this.id_break.V(), rfH_22, n2);
                this.id_break.id_class.id_class(new rvj_3(rfH_22, this.id_class.id_byte(rfH_22), rZM2, true, "actual start of destroying"));
                this.id_volatile = n2;
            }
        } else if (rZM2 == rZM.STOP_DESTROY_BLOCK) {
            if (rfH_22.equals(this.id_private)) {
                int n3 = this.id_implements - this.id_catch;
                xc_3 xc_33 = this.id_class.id_byte(rfH_22);
                if (!xc_33.id_catch()) {
                    float f = xc_33.id_class(this.id_break, (rYB)this.id_break.id_throws[7], rfH_22) * (float)(n3 + 1);
                    if (f >= 0.7f) {
                        this.id_case = false;
                        this.id_class.id_class(this.id_break.V(), rfH_22, -1);
                        this.id_class(rfH_22, rZM2, "destroyed");
                        return;
                    }
                    if (!this.id_finally) {
                        this.id_case = false;
                        this.id_finally = true;
                        this.id_extends = rfH_22;
                        this.id_native = this.id_catch;
                    }
                }
            }
            this.id_break.id_class.id_class(new rvj_3(rfH_22, this.id_class.id_byte(rfH_22), rZM2, true, "stopped destroying"));
        } else if (rZM2 == rZM.ABORT_DESTROY_BLOCK) {
            this.id_case = false;
            if (!Objects.equals(this.id_private, rfH_22)) {
                id_byte.warn("Mismatch in destroy block pos: " + this.id_private + " " + rfH_22);
                this.id_class.id_class(this.id_break.V(), this.id_private, -1);
                this.id_break.id_class.id_class(new rvj_3(this.id_private, this.id_class.id_byte(this.id_private), rZM2, true, "aborted mismatched destroying"));
            }
            this.id_class.id_class(this.id_break.V(), rfH_22, -1);
            this.id_break.id_class.id_class(new rvj_3(rfH_22, this.id_class.id_byte(rfH_22), rZM2, true, "aborted destroying"));
        }
    }

    public void id_class(rRl_1 rRl_12) {
        this.id_class(rRl_12, rRl_12 != this.id_protected ? this.id_protected : this.id_throws);
    }

    public rRl_1 id_break() {
        return this.id_protected;
    }

    public void id_break(rRl_1 rRl_12) {
        if (this.id_protected == rRl_1.NOT_SET) {
            this.id_protected = rRl_12;
        }
        this.id_class(this.id_protected);
    }

    public boolean id_throws() {
        return this.id_protected.id_throws();
    }

    public boolean id_protected() {
        return this.id_protected.id_case();
    }
}

