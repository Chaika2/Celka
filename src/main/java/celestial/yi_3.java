/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class yi_3 {
    public int id_class;
    public String id_break;
    public long id_byte;

    public float id_byte() {
        return (float)(this.id_class & 0xFF) / 255.0f;
    }

    public yi_3(int n, String string, long l) {
        this.id_class = n;
        this.id_break = string;
        this.id_byte = l;
    }

    public float id_class() {
        return (float)(this.id_class >> 16 & 0xFF) / 255.0f;
    }

    public float id_break() {
        return (float)(this.id_class >> 8 & 0xFF) / 255.0f;
    }

    public float id_protected() {
        return (float)(this.id_class >> 24 & 0xFF) / 255.0f;
    }
}

