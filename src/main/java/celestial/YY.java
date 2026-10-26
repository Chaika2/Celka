/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType$StringType
 */
package celestial;

import celestial.RI;
import celestial.ruu_3;
import com.google.gson.JsonObject;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;

public class YY
implements RI<StringArgumentType> {
    @Override
    public /* synthetic */ ArgumentType id_class(ruu_3 ruu_32) {
        return this.id_break(ruu_32);
    }

    @Override
    public void id_class(StringArgumentType stringArgumentType, JsonObject jsonObject) {
        switch (stringArgumentType.getType()) {
            case SINGLE_WORD: {
                jsonObject.addProperty("type", "word");
                break;
            }
            case QUOTABLE_PHRASE: {
                jsonObject.addProperty("type", "phrase");
                break;
            }
            default: {
                jsonObject.addProperty("type", "greedy");
            }
        }
    }

    @Override
    public void id_class(StringArgumentType stringArgumentType, ruu_3 ruu_32) {
        ruu_32.id_class((Enum<?>)stringArgumentType.getType());
    }

    public StringArgumentType id_break(ruu_3 ruu_32) {
        StringArgumentType.StringType stringType = ruu_32.id_class(StringArgumentType.StringType.class);
        switch (stringType) {
            case SINGLE_WORD: {
                return StringArgumentType.word();
            }
            case QUOTABLE_PHRASE: {
                return StringArgumentType.string();
            }
        }
        return StringArgumentType.greedyString();
    }
}

