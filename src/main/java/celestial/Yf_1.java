/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.DoubleArgumentType
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.arguments.LongArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 */
package celestial;

import celestial.RE;
import celestial.RG;
import celestial.YR;
import celestial.YV;
import celestial.YY;
import celestial.Yg_1;
import celestial.Yj_1;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.LongArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;

public class Yf_1 {
    public static boolean id_class(byte by) {
        return (by & 1) != 0;
    }

    public static byte id_class(boolean bl, boolean bl2) {
        byte by = 0;
        if (bl) {
            by = (byte)(by | 1);
        }
        if (bl2) {
            by = (byte)(by | 2);
        }
        return by;
    }

    public static void id_class() {
        RG.id_class("brigadier:bool", BoolArgumentType.class, new RE<BoolArgumentType>(BoolArgumentType::bool));
        RG.id_class("brigadier:float", FloatArgumentType.class, new YV());
        RG.id_class("brigadier:double", DoubleArgumentType.class, new Yj_1());
        RG.id_class("brigadier:integer", IntegerArgumentType.class, new Yg_1());
        RG.id_class("brigadier:long", LongArgumentType.class, new YR());
        RG.id_class("brigadier:string", StringArgumentType.class, new YY());
    }

    public static boolean id_break(byte by) {
        return (by & 2) != 0;
    }
}

