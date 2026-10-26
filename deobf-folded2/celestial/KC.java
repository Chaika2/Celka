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
   private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("commands.worldborder.center.failed"));
   private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType(new rgn_3("commands.worldborder.set.failed.nochange"));
   private static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType(new rgn_3("commands.worldborder.set.failed.small."));
   private static final SimpleCommandExceptionType id_protected = new SimpleCommandExceptionType(new rgn_3("commands.worldborder.set.failed.big."));
   private static final SimpleCommandExceptionType id_throws = new SimpleCommandExceptionType(new rgn_3("commands.worldborder.warning.time.failed"));
   private static final SimpleCommandExceptionType id_case = new SimpleCommandExceptionType(new rgn_3("commands.worldborder.warning.distance.failed"));
   private static final SimpleCommandExceptionType id_catch = new SimpleCommandExceptionType(new rgn_3("commands.worldborder.damage.buffer.failed"));
   private static final SimpleCommandExceptionType id_private = new SimpleCommandExceptionType(new rgn_3("commands.worldborder.damage.amount.failed"));

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class(
                                 "worldborder"
                              )
                              .requires(var0x -> var0x.id_class(2)))
                           .then(
                              gp_3.id_class("add")
                                 .then(
                                    ((RequiredArgumentBuilder)gp_3.id_class("distance", FloatArgumentType.floatArg(-6.0E7F, 6.0E7F))
                                          .executes(
                                             var0x -> id_class(
                                                   (gy_3)var0x.getSource(),
                                                   ((gy_3)var0x.getSource()).id_final().id_instanceof().id_implements()
                                                      + (double)FloatArgumentType.getFloat(var0x, "distance"),
                                                   0L
                                                )
                                          ))
                                       .then(
                                          gp_3.id_class("time", IntegerArgumentType.integer(0))
                                             .executes(
                                                var0x -> id_class(
                                                      (gy_3)var0x.getSource(),
                                                      ((gy_3)var0x.getSource()).id_final().id_instanceof().id_implements()
                                                         + (double)FloatArgumentType.getFloat(var0x, "distance"),
                                                      ((gy_3)var0x.getSource()).id_final().id_instanceof().id_finally()
                                                         + (long)IntegerArgumentType.getInteger(var0x, "time") * 1000L
                                                   )
                                             )
                                       )
                                 )
                           ))
                        .then(
                           gp_3.id_class("set")
                              .then(
                                 ((RequiredArgumentBuilder)gp_3.id_class("distance", FloatArgumentType.floatArg(-6.0E7F, 6.0E7F))
                                       .executes(var0x -> id_class((gy_3)var0x.getSource(), (double)FloatArgumentType.getFloat(var0x, "distance"), 0L)))
                                    .then(
                                       gp_3.id_class("time", IntegerArgumentType.integer(0))
                                          .executes(
                                             var0x -> id_class(
                                                   (gy_3)var0x.getSource(),
                                                   (double)FloatArgumentType.getFloat(var0x, "distance"),
                                                   (long)IntegerArgumentType.getInteger(var0x, "time") * 1000L
                                                )
                                          )
                                    )
                              )
                        ))
                     .then(
                        gp_3.id_class("center")
                           .then(gp_3.id_class("pos", Yt_1.id_class()).executes(var0x -> id_class((gy_3)var0x.getSource(), Yt_1.id_class(var0x, "pos"))))
                     ))
                  .then(
                     ((LiteralArgumentBuilder)gp_3.id_class("damage")
                           .then(
                              gp_3.id_class("amount")
                                 .then(
                                    gp_3.id_class("damagePerBlock", FloatArgumentType.floatArg(0.0F))
                                       .executes(var0x -> id_break((gy_3)var0x.getSource(), FloatArgumentType.getFloat(var0x, "damagePerBlock")))
                                 )
                           ))
                        .then(
                           gp_3.id_class("buffer")
                              .then(
                                 gp_3.id_class("distance", FloatArgumentType.floatArg(0.0F))
                                    .executes(var0x -> id_class((gy_3)var0x.getSource(), FloatArgumentType.getFloat(var0x, "distance")))
                              )
                        )
                  ))
               .then(gp_3.id_class("get").executes(var0x -> id_class((gy_3)var0x.getSource()))))
            .then(
               ((LiteralArgumentBuilder)gp_3.id_class("warning")
                     .then(
                        gp_3.id_class("distance")
                           .then(
                              gp_3.id_class("distance", IntegerArgumentType.integer(0))
                                 .executes(var0x -> id_break((gy_3)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "distance")))
                           )
                     ))
                  .then(
                     gp_3.id_class("time")
                        .then(
                           gp_3.id_class("time", IntegerArgumentType.integer(0))
                              .executes(var0x -> id_class((gy_3)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "time")))
                        )
                  )
            )
      );
   }

   private static int id_class(gy_3 var0, double var1, long var3) throws CommandSyntaxException {
      roE_2 var5 = var0.id_final().id_instanceof();
      double var6 = var5.id_implements();
      if (var6 == var1) {
         throw id_break.create();
      } else if (var1 < 1.0) {
         throw id_byte.create();
      } else if (var1 > 6.0E7) {
         throw id_protected.create();
      } else {
         if (var3 > 0L) {
            var5.id_class(var6, var1, var3);
            if (var1 > var6) {
               var0.id_class(new rgn_3("commands.worldborder.set.grow", String.format(Locale.ROOT, "%.1f", var1), Long.toString(var3 / 1000L)), true);
            } else {
               var0.id_class(new rgn_3("commands.worldborder.set.shrink", String.format(Locale.ROOT, "%.1f", var1), Long.toString(var3 / 1000L)), true);
            }
         } else {
            var5.id_class(var1);
            var0.id_class(new rgn_3("commands.worldborder.set.immediate", String.format(Locale.ROOT, "%.1f", var1)), true);
         }

         return (int)(var1 - var6);
      }
   }

   private static int id_class(gy_3 var0, float var1) throws CommandSyntaxException {
      roE_2 var2 = var0.id_final().id_instanceof();
      if (var2.id_final() == (double)var1) {
         throw id_catch.create();
      } else {
         var2.id_break((double)var1);
         var0.id_class(new rgn_3("commands.worldborder.damage.buffer.success", String.format(Locale.ROOT, "%.2f", var1)), true);
         return (int)var1;
      }
   }

   private static int id_class(gy_3 var0, rjK_2 var1) throws CommandSyntaxException {
      roE_2 var2 = var0.id_final().id_instanceof();
      if (var2.id_class() == (double)var1.id_byte && var2.id_break() == (double)var1.id_protected) {
         throw id_class.create();
      } else {
         var2.id_break((double)var1.id_byte, (double)var1.id_protected);
         var0.id_class(
            new rgn_3("commands.worldborder.center.success", String.format(Locale.ROOT, "%.2f", var1.id_byte), String.format("%.2f", var1.id_protected)), true
         );
         return 0;
      }
   }

   private static int id_class(gy_3 var0, int var1) throws CommandSyntaxException {
      roE_2 var2 = var0.id_final().id_instanceof();
      if (var2.id_new() == var1) {
         throw id_throws.create();
      } else {
         var2.id_break(var1);
         var0.id_class(new rgn_3("commands.worldborder.warning.time.success", var1), true);
         return var1;
      }
   }

   private static int id_class(gy_3 var0) {
      double var1 = var0.id_final().id_instanceof().id_implements();
      var0.id_class(new rgn_3("commands.worldborder.get", String.format(Locale.ROOT, "%.0f", var1)), false);
      return rfU_2.id_byte(var1 + 0.5);
   }

   private static int id_break(gy_3 var0, float var1) throws CommandSyntaxException {
      roE_2 var2 = var0.id_final().id_instanceof();
      if (var2.id_package() == (double)var1) {
         throw id_private.create();
      } else {
         var2.id_byte((double)var1);
         var0.id_class(new rgn_3("commands.worldborder.damage.amount.success", String.format(Locale.ROOT, "%.2f", var1)), true);
         return (int)var1;
      }
   }

   private static int id_break(gy_3 var0, int var1) throws CommandSyntaxException {
      roE_2 var2 = var0.id_final().id_instanceof();
      if (var2.id_continue() == var1) {
         throw id_case.create();
      } else {
         var2.id_byte(var1);
         var0.id_class(new rgn_3("commands.worldborder.warning.distance.success", var1), true);
         return var1;
      }
   }
}
