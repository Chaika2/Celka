/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.MT;

public class rrxz_3 {
    private boolean id_class;
    private int id_break;
    private int id_byte;
    private int id_protected;
    private int id_throws;

    public boolean id_byte() {
        return this.id_class;
    }

    public rrxz_3() {
        this(false, 1, 0);
    }

    public rrxz_3(boolean bl, int n, int n2) {
        this(bl, n, n2, n, n2);
    }

    public rrxz_3(boolean bl, int n, int n2, int n3, int n4) {
        this.id_class = bl;
        this.id_break = n;
        this.id_byte = n2;
        this.id_protected = n3;
        this.id_throws = n4;
    }

    public rrxz_3(boolean bl) {
        this(bl, 1, 0);
    }

    public String toString() {
        return "enabled: " + this.id_class + ", src: " + this.id_break + ", dst: " + this.id_byte + ", srcAlpha: " + this.id_protected + ", dstAlpha: " + this.id_throws;
    }

    public void id_class(int n, int n2, int n3, int n4) {
        this.id_break = n;
        this.id_byte = n2;
        this.id_protected = n3;
        this.id_throws = n4;
    }

    public void id_class(int n, int n2) {
        this.id_break = n;
        this.id_byte = n2;
        this.id_protected = n;
        this.id_throws = n2;
    }

    public void id_class(boolean bl, int n, int n2, int n3, int n4) {
        this.id_class = bl;
        this.id_break = n;
        this.id_byte = n2;
        this.id_protected = n3;
        this.id_throws = n4;
    }

    public void id_class(boolean bl) {
        this.id_class = bl;
    }

    public void id_class() {
        this.id_class = true;
    }

    public void id_class(rrxz_3 rrxz_32) {
        this.id_class = rrxz_32.id_class;
        this.id_break = rrxz_32.id_break;
        this.id_byte = rrxz_32.id_byte;
        this.id_protected = rrxz_32.id_protected;
        this.id_throws = rrxz_32.id_throws;
    }

    public void id_break() {
        this.id_class = false;
    }

    public int id_throws() {
        return this.id_byte;
    }

    public int id_catch() {
        return this.id_throws;
    }

    public int id_case() {
        return this.id_protected;
    }

    public void id_implements() {
        if (!this.id_class) {
            MT.id_final();
        } else {
            MT.id_package();
            MT.id_break(this.id_break, this.id_byte, this.id_protected, this.id_throws);
        }
    }

    public int id_protected() {
        return this.id_break;
    }

    public boolean id_private() {
        return this.id_break != this.id_protected || this.id_byte != this.id_throws;
    }
}

