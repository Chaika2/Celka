/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rjK_2;
import celestial.rja_3;
import celestial.rrdM;

public class rrxf_3 {
    private final String id_class;
    private final rrdM id_break;
    private int id_byte;
    private int id_protected;
    private rja_3 id_throws;
    private rja_3 id_case;
    private rjK_2 id_catch;
    private int id_private;

    public void id_byte() {
        this.id_throws = null;
        this.id_case = null;
        this.id_catch = null;
    }

    public void id_byte(int n) {
        this.id_private = n;
    }

    public rrxf_3(String string, rrdM rrdM2) {
        this.id_class = string;
        this.id_break = rrdM2;
    }

    public String toString() {
        return "name: " + this.id_class + ", id: " + this.id_byte;
    }

    public void id_class(rja_3 rja_32) {
        this.id_throws = rja_32;
    }

    public void id_class(rjK_2 rjK_22) {
        this.id_catch = rjK_22;
    }

    public void id_class() {
    }

    public void id_class(int n) {
        this.id_byte = n;
    }

    public void id_break(int n) {
        this.id_protected = n;
    }

    public void id_break(rja_3 rja_32) {
        this.id_case = rja_32;
    }

    public void id_break() {
        this.id_byte = 0;
        this.id_protected = 0;
    }

    public rrdM id_throws() {
        return this.id_break;
    }

    public rjK_2 id_finally() {
        return this.id_catch;
    }

    public int id_catch() {
        return this.id_protected;
    }

    public int id_extends() {
        return this.id_private;
    }

    public int id_case() {
        return this.id_byte;
    }

    public rja_3 id_implements() {
        return this.id_case;
    }

    public String id_protected() {
        return this.id_class;
    }

    public rja_3 id_private() {
        return this.id_throws;
    }

    public boolean id_native() {
        return this.id_private != 0;
    }
}

