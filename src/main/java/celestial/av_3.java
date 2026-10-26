/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rcd_3;
import celestial.rmE_2;
import celestial.rut_3;
import java.util.Random;

public class av_3 {
    private final rmE_2 id_protected;
    private final rut_3<Integer> id_throws;
    private final rut_3<Boolean> id_case;
    public boolean id_class;
    public int id_break;
    public int id_byte;

    public av_3(rmE_2 rmE_22, rut_3<Integer> rut_32, rut_3<Boolean> rut_33) {
        this.id_protected = rmE_22;
        this.id_throws = rut_32;
        this.id_case = rut_33;
    }

    public void id_class(boolean bl) {
        this.id_protected.id_break(this.id_case, bl);
    }

    public void id_class(rcd_3 rcd_32) {
        rcd_32.id_class("Saddle", this.id_break());
    }

    public void id_class() {
        this.id_class = true;
        this.id_break = 0;
        this.id_byte = this.id_protected.id_class(this.id_throws);
    }

    public boolean id_class(Random random) {
        if (this.id_class) {
            return false;
        }
        this.id_class = true;
        this.id_break = 0;
        this.id_byte = random.nextInt(841) + 140;
        this.id_protected.id_break(this.id_throws, this.id_byte);
        return true;
    }

    public void id_break(rcd_3 rcd_32) {
        this.id_class(rcd_32.id_new("Saddle"));
    }

    public boolean id_break() {
        return this.id_protected.id_class(this.id_case);
    }
}

