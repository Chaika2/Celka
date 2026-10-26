/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Ml_1;
import celestial.gm_3;
import celestial.rgN_2;
import celestial.rgP_2;
import celestial.rgn_3;
import celestial.rpC_2;
import celestial.rrbT_2;
import celestial.rrbt_3;
import celestial.vm_3;

public class vY_2
extends vm_3
implements rpC_2 {
    private rgP_2 id_class;
    private rgP_2 id_throws;
    private int id_case;
    private boolean id_catch;
    private final rrbT_2 id_private = rrbt_3.id_class();

    @Override
    public void id_byte(rgP_2 rgP_22) {
        this.id_class = rgP_22;
        this.id_protected(new rgn_3("progress.working"));
    }

    public vY_2() {
        super(rgN_2.id_byte);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        if (this.id_catch) {
            this.id_volatile.id_break((vm_3)null);
        } else {
            if (this.id_private != null && (gm_3)this.id_volatile.id_class[56] == null) {
                this.id_private.id_class(this.id_package, this.id_int);
            } else {
                this.id_class(ml_1);
            }
            if (this.id_case > 0) {
                if (this.id_class != null) {
                    vY_2.id_class(ml_1, this.id_super, this.id_class, this.id_package / 2, 70, 0xFFFFFF);
                }
                if (this.id_throws != null && this.id_case != 0) {
                    vY_2.id_class(ml_1, this.id_super, (rgP_2)new rgN_2("").id_class(this.id_throws).id_break(" " + this.id_case + "%"), this.id_package / 2, 90, 0xFFFFFF);
                }
            }
            super.id_class(ml_1, n, n2, f);
        }
    }

    @Override
    public void id_break(int n) {
        this.id_case = n;
    }

    @Override
    public void id_break(rgP_2 rgP_22) {
        this.id_byte(rgP_22);
    }

    @Override
    public void id_finally() {
        this.id_catch = true;
    }

    @Override
    public void id_protected(rgP_2 rgP_22) {
        this.id_throws = rgP_22;
        this.id_break(0);
    }

    @Override
    public boolean E_() {
        return false;
    }
}

