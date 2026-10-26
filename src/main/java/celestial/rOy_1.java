/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rOH;
import celestial.rPD;
import celestial.rhP_2;

public class rOy_1<T extends iB_2>
extends rPD<T> {
    private final rOH id_finally;
    public final /* synthetic */ rOH id_implements;

    @Override
    public void id_byte() {
        this.id_implements.id_byte((iB_2)null);
        super.id_byte();
    }

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public rOy_1(rOH rOH2, rOH rOH3, Class clazz, float f, double d, double d2) {
        this.id_implements = rOH2;
        super(rOH3, clazz, f, d, d2);
        this.id_finally = rOH3;
    }

    private boolean id_class(rhP_2 rhP_22) {
        return rhP_22.sD() >= rOH.id_class(this.id_implements).nextInt(5);
    }

    @Override
    public boolean id_class() {
        if (super.id_class() && this.id_break instanceof rhP_2) {
            return !this.id_finally.sZ() && this.id_class((rhP_2)this.id_break);
        }
        return false;
    }

    @Override
    public void id_throws() {
        this.id_implements.id_byte((iB_2)null);
        super.id_throws();
    }
}

