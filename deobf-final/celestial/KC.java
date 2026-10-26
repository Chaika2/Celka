package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Locale;

public class KC {
   private static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("commands.worldborder.center.failed"));
   private static final SimpleCommandExceptionType break_ = new SimpleCommandExceptionType(new rgn_3("commands.worldborder.set.failed.nochange"));
   private static final SimpleCommandExceptionType byte_ = new SimpleCommandExceptionType(new rgn_3("commands.worldborder.set.failed.small."));
   private static final SimpleCommandExceptionType protected_ = new SimpleCommandExceptionType(new rgn_3("commands.worldborder.set.failed.big."));
   private static final SimpleCommandExceptionType throws_ = new SimpleCommandExceptionType(new rgn_3("commands.worldborder.warning.time.failed"));
   private static final SimpleCommandExceptionType case_ = new SimpleCommandExceptionType(new rgn_3("commands.worldborder.warning.distance.failed"));
   private static final SimpleCommandExceptionType catch_ = new SimpleCommandExceptionType(new rgn_3("commands.worldborder.damage.buffer.failed"));
   private static final SimpleCommandExceptionType private_ = new SimpleCommandExceptionType(new rgn_3("commands.worldborder.damage.amount.failed"));

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_(
                                 "worldborder"
                              )
                              .requires(var0x -> var0x.class_(2)))
                           .then(
                              gp_3.class_("add")
                                 .then(
                                    ((RequiredArgumentBuilder)gp_3.class_("distance", FloatArgumentType.floatArg(-6.0E7F, 6.0E7F))
                                          .executes(
                                             var0x -> class_(
                                                   (gy_3)var0x.getSource(),
                                                   ((gy_3)var0x.getSource()).final_().instanceof_().implements_()
                                                      + (double)FloatArgumentType.getFloat(var0x, "distance"),
                                                   0L
                                                )
                                          ))
                                       .then(
                                          gp_3.class_("time", IntegerArgumentType.integer(0))
                                             .executes(
                                                var0x -> class_(
                                                      (gy_3)var0x.getSource(),
                                                      ((gy_3)var0x.getSource()).final_().instanceof_().implements_()
                                                         + (double)FloatArgumentType.getFloat(var0x, "distance"),
                                                      ((gy_3)var0x.getSource()).final_().instanceof_().finally_()
                                                         + (long)IntegerArgumentType.getInteger(var0x, "time") * 1000L
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           gp_3.class_("set")
                              .then(
                                 ((RequiredArgumentBuilder)gp_3.class_("distance", FloatArgumentType.floatArg(-6.0E7F, 6.0E7F))
                                       .executes(var0x -> class_((gy_3)var0x.getSource(), (double)FloatArgumentType.getFloat(var0x, "distance"), 0L)))
                                    .then(
                                       gp_3.class_("time", IntegerArgumentType.integer(0))
                                          .executes(
                                             var0x -> class_(
                                                   (gy_3)var0x.getSource(),
                                                   (double)FloatArgumentType.getFloat(var0x, "distance"),
                                                   (long)IntegerArgumentType.getInteger(var0x, "time") * 1000L
                                                )
                                          )
                                    )
                              )
                        ))
                     .then(
                        gp_3.class_("center")
                           .then(gp_3.class_("pos", Yt_1.class_()).executes(var0x -> class_((gy_3)var0x.getSource(), Yt_1.class_(var0x, "pos"))))
                     ))
                  .then(
                     ((LiteralArgumentBuilder)gp_3.class_("damage")
                           .then(
                              gp_3.class_("amount")
                                 .then(
                                    gp_3.class_("damagePerBlock", FloatArgumentType.floatArg(0.0F))
                                       .executes(var0x -> break_((gy_3)var0x.getSource(), FloatArgumentType.getFloat(var0x, "damagePerBlock")))
                                 )
                           ))
                        .then(
                           gp_3.class_("buffer")
                              .then(
                                 gp_3.class_("distance", FloatArgumentType.floatArg(0.0F))
                                    .executes(var0x -> class_((gy_3)var0x.getSource(), FloatArgumentType.getFloat(var0x, "distance")))
                              )
                        )
                  ))
               .then(gp_3.class_("get").executes(var0x -> class_((gy_3)var0x.getSource()))))
            .then(
               ((LiteralArgumentBuilder)gp_3.class_("warning")
                     .then(
                        gp_3.class_("distance")
                           .then(
                              gp_3.class_("distance", IntegerArgumentType.integer(0))
                                 .executes(var0x -> break_((gy_3)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "distance")))
                           )
                     ))
                  .then(
                     gp_3.class_("time")
                        .then(
                           gp_3.class_("time", IntegerArgumentType.integer(0))
                              .executes(var0x -> class_((gy_3)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "time")))
                        )
                  )
            )
      );
   }

   private static int class_(gy_3 var0, double var1, long var3) throws CommandSyntaxException {
      roE_2 var5 = var0.final_().instanceof_();
      double var6 = var5.implements_();
      if (var6 == var1) {
         throw break_.create();
      } else if (var1 < 1.0) {
         throw byte_.create();
      } else if (var1 > 6.0E7) {
         throw protected_.create();
      } else {
         if (var3 > 0L) {
            var5.class_(var6, var1, var3);
            if (var1 > var6) {
               var0.class_(new rgn_3("commands.worldborder.set.grow", String.format(Locale.ROOT, "%.1f", var1), Long.toString(var3 / 1000L)), true);
            } else {
               var0.class_(new rgn_3("commands.worldborder.set.shrink", String.format(Locale.ROOT, "%.1f", var1), Long.toString(var3 / 1000L)), true);
            }
         } else {
            var5.class_(var1);
            var0.class_(new rgn_3("commands.worldborder.set.immediate", String.format(Locale.ROOT, "%.1f", var1)), true);
         }

         return (int)(var1 - var6);
      }
   }

   private static int class_(gy_3 var0, float var1) throws CommandSyntaxException {
      roE_2 var2 = var0.final_().instanceof_();
      if (var2.final_() == (double)var1) {
         throw catch_.create();
      } else {
         var2.break_((double)var1);
         var0.class_(new rgn_3("commands.worldborder.damage.buffer.success", String.format(Locale.ROOT, "%.2f", var1)), true);
         return (int)var1;
      }
   }

   private static int class_(gy_3 var0, rjK_2 var1) throws CommandSyntaxException {
      roE_2 var2 = var0.final_().instanceof_();
      if (var2.class_() == (double)var1.byte_ && var2.break_() == (double)var1.protected_) {
         throw class_.create();
      } else {
         var2.break_((double)var1.byte_, (double)var1.protected_);
         var0.class_(
            new rgn_3("commands.worldborder.center.success", String.format(Locale.ROOT, "%.2f", var1.byte_), String.format("%.2f", var1.protected_)), true
         );
         return 0;
      }
   }

   private static int class_(gy_3 var0, int var1) throws CommandSyntaxException {
      roE_2 var2 = var0.final_().instanceof_();
      if (var2.new_() == var1) {
         throw throws_.create();
      } else {
         var2.break_(var1);
         var0.class_(new rgn_3("commands.worldborder.warning.time.success", var1), true);
         return var1;
      }
   }

   private static int class_(gy_3 var0) {
      double var1 = var0.final_().instanceof_().implements_();
      var0.class_(new rgn_3("commands.worldborder.get", String.format(Locale.ROOT, "%.0f", var1)), false);
      return rfU_2.byte_(var1 + 0.5);
   }

   private static int break_(gy_3 var0, float var1) throws CommandSyntaxException {
      roE_2 var2 = var0.final_().instanceof_();
      if (var2.package_() == (double)var1) {
         throw private_.create();
      } else {
         var2.byte_((double)var1);
         var0.class_(new rgn_3("commands.worldborder.damage.amount.success", String.format(Locale.ROOT, "%.2f", var1)), true);
         return (int)var1;
      }
   }

   private static int break_(gy_3 var0, int var1) throws CommandSyntaxException {
      roE_2 var2 = var0.final_().instanceof_();
      if (var2.continue_() == var1) {
         throw case_.create();
      } else {
         var2.byte_(var1);
         var0.class_(new rgn_3("commands.worldborder.warning.distance.success", var1), true);
         return var1;
      }
   }
}
