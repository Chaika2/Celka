/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgn_3;

public final class AW
extends Enum<AW> {
    public static final /* enum */ AW FAVORITES = new AW("Favorites", new rgn_3("unique_servers.favorites"));
    public static final /* enum */ AW MOST_POPULAR = new AW("Most Popular", new rgn_3("unique_servers.most_popular"));
    public static final /* enum */ AW DEFAULT = new AW("Default", new rgn_3("unique_servers.default"));
    private final String typeName;
    private final rgn_3 name;
    private static final /* synthetic */ AW[] $VALUES;

    private static /* synthetic */ AW[] id_byte() {
        return new AW[]{FAVORITES, MOST_POPULAR, DEFAULT};
    }

    private AW(String string2, rgn_3 rgn_32) {
        this.typeName = string2;
        this.name = rgn_32;
    }

    static {
        $VALUES = AW.id_byte();
    }

    public static AW[] values() {
        return (AW[])$VALUES.clone();
    }

    public static AW valueOf(String string) {
        return Enum.valueOf(AW.class, string);
    }

    public String id_class() {
        return this.typeName;
    }

    public static AW id_class(String string) {
        for (AW aW : AW.values()) {
            if (!aW.typeName.equalsIgnoreCase(string.toLowerCase())) continue;
            return aW;
        }
        return null;
    }

    public rgn_3 id_break() {
        return this.name;
    }
}

