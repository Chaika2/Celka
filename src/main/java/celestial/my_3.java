/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LC;
import celestial.LF;
import celestial.Ml_1;
import celestial.cN_2;
import celestial.cv_3;
import celestial.mp_3;
import celestial.rgP_2;
import celestial.rgS_2;
import celestial.rgn_3;
import celestial.vm_3;

public class my_3
extends vm_3 {
    private final vm_3 id_throws;
    protected final mp_3 id_class;
    private final rgP_2 id_case;
    private final boolean id_catch;
    private cv_3 id_private = cv_3.id_class;
    private LC id_implements;

    public my_3(vm_3 vm_32, mp_3 mp_32, rgP_2 rgP_22, rgP_2 rgP_23, boolean bl) {
        super(rgP_22);
        this.id_throws = vm_32;
        this.id_class = mp_32;
        this.id_case = rgP_23;
        this.id_catch = bl;
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        if (n == 256) {
            this.id_volatile.id_break(this.id_throws);
            return true;
        }
        return super.id_class(n, n2, n3);
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        my_3.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, 50, 0xFFFFFF);
        this.id_private.id_class(ml_1, this.id_package / 2, 70);
        super.id_class(ml_1, n, n2, f);
    }

    @Override
    public boolean E_() {
        return false;
    }

    @Override
    protected void v_() {
        super.v_();
        this.id_private = cv_3.id_class(this.id_super, (rgS_2)this.id_case, this.id_package - 50);
        int n = (this.id_private.id_class() + 1) * 9;
        this.id_class(new LF(this.id_package / 2 - 155, 100 + n, 150, 20, new rgn_3("selectWorld.backupJoinConfirmButton"), lF -> this.id_class.proceed(true, this.id_implements.id_private())));
        this.id_class(new LF(this.id_package / 2 - 155 + 160, 100 + n, 150, 20, new rgn_3("selectWorld.backupJoinSkipButton"), lF -> this.id_class.proceed(false, this.id_implements.id_private())));
        this.id_class(new LF(this.id_package / 2 - 155 + 80, 124 + n, 150, 20, cN_2.id_protected, lF -> this.id_volatile.id_break(this.id_throws)));
        this.id_implements = new LC(this.id_package / 2 - 155 + 80, 76 + n, 150, 20, new rgn_3("selectWorld.backupEraseCache"), false);
        if (this.id_catch) {
            this.id_class(this.id_implements);
        }
    }
}

