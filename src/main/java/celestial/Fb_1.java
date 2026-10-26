/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.FI;
import celestial.FM;
import celestial.Fu_1;
import celestial.LZ;
import celestial.rJr_1;
import celestial.rJu_1;
import celestial.rdn_3;
import celestial.rgP_2;
import celestial.rhz_3;
import java.util.List;

public abstract class Fb_1<T extends rJr_1>
extends Fu_1<T>
implements rJu_1 {
    private FM id_class;

    @Override
    public void id_byte(List<rdn_3> list) {
        rJu_1.super.id_byte(list);
        this.id_interface();
    }

    public Fb_1(T t, rhz_3 rhz_32, rgP_2 rgP_22) {
        super(t, rhz_32, rgP_22);
    }

    private void id_interface() {
        for (LZ lZ : this.id_new) {
            if (!(lZ instanceof FI)) continue;
            FI fI = (FI)lZ;
            lZ.id_int = fI.id_extends();
        }
    }

    public void id_class(FM fM) {
        this.id_class = fM;
    }

    public void id_break(List<LZ> list) {
    }

    public abstract boolean id_finally();

    public FM id_package() {
        return this.id_class;
    }

    @Override
    public void id_private() {
        super.id_private();
        this.id_interface();
        for (LZ lZ : this.id_new) {
            if (!(lZ instanceof FI)) continue;
            FI fI = (FI)lZ;
            fI.id_private();
        }
    }

    public void id_final() {
    }

    public abstract List<LZ> id_native();

    @Override
    protected void v_() {
        super.v_();
        if (!this.id_finally()) {
            return;
        }
        this.id_final();
        this.id_instanceof.id_class(this);
        List<LZ> list = this.id_native();
        if (list != null) {
            for (LZ lZ : list) {
                this.id_class(lZ);
            }
            this.id_interface();
        }
        this.id_break(list);
    }

    @Override
    public void w_() {
        super.w_();
        this.id_instanceof.id_break(this);
        this.id_class((FM)null);
    }
}

