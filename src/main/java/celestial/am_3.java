/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aU_2;

public class am_3
implements aU_2 {
    private int id_class;
    private final boolean id_break;
    private final float id_byte;

    public boolean id_byte() {
        return this.id_break;
    }

    private am_3(boolean bl, float f) {
        this.id_break = bl;
        this.id_byte = f;
    }

    public am_3(float f) {
        this(true, f);
    }

    public am_3(boolean bl) {
        this(bl, 0.05f);
    }

    public int id_class() {
        return this.id_class;
    }

    public void id_break() {
        ++this.id_class;
    }

    public float id_protected() {
        return this.id_byte;
    }
}

