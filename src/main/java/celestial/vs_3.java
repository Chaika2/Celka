/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrvs_1;
import java.util.HashSet;
import java.util.Set;

public final class vs_3
extends Enum<vs_3> {
    public static final /* enum */ vs_3 INSTANCE = new vs_3();
    private final Set<rrvs_1> focusables = new HashSet<rrvs_1>();
    private static final /* synthetic */ vs_3[] $VALUES;

    public Set<rrvs_1> id_byte() {
        return this.focusables;
    }

    static {
        $VALUES = vs_3.id_protected();
    }

    public static vs_3[] values() {
        return (vs_3[])$VALUES.clone();
    }

    public static vs_3 valueOf(String string) {
        return Enum.valueOf(vs_3.class, string);
    }

    public void id_class() {
        this.focusables.clear();
    }

    public void id_class(rrvs_1 rrvs_12) {
        this.focusables.add(rrvs_12);
    }

    public void id_break(rrvs_1 rrvs_12) {
        this.focusables.remove(rrvs_12);
    }

    public boolean id_break() {
        for (rrvs_1 rrvs_12 : this.focusables) {
            if (!rrvs_12.aO_()) continue;
            return true;
        }
        return false;
    }

    private static /* synthetic */ vs_3[] id_protected() {
        return new vs_3[]{INSTANCE};
    }
}

