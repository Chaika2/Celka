/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  com.mojang.brigadier.CommandDispatcher
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.mojang.brigadier.context.CommandContext
 *  com.mojang.brigadier.exceptions.CommandSyntaxException
 *  com.mojang.brigadier.exceptions.Dynamic4CommandExceptionType
 */
package celestial;

import celestial.Kd_1;
import celestial.RZ;
import celestial.Yt_1;
import celestial.an_3;
import celestial.gp_3;
import celestial.gy_3;
import celestial.rfU_2;
import celestial.rgn_3;
import celestial.rhd_3;
import celestial.rjK_2;
import celestial.rnM_2;
import celestial.rrEm_1;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic4CommandExceptionType;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Random;

public class Kx_1 {
    private static final Dynamic4CommandExceptionType id_class = new Dynamic4CommandExceptionType((object, object2, object3, object4) -> new rgn_3("commands.spreadplayers.failed.teams", object, object2, object3, object4));
    private static final Dynamic4CommandExceptionType id_break = new Dynamic4CommandExceptionType((object, object2, object3, object4) -> new rgn_3("commands.spreadplayers.failed.entities", object, object2, object3, object4));

    public static void id_class(CommandDispatcher<gy_3> commandDispatcher) {
        commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("spreadplayers").requires(gy_32 -> gy_32.id_class(2))).then(gp_3.id_class("center", Yt_1.id_class()).then(gp_3.id_class("spreadDistance", FloatArgumentType.floatArg((float)0.0f)).then(((RequiredArgumentBuilder)gp_3.id_class("maxRange", FloatArgumentType.floatArg((float)1.0f)).then(gp_3.id_class("respectTeams", BoolArgumentType.bool()).then(gp_3.id_class("targets", RZ.id_break()).executes(commandContext -> Kx_1.id_class((gy_3)commandContext.getSource(), Yt_1.id_class((CommandContext<gy_3>)commandContext, "center"), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"spreadDistance"), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"maxRange"), 256, BoolArgumentType.getBool((CommandContext)commandContext, (String)"respectTeams"), RZ.id_break((CommandContext<gy_3>)commandContext, "targets")))))).then(gp_3.id_class("under").then(gp_3.id_class("maxHeight", IntegerArgumentType.integer((int)0)).then(gp_3.id_class("respectTeams", BoolArgumentType.bool()).then(gp_3.id_class("targets", RZ.id_break()).executes(commandContext -> Kx_1.id_class((gy_3)commandContext.getSource(), Yt_1.id_class((CommandContext<gy_3>)commandContext, "center"), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"spreadDistance"), FloatArgumentType.getFloat((CommandContext)commandContext, (String)"maxRange"), IntegerArgumentType.getInteger((CommandContext)commandContext, (String)"maxHeight"), BoolArgumentType.getBool((CommandContext)commandContext, (String)"respectTeams"), RZ.id_break((CommandContext<gy_3>)commandContext, "targets")))))))))));
    }

    private static Kd_1[] id_class(Random random, int n, double d, double d2, double d3, double d4) {
        Kd_1[] kd_1Array = new Kd_1[n];
        for (int i = 0; i < kd_1Array.length; ++i) {
            Kd_1 kd_1 = new Kd_1();
            kd_1.id_class(random, d, d2, d3, d4);
            kd_1Array[i] = kd_1;
        }
        return kd_1Array;
    }

    private static int id_class(gy_3 gy_32, rjK_2 rjK_22, float f, float f2, int n, boolean bl, Collection<? extends an_3> collection) throws CommandSyntaxException {
        Random random = new Random();
        double d = rjK_22.id_byte - f2;
        double d2 = rjK_22.id_protected - f2;
        double d3 = rjK_22.id_byte + f2;
        double d4 = rjK_22.id_protected + f2;
        Kd_1[] kd_1Array = Kx_1.id_class(random, bl ? Kx_1.id_class(collection) : collection.size(), d, d2, d3, d4);
        Kx_1.id_class(rjK_22, f, gy_32.id_final(), random, d, d2, d3, d4, n, kd_1Array, bl);
        double d5 = Kx_1.id_class(collection, gy_32.id_final(), kd_1Array, n, bl);
        gy_32.id_class(new rgn_3("commands.spreadplayers.success." + (bl ? "teams" : "entities"), kd_1Array.length, Float.valueOf(rjK_22.id_byte), Float.valueOf(rjK_22.id_protected), String.format(Locale.ROOT, "%.2f", d5)), true);
        return kd_1Array.length;
    }

    private static int id_class(Collection<? extends an_3> collection) {
        HashSet hashSet = Sets.newHashSet();
        for (an_3 an_32 : collection) {
            if (an_32 instanceof rhd_3) {
                hashSet.add(an_32.BG());
                continue;
            }
            hashSet.add(null);
        }
        return hashSet.size();
    }

    private static void id_class(rjK_2 rjK_22, double d, rrEm_1 rrEm_12, Random random, double d2, double d3, double d4, double d5, int n, Kd_1[] kd_1Array, boolean bl) throws CommandSyntaxException {
        int n2;
        boolean bl2 = true;
        double d6 = 3.4028234663852886E38;
        for (n2 = 0; n2 < 10000 && bl2; ++n2) {
            bl2 = false;
            d6 = 3.4028234663852886E38;
            for (int i = 0; i < kd_1Array.length; ++i) {
                Kd_1 kd_1 = kd_1Array[i];
                int n3 = 0;
                Kd_1 kd_12 = new Kd_1();
                for (int j = 0; j < kd_1Array.length; ++j) {
                    if (i == j) continue;
                    Kd_1 kd_13 = kd_1Array[j];
                    double d7 = kd_1.id_class(kd_13);
                    d6 = Math.min(d7, d6);
                    if (!(d7 < d)) continue;
                    ++n3;
                    kd_12.id_class += kd_13.id_class - kd_1.id_class;
                    kd_12.id_break += kd_13.id_break - kd_1.id_break;
                }
                if (n3 > 0) {
                    kd_12.id_class /= (double)n3;
                    kd_12.id_break /= (double)n3;
                    double d8 = kd_12.id_break();
                    if (d8 > 0.0) {
                        kd_12.id_class();
                        kd_1.id_break(kd_12);
                    } else {
                        kd_1.id_class(random, d2, d3, d4, d5);
                    }
                    bl2 = true;
                }
                if (!kd_1.id_class(d2, d3, d4, d5)) continue;
                bl2 = true;
            }
            if (bl2) continue;
            for (Kd_1 kd_12 : kd_1Array) {
                if (kd_12.id_break(rrEm_12, n)) continue;
                kd_12.id_class(random, d2, d3, d4, d5);
                bl2 = true;
            }
        }
        if (d6 == 3.4028234663852886E38) {
            d6 = 0.0;
        }
        if (n2 >= 10000) {
            if (bl) {
                throw id_class.create((Object)kd_1Array.length, (Object)Float.valueOf(rjK_22.id_byte), (Object)Float.valueOf(rjK_22.id_protected), (Object)String.format(Locale.ROOT, "%.2f", d6));
            }
            throw id_break.create((Object)kd_1Array.length, (Object)Float.valueOf(rjK_22.id_byte), (Object)Float.valueOf(rjK_22.id_protected), (Object)String.format(Locale.ROOT, "%.2f", d6));
        }
    }

    private static double id_class(Collection<? extends an_3> collection, rrEm_1 rrEm_12, Kd_1[] kd_1Array, int n, boolean bl) {
        double d = 0.0;
        int n2 = 0;
        HashMap hashMap = Maps.newHashMap();
        for (an_3 an_32 : collection) {
            Kd_1 kd_1;
            if (bl) {
                rnM_2 rnM_22;
                rnM_2 rnM_23 = rnM_22 = an_32 instanceof rhd_3 ? an_32.BG() : null;
                if (!hashMap.containsKey(rnM_22)) {
                    hashMap.put(rnM_22, kd_1Array[n2++]);
                }
                kd_1 = (Kd_1)hashMap.get(rnM_22);
            } else {
                kd_1 = kd_1Array[n2++];
            }
            an_32.id_throws((double)rfU_2.id_byte(kd_1.id_class) + 0.5, kd_1.id_class(rrEm_12, n), (double)rfU_2.id_byte(kd_1.id_break) + 0.5);
            double d2 = Double.MAX_VALUE;
            for (Kd_1 kd_12 : kd_1Array) {
                if (kd_1 == kd_12) continue;
                double d3 = kd_1.id_class(kd_12);
                d2 = Math.min(d3, d2);
            }
            d += d2;
        }
        return collection.size() < 2 ? 0.0 : d / (double)collection.size();
    }
}

