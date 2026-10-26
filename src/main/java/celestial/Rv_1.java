/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.ArgumentType
 */
package celestial;

import celestial.RI;
import celestial.RZ;
import celestial.ruu_3;
import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;

public class Rv_1
implements RI<RZ> {
    @Override
    public /* synthetic */ ArgumentType id_class(ruu_3 ruu_32) {
        return this.id_break(ruu_32);
    }

    @Override
    public void id_class(RZ rZ, JsonObject jsonObject) {
        jsonObject.addProperty("amount", rZ.id_private ? "single" : "multiple");
        jsonObject.addProperty("type", rZ.id_implements ? "players" : "entities");
    }

    @Override
    public void id_class(RZ rZ, ruu_3 ruu_32) {
        byte by = 0;
        if (rZ.id_private) {
            by = (byte)(by | 1);
        }
        if (rZ.id_implements) {
            by = (byte)(by | 2);
        }
        ruu_32.writeByte(by);
    }

    public RZ id_break(ruu_3 ruu_32) {
        byte by = ruu_32.readByte();
        return new RZ((by & 1) != 0, (by & 2) != 0);
    }
}

