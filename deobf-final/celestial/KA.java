package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class KA {
   private static int byte_(gy_3 var0, int var1) {
      var0.final_().class_(0, var1, true, true);
      var0.class_(new rgn_3("commands.weather.set.thunder"), true);
      return var1;
   }

   private static int class_(gy_3 var0, int var1) {
      var0.final_().class_(var1, 0, false, false);
      var0.class_(new rgn_3("commands.weather.set.clear"), true);
      return var1;
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("weather")
                     .requires(var0x -> var0x.class_(2)))
                  .then(
                     ((LiteralArgumentBuilder)gp_3.class_("clear").executes(var0x -> class_((gy_3)var0x.getSource(), 6000)))
                        .then(
                           gp_3.class_("duration", IntegerArgumentType.integer(0, 1000000))
                              .executes(var0x -> class_((gy_3)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "duration") * 20))
                        )
                  ))
               .then(
                  ((LiteralArgumentBuilder)gp_3.class_("rain").executes(var0x -> break_((gy_3)var0x.getSource(), 6000)))
                     .then(
                        gp_3.class_("duration", IntegerArgumentType.integer(0, 1000000))
                           .executes(var0x -> break_((gy_3)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "duration") * 20))
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)gp_3.class_("thunder").executes(var0x -> byte_((gy_3)var0x.getSource(), 6000)))
                  .then(
                     gp_3.class_("duration", IntegerArgumentType.integer(0, 1000000))
                        .executes(var0x -> byte_((gy_3)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "duration") * 20))
                  )
            )
      );
   }

   private static int break_(gy_3 var0, int var1) {
      var0.final_().class_(0, var1, true, false);
      var0.class_(new rgn_3("commands.weather.set.rain"), true);
      return var1;
   }
}
