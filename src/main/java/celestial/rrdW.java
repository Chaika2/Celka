/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 */
package celestial;

import celestial.jF_2;
import celestial.jL_2;
import celestial.jZ_2;
import celestial.jv_3;
import com.google.common.collect.ImmutableList;

public class rrdW {
    public static final int id_class = 18;
    public static final int id_break = 8;
    public static final int id_byte = 9;
    public static final int id_protected = 11;
    public static final int id_throws = 13;
    public static final int id_case = 15;
    public static final jv_3 id_catch = rrdW.id_class("SHADERS_MIDOFFSET_3B", 0, jF_2.BYTE, jL_2.PADDING, 3);
    public static final jv_3 id_private = rrdW.id_class("PADDING_1B", 0, jF_2.BYTE, jL_2.PADDING, 1);
    public static final jv_3 id_implements = rrdW.id_class("SHADERS_MIDTEXCOORD_2F", 0, jF_2.FLOAT, jL_2.PADDING, 2);
    public static final jv_3 id_finally = rrdW.id_class("SHADERS_TANGENT_4S", 0, jF_2.SHORT, jL_2.PADDING, 4);
    public static final jv_3 id_extends = rrdW.id_class("SHADERS_MC_ENTITY_4S", 0, jF_2.SHORT, jL_2.PADDING, 4);
    public static final jv_3 id_native = rrdW.id_class("SHADERS_VELOCITY_3F", 0, jF_2.FLOAT, jL_2.PADDING, 3);

    public static jZ_2 id_class(jZ_2 jZ_22) {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll(jZ_22.id_byte());
        builder.add((Object)id_catch);
        builder.add((Object)id_private);
        builder.add((Object)id_implements);
        builder.add((Object)id_finally);
        builder.add((Object)id_extends);
        builder.add((Object)id_native);
        return new jZ_2((ImmutableList<jv_3>)builder.build());
    }

    private static jv_3 id_class(String string, int n, jF_2 jF_22, jL_2 jL_22, int n2) {
        jv_3 jv_32 = new jv_3(n, jF_22, jL_22, n2);
        jv_32.id_class(string);
        return jv_32;
    }

    public static jZ_2 id_break(jZ_2 jZ_22) {
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.addAll(jZ_22.id_byte());
        builder.add((Object)id_implements);
        builder.add((Object)id_finally);
        builder.add((Object)id_extends);
        builder.add((Object)id_native);
        return new jZ_2((ImmutableList<jv_3>)builder.build());
    }
}

