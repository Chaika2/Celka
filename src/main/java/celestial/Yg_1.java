/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 */
package celestial;

import celestial.RI;
import celestial.Yf_1;
import celestial.ruu_3;
import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;

public class Yg_1
implements RI<IntegerArgumentType> {
    @Override
    public /* synthetic */ ArgumentType id_class(ruu_3 ruu_32) {
        return this.id_break(ruu_32);
    }

    @Override
    public void id_class(IntegerArgumentType integerArgumentType, JsonObject jsonObject) {
        if (integerArgumentType.getMinimum() != Integer.MIN_VALUE) {
            jsonObject.addProperty("min", (Number)integerArgumentType.getMinimum());
        }
        if (integerArgumentType.getMaximum() != Integer.MAX_VALUE) {
            jsonObject.addProperty("max", (Number)integerArgumentType.getMaximum());
        }
    }

    @Override
    public void id_class(IntegerArgumentType integerArgumentType, ruu_3 ruu_32) {
        boolean bl = integerArgumentType.getMinimum() != Integer.MIN_VALUE;
        boolean bl2 = integerArgumentType.getMaximum() != Integer.MAX_VALUE;
        ruu_32.writeByte(Yf_1.id_class(bl, bl2));
        if (bl) {
            ruu_32.writeInt(integerArgumentType.getMinimum());
        }
        if (bl2) {
            ruu_32.writeInt(integerArgumentType.getMaximum());
        }
    }

    public IntegerArgumentType id_break(ruu_3 ruu_32) {
        byte by = ruu_32.readByte();
        int n = Yf_1.id_class(by) ? ruu_32.readInt() : Integer.MIN_VALUE;
        int n2 = Yf_1.id_break(by) ? ruu_32.readInt() : Integer.MAX_VALUE;
        return IntegerArgumentType.integer((int)n, (int)n2);
    }
}

