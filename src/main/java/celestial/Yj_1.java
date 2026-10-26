/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.DoubleArgumentType
 */
package celestial;

import celestial.RI;
import celestial.Yf_1;
import celestial.ruu_3;
import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;

public class Yj_1
implements RI<DoubleArgumentType> {
    @Override
    public /* synthetic */ ArgumentType id_class(ruu_3 ruu_32) {
        return this.id_break(ruu_32);
    }

    @Override
    public void id_class(DoubleArgumentType doubleArgumentType, JsonObject jsonObject) {
        if (doubleArgumentType.getMinimum() != -1.7976931348623157E308) {
            jsonObject.addProperty("min", (Number)doubleArgumentType.getMinimum());
        }
        if (doubleArgumentType.getMaximum() != Double.MAX_VALUE) {
            jsonObject.addProperty("max", (Number)doubleArgumentType.getMaximum());
        }
    }

    @Override
    public void id_class(DoubleArgumentType doubleArgumentType, ruu_3 ruu_32) {
        boolean bl = doubleArgumentType.getMinimum() != -1.7976931348623157E308;
        boolean bl2 = doubleArgumentType.getMaximum() != Double.MAX_VALUE;
        ruu_32.writeByte(Yf_1.id_class(bl, bl2));
        if (bl) {
            ruu_32.writeDouble(doubleArgumentType.getMinimum());
        }
        if (bl2) {
            ruu_32.writeDouble(doubleArgumentType.getMaximum());
        }
    }

    public DoubleArgumentType id_break(ruu_3 ruu_32) {
        byte by = ruu_32.readByte();
        double d = Yf_1.id_class(by) ? ruu_32.readDouble() : -1.7976931348623157E308;
        double d2 = Yf_1.id_break(by) ? ruu_32.readDouble() : Double.MAX_VALUE;
        return DoubleArgumentType.doubleArg((double)d, (double)d2);
    }
}

