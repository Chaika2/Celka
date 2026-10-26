/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.FloatArgumentType
 */
package celestial;

import celestial.RI;
import celestial.Yf_1;
import celestial.ruu_3;
import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;

public class YV
implements RI<FloatArgumentType> {
    @Override
    public /* synthetic */ ArgumentType id_class(ruu_3 ruu_32) {
        return this.id_break(ruu_32);
    }

    @Override
    public void id_class(FloatArgumentType floatArgumentType, JsonObject jsonObject) {
        if (floatArgumentType.getMinimum() != -3.4028235E38f) {
            jsonObject.addProperty("min", (Number)Float.valueOf(floatArgumentType.getMinimum()));
        }
        if (floatArgumentType.getMaximum() != Float.MAX_VALUE) {
            jsonObject.addProperty("max", (Number)Float.valueOf(floatArgumentType.getMaximum()));
        }
    }

    @Override
    public void id_class(FloatArgumentType floatArgumentType, ruu_3 ruu_32) {
        boolean bl = floatArgumentType.getMinimum() != -3.4028235E38f;
        boolean bl2 = floatArgumentType.getMaximum() != Float.MAX_VALUE;
        ruu_32.writeByte(Yf_1.id_class(bl, bl2));
        if (bl) {
            ruu_32.writeFloat(floatArgumentType.getMinimum());
        }
        if (bl2) {
            ruu_32.writeFloat(floatArgumentType.getMaximum());
        }
    }

    public FloatArgumentType id_break(ruu_3 ruu_32) {
        byte by = ruu_32.readByte();
        float f = Yf_1.id_class(by) ? ruu_32.readFloat() : -3.4028235E38f;
        float f2 = Yf_1.id_break(by) ? ruu_32.readFloat() : Float.MAX_VALUE;
        return FloatArgumentType.floatArg((float)f, (float)f2);
    }
}

