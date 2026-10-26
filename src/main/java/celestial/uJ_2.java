/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.uX_2;

public interface uJ_2
extends uX_2 {
    public float id_byte();

    public int id_class();

    public void id_class(int var1, int var2);

    public int id_break();

    default public float id_finally() {
        return this.id_native();
    }

    default public float id_extends() {
        return this.id_finally() + (float)this.id_break() / this.id_byte();
    }

    default public float id_implements() {
        return this.id_private() + (float)this.id_class() / this.id_byte();
    }

    public boolean id_protected();

    default public float id_private() {
        return this.id_throws();
    }

    default public float id_native() {
        return 3.0f;
    }
}

