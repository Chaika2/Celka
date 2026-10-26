package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class KA {
   private static int id_byte(gy_3 var0, int var1) {
      var0.id_final().id_class(0, var1, true, true);
      var0.id_class(new rgn_3("commands.weather.set.thunder"), true);
      return var1;
   }

   private static int id_class(gy_3 var0, int var1) {
      var0.id_final().id_class(var1, 0, false, false);
      var0.id_class(new rgn_3("commands.weather.set.clear"), true);
      return var1;
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("weather")
                     .requires(var0x -> var0x.id_class(2)))
                  .then(
                     ((LiteralArgumentBuilder)gp_3.id_class("clear").executes(var0x -> id_class((gy_3)var0x.getSource(), 6000)))
                        .then(
                           gp_3.id_class("duration", IntegerArgumentType.integer(0, 1000000))
                              .executes(var0x -> id_class((gy_3)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "duration") * 20))
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)gp_3.id_class("rain").executes(var0x -> id_break((gy_3)var0x.getSource(), 6000)))
                     .then(
                        gp_3.id_class("duration", IntegerArgumentType.integer(0, 1000000))
                           .executes(var0x -> id_break((gy_3)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "duration") * 20))
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)gp_3.id_class("thunder").executes(var0x -> id_byte((gy_3)var0x.getSource(), 6000)))
                  .then(
                     gp_3.id_class("duration", IntegerArgumentType.integer(0, 1000000))
                        .executes(var0x -> id_byte((gy_3)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "duration") * 20))
                  )
            )
      );
   }

   private static int id_break(gy_3 var0, int var1) {
      var0.id_final().id_class(0, var1, true, false);
      var0.id_class(new rgn_3("commands.weather.set.rain"), true);
      return var1;
   }
}
