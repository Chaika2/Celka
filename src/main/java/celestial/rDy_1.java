/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.rDH;
import celestial.rKY;
import celestial.rKi_1;
import celestial.xc_3;
import celestial.xd_3;
import com.google.common.collect.ImmutableSet;
import java.util.Set;

public class rDy_1 {
    private final rKi_1 id_class;
    private final rKY id_break;
    private Set<xd_3> id_byte = ImmutableSet.of();
    private Set<xc_3> id_protected = ImmutableSet.of();
    private int id_throws = 64;
    private int id_case = 7;
    private int id_catch = 3;
    private int id_private = 7;
    private boolean id_implements;
    private boolean id_finally = true;
    private boolean id_extends = false;

    public rDy_1 id_byte(int n) {
        this.id_catch = n;
        return this;
    }

    public rDy_1 id_byte() {
        this.id_extends = true;
        return this;
    }

    public rDy_1(rKi_1 rKi_12, rKY rKY2) {
        this.id_class = rKi_12;
        this.id_break = rKY2;
    }

    public rDy_1 id_class(Set<xd_3> set) {
        this.id_byte = set;
        return this;
    }

    public rDy_1 id_class() {
        this.id_implements = true;
        return this;
    }

    public rDy_1 id_class(int n) {
        this.id_throws = n;
        return this;
    }

    public rDy_1 id_break() {
        this.id_finally = false;
        return this;
    }

    public rDy_1 id_break(int n) {
        this.id_case = n;
        return this;
    }

    public rDy_1 id_break(Set<xc_3> set) {
        this.id_protected = set;
        return this;
    }

    public rDy_1 id_protected(int n) {
        this.id_private = n;
        return this;
    }

    public rDH id_protected() {
        return new rDH(this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch, this.id_private, this.id_implements, this.id_finally, this.id_extends);
    }
}

