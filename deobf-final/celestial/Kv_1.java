package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class Kv_1 {
   private static int byte_(gy_3 var0, int var1) {
      var0.class_(new rgn_3("commands.time.query", var1), false);
      return var1;
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("time")
                     .requires(var0x -> var0x.class_(2)))
                  .then(
                     ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("set")
                                    .then(gp_3.class_("day").executes(var0x -> class_((gy_3)var0x.getSource(), 1000))))
                                 .then(gp_3.class_("noon").executes(var0x -> class_((gy_3)var0x.getSource(), 6000))))
                              .then(gp_3.class_("night").executes(var0x -> class_((gy_3)var0x.getSource(), 13000))))
                           .then(gp_3.class_("midnight").executes(var0x -> class_((gy_3)var0x.getSource(), 18000))))
                        .then(
                           gp_3.class_("time", Yq_1.class_()).executes(var0x -> class_((gy_3)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "time")))
                        )
                  ))
               .then(
                  gp_3.class_("add")
                     .then(gp_3.class_("time", Yq_1.class_()).executes(var0x -> break_((gy_3)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "time"))))
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("query")
                        .then(gp_3.class_("daytime").executes(var0x -> byte_((gy_3)var0x.getSource(), class_(((gy_3)var0x.getSource()).final_())))))
                     .then(
                        gp_3.class_("gametime").executes(var0x -> byte_((gy_3)var0x.getSource(), (int)(((gy_3)var0x.getSource()).final_().r() % 2147483647L)))
                     ))
                  .then(
                     gp_3.class_("day").executes(var0x -> byte_((gy_3)var0x.getSource(), (int)(((gy_3)var0x.getSource()).final_().P() / 24000L % 2147483647L)))
                  )
            )
      );
   }

   private static int class_(rrEm_1 var0) {
      return (int)(var0.P() % 24000L);
   }

   public static int class_(gy_3 var0, int var1) {
      for (rrEm_1 var3 : var0.super_().float_()) {
         var3.class_((long)var1);
      }

      var0.class_(new rgn_3("commands.time.set", var1), true);
      return class_(var0.final_());
   }

   public static int break_(gy_3 var0, int var1) {
      for (rrEm_1 var3 : var0.super_().float_()) {
         var3.class_(var3.P() + (long)var1);
      }

      int var4 = class_(var0.final_());
      var0.class_(new rgn_3("commands.time.set", var4), true);
      return var4;
   }
}
