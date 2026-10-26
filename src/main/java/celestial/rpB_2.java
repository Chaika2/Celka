/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rpE_2;
import celestial.rpH_2;
import celestial.rpS_2;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.rps_3;
import celestial.rqR_2;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public abstract sealed class rpB_2
extends Enum<rpB_2>
implements Predicate<rpr_3>,
rpH_2
permits rpS_2, rps_3, rpE_2 {
    public static final /* enum */ rpB_2 X = new rpS_2("x");
    public static final /* enum */ rpB_2 Y = new rps_3("y");
    public static final /* enum */ rpB_2 Z = new rpE_2("z");
    private static final rpB_2[] VALUES;
    public static final Codec<rpB_2> CODEC;
    private static final Map<String, rpB_2> NAME_LOOKUP;
    private final String name;
    private static final /* synthetic */ rpB_2[] $VALUES;

    public boolean id_byte() {
        return this == Y;
    }

    public rpB_2(String string2) {
        this.name = string2;
    }

    static {
        $VALUES = rpB_2.id_case();
        VALUES = rpB_2.values();
        CODEC = rpH_2.id_class(rpB_2::values, rpB_2::id_class);
        NAME_LOOKUP = Arrays.stream(VALUES).collect(Collectors.toMap(rpB_2::id_break, rpB_22 -> rpB_22));
    }

    public String toString() {
        return this.name;
    }

    public static rpB_2[] values() {
        return (rpB_2[])$VALUES.clone();
    }

    @Override
    public /* synthetic */ boolean test(Object object) {
        return this.id_class((rpr_3)object);
    }

    public static rpB_2 valueOf(String string) {
        return Enum.valueOf(rpB_2.class, string);
    }

    public abstract int id_class(int var1, int var2, int var3);

    public boolean id_class(rpr_3 rpr_32) {
        return rpr_32 != null && rpr_32.id_final() == this;
    }

    public abstract double id_class(double var1, double var3, double var5);

    @Override
    public String id_class() {
        return this.name;
    }

    public static rpB_2 id_class(Random random) {
        return rqR_2.id_class(VALUES, random);
    }

    public static rpB_2 id_class(String string) {
        return NAME_LOOKUP.get(string.toLowerCase(Locale.ROOT));
    }

    public String id_break() {
        return this.name;
    }

    public rpb_3 id_throws() {
        switch (this) {
            case X: 
            case Z: {
                return rpb_3.HORIZONTAL;
            }
            case Y: {
                return rpb_3.VERTICAL;
            }
        }
        throw new Error("Someone's been tampering with the universe!");
    }

    private static /* synthetic */ rpB_2[] id_case() {
        return new rpB_2[]{X, Y, Z};
    }

    public boolean id_protected() {
        return this == X || this == Z;
    }
}

