/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrdZ;

public class rrxq_3 {
    private int id_class;
    private float id_break;
    private float id_byte;
    private float id_protected;
    private float id_throws;
    private float id_case;
    private float id_catch;
    private boolean id_private;

    public float id_byte() {
        return this.id_case;
    }

    public void id_class(int n, float f, float f2, float f3) {
        if (!rrdZ.id_new && n != this.id_class) {
            if (this.id_class != 0) {
                this.id_throws = f - this.id_break;
                this.id_case = f2 - this.id_byte;
                this.id_catch = f3 - this.id_protected;
                this.id_private = n - this.id_class <= 3 && !rrdZ.S;
            }
            this.id_class = n;
            this.id_break = f;
            this.id_byte = f2;
            this.id_protected = f3;
        }
    }

    public boolean id_class() {
        return this.id_private;
    }

    public float id_break() {
        return this.id_throws;
    }

    public int id_throws() {
        return this.id_class;
    }

    public float id_protected() {
        return this.id_catch;
    }
}

