/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public final class rgF_2
extends Enum<rgF_2> {
    public static final /* enum */ rgF_2 BLACK = new rgF_2("BLACK", '0', 0, 0);
    public static final /* enum */ rgF_2 DARK_BLUE = new rgF_2("DARK_BLUE", '1', 1, 170);
    public static final /* enum */ rgF_2 DARK_GREEN = new rgF_2("DARK_GREEN", '2', 2, 43520);
    public static final /* enum */ rgF_2 DARK_AQUA = new rgF_2("DARK_AQUA", '3', 3, 43690);
    public static final /* enum */ rgF_2 DARK_RED = new rgF_2("DARK_RED", '4', 4, 0xAA0000);
    public static final /* enum */ rgF_2 DARK_PURPLE = new rgF_2("DARK_PURPLE", '5', 5, 0xAA00AA);
    public static final /* enum */ rgF_2 GOLD = new rgF_2("GOLD", '6', 6, 0xFFAA00);
    public static final /* enum */ rgF_2 GRAY = new rgF_2("GRAY", '7', 7, 0xAAAAAA);
    public static final /* enum */ rgF_2 DARK_GRAY = new rgF_2("DARK_GRAY", '8', 8, 0x555555);
    public static final /* enum */ rgF_2 BLUE = new rgF_2("BLUE", '9', 9, 0x5555FF);
    public static final /* enum */ rgF_2 GREEN = new rgF_2("GREEN", 'a', 10, 0x55FF55);
    public static final /* enum */ rgF_2 AQUA = new rgF_2("AQUA", 'b', 11, 0x55FFFF);
    public static final /* enum */ rgF_2 RED = new rgF_2("RED", 'c', 12, 0xFF5555);
    public static final /* enum */ rgF_2 LIGHT_PURPLE = new rgF_2("LIGHT_PURPLE", 'd', 13, 0xFF55FF);
    public static final /* enum */ rgF_2 YELLOW = new rgF_2("YELLOW", 'e', 14, 0xFFFF55);
    public static final /* enum */ rgF_2 WHITE = new rgF_2("WHITE", 'f', 15, 0xFFFFFF);
    public static final /* enum */ rgF_2 OBFUSCATED = new rgF_2("OBFUSCATED", 'k', true);
    public static final /* enum */ rgF_2 BOLD = new rgF_2("BOLD", 'l', true);
    public static final /* enum */ rgF_2 STRIKETHROUGH = new rgF_2("STRIKETHROUGH", 'm', true);
    public static final /* enum */ rgF_2 UNDERLINE = new rgF_2("UNDERLINE", 'n', true);
    public static final /* enum */ rgF_2 ITALIC = new rgF_2("ITALIC", 'o', true);
    public static final /* enum */ rgF_2 RESET = new rgF_2("RESET", 'r', -1, null);
    private static final Map<String, rgF_2> NAME_MAPPING;
    private static final Pattern FORMATTING_CODE_PATTERN;
    private final String name;
    private final char formattingCode;
    private final boolean fancyStyling;
    private final String controlString;
    private final int colorIndex;
    private final Integer color;
    private static final /* synthetic */ rgF_2[] $VALUES;

    private static String id_byte(String string) {
        return string.toLowerCase(Locale.ROOT).replaceAll("[^a-z]", "");
    }

    public boolean id_byte() {
        return !this.fancyStyling && this != RESET;
    }

    private rgF_2(String string2, char c, boolean bl, int n2, Integer n3) {
        this.name = string2;
        this.formattingCode = c;
        this.fancyStyling = bl;
        this.colorIndex = n2;
        this.color = n3;
        this.controlString = "\u00a7" + c;
    }

    private rgF_2(String string2, char c, boolean bl) {
        this(string2, c, bl, -1, null);
    }

    private rgF_2(String string2, char c, int n2, Integer n3) {
        this(string2, c, false, n2, n3);
    }

    static {
        $VALUES = rgF_2.id_case();
        NAME_MAPPING = Arrays.stream(rgF_2.values()).collect(Collectors.toMap(rgF_22 -> rgF_2.id_byte(rgF_22.name), rgF_22 -> rgF_22));
        FORMATTING_CODE_PATTERN = Pattern.compile("(?i)\u00a7[0-9A-FK-OR]");
    }

    public String toString() {
        return this.controlString;
    }

    public static rgF_2[] values() {
        return (rgF_2[])$VALUES.clone();
    }

    public static rgF_2 valueOf(String string) {
        return Enum.valueOf(rgF_2.class, string);
    }

    public static String id_class(String string) {
        return string == null ? null : FORMATTING_CODE_PATTERN.matcher(string).replaceAll("");
    }

    public static Collection<String> id_class(boolean bl, boolean bl2) {
        ArrayList arrayList = Lists.newArrayList();
        for (rgF_2 rgF_22 : rgF_2.values()) {
            if (rgF_22.id_byte() && !bl || rgF_22.id_break() && !bl2) continue;
            arrayList.add(rgF_22.id_throws());
        }
        return arrayList;
    }

    public static rgF_2 id_class(char c) {
        char c2 = Character.toString(c).toLowerCase(Locale.ROOT).charAt(0);
        for (rgF_2 rgF_22 : rgF_2.values()) {
            if (rgF_22.formattingCode != c2) continue;
            return rgF_22;
        }
        return null;
    }

    public int id_class() {
        return this.colorIndex;
    }

    public static rgF_2 id_class(int n) {
        if (n < 0) {
            return RESET;
        }
        for (rgF_2 rgF_22 : rgF_2.values()) {
            if (rgF_22.id_class() != n) continue;
            return rgF_22;
        }
        return null;
    }

    public boolean id_break() {
        return this.fancyStyling;
    }

    public static rgF_2 id_break(String string) {
        return string == null ? null : NAME_MAPPING.get(rgF_2.id_byte(string));
    }

    public String id_throws() {
        return this.name().toLowerCase(Locale.ROOT);
    }

    private static /* synthetic */ rgF_2[] id_case() {
        return new rgF_2[]{BLACK, DARK_BLUE, DARK_GREEN, DARK_AQUA, DARK_RED, DARK_PURPLE, GOLD, GRAY, DARK_GRAY, BLUE, GREEN, AQUA, RED, LIGHT_PURPLE, YELLOW, WHITE, OBFUSCATED, BOLD, STRIKETHROUGH, UNDERLINE, ITALIC, RESET};
    }

    public Integer id_protected() {
        return this.color;
    }
}

