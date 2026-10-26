/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class wD_2 {
    public float[] id_class;
    public final int id_break;

    public int id_byte(int n) {
        return (n + 4 - this.id_break / 90) % 4;
    }

    public wD_2(float[] fArray, int n) {
        this.id_class = fArray;
        this.id_break = n;
    }

    public void id_class(float[] fArray) {
        if (this.id_class == null) {
            this.id_class = fArray;
        }
    }

    public float id_class(int n) {
        if (this.id_class == null) {
            throw new NullPointerException("uvs");
        }
        int n2 = this.id_protected(n);
        return this.id_class[n2 != 0 && n2 != 1 ? 2 : 0];
    }

    public float id_break(int n) {
        if (this.id_class == null) {
            throw new NullPointerException("uvs");
        }
        int n2 = this.id_protected(n);
        return this.id_class[n2 != 0 && n2 != 3 ? 3 : 1];
    }

    private int id_protected(int n) {
        return (n + this.id_break / 90) % 4;
    }
}

