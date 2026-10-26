/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class rqw_3 {
    public float id_class;
    public float id_break;
    private long id_byte;
    private final float id_protected;
    private float id_throws = 1.0f;

    public rqw_3(float f, long l) {
        this.id_protected = 1000.0f / f;
        this.id_byte = l;
    }

    public void id_class(float f) {
        this.id_throws = f;
    }

    public float id_class() {
        return this.id_throws;
    }

    public int id_class(long l) {
        this.id_break = (float)(l - this.id_byte) / this.id_protected * this.id_throws;
        this.id_byte = l;
        this.id_class += this.id_break;
        int n = (int)this.id_class;
        this.id_class -= (float)n;
        return n;
    }
}

