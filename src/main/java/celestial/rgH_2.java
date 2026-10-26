/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public final class rgH_2
extends Enum<rgH_2> {
    public static final /* enum */ rgH_2 OPEN_URL = new rgH_2("open_url", true);
    public static final /* enum */ rgH_2 OPEN_FILE = new rgH_2("open_file", false);
    public static final /* enum */ rgH_2 RUN_COMMAND = new rgH_2("run_command", true);
    public static final /* enum */ rgH_2 SUGGEST_COMMAND = new rgH_2("suggest_command", true);
    public static final /* enum */ rgH_2 CHANGE_PAGE = new rgH_2("change_page", true);
    public static final /* enum */ rgH_2 COPY_TO_CLIPBOARD = new rgH_2("copy_to_clipboard", true);
    public static final /* enum */ rgH_2 RUNNABLE = new rgH_2("runnable", true);
    private static final Map<String, rgH_2> NAME_MAPPING;
    private final boolean allowedInChat;
    private final String canonicalName;
    private static final /* synthetic */ rgH_2[] $VALUES;

    private static /* synthetic */ rgH_2[] id_byte() {
        return new rgH_2[]{OPEN_URL, OPEN_FILE, RUN_COMMAND, SUGGEST_COMMAND, CHANGE_PAGE, COPY_TO_CLIPBOARD, RUNNABLE};
    }

    private rgH_2(String string2, boolean bl) {
        this.canonicalName = string2;
        this.allowedInChat = bl;
    }

    static {
        $VALUES = rgH_2.id_byte();
        NAME_MAPPING = Arrays.stream(rgH_2.values()).collect(Collectors.toMap(rgH_2::id_break, rgH_22 -> rgH_22));
    }

    public static rgH_2[] values() {
        return (rgH_2[])$VALUES.clone();
    }

    public static rgH_2 valueOf(String string) {
        return Enum.valueOf(rgH_2.class, string);
    }

    public static rgH_2 id_class(String string) {
        return NAME_MAPPING.get(string);
    }

    public boolean id_class() {
        return this.allowedInChat;
    }

    public String id_break() {
        return this.canonicalName;
    }
}

