/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.ArgumentType
 */
package celestial;

import celestial.RI;
import celestial.Yv_1;
import celestial.ruu_3;
import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public class YA
implements RI<Yv_1> {
    @Override
    public /* synthetic */ ArgumentType id_class(ruu_3 ruu_32) {
        return this.id_break(ruu_32);
    }

    @Override
    public void id_class(Yv_1 yv_1, JsonObject jsonObject) {
        jsonObject.addProperty("amount", yv_1.id_protected ? "multiple" : "single");
    }

    @Override
    public void id_class(Yv_1 yv_1, ruu_3 ruu_32) {
        int n = 0;
        if (yv_1.id_protected) {
            n = (byte)(n | 1);
        }
        ruu_32.writeByte(n);
    }

    public Yv_1 id_break(ruu_3 ruu_32) {
        byte by = ruu_32.readByte();
        boolean bl = (by & 1) != 0;
        return new Yv_1(bl);
    }
}

