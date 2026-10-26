/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.LongArgumentType
 */
package celestial;

import celestial.RI;
import celestial.Yf_1;
import celestial.ruu_3;
import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.LongArgumentType;

public class YR
implements RI<LongArgumentType> {
    @Override
    public /* synthetic */ ArgumentType id_class(ruu_3 ruu_32) {
        return this.id_break(ruu_32);
    }

    @Override
    public void id_class(LongArgumentType longArgumentType, JsonObject jsonObject) {
        if (longArgumentType.getMinimum() != Long.MIN_VALUE) {
            jsonObject.addProperty("min", (Number)longArgumentType.getMinimum());
        }
        if (longArgumentType.getMaximum() != Long.MAX_VALUE) {
            jsonObject.addProperty("max", (Number)longArgumentType.getMaximum());
        }
    }

    @Override
    public void id_class(LongArgumentType longArgumentType, ruu_3 ruu_32) {
        boolean bl = longArgumentType.getMinimum() != Long.MIN_VALUE;
        boolean bl2 = longArgumentType.getMaximum() != Long.MAX_VALUE;
        ruu_32.writeByte(Yf_1.id_class(bl, bl2));
        if (bl) {
            ruu_32.writeLong(longArgumentType.getMinimum());
        }
        if (bl2) {
            ruu_32.writeLong(longArgumentType.getMaximum());
        }
    }

    public LongArgumentType id_break(ruu_3 ruu_32) {
        byte by = ruu_32.readByte();
        long l = Yf_1.id_class(by) ? ruu_32.readLong() : Long.MIN_VALUE;
        long l2 = Yf_1.id_break(by) ? ruu_32.readLong() : Long.MAX_VALUE;
        return LongArgumentType.longArg((long)l, (long)l2);
    }
}

