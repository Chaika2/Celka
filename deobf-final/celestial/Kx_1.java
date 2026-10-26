package celestial;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.Dynamic4CommandExceptionType;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Random;

public class Kx_1 {
   private static final Dynamic4CommandExceptionType class_ = new Dynamic4CommandExceptionType(
      (var0, var1, var2, var3) -> new rgn_3("commands.spreadplayers.failed.teams", var0, var1, var2, var3)
   );
   private static final Dynamic4CommandExceptionType break_ = new Dynamic4CommandExceptionType(
      (var0, var1, var2, var3) -> new rgn_3("commands.spreadplayers.failed.entities", var0, var1, var2, var3)
   );

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("spreadplayers").requires(var0x -> var0x.class_(2)))
            .then(
               gp_3.class_("center", Yt_1.class_())
                  .then(
                     gp_3.class_("spreadDistance", FloatArgumentType.floatArg(0.0F))
                        .then(
                           ((RequiredArgumentBuilder)gp_3.class_("maxRange", FloatArgumentType.floatArg(1.0F))
                                 .then(
                                    gp_3.class_("respectTeams", BoolArgumentType.bool())
                                       .then(
                                          gp_3.class_("targets", RZ.break_())
                                             .executes(
                                                var0x -> class_(
                                                      (gy_3)var0x.getSource(),
                                                      Yt_1.class_(var0x, "center"),
                                                      FloatArgumentType.getFloat(var0x, "spreadDistance"),
                                                      FloatArgumentType.getFloat(var0x, "maxRange"),
                                                      256,
                                                      BoolArgumentType.getBool(var0x, "respectTeams"),
                                                      RZ.break_(var0x, "targets")
                                                   )
                                             )
                                       )
                                 ))
                              .then(
                                 gp_3.class_("under")
                                    .then(
                                       gp_3.class_("maxHeight", IntegerArgumentType.integer(0))
                                          .then(
                                             gp_3.class_("respectTeams", BoolArgumentType.bool())
                                                .then(
                                                   gp_3.class_("targets", RZ.break_())
                                                      .executes(
                                                         var0x -> class_(
                                                               (gy_3)var0x.getSource(),
                                                               Yt_1.class_(var0x, "center"),
                                                               FloatArgumentType.getFloat(var0x, "spreadDistance"),
                                                               FloatArgumentType.getFloat(var0x, "maxRange"),
                                                               IntegerArgumentType.getInteger(var0x, "maxHeight"),
                                                               BoolArgumentType.getBool(var0x, "respectTeams"),
                                                               RZ.break_(var0x, "targets")
                                                            )
                                                      )
                                                )
                                          )
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static Kd_1[] class_(Random var0, int var1, double var2, double var4, double var6, double var8) {
      Kd_1[] var10 = new Kd_1[var1];

      for (int var11 = 0; var11 < var10.length; var11++) {
         Kd_1 var12 = new Kd_1();
         var12.class_(var0, var2, var4, var6, var8);
         var10[var11] = var12;
      }

      return var10;
   }

   private static int class_(gy_3 var0, rjK_2 var1, float var2, float var3, int var4, boolean var5, Collection<? extends an_3> var6) throws CommandSyntaxException {
      Random var7 = new Random();
      double var8 = (double)(var1.byte_ - var3);
      double var10 = (double)(var1.protected_ - var3);
      double var12 = (double)(var1.byte_ + var3);
      double var14 = (double)(var1.protected_ + var3);
      Kd_1[] var16 = class_(var7, var5 ? class_(var6) : var6.size(), var8, var10, var12, var14);
      class_(var1, (double)var2, var0.final_(), var7, var8, var10, var12, var14, var4, var16, var5);
      double var17 = class_(var6, var0.final_(), var16, var4, var5);
      var0.class_(
         new rgn_3(
            "commands.spreadplayers.success." + (var5 ? "teams" : "entities"),
            var16.length,
            var1.byte_,
            var1.protected_,
            String.format(Locale.ROOT, "%.2f", var17)
         ),
         true
      );
      return var16.length;
   }

   private static int class_(Collection<? extends an_3> var0) {
      HashSet var1 = Sets.newHashSet();

      for (an_3 var3 : var0) {
         if (var3 instanceof rhd_3) {
            var1.add(var3.BG());
         } else {
            var1.add((rnM_2)null);
         }
      }

      return var1.size();
   }

   private static void class_(
      rjK_2 var0, double var1, rrEm_1 var3, Random var4, double var5, double var7, double var9, double var11, int var13, Kd_1[] var14, boolean var15
   ) throws CommandSyntaxException {
      boolean var16 = true;
      double var17 = Float.MAX_VALUE;

      int var19;
      for (var19 = 0; var19 < 10000 && var16; var19++) {
         var16 = false;
         var17 = Float.MAX_VALUE;

         for (int var20 = 0; var20 < var14.length; var20++) {
            Kd_1 var21 = var14[var20];
            int var22 = 0;
            Kd_1 var23 = new Kd_1();

            for (int var24 = 0; var24 < var14.length; var24++) {
               if (var20 != var24) {
                  Kd_1 var25 = var14[var24];
                  double var26 = var21.class_(var25);
                  var17 = Math.min(var26, var17);
                  if (var26 < var1) {
                     var22++;
                     var23.class_ = var23.class_ + (var25.class_ - var21.class_);
                     var23.break_ = var23.break_ + (var25.break_ - var21.break_);
                  }
               }
            }

            if (var22 > 0) {
               var23.class_ /= (double)var22;
               var23.break_ /= (double)var22;
               double var32 = (double)var23.break_();
               if (var32 > 0.0) {
                  var23.class_();
                  var21.break_(var23);
               } else {
                  var21.class_(var4, var5, var7, var9, var11);
               }

               var16 = true;
            }

            if (var21.class_(var5, var7, var9, var11)) {
               var16 = true;
            }
         }

         if (!var16) {
            for (Kd_1 var31 : var14) {
               if (!var31.break_(var3, var13)) {
                  var31.class_(var4, var5, var7, var9, var11);
                  var16 = true;
               }
            }
         }
      }

      if (var17 == Float.MAX_VALUE) {
         var17 = 0.0;
      }

      if (var19 >= 10000) {
         if (var15) {
            throw class_.create(var14.length, var0.byte_, var0.protected_, String.format(Locale.ROOT, "%.2f", var17));
         } else {
            throw break_.create(var14.length, var0.byte_, var0.protected_, String.format(Locale.ROOT, "%.2f", var17));
         }
      }
   }

   private static double class_(Collection<? extends an_3> var0, rrEm_1 var1, Kd_1[] var2, int var3, boolean var4) {
      double var5 = 0.0;
      int var7 = 0;
      HashMap var8 = Maps.newHashMap();

      for (an_3 var10 : var0) {
         Kd_1 var11;
         if (var4) {
            rnM_2 var12 = var10 instanceof rhd_3 ? var10.BG() : null;
            if (!var8.containsKey(var12)) {
               var8.put(var12, var2[var7++]);
            }

            var11 = (Kd_1)var8.get(var12);
         } else {
            var11 = var2[var7++];
         }

         var10.throws_((double)rfU_2.byte_(var11.class_) + 0.5, (double)var11.class_(var1, var3), (double)rfU_2.byte_(var11.break_) + 0.5);
         double var20 = Double.MAX_VALUE;

         for (Kd_1 var17 : var2) {
            if (var11 != var17) {
               double var18 = var11.class_(var17);
               var20 = Math.min(var18, var20);
            }
         }

         var5 += var20;
      }

      return var0.size() < 2 ? 0.0 : var5 / (double)var0.size();
   }
}
