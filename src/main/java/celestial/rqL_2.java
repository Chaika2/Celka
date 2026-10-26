/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class rqL_2
extends Enum<rqL_2> {
    public static final /* enum */ rqL_2 MASTER = new rqL_2("master", 1.0f);
    public static final /* enum */ rqL_2 MUSIC = new rqL_2("music", 0.0f);
    public static final /* enum */ rqL_2 RECORDS = new rqL_2("record", 1.0f);
    public static final /* enum */ rqL_2 WEATHER = new rqL_2("weather", 1.0f);
    public static final /* enum */ rqL_2 BLOCKS = new rqL_2("block", 1.0f);
    public static final /* enum */ rqL_2 HOSTILE = new rqL_2("hostile", 1.0f);
    public static final /* enum */ rqL_2 NEUTRAL = new rqL_2("neutral", 1.0f);
    public static final /* enum */ rqL_2 PLAYERS = new rqL_2("player", 1.0f);
    public static final /* enum */ rqL_2 AMBIENT = new rqL_2("ambient", 1.0f);
    public static final /* enum */ rqL_2 VOICE = new rqL_2("voice", 1.0f);
    public static final /* enum */ rqL_2 CLIENT = new rqL_2("client", 1.0f);
    private static final Map<String, rqL_2> SOUND_CATEGORIES;
    private final String name;
    private float defaultVolume = 1.0f;
    private static final /* synthetic */ rqL_2[] $VALUES;

    private static /* synthetic */ rqL_2[] id_byte() {
        return new rqL_2[]{MASTER, MUSIC, RECORDS, WEATHER, BLOCKS, HOSTILE, NEUTRAL, PLAYERS, AMBIENT, VOICE, CLIENT};
    }

    private rqL_2(String string2, float f) {
        this.name = string2;
        this.defaultVolume = f;
    }

    static {
        $VALUES = rqL_2.id_byte();
        SOUND_CATEGORIES = Arrays.stream(rqL_2.values()).collect(Collectors.toMap(rqL_2::id_class, Function.identity()));
    }

    public static rqL_2[] values() {
        return (rqL_2[])$VALUES.clone();
    }

    public static rqL_2 valueOf(String string) {
        return Enum.valueOf(rqL_2.class, string);
    }

    public String id_class() {
        return this.name;
    }

    public float id_break() {
        return this.defaultVolume;
    }
}

