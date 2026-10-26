/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.cr_3;
import celestial.rfU_2;
import celestial.rqA_2;
import celestial.rqL_2;

public class NO
extends cr_3 {
    private int id_class;
    private int id_package;

    @Override
    public void id_byte() {
        if (this.id_package < 0) {
            this.id_super();
        }
        this.id_package += this.id_class;
        this.id_throws = rfU_2.id_class((float)this.id_package / 40.0f, 0.0f, 1.0f);
    }

    public NO(rqA_2 rqA_22) {
        super(rqA_22, rqL_2.AMBIENT);
        this.id_finally = true;
        this.id_extends = 0;
        this.id_throws = 1.0f;
        this.id_final = true;
    }

    public void id_class() {
        this.id_package = Math.min(this.id_package, 40);
        this.id_class = -1;
    }

    public void id_break() {
        this.id_package = Math.max(0, this.id_package);
        this.id_class = 1;
    }
}

