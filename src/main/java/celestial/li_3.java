/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HP;
import celestial.Hr_1;
import celestial.rpr_3;
import celestial.rqR_2;

public final class li_3
extends Enum<li_3> {
    public static final /* enum */ li_3 DOWN = new li_3(new HP(Hr_1.id_case, Hr_1.id_throws, Hr_1.id_class), new HP(Hr_1.id_case, Hr_1.id_throws, Hr_1.id_protected), new HP(Hr_1.id_byte, Hr_1.id_throws, Hr_1.id_protected), new HP(Hr_1.id_byte, Hr_1.id_throws, Hr_1.id_class));
    public static final /* enum */ li_3 UP = new li_3(new HP(Hr_1.id_case, Hr_1.id_break, Hr_1.id_protected), new HP(Hr_1.id_case, Hr_1.id_break, Hr_1.id_class), new HP(Hr_1.id_byte, Hr_1.id_break, Hr_1.id_class), new HP(Hr_1.id_byte, Hr_1.id_break, Hr_1.id_protected));
    public static final /* enum */ li_3 NORTH = new li_3(new HP(Hr_1.id_byte, Hr_1.id_break, Hr_1.id_protected), new HP(Hr_1.id_byte, Hr_1.id_throws, Hr_1.id_protected), new HP(Hr_1.id_case, Hr_1.id_throws, Hr_1.id_protected), new HP(Hr_1.id_case, Hr_1.id_break, Hr_1.id_protected));
    public static final /* enum */ li_3 SOUTH = new li_3(new HP(Hr_1.id_case, Hr_1.id_break, Hr_1.id_class), new HP(Hr_1.id_case, Hr_1.id_throws, Hr_1.id_class), new HP(Hr_1.id_byte, Hr_1.id_throws, Hr_1.id_class), new HP(Hr_1.id_byte, Hr_1.id_break, Hr_1.id_class));
    public static final /* enum */ li_3 WEST = new li_3(new HP(Hr_1.id_case, Hr_1.id_break, Hr_1.id_protected), new HP(Hr_1.id_case, Hr_1.id_throws, Hr_1.id_protected), new HP(Hr_1.id_case, Hr_1.id_throws, Hr_1.id_class), new HP(Hr_1.id_case, Hr_1.id_break, Hr_1.id_class));
    public static final /* enum */ li_3 EAST = new li_3(new HP(Hr_1.id_byte, Hr_1.id_break, Hr_1.id_class), new HP(Hr_1.id_byte, Hr_1.id_throws, Hr_1.id_class), new HP(Hr_1.id_byte, Hr_1.id_throws, Hr_1.id_protected), new HP(Hr_1.id_byte, Hr_1.id_break, Hr_1.id_protected));
    private static final li_3[] FACINGS;
    private final HP[] vertexInfos;
    private static final /* synthetic */ li_3[] $VALUES;

    private li_3(HP ... hPArray) {
        this.vertexInfos = hPArray;
    }

    static {
        $VALUES = li_3.id_class();
        FACINGS = rqR_2.id_class(new li_3[6], li_3Array -> {
            li_3Array[Hr_1.id_throws] = DOWN;
            li_3Array[Hr_1.id_break] = UP;
            li_3Array[Hr_1.id_protected] = NORTH;
            li_3Array[Hr_1.id_class] = SOUTH;
            li_3Array[Hr_1.id_case] = WEST;
            li_3Array[Hr_1.id_byte] = EAST;
        });
    }

    public static li_3[] values() {
        return (li_3[])$VALUES.clone();
    }

    public static li_3 valueOf(String string) {
        return Enum.valueOf(li_3.class, string);
    }

    public HP id_class(int n) {
        return this.vertexInfos[n];
    }

    private static /* synthetic */ li_3[] id_class() {
        return new li_3[]{DOWN, UP, NORTH, SOUTH, WEST, EAST};
    }

    public static li_3 id_class(rpr_3 rpr_32) {
        return FACINGS[rpr_32.id_byte()];
    }
}

