/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.rgP_2;
import celestial.rye_3;

public class ryV_2 {
    private final rye_3 id_class;
    private final int id_break;
    private final float id_byte;
    private final float id_protected;
    private final String id_throws;
    private final float id_case;

    public boolean id_byte() {
        return this.id_class.id_extends() instanceof iB_2;
    }

    public ryV_2(rye_3 rye_32, int n, float f, float f2, String string, float f3) {
        this.id_class = rye_32;
        this.id_break = n;
        this.id_byte = f2;
        this.id_protected = f;
        this.id_throws = string;
        this.id_case = f3;
    }

    public rye_3 id_class() {
        return this.id_class;
    }

    public float id_break() {
        return this.id_byte;
    }

    public rgP_2 id_throws() {
        return this.id_class().id_extends() == null ? null : this.id_class().id_extends().L_();
    }

    public float id_case() {
        return this.id_class == rye_3.id_volatile ? Float.MAX_VALUE : this.id_case;
    }

    public String id_protected() {
        return this.id_throws;
    }
}

