/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL$TypeReference
 */
package celestial;

import celestial.rTC;
import com.mojang.datafixers.DSL;

public final class rTv_1
extends Enum<rTv_1> {
    public static final /* enum */ rTv_1 LEVEL = new rTv_1(rTC.id_class);
    public static final /* enum */ rTv_1 PLAYER = new rTv_1(rTC.id_break);
    public static final /* enum */ rTv_1 CHUNK = new rTv_1(rTC.id_byte);
    public static final /* enum */ rTv_1 HOTBAR = new rTv_1(rTC.id_protected);
    public static final /* enum */ rTv_1 OPTIONS = new rTv_1(rTC.id_throws);
    public static final /* enum */ rTv_1 STRUCTURE = new rTv_1(rTC.id_case);
    public static final /* enum */ rTv_1 STATS = new rTv_1(rTC.id_catch);
    public static final /* enum */ rTv_1 SAVED_DATA = new rTv_1(rTC.id_private);
    public static final /* enum */ rTv_1 ADVANCEMENTS = new rTv_1(rTC.id_implements);
    public static final /* enum */ rTv_1 POI_CHUNK = new rTv_1(rTC.id_finally);
    public static final /* enum */ rTv_1 WORLD_GEN_SETTINGS = new rTv_1(rTC.id_goto);
    private final DSL.TypeReference reference;
    private static final /* synthetic */ rTv_1[] $VALUES;

    private rTv_1(DSL.TypeReference typeReference) {
        this.reference = typeReference;
    }

    static {
        $VALUES = rTv_1.id_break();
    }

    public static rTv_1[] values() {
        return (rTv_1[])$VALUES.clone();
    }

    public static rTv_1 valueOf(String string) {
        return Enum.valueOf(rTv_1.class, string);
    }

    public DSL.TypeReference id_class() {
        return this.reference;
    }

    private static /* synthetic */ rTv_1[] id_break() {
        return new rTv_1[]{LEVEL, PLAYER, CHUNK, HOTBAR, OPTIONS, STRUCTURE, STATS, SAVED_DATA, ADVANCEMENTS, POI_CHUNK, WORLD_GEN_SETTINGS};
    }
}

