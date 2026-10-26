/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package celestial;

import celestial.rpH_2;
import com.mojang.serialization.Codec;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public final class riV_2
extends Enum<riV_2>
implements rpH_2 {
    public static final /* enum */ riV_2 STANDARD = new riV_2("standard");
    public static final /* enum */ riV_2 DESERT = new riV_2("desert");
    public static final /* enum */ riV_2 JUNGLE = new riV_2("jungle");
    public static final /* enum */ riV_2 SWAMP = new riV_2("swamp");
    public static final /* enum */ riV_2 MOUNTAIN = new riV_2("mountain");
    public static final /* enum */ riV_2 OCEAN = new riV_2("ocean");
    public static final /* enum */ riV_2 NETHER = new riV_2("nether");
    public static final Codec<riV_2> field_236342_h_;
    private static final Map<String, riV_2> field_236343_i_;
    private final String field_236344_j_;
    private static final /* synthetic */ riV_2[] $VALUES;

    private static /* synthetic */ riV_2[] id_byte() {
        return new riV_2[]{STANDARD, DESERT, JUNGLE, SWAMP, MOUNTAIN, OCEAN, NETHER};
    }

    private riV_2(String string2) {
        this.field_236344_j_ = string2;
    }

    static {
        $VALUES = riV_2.id_byte();
        field_236342_h_ = rpH_2.id_class(riV_2::values, riV_2::id_class);
        field_236343_i_ = Arrays.stream(riV_2.values()).collect(Collectors.toMap(riV_2::id_break, riV_22 -> riV_22));
    }

    public static riV_2[] values() {
        return (riV_2[])$VALUES.clone();
    }

    public static riV_2 valueOf(String string) {
        return Enum.valueOf(riV_2.class, string);
    }

    public static riV_2 id_class(String string) {
        return field_236343_i_.get(string);
    }

    @Override
    public String id_class() {
        return this.field_236344_j_;
    }

    public String id_break() {
        return this.field_236344_j_;
    }
}

