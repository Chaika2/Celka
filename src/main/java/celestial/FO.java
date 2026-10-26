/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aq_1;
import celestial.FG;
import celestial.Lu_1;
import celestial.Ml_1;
import celestial.QY;
import celestial.Qj_1;
import celestial.cb_3;
import celestial.rJY;
import celestial.rJf_1;
import celestial.rJr_1;
import celestial.rZz_1;
import celestial.rdn_3;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rhx_3;
import celestial.rhz_3;
import celestial.rqO_2;
import celestial.rrvs_1;
import celestial.vs_3;
import com.mojang.blaze3d.systems.RenderSystem;

public class FO
extends FG<rJf_1>
implements rrvs_1 {
    private static final rqO_2 id_class = new rqO_2("textures/gui/container/anvil.png");
    private static final rgP_2 id_throws = new rgn_3("container.repair.expensive");
    private Lu_1 id_case;

    public FO(rJf_1 rJf_12, rhz_3 rhz_32, rgP_2 rgP_22) {
        super(rJf_12, rhz_32, rgP_22, id_class);
        this.id_public = 60;
    }

    @Override
    public void id_class(rJr_1 rJr_12, int n, rdn_3 rdn_32) {
        if (n == 0) {
            this.id_case.id_class(rdn_32.id_class() ? "" : rdn_32.id_continue().getString());
            this.id_case.id_case(!rdn_32.id_class());
            this.id_class(this.id_case);
        }
    }

    private void id_class(String string) {
        if (!string.isEmpty()) {
            String string2 = string;
            rJY rJY2 = ((rJf_1)this.id_instanceof).id_class(0);
            if (rJY2 != null && rJY2.id_break() && !rJY2.id_class().id_this() && string.equals(rJY2.id_class().id_continue().getString())) {
                string2 = "";
            }
            ((rJf_1)this.id_instanceof).id_class(string2);
            ((Aq_1)((cb_3)this.id_volatile.id_class[57]).id_break[0]).id_class(new rZz_1(string2));
        }
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        if (n == 256) {
            ((cb_3)this.id_volatile.id_class[57]).id_strictfp();
        }
        return !this.id_case.id_class(n, n2, n3) && !this.id_case.id_volatile() ? super.id_class(n, n2, n3) : true;
    }

    @Override
    protected void id_class(Ml_1 ml_1, int n, int n2) {
        RenderSystem.disableBlend();
        super.id_class(ml_1, n, n2);
        int n3 = ((rJf_1)this.id_instanceof).id_break();
        if (n3 > 0) {
            rgP_2 rgP_22;
            int n4 = 8453920;
            if (n3 >= 40 && !((rhx_3)((cb_3)this.id_volatile.id_class[57]).id_implements[18]).id_protected) {
                rgP_22 = id_throws;
                n4 = 0xFF6060;
            } else if (!((rJf_1)this.id_instanceof).id_class(2).id_break()) {
                rgP_22 = null;
            } else {
                rgP_22 = new rgn_3("container.repair.cost", n3);
                if (this.id_throw != null && !((rJf_1)this.id_instanceof).id_class(2).id_class(this.id_throw.id_throws)) {
                    n4 = 0xFF6060;
                }
            }
            if (rgP_22 != null) {
                int n5 = this.id_synchronized - 8 - this.id_super.id_class(rgP_22) - 2;
                int n6 = 69;
                FO.id_class(ml_1, n5 - 2, 67, this.id_synchronized - 8, 79, 0x4F000000);
                this.id_super.id_break(ml_1, rgP_22, (float)n5, 69.0f, n4);
            }
        }
    }

    @Override
    public void id_class(QY qY, int n, int n2) {
        String string = this.id_case.id_private();
        this.id_break(qY, n, n2);
        this.id_case.id_class(string);
    }

    @Override
    public void id_break(Ml_1 ml_1, int n, int n2, float f) {
        this.id_case.id_class(ml_1, n, n2, f);
    }

    @Override
    public void id_private() {
        super.id_private();
        this.id_case.id_catch();
    }

    @Override
    protected void id_native() {
        ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
        int n = (this.id_package - this.id_synchronized) / 2;
        int n2 = (this.id_int - this.id_return) / 2;
        this.id_case = new Lu_1(this.id_super, n + 62, n2 + 24, 103, 12, null, new rgn_3("container.repair"), false);
        this.id_case.id_catch(false);
        this.id_case.id_finally(-1);
        this.id_case.id_extends(-1);
        this.id_case.id_protected(false);
        this.id_case.id_implements(35);
        this.id_case.id_class(this::id_class);
        this.id_native.add(this.id_case);
        this.id_break(this.id_case);
        vs_3.INSTANCE.id_class(this);
    }

    @Override
    public boolean aO_() {
        return this.id_case.id_volatile();
    }

    @Override
    public void w_() {
        super.w_();
        ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
    }
}

