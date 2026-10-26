/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 */
package celestial;

import celestial.aH_2;
import celestial.aI_2;
import celestial.aj_3;
import celestial.an_3;
import celestial.ap_3;
import celestial.rTC;
import celestial.rqR_2;
import celestial.xd_3;
import com.google.common.collect.ImmutableSet;

public class af_3<T extends an_3> {
    private final aj_3<T> id_class;
    private final aH_2 id_break;
    private ImmutableSet<xd_3> id_byte = ImmutableSet.of();
    private boolean id_protected = true;
    private boolean id_throws = true;
    private boolean id_case;
    private boolean id_catch;
    private int id_private = 5;
    private int id_implements = 3;
    private ap_3 id_finally = ap_3.id_break(0.6f, 1.8f);

    public af_3<T> id_byte() {
        this.id_case = true;
        return this;
    }

    private af_3(aj_3<T> aj_32, aH_2 aH_22) {
        this.id_class = aj_32;
        this.id_break = aH_22;
        this.id_catch = aH_22 == aH_2.CREATURE || aH_22 == aH_2.MISC;
    }

    public static <T extends an_3> af_3<T> id_class(aj_3<T> aj_32, aH_2 aH_22) {
        return new af_3<T>(aj_32, aH_22);
    }

    public af_3<T> id_class(xd_3 ... xd_3Array) {
        this.id_byte = ImmutableSet.copyOf((Object[])xd_3Array);
        return this;
    }

    public af_3<T> id_class(int n) {
        this.id_private = n;
        return this;
    }

    public aI_2<T> id_class(String string) {
        if (this.id_protected) {
            rqR_2.id_class(rTC.id_package, string);
        }
        return new aI_2<T>(this.id_class, this.id_break, this.id_protected, this.id_throws, this.id_case, this.id_catch, this.id_byte, this.id_finally, this.id_private, this.id_implements);
    }

    public af_3<T> id_class(float f, float f2) {
        this.id_finally = ap_3.id_break(f, f2);
        return this;
    }

    public af_3<T> id_class() {
        this.id_throws = false;
        return this;
    }

    public static <T extends an_3> af_3<T> id_class(aH_2 aH_22) {
        return new af_3<an_3>((aI_22, rYB2) -> null, aH_22);
    }

    public af_3<T> id_break() {
        this.id_protected = false;
        return this;
    }

    public af_3<T> id_break(int n) {
        this.id_implements = n;
        return this;
    }

    public af_3<T> id_protected() {
        this.id_catch = true;
        return this;
    }
}

