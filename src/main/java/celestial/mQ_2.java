/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.LF;
import celestial.LZ;
import celestial.Ml_1;
import celestial.cN_2;
import celestial.cv_3;
import celestial.rgP_2;
import celestial.rgS_2;
import celestial.vm_3;

public class mQ_2
extends vm_3 {
    private final Runnable id_case;
    protected final rgP_2 id_class;
    private cv_3 id_catch = cv_3.id_class;
    protected final rgP_2 id_throws;
    private int id_private;

    public mQ_2(Runnable runnable, rgP_2 rgP_22, rgP_2 rgP_23) {
        this(runnable, rgP_22, rgP_23, cN_2.id_private);
    }

    public mQ_2(Runnable runnable, rgP_2 rgP_22, rgP_2 rgP_23, rgP_2 rgP_24) {
        super(rgP_22);
        this.id_case = runnable;
        this.id_class = rgP_23;
        this.id_throws = rgP_24;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        mQ_2.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, 70, 0xFFFFFF);
        this.id_catch.id_class(ml_1, this.id_package / 2, 90);
        super.id_class(ml_1, n, n2, f);
    }

    @Override
    public void id_private() {
        super.id_private();
        if (--this.id_private == 0) {
            for (LZ lZ : this.id_new) {
                lZ.id_int = true;
            }
        }
    }

    @Override
    protected void v_() {
        super.v_();
        this.id_class(new LF(this.id_package / 2 - 100, this.id_int / 6 + 168, 200, 20, this.id_throws, lF -> this.id_case.run()));
        this.id_catch = cv_3.id_class(this.id_super, (rgS_2)this.id_class, this.id_package - 50);
    }
}

