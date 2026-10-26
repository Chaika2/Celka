/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Stream;

public final class rgD_2
extends Enum<rgD_2> {
    public static final /* enum */ rgD_2 MAJOR_NEGATIVE = new rgD_2("major_negative", -5, 100, 10, 10);
    public static final /* enum */ rgD_2 MINOR_NEGATIVE = new rgD_2("minor_negative", -1, 200, 20, 20);
    public static final /* enum */ rgD_2 MINOR_POSITIVE = new rgD_2("minor_positive", 1, 200, 1, 5);
    public static final /* enum */ rgD_2 MAJOR_POSITIVE = new rgD_2("major_positive", 5, 100, 0, 100);
    public static final /* enum */ rgD_2 TRADING = new rgD_2("trading", 1, 25, 2, 20);
    public final String id;
    public final int weight;
    public final int max;
    public final int decayPerDay;
    public final int decayPerTransfer;
    private static final Map<String, rgD_2> BY_ID;
    private static final /* synthetic */ rgD_2[] $VALUES;

    private rgD_2(String string2, int n2, int n3, int n4, int n5) {
        this.id = string2;
        this.weight = n2;
        this.max = n3;
        this.decayPerDay = n4;
        this.decayPerTransfer = n5;
    }

    static {
        $VALUES = rgD_2.id_class();
        BY_ID = (Map)Stream.of(rgD_2.values()).collect(ImmutableMap.toImmutableMap(rgD_22 -> rgD_22.id, Function.identity()));
    }

    public static rgD_2[] values() {
        return (rgD_2[])$VALUES.clone();
    }

    public static rgD_2 valueOf(String string) {
        return Enum.valueOf(rgD_2.class, string);
    }

    public static rgD_2 id_class(String string) {
        return BY_ID.get(string);
    }

    private static /* synthetic */ rgD_2[] id_class() {
        return new rgD_2[]{MAJOR_NEGATIVE, MINOR_NEGATIVE, MINOR_POSITIVE, MAJOR_POSITIVE, TRADING};
    }
}

