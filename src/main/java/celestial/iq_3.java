/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVL;

public class iq_3 {
    public static final iq_3 id_class = iq_3.id_class("core");
    public static final iq_3 id_break = iq_3.id_class("idle");
    public static final iq_3 id_byte = iq_3.id_class("work");
    public static final iq_3 id_protected = iq_3.id_class("play");
    public static final iq_3 id_throws = iq_3.id_class("rest");
    public static final iq_3 id_case = iq_3.id_class("meet");
    public static final iq_3 id_catch = iq_3.id_class("panic");
    public static final iq_3 id_private = iq_3.id_class("raid");
    public static final iq_3 id_implements = iq_3.id_class("pre_raid");
    public static final iq_3 id_finally = iq_3.id_class("hide");
    public static final iq_3 id_extends = iq_3.id_class("fight");
    public static final iq_3 id_native = iq_3.id_class("celebrate");
    public static final iq_3 id_volatile = iq_3.id_class("admire_item");
    public static final iq_3 id_final = iq_3.id_class("avoid");
    public static final iq_3 id_package = iq_3.id_class("ride");
    private final String id_int;
    private final int id_new;

    private iq_3(String string) {
        this.id_int = string;
        this.id_new = string.hashCode();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && this.getClass() == object.getClass()) {
            iq_3 iq_32 = (iq_3)object;
            return this.id_int.equals(iq_32.id_int);
        }
        return false;
    }

    public String toString() {
        return this.id_class();
    }

    public int hashCode() {
        return this.id_new;
    }

    public String id_class() {
        return this.id_int;
    }

    private static iq_3 id_class(String string) {
        return rVL.id_class(rVL.z, string, new iq_3(string));
    }
}

