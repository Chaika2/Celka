/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 */
package celestial;

import celestial.jF_2;
import celestial.jL_2;
import celestial.jZ_2;
import celestial.jv_3;
import celestial.rrbb_3;
import celestial.rrdW;
import com.google.common.collect.ImmutableList;

public class ju_3 {
    public static final jv_3 id_class = new jv_3(0, jF_2.FLOAT, jL_2.POSITION, 3);
    public static final jv_3 id_break = new jv_3(0, jF_2.UBYTE, jL_2.COLOR, 4);
    public static final jv_3 id_byte = new jv_3(0, jF_2.FLOAT, jL_2.UV, 2);
    public static final jv_3 id_protected = new jv_3(1, jF_2.SHORT, jL_2.UV, 2);
    public static final jv_3 id_throws = new jv_3(2, jF_2.SHORT, jL_2.UV, 2);
    public static final jv_3 id_case = new jv_3(0, jF_2.BYTE, jL_2.NORMAL, 3);
    public static final jv_3 id_catch = new jv_3(0, jF_2.BYTE, jL_2.PADDING, 1);
    public static final jZ_2 id_private = new jZ_2((ImmutableList<jv_3>)ImmutableList.builder().add((Object)id_class).add((Object)id_break).add((Object)id_byte).add((Object)id_throws).add((Object)id_case).add((Object)id_catch).build());
    public static final jZ_2 id_implements = new jZ_2((ImmutableList<jv_3>)ImmutableList.builder().add((Object)id_class).add((Object)id_break).add((Object)id_byte).add((Object)id_protected).add((Object)id_throws).add((Object)id_case).add((Object)id_catch).build());
    public static final jZ_2 id_finally = id_private.id_native();
    public static final jZ_2 id_extends = rrdW.id_class(id_finally);
    public static final int id_native = id_finally.id_break();
    public static final int id_volatile = id_extends.id_break();
    public static final jZ_2 id_final = id_implements.id_native();
    public static final jZ_2 id_package = rrdW.id_break(id_final);
    public static final int id_int = id_final.id_break();
    public static final int id_new = id_package.id_break();
    @Deprecated
    public static final jZ_2 id_continue = new jZ_2((ImmutableList<jv_3>)ImmutableList.builder().add((Object)id_class).add((Object)id_byte).add((Object)id_break).add((Object)id_throws).build());
    public static final jZ_2 id_super = new jZ_2((ImmutableList<jv_3>)ImmutableList.builder().add((Object)id_class).build());
    public static final jZ_2 id_this = new jZ_2((ImmutableList<jv_3>)ImmutableList.builder().add((Object)id_class).add((Object)id_break).build());
    public static final jZ_2 id_else = new jZ_2((ImmutableList<jv_3>)ImmutableList.builder().add((Object)id_class).add((Object)id_break).add((Object)id_throws).build());
    public static final jZ_2 id_synchronized = new jZ_2((ImmutableList<jv_3>)ImmutableList.builder().add((Object)id_class).add((Object)id_byte).build());
    public static final jZ_2 id_return = new jZ_2((ImmutableList<jv_3>)ImmutableList.builder().add((Object)id_class).add((Object)id_break).add((Object)id_byte).build());
    @Deprecated
    public static final jZ_2 id_public = new jZ_2((ImmutableList<jv_3>)ImmutableList.builder().add((Object)id_class).add((Object)id_byte).add((Object)id_break).build());
    public static final jZ_2 id_goto = new jZ_2((ImmutableList<jv_3>)ImmutableList.builder().add((Object)id_class).add((Object)id_break).add((Object)id_byte).add((Object)id_throws).build());
    @Deprecated
    public static final jZ_2 id_while = new jZ_2((ImmutableList<jv_3>)ImmutableList.builder().add((Object)id_class).add((Object)id_byte).add((Object)id_throws).add((Object)id_break).build());
    @Deprecated
    public static final jZ_2 id_try = new jZ_2((ImmutableList<jv_3>)ImmutableList.builder().add((Object)id_class).add((Object)id_byte).add((Object)id_break).add((Object)id_case).add((Object)id_catch).build());

    static {
        id_class.id_class("POSITION_3F");
        id_break.id_class("COLOR_4UB");
        id_byte.id_class("TEX_2F");
        id_protected.id_class("TEX_2S");
        id_throws.id_class("TEX_2SB");
        id_case.id_class("NORMAL_3B");
        id_catch.id_class("PADDING_1B");
        id_private.id_class("BLOCK");
        id_implements.id_class("ENTITY");
        id_extends.id_class("BLOCK_SHADERS");
        id_package.id_class("ENTITY_SHADERS");
        id_continue.id_class("PARTICLE_POSITION_TEX_COLOR_LMAP");
        id_super.id_class("POSITION");
        id_this.id_class("POSITION_COLOR");
        id_else.id_class("POSITION_COLOR_LIGHTMAP");
        id_synchronized.id_class("POSITION_TEX");
        id_return.id_class("POSITION_COLOR_TEX");
        id_public.id_class("POSITION_TEX_COLOR");
        id_goto.id_class("POSITION_COLOR_TEX_LIGHTMAP");
        id_while.id_class("POSITION_TEX_LIGHTMAP_COLOR");
        id_try.id_class("POSITION_TEX_COLOR_NORMAL");
    }

    public static void id_class() {
        if (rrbb_3.rs()) {
            id_private.id_class(id_extends);
            id_implements.id_class(id_package);
        } else {
            id_private.id_class(id_finally);
            id_implements.id_class(id_final);
        }
    }
}

