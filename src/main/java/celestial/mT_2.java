/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.booleans.BooleanConsumer
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
import it.unimi.dsi.fastutil.booleans.BooleanConsumer;

public class mT_2
extends vm_3 {
    private final rgP_2 id_catch;
    private cv_3 id_private = cv_3.id_class;
    protected rgP_2 id_class;
    protected rgP_2 id_throws;
    private int id_implements;
    protected final BooleanConsumer id_case;

    public mT_2(BooleanConsumer booleanConsumer, rgP_2 rgP_22, rgP_2 rgP_23) {
        this(booleanConsumer, rgP_22, rgP_23, cN_2.id_throws, cN_2.id_case);
    }

    public mT_2(BooleanConsumer booleanConsumer, rgP_2 rgP_22, rgP_2 rgP_23, rgP_2 rgP_24, rgP_2 rgP_25) {
        super(rgP_22);
        this.id_case = booleanConsumer;
        this.id_catch = rgP_23;
        this.id_class = rgP_24;
        this.id_throws = rgP_25;
    }

    @Override
    public void id_class(Ml_1 ml_1, int n, int n2, float f) {
        this.id_class(ml_1);
        mT_2.id_class(ml_1, this.id_super, this.id_extends, this.id_package / 2, 70, 0xFFFFFF);
        this.id_private.id_class(ml_1, this.id_package / 2, 90);
        super.id_class(ml_1, n, n2, f);
    }

    @Override
    public boolean id_class(int n, int n2, int n3) {
        if (n == 256) {
            this.id_case.accept(false);
            return true;
        }
        return super.id_class(n, n2, n3);
    }

    public void id_break(int n) {
        this.id_implements = n;
        for (LZ lZ : this.id_new) {
            lZ.id_int = false;
        }
    }

    @Override
    public void id_private() {
        super.id_private();
        if (--this.id_implements == 0) {
            for (LZ lZ : this.id_new) {
                lZ.id_int = true;
            }
        }
    }

    @Override
    public String D_() {
        return super.D_() + ". " + this.id_catch.getString();
    }

    @Override
    public boolean E_() {
        return false;
    }

    @Override
    protected void v_() {
        super.v_();
        this.id_class(new LF(this.id_package / 2 - 155, this.id_int / 6 + 96, 150, 20, this.id_class, lF -> this.id_case.accept(true)));
        this.id_class(new LF(this.id_package / 2 - 155 + 160, this.id_int / 6 + 96, 150, 20, this.id_throws, lF -> this.id_case.accept(false)));
        this.id_private = cv_3.id_class(this.id_super, (rgS_2)this.id_catch, this.id_package - 50);
    }
}

