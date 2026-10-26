/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Iq_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.QY;
import celestial.cG_2;
import celestial.fN_2;
import celestial.ff_3;
import celestial.fk_3;
import celestial.rqO_2;
import celestial.rrJo_1;
import celestial.tW_2;
import java.awt.Dimension;

public class rrJR {
    private Dimension id_private = null;
    private boolean id_implements = false;
    private rrJo_1[] id_finally = new rrJo_1[0];
    private rqO_2 id_extends = null;
    private fN_2 id_native = null;
    private fk_3 id_volatile = null;
    private rqO_2 id_final = new rqO_2("textures/block/red_wool.png");
    public static final int id_class = 0;
    public static final int id_break = 1;
    public static final int id_byte = 2;
    public static final int id_protected = 3;
    public static final int id_throws = 4;
    public static final int id_case = 5;
    public static final int id_catch = 6;

    public rqO_2 id_byte() {
        return this.id_extends;
    }

    public rrJR(Dimension dimension, boolean bl, rrJo_1[] rrJo_1Array) {
        this.id_private = dimension;
        this.id_implements = bl;
        this.id_finally = rrJo_1Array;
    }

    public void id_class(rqO_2 rqO_22) {
        this.id_extends = rqO_22;
    }

    public void id_class(fN_2 fN_22) {
        this.id_native = fN_22;
    }

    public void id_class(tW_2 tW_22, cG_2 cG_22, Ml_1 ml_1, Hx_1 hx_1, int n, int n2) {
        rqO_2 rqO_22 = this.id_final;
        if (this.id_implements) {
            rqO_22 = cG_22.id_final();
        } else if (this.id_extends != null) {
            if (this.id_volatile == null && this.id_native != null) {
                this.id_volatile = new fk_3(this.id_native);
                QY.id_instanceof().A().id_class(this.id_extends, (ff_3)this.id_volatile);
            }
            rqO_22 = this.id_extends;
        } else {
            rqO_22 = this.id_final;
        }
        for (int i = 0; i < this.id_finally.length; ++i) {
            rrJo_1 rrJo_12 = this.id_finally[i];
            ml_1.id_class();
            HU hU = HU.id_protected(rqO_22);
            Ok_1 ok_1 = hx_1.getBuffer(hU);
            rrJo_12.id_class(tW_22, ml_1, ok_1, n, n2);
            ml_1.id_break();
        }
    }

    public static Iq_1 id_class(tW_2 tW_22, int n) {
        switch (n) {
            case 0: {
                return tW_22.id_byte;
            }
            case 1: {
                return tW_22.id_class;
            }
            case 2: {
                return tW_22.id_throws;
            }
            case 3: {
                return tW_22.id_protected;
            }
            case 4: {
                return tW_22.id_catch;
            }
            case 5: {
                return tW_22.id_case;
            }
        }
        return null;
    }

    public fN_2 id_class() {
        return this.id_native;
    }

    public fk_3 id_break() {
        return this.id_volatile;
    }

    public boolean id_protected() {
        return this.id_implements;
    }
}

