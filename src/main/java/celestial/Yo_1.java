/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.brigadier.arguments.StringArgumentType$StringType
 */
package celestial;

import com.mojang.brigadier.arguments.StringArgumentType;

public class Yo_1 {
    public static final /* synthetic */ int[] id_class;

    static {
        id_class = new int[StringArgumentType.StringType.values().length];
        try {
            Yo_1.id_class[StringArgumentType.StringType.SINGLE_WORD.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Yo_1.id_class[StringArgumentType.StringType.QUOTABLE_PHRASE.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            Yo_1.id_class[StringArgumentType.StringType.GREEDY_PHRASE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

