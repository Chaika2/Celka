/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.uq_3;
import celestial.uy_3;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public record ut_3(int id_class, int id_break) {
    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{ut_3.class, "x;y", "id_class", "id_break"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{ut_3.class, "x;y", "id_class", "id_break"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{ut_3.class, "x;y", "id_class", "id_break"}, this);
    }

    public static ut_3 id_class(uy_3 uy_32, int n, int n2) {
        return switch (uy_32) {
            default -> throw new IncompatibleClassChangeError();
            case uy_3.HORIZONTAL -> new ut_3(n, n2);
            case uy_3.VERTICAL -> new ut_3(n2, n);
        };
    }

    public ut_3 id_class(uq_3 uq_32) {
        return switch (uq_32) {
            default -> throw new IncompatibleClassChangeError();
            case uq_3.DOWN -> new ut_3(this.id_class, this.id_break + 1);
            case uq_3.UP -> new ut_3(this.id_class, this.id_break - 1);
            case uq_3.LEFT -> new ut_3(this.id_class - 1, this.id_break);
            case uq_3.RIGHT -> new ut_3(this.id_class + 1, this.id_break);
        };
    }

    public int id_class(uy_3 uy_32) {
        return switch (uy_32) {
            default -> throw new IncompatibleClassChangeError();
            case uy_3.HORIZONTAL -> this.id_class;
            case uy_3.VERTICAL -> this.id_break;
        };
    }
}

