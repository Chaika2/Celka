/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rVi_1;
import celestial.rgM_2;
import celestial.rgN_2;
import celestial.rgO_2;
import celestial.rgP_2;
import celestial.rgZ_2;
import celestial.rgc_3;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;

public class rgh_3
extends rgZ_2 {
    private static Function<String, Supplier<rgP_2>> id_byte = string -> () -> new rgN_2((String)string);
    private final String id_protected;
    private Supplier<rgP_2> id_throws;

    public rgh_3(String string) {
        this.id_protected = string;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof rgh_3)) {
            return false;
        }
        rgh_3 rgh_32 = (rgh_3)object;
        return this.id_protected.equals(rgh_32.id_protected) && super.equals(object);
    }

    @Override
    public String toString() {
        return "KeybindComponent{keybind='" + this.id_protected + "', siblings=" + this.id_case + ", style=" + this.id_class() + "}";
    }

    public static void id_class(Function<String, Supplier<rgP_2>> function) {
        id_byte = function;
    }

    @Override
    public <T> Optional<T> id_break(rgM_2<T> rgM_22, rgc_3 rgc_32) {
        return this.id_extends().id_class(rgM_22, rgc_32);
    }

    @Override
    public <T> Optional<T> id_break(rgO_2<T> rgO_22) {
        return this.id_extends().id_class(rgO_22);
    }

    @Override
    public /* synthetic */ rVi_1 id_throws() {
        return this.id_private();
    }

    @Override
    public /* synthetic */ rgZ_2 id_finally() {
        return this.id_private();
    }

    private rgP_2 id_extends() {
        if (this.id_throws == null) {
            this.id_throws = id_byte.apply(this.id_protected);
        }
        return this.id_throws.get();
    }

    public String id_implements() {
        return this.id_protected;
    }

    public rgh_3 id_private() {
        return new rgh_3(this.id_protected);
    }
}

