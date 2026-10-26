/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.QY;
import celestial.fH_2;
import celestial.fY_2;
import celestial.ff_3;
import celestial.rqO_2;
import celestial.rrdE;
import celestial.rrxa_3;
import java.io.Serializable;

public class rrxV_2
implements rrxa_3 {
    private int id_protected = -1;
    private rqO_2 id_throws;
    private int id_case = 0;
    private ff_3 id_catch;
    public static final int id_class = 0;
    public static final int id_break = 1;
    public static final int id_byte = 2;

    public void id_byte() {
        this.id_catch = null;
    }

    public rrxV_2(int n, rqO_2 rqO_22, int n2) {
        this.id_protected = n;
        this.id_throws = rqO_22;
        this.id_case = n2;
    }

    public String toString() {
        return "textureUnit: " + this.id_protected + ", location: " + this.id_throws + ", glTextureId: " + (Serializable)(this.id_catch != null ? Integer.valueOf(this.id_catch.id_new()) : "");
    }

    @Override
    public int id_class() {
        return this.id_protected;
    }

    public ff_3 id_break() {
        if (this.id_catch == null) {
            fY_2 fY_22 = QY.id_instanceof().A();
            this.id_catch = fY_22.id_break(this.id_throws);
            if (this.id_catch == null) {
                this.id_catch = new fH_2(this.id_throws);
                fY_22.id_class(this.id_throws, this.id_catch);
                this.id_catch = fY_22.id_break(this.id_throws);
            }
        }
        return this.id_catch;
    }

    @Override
    public void id_throws() {
    }

    @Override
    public int id_protected() {
        rrdE rrdE2;
        ff_3 ff_32 = this.id_break();
        if (this.id_case != 0 && ff_32 instanceof ff_3 && (rrdE2 = ff_32.id_implements) != null) {
            if (this.id_case == 1) {
                return rrdE2.id_break;
            }
            if (this.id_case == 2) {
                return rrdE2.id_byte;
            }
        }
        return ff_32.id_new();
    }
}

