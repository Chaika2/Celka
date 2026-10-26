/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ak_1;
import celestial.Aq_1;
import celestial.LF;
import celestial.Ml_1;
import celestial.cv_3;
import celestial.mt_3;
import celestial.rgP_2;
import celestial.rgS_2;
import celestial.rgn_3;
import celestial.rrFD;
import celestial.rrFK;
import celestial.rrfp_3;
import celestial.rrfq_3;
import celestial.rrvL;
import celestial.vm_3;

public class ZG
extends vm_3 {
    private final rgP_2 id_class;
    private cv_3 id_throws = cv_3.id_class;
    private final vm_3 id_case;
    private int id_catch;

    public ZG(vm_3 vm_32, rgP_2 rgP_22, rgP_2 rgP_23) {
        super(rgP_22);
        this.id_case = vm_32;
        this.id_class = rgP_23;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        ZG.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, this.id_int / 2 - this.id_catch / 2 - 18, 0xAAAAAA);
        this.id_throws.id_class(ml_1, this.id_package / 2, this.id_int / 2 - this.id_catch / 2);
        super.id_class(ml_1, n, n2, f);
    }

    private void id_finally() {
        if ((Ak_1)rrfp_3.id_class[0] != null) {
            this.id_volatile.id_break(new mt_3(new rrvL(), id_import, (Ak_1)rrfp_3.id_class[0]));
        }
    }

    @Override
    public boolean E_() {
        return false;
    }

    @Override
    protected void v_() {
        super.v_();
        this.id_throws = cv_3.id_class(this.id_super, (rgS_2)this.id_class, this.id_package - 50);
        this.id_catch = this.id_throws.id_class() * 9;
        int n = Math.min(this.id_int / 2 + this.id_catch / 2 + 9, this.id_int - 30);
        this.id_class(new LF(this.id_package / 2 - 100, n, 200, 20, new rgn_3("gui.toMenu"), lF -> this.id_volatile.id_break(this.id_case)));
        if (!this.id_volatile.id_switch() && (rrfq_3)((Object)rrfp_3.id_class[1]) != null) {
            this.id_class(new LF(this.id_package / 2 - 100, n + 25, 200, 20, new rgn_3("menu.reconnect"), lF -> this.id_finally()));
        }
        Aq_1 aq_1 = id_import.id_void();
        rrFK.id_class((rrFD)((Object)rrFD.staticFields1658baa549203f63991cdcef51acf497[1]), this.id_class, aq_1 == null ? null : aq_1.id_class());
    }
}

