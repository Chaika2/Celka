/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class rjK_2 {
    public static final rjK_2 id_class = new rjK_2(0.0f, 0.0f);
    public static final rjK_2 id_break = new rjK_2(1.0f, 1.0f);
    public float id_byte;
    public float id_protected;

    public rjK_2(float f, float f2) {
        this.id_byte = f;
        this.id_protected = f2;
    }

    public boolean id_class(rjK_2 rjK_22) {
        return this.id_byte == rjK_22.id_byte && this.id_protected == rjK_22.id_protected;
    }

    public rjK_2 id_class(float f, float f2) {
        this.id_byte = f;
        this.id_protected = f2;
        return this;
    }
}

