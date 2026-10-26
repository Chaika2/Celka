package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class oo_3 {
   private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("commands.particle.failed"));

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("particle").requires(var0x -> var0x.id_class(2)))
            .then(
               ((RequiredArgumentBuilder)gp_3.id_class("name", Yc_1.id_class())
                     .executes(
                        var0x -> id_class(
                              (gy_3)var0x.getSource(),
                              Yc_1.id_class(var0x, "name"),
                              ((gy_3)var0x.getSource()).id_volatile(),
                              rjU_2.id_class,
                              0.0F,
                              0,
                              false,
                              ((gy_3)var0x.getSource()).id_super().x().id_super()
                           )
                     ))
                  .then(
                     ((RequiredArgumentBuilder)gp_3.id_class("pos", Yw_1.id_class())
                           .executes(
                              var0x -> id_class(
                                    (gy_3)var0x.getSource(),
                                    Yc_1.id_class(var0x, "name"),
                                    Yw_1.id_class(var0x, "pos"),
                                    rjU_2.id_class,
                                    0.0F,
                                    0,
                                    false,
                                    ((gy_3)var0x.getSource()).id_super().x().id_super()
                                 )
                           ))
                        .then(
                           gp_3.id_class("delta", Yw_1.id_class(false))
                              .then(
                                 gp_3.id_class("speed", FloatArgumentType.floatArg(0.0F))
                                    .then(
                                       ((RequiredArgumentBuilder)((RequiredArgumentBuilder)gp_3.id_class("count", IntegerArgumentType.integer(0))
                                                .executes(
                                                   var0x -> id_class(
                                                         (gy_3)var0x.getSource(),
                                                         Yc_1.id_class(var0x, "name"),
                                                         Yw_1.id_class(var0x, "pos"),
                                                         Yw_1.id_class(var0x, "delta"),
                                                         FloatArgumentType.getFloat(var0x, "speed"),
                                                         IntegerArgumentType.getInteger(var0x, "count"),
                                                         false,
                                                         ((gy_3)var0x.getSource()).id_super().x().id_super()
                                                      )
                                                ))
                                             .then(
                                                ((LiteralArgumentBuilder)gp_3.id_class("force")
                                                      .executes(
                                                         var0x -> id_class(
                                                               (gy_3)var0x.getSource(),
                                                               Yc_1.id_class(var0x, "name"),
                                                               Yw_1.id_class(var0x, "pos"),
                                                               Yw_1.id_class(var0x, "delta"),
                                                               FloatArgumentType.getFloat(var0x, "speed"),
                                                               IntegerArgumentType.getInteger(var0x, "count"),
                                                               true,
                                                               ((gy_3)var0x.getSource()).id_super().x().id_super()
                                                            )
                                                      ))
                                                   .then(
                                                      gp_3.id_class("viewers", RZ.id_protected())
                                                         .executes(
                                                            var0x -> id_class(
                                                                  (gy_3)var0x.getSource(),
                                                                  Yc_1.id_class(var0x, "name"),
                                                                  Yw_1.id_class(var0x, "pos"),
                                                                  Yw_1.id_class(var0x, "delta"),
                                                                  FloatArgumentType.getFloat(var0x, "speed"),
                                                                  IntegerArgumentType.getInteger(var0x, "count"),
                                                                  true,
                                                                  RZ.id_case(var0x, "viewers")
                                                               )
                                                         )
                                                   )
                                             ))
                                          .then(
                                             ((LiteralArgumentBuilder)gp_3.id_class("normal")
                                                   .executes(
                                                      var0x -> id_class(
                                                            (gy_3)var0x.getSource(),
                                                            Yc_1.id_class(var0x, "name"),
                                                            Yw_1.id_class(var0x, "pos"),
                                                            Yw_1.id_class(var0x, "delta"),
                                                            FloatArgumentType.getFloat(var0x, "speed"),
                                                            IntegerArgumentType.getInteger(var0x, "count"),
                                                            false,
                                                            ((gy_3)var0x.getSource()).id_super().x().id_super()
                                                         )
                                                   ))
                                                .then(
                                                   gp_3.id_class("viewers", RZ.id_protected())
                                                      .executes(
                                                         var0x -> id_class(
                                                               (gy_3)var0x.getSource(),
                                                               Yc_1.id_class(var0x, "name"),
                                                               Yw_1.id_class(var0x, "pos"),
                                                               Yw_1.id_class(var0x, "delta"),
                                                               FloatArgumentType.getFloat(var0x, "speed"),
                                                               IntegerArgumentType.getInteger(var0x, "count"),
                                                               false,
                                                               RZ.id_case(var0x, "viewers")
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

   private static int id_class(gy_3 var0, rLx_1 var1, rjU_2 var2, rjU_2 var3, float var4, int var5, boolean var6, Collection<rhN_2> var7) throws CommandSyntaxException {
      int var8 = 0;

      for (rhN_2 var10 : var7) {
         if (var0.id_final()
            .id_class(var10, var1, var6, var2.id_break, var2.id_byte, var2.id_protected, var5, var3.id_break, var3.id_byte, var3.id_protected, (double)var4)) {
            var8++;
         }
      }

      if (var8 == 0) {
         throw id_class.create();
      } else {
         var0.id_class(new rgn_3("commands.particle.success", rVL.id_switch.id_break(var1.id_protected()).toString()), true);
         return var8;
      }
   }
}
