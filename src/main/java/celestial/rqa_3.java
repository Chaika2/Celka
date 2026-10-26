/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.Hash$Strategy
 */
package celestial;

import it.unimi.dsi.fastutil.Hash;

public final class rqa_3
extends Enum<rqa_3>
implements Hash.Strategy<Object> {
    public static final /* enum */ rqa_3 INSTANCE = new rqa_3();
    private static final /* synthetic */ rqa_3[] $VALUES;

    static {
        $VALUES = rqa_3.id_class();
    }

    public boolean equals(Object object, Object object2) {
        return object == object2;
    }

    public static rqa_3[] values() {
        return (rqa_3[])$VALUES.clone();
    }

    public int hashCode(Object object) {
        return System.identityHashCode(object);
    }

    public static rqa_3 valueOf(String string) {
        return Enum.valueOf(rqa_3.class, string);
    }

    private static /* synthetic */ rqa_3[] id_class() {
        return new rqa_3[]{INSTANCE};
    }
}

