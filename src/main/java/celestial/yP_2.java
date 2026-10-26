/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.Hash$Strategy
 */
package celestial;

import celestial.yr_3;
import it.unimi.dsi.fastutil.Hash;
import java.util.Objects;

public final class yP_2
extends Enum<yP_2>
implements Hash.Strategy<yr_3> {
    public static final /* enum */ yP_2 INSTANCE = new yP_2();
    private static final /* synthetic */ yP_2[] $VALUES;

    static {
        $VALUES = yP_2.id_class();
    }

    public /* synthetic */ boolean equals(Object object, Object object2) {
        return this.id_class((yr_3)object, (yr_3)object2);
    }

    public static yP_2[] values() {
        return (yP_2[])$VALUES.clone();
    }

    public /* synthetic */ int hashCode(Object object) {
        return this.id_class((yr_3)object);
    }

    public static yP_2 valueOf(String string) {
        return Enum.valueOf(yP_2.class, string);
    }

    private static /* synthetic */ yP_2[] id_class() {
        return new yP_2[]{INSTANCE};
    }

    public boolean id_class(yr_3 yr_32, yr_3 yr_33) {
        if (yr_32 == yr_33) {
            return true;
        }
        return yr_32 != null && yr_33 != null ? Objects.equals(yr_32.G, yr_33.G) : false;
    }

    public int id_class(yr_3 yr_32) {
        return yr_32 == null ? 0 : yr_32.b;
    }
}

