/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
package celestial;

import celestial.an_3;
import celestial.gy_3;
import celestial.rjU_2;
import celestial.rqR_2;
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.function.BiFunction;

public final class Rm_1
extends Enum<Rm_1> {
    public static final /* enum */ Rm_1 FEET = new Rm_1("feet", (rjU_22, an_32) -> rjU_22);
    public static final /* enum */ Rm_1 EYES = new Rm_1("eyes", (rjU_22, an_32) -> new rjU_2(rjU_22.id_break, rjU_22.id_byte + (double)an_32.Bx(), rjU_22.id_protected));
    public static final Map<String, Rm_1> BY_NAME;
    private final String name;
    private final BiFunction<rjU_2, an_3, rjU_2> offsetFunc;
    private static final /* synthetic */ Rm_1[] $VALUES;

    private Rm_1(String string2, BiFunction<rjU_2, an_3, rjU_2> biFunction) {
        this.name = string2;
        this.offsetFunc = biFunction;
    }

    static {
        $VALUES = Rm_1.id_class();
        BY_NAME = rqR_2.id_class(Maps.newHashMap(), (T hashMap) -> {
            for (Rm_1 rm_1 : Rm_1.values()) {
                hashMap.put(rm_1.name, rm_1);
            }
        });
    }

    public static Rm_1[] values() {
        return (Rm_1[])$VALUES.clone();
    }

    public static Rm_1 valueOf(String string) {
        return Enum.valueOf(Rm_1.class, string);
    }

    public rjU_2 id_class(gy_3 gy_32) {
        an_3 an_32 = gy_32.id_package();
        return an_32 == null ? gy_32.id_volatile() : this.offsetFunc.apply(gy_32.id_volatile(), an_32);
    }

    private static /* synthetic */ Rm_1[] id_class() {
        return new Rm_1[]{FEET, EYES};
    }

    public static Rm_1 id_class(String string) {
        return BY_NAME.get(string);
    }

    public rjU_2 id_class(an_3 an_32) {
        return this.offsetFunc.apply(an_32.Ps(), an_32);
    }
}

