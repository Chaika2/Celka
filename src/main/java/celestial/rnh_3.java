/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rgP_2;
import celestial.rgn_3;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public final class rnh_3
extends Enum<rnh_3> {
    public static final /* enum */ rnh_3 ALWAYS = new rnh_3("always", 0);
    public static final /* enum */ rnh_3 NEVER = new rnh_3("never", 1);
    public static final /* enum */ rnh_3 PUSH_OTHER_TEAMS = new rnh_3("pushOtherTeams", 2);
    public static final /* enum */ rnh_3 PUSH_OWN_TEAM = new rnh_3("pushOwnTeam", 3);
    private static final Map<String, rnh_3> nameMap;
    public final String name;
    public final int id;
    private static final /* synthetic */ rnh_3[] $VALUES;

    private rnh_3(String string2, int n2) {
        this.name = string2;
        this.id = n2;
    }

    static {
        $VALUES = rnh_3.id_break();
        nameMap = Arrays.stream(rnh_3.values()).collect(Collectors.toMap(rnh_32 -> rnh_32.name, rnh_32 -> rnh_32));
    }

    public static rnh_3[] values() {
        return (rnh_3[])$VALUES.clone();
    }

    public static rnh_3 valueOf(String string) {
        return Enum.valueOf(rnh_3.class, string);
    }

    public rgP_2 id_class() {
        return new rgn_3("team.collision." + this.name);
    }

    public static rnh_3 id_class(String string) {
        return nameMap.get(string);
    }

    private static /* synthetic */ rnh_3[] id_break() {
        return new rnh_3[]{ALWAYS, NEVER, PUSH_OTHER_TEAMS, PUSH_OWN_TEAM};
    }
}

