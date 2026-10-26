/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.Ml_1;
import celestial.cv_3;
import celestial.rgS_2;
import celestial.rgn_3;
import celestial.vm_3;

public class ZB
extends vm_3 {
    private cv_3 id_class = cv_3.id_class;
    private final Runnable id_throws;

    public ZB(Runnable runnable) {
        super(new rgn_3("datapackFailure.title"));
        this.id_throws = runnable;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        this.id_class.id_class(ml_1, this.id_package / 2, 70);
        super.id_class(ml_1, n, n2, f);
    }

    @Override
    public boolean E_() {
        return false;
    }

    @Override
    protected void v_() {
        super.v_();
        this.id_class = cv_3.id_class(this.id_super, (rgS_2)this.id_new(), this.id_package - 50);
        this.id_class(new LF(this.id_package / 2 - 155, this.id_int / 6 + 96, 150, 20, new rgn_3("datapackFailure.safeMode"), lF -> this.id_throws.run()));
        this.id_class(new LF(this.id_package / 2 - 155 + 160, this.id_int / 6 + 96, 150, 20, new rgn_3("gui.toTitle"), lF -> this.id_volatile.id_break((vm_3)null)));
    }
}

