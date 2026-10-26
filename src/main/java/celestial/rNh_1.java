/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 */
package celestial;

import celestial.YJ;
import celestial.rNE;
import celestial.rNs_1;
import celestial.rcZ_2;
import celestial.rpY_2;
import com.google.gson.JsonObject;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.function.Supplier;

public class rNh_1 {
    private final String id_class;
    private final YJ id_break;
    private final String id_byte;
    private final YJ id_protected;
    private final rNE id_throws;

    public rNh_1(String string, String string2, rNE rNE2) {
        this.id_class = string;
        this.id_break = rNs_1.id_class(string);
        this.id_byte = string2;
        this.id_protected = rNs_1.id_class(string2);
        this.id_throws = rNE2;
    }

    public static rNh_1 id_class(JsonObject jsonObject) {
        String string = rpY_2.id_case(jsonObject, "source");
        String string2 = rpY_2.id_case(jsonObject, "target");
        rNE rNE2 = rNE.id_class(rpY_2.id_case(jsonObject, "op"));
        return new rNh_1(string, string2, rNE2);
    }

    public JsonObject id_class() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("source", this.id_class);
        jsonObject.addProperty("target", this.id_byte);
        jsonObject.addProperty("op", this.id_throws.op);
        return jsonObject;
    }

    public void id_class(Supplier<rcZ_2> supplier, rcZ_2 rcZ_22) {
        try {
            List<rcZ_2> list = this.id_break.id_class(rcZ_22);
            if (!list.isEmpty()) {
                this.id_throws.id_class(supplier.get(), this.id_protected, list);
            }
        }
        catch (CommandSyntaxException commandSyntaxException) {
            // empty catch block
        }
    }
}

