/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rnP_2;
import celestial.rns_3;
import java.util.Comparator;

public class rAa_1 {
    public static final Comparator<rAa_1> id_class = (rAa_12, rAa_13) -> {
        if (rAa_12.id_break() > rAa_13.id_break()) {
            return 1;
        }
        return rAa_12.id_break() < rAa_13.id_break() ? -1 : rAa_13.id_throws().compareToIgnoreCase(rAa_12.id_throws());
    };
    private final rns_3 id_break;
    private final rnP_2 id_byte;
    private final String id_protected;
    private int id_throws;
    private boolean id_case;
    private boolean id_catch;

    public void id_byte() {
        this.id_break(0);
    }

    public rAa_1(rns_3 rns_32, rnP_2 rnP_22, String string) {
        this.id_break = rns_32;
        this.id_byte = rnP_22;
        this.id_protected = string;
        this.id_case = true;
        this.id_catch = true;
    }

    public void id_class(int n) {
        if (this.id_byte.id_byte().id_break()) {
            throw new IllegalStateException("Cannot modify read-only score");
        }
        this.id_break(this.id_break() + n);
    }

    public void id_class() {
        this.id_class(1);
    }

    public void id_class(boolean bl) {
        this.id_case = bl;
    }

    public int id_break() {
        return this.id_throws;
    }

    public void id_break(int n) {
        int n2 = this.id_throws;
        this.id_throws = n;
        if (n2 != n || this.id_catch) {
            this.id_catch = false;
            this.id_case().id_class(this);
        }
    }

    public String id_throws() {
        return this.id_protected;
    }

    public boolean id_catch() {
        return this.id_case;
    }

    public rns_3 id_case() {
        return this.id_break;
    }

    public rnP_2 id_protected() {
        return this.id_byte;
    }
}

