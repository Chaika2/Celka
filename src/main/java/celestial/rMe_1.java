/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rBl_1;
import celestial.rMK;

public class rMe_1
extends rBl_1 {
    public final /* synthetic */ rMK id_break;

    public rMe_1(rMK rMK2) {
        this.id_break = rMK2;
        super(rMK2, 1.25, true);
    }

    @Override
    protected double id_class(iB_2 iB_22) {
        return 4.0f + iB_22.PN();
    }

    @Override
    protected void id_class(iB_2 iB_22, double d) {
        double d2 = this.id_class(iB_22);
        if (d <= d2 && this.id_private()) {
            this.id_catch();
            this.id_class.id_public(iB_22);
            this.id_break.id_this(false);
        } else if (d <= d2 * 2.0) {
            if (this.id_private()) {
                this.id_break.id_this(false);
                this.id_catch();
            }
            if (this.id_finally() <= 10) {
                this.id_break.id_this(true);
                this.id_break.n();
            }
        } else {
            this.id_catch();
            this.id_break.id_this(false);
        }
    }

    @Override
    public void id_protected() {
        this.id_break.id_this(false);
        super.id_protected();
    }
}

