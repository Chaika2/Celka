/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.IJ;
import celestial.rdn_3;
import celestial.rgP_2;
import celestial.rrTu_1;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;

public class rrTP
extends Record
implements rrTu_1 {
    public float id_class;
    public List<rdn_3> id_break;
    public IJ[] id_byte;
    public int id_protected;
    public float id_throws;
    public float[] id_case;
    public float id_catch;
    public rgP_2 id_private;

    @Override
    public rgP_2 id_byte() {
        return this.id_private;
    }

    public rrTP(List<rdn_3> list, float f, float f2, float[] fArray, float f3, int n, rgP_2 rgP_22, IJ[] iJArray) {
        this.id_break = list;
        this.id_class = f;
        this.id_throws = f2;
        this.id_case = fArray;
        this.id_catch = f3;
        this.id_protected = n;
        this.id_private = rgP_22;
        this.id_byte = iJArray;
    }

    @Override
    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{rrTP.class, "items;x;y;colors;scale;entityId;title;models", "id_break", "id_class", "id_throws", "id_case", "id_catch", "id_protected", "id_private", "id_byte"}, this, object);
    }

    @Override
    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{rrTP.class, "items;x;y;colors;scale;entityId;title;models", "id_break", "id_class", "id_throws", "id_case", "id_catch", "id_protected", "id_private", "id_byte"}, this);
    }

    @Override
    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{rrTP.class, "items;x;y;colors;scale;entityId;title;models", "id_break", "id_class", "id_throws", "id_case", "id_catch", "id_protected", "id_private", "id_byte"}, this);
    }

    @Override
    public float id_class() {
        return this.id_catch;
    }

    @Override
    public float id_break() {
        return this.id_throws;
    }

    @Override
    public float[] id_throws() {
        return this.id_case;
    }

    @Override
    public IJ[] id_catch() {
        return this.id_byte;
    }

    public int id_case() {
        return this.id_protected;
    }

    @Override
    public List<rdn_3> id_protected() {
        return this.id_break;
    }

    @Override
    public float id_private() {
        return this.id_class;
    }
}

