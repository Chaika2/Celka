/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVj_1;
import celestial.rgc_3;
import celestial.rpv_3;

public class rVY
implements rpv_3 {
    private final float id_break;
    private int id_byte = -1;
    private rgc_3 id_protected = rgc_3.id_class;
    private boolean id_throws;
    private float id_case;
    private int id_catch = -1;
    private rgc_3 id_private = rgc_3.id_class;
    private int id_implements;
    private int id_finally;
    public final /* synthetic */ rVj_1 id_class;

    private boolean id_byte() {
        return this.id_byte != -1;
    }

    public rVY(rVj_1 rVj_12, float f) {
        this.id_class = rVj_12;
        this.id_break = Math.max(f, 1.0f);
    }

    public void id_class(int n) {
        this.id_finally += n;
    }

    public int id_class() {
        return this.id_byte() ? this.id_byte : this.id_implements;
    }

    private boolean id_class(int n, rgc_3 rgc_32) {
        this.id_byte = n;
        this.id_protected = rgc_32;
        return false;
    }

    @Override
    public boolean accept(int n, rgc_3 rgc_32, int n2) {
        int n3 = n + this.id_finally;
        switch (n2) {
            case 10: {
                return this.id_class(n3, rgc_32);
            }
            case 32: {
                this.id_catch = n3;
                this.id_private = rgc_32;
            }
        }
        float f = this.id_class.id_class.getWidth(n2, rgc_32);
        this.id_case += f;
        if (this.id_throws && this.id_case > this.id_break) {
            return this.id_catch != -1 ? this.id_class(this.id_catch, this.id_private) : this.id_class(n3, rgc_32);
        }
        this.id_throws |= f != 0.0f;
        this.id_implements = n3 + Character.charCount(n2);
        return true;
    }

    public rgc_3 id_break() {
        return this.id_protected;
    }
}

