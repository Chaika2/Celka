/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Aq_1;
import celestial.FP;
import celestial.LF;
import celestial.cb_3;
import celestial.cq_3;
import celestial.rgn_3;
import celestial.rmD_2;
import celestial.rmU_2;

public class vy_3
extends FP {
    public vy_3() {
        super("");
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        if (n == 256) {
            this.id_native();
        } else if (n == 257 || n == 335) {
            String string = this.id_class.id_private().trim();
            if (!string.isEmpty()) {
                this.id_break(string);
            }
            this.id_class.id_class("");
            ((cq_3)this.id_volatile.id_class[19]).id_throws().id_throws();
            return true;
        }
        return super.id_class(n, n2, n3);
    }

    @Override
    public void id_volatile() {
        this.id_native();
    }

    private void id_native() {
        Aq_1 aq_1 = (Aq_1)((cb_3)this.id_volatile.id_class[57]).id_break[0];
        aq_1.id_class(new rmD_2((cb_3)this.id_volatile.id_class[57], rmU_2.STOP_SLEEPING));
    }

    @Override
    protected void v_() {
        super.v_();
        this.id_class(new LF(this.id_package / 2 - 100, this.id_int - 40, 200, 20, new rgn_3("multiplayer.stopSleeping"), lF -> this.id_native()));
    }
}

