/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgP_2;
import celestial.rgn_3;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public final class rnX_2
extends Enum<rnX_2> {
    public static final /* enum */ rnX_2 ALWAYS = new rnX_2("always", 0);
    public static final /* enum */ rnX_2 NEVER = new rnX_2("never", 1);
    public static final /* enum */ rnX_2 HIDE_FOR_OTHER_TEAMS = new rnX_2("hideForOtherTeams", 2);
    public static final /* enum */ rnX_2 HIDE_FOR_OWN_TEAM = new rnX_2("hideForOwnTeam", 3);
    private static final Map<String, rnX_2> nameMap;
    public final String internalName;
    public final int id;
    private static final /* synthetic */ rnX_2[] $VALUES;

    private rnX_2(String string2, int n2) {
        this.internalName = string2;
        this.id = n2;
    }

    static {
        $VALUES = rnX_2.id_break();
        nameMap = Arrays.stream(rnX_2.values()).collect(Collectors.toMap(rnX_22 -> rnX_22.internalName, rnX_22 -> rnX_22));
    }

    public static rnX_2[] values() {
        return (rnX_2[])$VALUES.clone();
    }

    public static rnX_2 valueOf(String string) {
        return Enum.valueOf(rnX_2.class, string);
    }

    public rgP_2 id_class() {
        return new rgn_3("team.visibility." + this.internalName);
    }

    public static rnX_2 id_class(String string) {
        return nameMap.get(string);
    }

    private static /* synthetic */ rnX_2[] id_break() {
        return new rnX_2[]{ALWAYS, NEVER, HIDE_FOR_OTHER_TEAMS, HIDE_FOR_OWN_TEAM};
    }
}

