/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class rfR_2 {
    private int id_class;
    private int id_break;
    private int id_byte;
    private int id_protected;
    private int id_throws;
    private int id_case;
    private int id_catch;
    private int id_private;
    private int id_implements;
    private int id_finally;
    private int id_extends;

    public int id_byte() {
        return this.id_break + this.id_finally;
    }

    public rfR_2(int n, int n2, int n3, int n4, int n5, int n6) {
        this.id_class = n;
        this.id_break = n2;
        this.id_byte = n3;
        this.id_protected = n4 - n + 1;
        this.id_throws = n5 - n2 + 1;
        this.id_case = n6 - n3 + 1;
        this.id_catch = this.id_protected * this.id_throws * this.id_case;
    }

    public boolean id_class() {
        if (this.id_private == this.id_catch) {
            return false;
        }
        this.id_implements = this.id_private % this.id_protected;
        int n = this.id_private / this.id_protected;
        this.id_finally = n % this.id_throws;
        this.id_extends = n / this.id_throws;
        ++this.id_private;
        return true;
    }

    public int id_break() {
        return this.id_class + this.id_implements;
    }

    public int id_throws() {
        int n = 0;
        if (this.id_implements == 0 || this.id_implements == this.id_protected - 1) {
            ++n;
        }
        if (this.id_finally == 0 || this.id_finally == this.id_throws - 1) {
            ++n;
        }
        if (this.id_extends == 0 || this.id_extends == this.id_case - 1) {
            ++n;
        }
        return n;
    }

    public int id_protected() {
        return this.id_byte + this.id_extends;
    }
}

