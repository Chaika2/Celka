/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.an_3;
import celestial.iB_2;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rls_3;
import celestial.ryV_2;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xu_3;
import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;

public class ryR_2 {
    private final List<ryV_2> id_class = Lists.newArrayList();
    private final iB_2 id_break;
    private int id_byte;
    private int id_protected;
    private int id_throws;
    private boolean id_case;
    private boolean id_catch;
    private String id_private;

    public iB_2 id_byte() {
        iB_2 iB_22 = null;
        rhd_3 rhd_32 = null;
        float f = 0.0f;
        float f2 = 0.0f;
        for (ryV_2 ryV_22 : this.id_class) {
            if (ryV_22.id_class().id_extends() instanceof rhd_3 && (rhd_32 == null || ryV_22.id_break() > f2)) {
                f2 = ryV_22.id_break();
                rhd_32 = (rhd_3)ryV_22.id_class().id_extends();
            }
            if (!(ryV_22.id_class().id_extends() instanceof iB_2) || iB_22 != null && !(ryV_22.id_break() > f)) continue;
            f = ryV_22.id_break();
            iB_22 = (iB_2)ryV_22.id_class().id_extends();
        }
        return rhd_32 != null && f2 >= f / 3.0f ? rhd_32 : iB_22;
    }

    public ryR_2(iB_2 iB_22) {
        this.id_break = iB_22;
    }

    private String id_class(ryV_2 ryV_22) {
        return ryV_22.id_protected() == null ? "generic" : ryV_22.id_protected();
    }

    public void id_class(rye_3 rye_32, float f, float f2) {
        this.id_throws();
        this.id_class();
        ryV_2 ryV_22 = new ryV_2(rye_32, (Integer)this.id_break.id_throws[41], f, f2, this.id_private, ((Float)this.id_break.id_throws[31]).floatValue());
        this.id_class.add(ryV_22);
        this.id_byte = (Integer)this.id_break.id_throws[41];
        this.id_catch = true;
        if (ryV_22.id_byte() && !this.id_case && this.id_break.BM()) {
            this.id_case = true;
            this.id_throws = this.id_protected = ((Integer)this.id_break.id_throws[41]).intValue();
            this.id_break.Sj();
        }
    }

    public void id_class() {
        this.id_private();
        Optional<rfH_2> optional = this.id_break.SP();
        if (optional.isPresent()) {
            xc_3 xc_32 = ((rYB)this.id_break.id_throws[7]).id_byte(optional.get());
            this.id_private = !xc_32.id_class(xu_3.PJ) && !xc_32.id_class(rls_3.id_static) ? (xc_32.id_class(xu_3.BD) ? "vines" : (!xc_32.id_class(xu_3.XC) && !xc_32.id_class(xu_3.Xl) ? (!xc_32.id_class(xu_3.XH) && !xc_32.id_class(xu_3.Xy) ? (xc_32.id_class(xu_3.hU) ? "scaffolding" : "other_climbable") : "twisting_vines") : "weeping_vines")) : "ladder";
        } else if (this.id_break.rT()) {
            this.id_private = "water";
        }
    }

    public rgP_2 id_break() {
        rgP_2 rgP_22;
        if (this.id_class.isEmpty()) {
            return new rgn_3("death.attack.generic", this.id_break.L_());
        }
        ryV_2 ryV_22 = this.id_catch();
        ryV_2 ryV_23 = this.id_class.get(this.id_class.size() - 1);
        rgP_2 rgP_23 = ryV_23.id_throws();
        an_3 an_32 = ryV_23.id_class().id_extends();
        if (ryV_22 != null && ryV_23.id_class() == rye_3.id_extends) {
            rgP_2 rgP_24 = ryV_22.id_throws();
            if (ryV_22.id_class() != rye_3.id_extends && ryV_22.id_class() != rye_3.id_volatile) {
                if (!(rgP_24 == null || rgP_23 != null && rgP_24.equals(rgP_23))) {
                    rdn_3 rdn_32;
                    an_3 an_33 = ryV_22.id_class().id_extends();
                    rdn_3 rdn_33 = rdn_32 = an_33 instanceof iB_2 ? ((iB_2)an_33).ss() : rdn_3.id_break;
                    rgP_22 = !rdn_32.id_class() && rdn_32.id_this() ? new rgn_3("death.fell.assist.item", this.id_break.L_(), rgP_24, rdn_32.id_throw()) : new rgn_3("death.fell.assist", this.id_break.L_(), rgP_24);
                } else if (rgP_23 != null) {
                    rdn_3 rdn_34;
                    rdn_3 rdn_35 = rdn_34 = an_32 instanceof iB_2 ? ((iB_2)an_32).ss() : rdn_3.id_break;
                    rgP_22 = !rdn_34.id_class() && rdn_34.id_this() ? new rgn_3("death.fell.finish.item", this.id_break.L_(), rgP_23, rdn_34.id_throw()) : new rgn_3("death.fell.finish", this.id_break.L_(), rgP_23);
                } else {
                    rgP_22 = new rgn_3("death.fell.killer", this.id_break.L_());
                }
            } else {
                rgP_22 = new rgn_3("death.fell.accident." + this.id_class(ryV_22), this.id_break.L_());
            }
        } else {
            rgP_22 = ryV_23.id_class().id_class(this.id_break);
        }
        return rgP_22;
    }

    public void id_throws() {
        int n;
        int n2 = n = this.id_case ? 300 : 100;
        if (this.id_catch && (!this.id_break.BM() || (Integer)this.id_break.id_throws[41] - this.id_byte > n)) {
            boolean bl = this.id_case;
            this.id_catch = false;
            this.id_case = false;
            this.id_throws = (Integer)this.id_break.id_throws[41];
            if (bl) {
                this.id_break.sh();
            }
            this.id_class.clear();
        }
    }

    private ryV_2 id_catch() {
        ryV_2 ryV_22 = null;
        ryV_2 ryV_23 = null;
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < this.id_class.size(); ++i) {
            ryV_2 ryV_24;
            ryV_2 ryV_25 = this.id_class.get(i);
            ryV_2 ryV_26 = ryV_24 = i > 0 ? this.id_class.get(i - 1) : null;
            if ((ryV_25.id_class() == rye_3.id_extends || ryV_25.id_class() == rye_3.id_volatile) && ryV_25.id_case() > 0.0f && (ryV_22 == null || ryV_25.id_case() > f2)) {
                ryV_22 = i > 0 ? ryV_24 : ryV_25;
                f2 = ryV_25.id_case();
            }
            if (ryV_25.id_protected() == null || ryV_23 != null && !(ryV_25.id_break() > f)) continue;
            ryV_23 = ryV_25;
            f = ryV_25.id_break();
        }
        if (f2 > 5.0f && ryV_22 != null) {
            return ryV_22;
        }
        return f > 5.0f && ryV_23 != null ? ryV_23 : null;
    }

    public iB_2 id_case() {
        return this.id_break;
    }

    public int id_protected() {
        return this.id_case ? (Integer)this.id_break.id_throws[41] - this.id_protected : this.id_throws - this.id_protected;
    }

    private void id_private() {
        this.id_private = null;
    }
}

