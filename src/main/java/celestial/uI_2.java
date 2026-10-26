/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package celestial;

import celestial.uq_3;
import celestial.ut_3;
import celestial.uy_3;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import javax.annotation.Nullable;

public final class uI_2
extends Record {
    private final ut_3 id_class;
    private final int id_break;
    private final int id_byte;
    private static final uI_2 id_protected = new uI_2(0, 0, 0, 0);

    public uI_2 id_byte(uq_3 uq_32) {
        int n = this.id_break(uq_32);
        uy_3 uy_32 = uq_32.id_class().id_class();
        int n2 = this.id_break(uy_32.id_byte());
        int n3 = this.id_class(uy_32);
        return uI_2.id_class(uq_32.id_class(), n, n2, 1, n3).id_class(uq_32);
    }

    public int id_byte() {
        return this.id_class.id_break() + this.id_byte;
    }

    public uI_2(int n, int n2, int n3, int n4) {
        this(new ut_3(n, n2), n3, n4);
    }

    public uI_2(ut_3 ut_32, int n, int n2) {
        this.id_class = ut_32;
        this.id_break = n;
        this.id_byte = n2;
    }

    @Override
    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{uI_2.class, "position;width;height", "id_class", "id_break", "id_byte"}, this, object);
    }

    @Override
    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{uI_2.class, "position;width;height", "id_class", "id_break", "id_byte"}, this);
    }

    @Override
    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{uI_2.class, "position;width;height", "id_class", "id_break", "id_byte"}, this);
    }

    public boolean id_class(int n, int n2) {
        return n >= this.id_protected() && n < this.id_throws() && n2 >= this.id_break() && n2 < this.id_byte();
    }

    public static uI_2 id_class(uy_3 uy_32, int n, int n2, int n3, int n4) {
        return switch (uy_32) {
            default -> throw new IncompatibleClassChangeError();
            case uy_3.HORIZONTAL -> new uI_2(n, n2, n3, n4);
            case uy_3.VERTICAL -> new uI_2(n2, n, n4, n3);
        };
    }

    public static uI_2 id_class() {
        return id_protected;
    }

    public uI_2 id_class(uq_3 uq_32) {
        return new uI_2(this.id_class.id_class(uq_32), this.id_break, this.id_byte);
    }

    public boolean id_class(uI_2 uI_22) {
        return this.id_class(uI_22, uy_3.HORIZONTAL) && this.id_class(uI_22, uy_3.VERTICAL);
    }

    public boolean id_class(uI_2 uI_22, uy_3 uy_32) {
        int n = this.id_break(uy_32.id_byte());
        int n2 = uI_22.id_break(uy_32.id_byte());
        int n3 = this.id_break(uy_32.id_break());
        int n4 = uI_22.id_break(uy_32.id_break());
        return Math.max(n, n2) <= Math.min(n3, n4);
    }

    public int id_class(uy_3 uy_32) {
        return switch (uy_32) {
            default -> throw new IncompatibleClassChangeError();
            case uy_3.HORIZONTAL -> this.id_break;
            case uy_3.VERTICAL -> this.id_byte;
        };
    }

    public int id_break(uy_3 uy_32) {
        return (this.id_break(uy_32.id_break()) + this.id_break(uy_32.id_byte())) / 2;
    }

    @Nullable
    public uI_2 id_break(uI_2 uI_22) {
        int n = Math.max(this.id_protected(), uI_22.id_protected());
        int n2 = Math.max(this.id_break(), uI_22.id_break());
        int n3 = Math.min(this.id_throws(), uI_22.id_throws());
        int n4 = Math.min(this.id_byte(), uI_22.id_byte());
        return n < n3 && n2 < n4 ? new uI_2(n, n2, n3 - n, n4 - n2) : null;
    }

    public int id_break() {
        return this.id_class.id_break();
    }

    public int id_break(uq_3 uq_32) {
        uy_3 uy_32 = uq_32.id_class();
        return uq_32.id_byte() ? this.id_class.id_class(uy_32) + this.id_class(uy_32) - 1 : this.id_class.id_class(uy_32);
    }

    public int id_throws() {
        return this.id_class.id_class() + this.id_break;
    }

    public int id_catch() {
        return this.id_break;
    }

    public ut_3 id_case() {
        return this.id_class;
    }

    public int id_protected() {
        return this.id_class.id_class();
    }

    public int id_private() {
        return this.id_byte;
    }
}

