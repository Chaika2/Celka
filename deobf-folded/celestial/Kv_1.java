package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;

public class Kv_1 {
   private static int id_byte(gy_3 var0, int var1) {
      var0.id_class(new rgn_3("commands.time.query", var1), false);
      return var1;
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("time")
                     .requires(var0x -> var0x.id_class(2)))
                  .then(
                     ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("set")
                                    .then(gp_3.id_class("day").executes(var0x -> id_class((gy_3)var0x.getSource(), 1000))))
                                 .then(gp_3.id_class("noon").executes(var0x -> id_class((gy_3)var0x.getSource(), 6000))))
                              .then(gp_3.id_class("night").executes(var0x -> id_class((gy_3)var0x.getSource(), 13000))))
                           .then(gp_3.id_class("midnight").executes(var0x -> id_class((gy_3)var0x.getSource(), 18000))))
                        .then(
                           gp_3.id_class("time", Yq_1.id_class())
                              .executes(var0x -> id_class((gy_3)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "time")))
                        )
                  ))
               .then(
                  gp_3.id_class("add")
                     .then(
                        gp_3.id_class("time", Yq_1.id_class())
                           .executes(var0x -> id_break((gy_3)var0x.getSource(), IntegerArgumentType.getInteger(var0x, "time")))
                     )
               ))
            .then(
               ((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("query")
                        .then(gp_3.id_class("daytime").executes(var0x -> id_byte((gy_3)var0x.getSource(), id_class(((gy_3)var0x.getSource()).id_final())))))
                     .then(
                        gp_3.id_class("gametime")
                           .executes(var0x -> id_byte((gy_3)var0x.getSource(), (int)(((gy_3)var0x.getSource()).id_final().r() % 2147483647L)))
                     ))
                  .then(
                     gp_3.id_class("day")
                        .executes(var0x -> id_byte((gy_3)var0x.getSource(), (int)(((gy_3)var0x.getSource()).id_final().P() / 24000L % 2147483647L)))
                  )
            )
      );
   }

   private static int id_class(rrEm_1 var0) {
      return (int)(var0.P() % 24000L);
   }

   public static int id_class(gy_3 var0, int var1) {
      for (rrEm_1 var3 : var0.id_super().id_float()) {
         var3.id_class((long)var1);
      }

      var0.id_class(new rgn_3("commands.time.set", var1), true);
      return id_class(var0.id_final());
   }

   public static int id_break(gy_3 var0, int var1) {
      for (rrEm_1 var3 : var0.id_super().id_float()) {
         var3.id_class(var3.P() + (long)var1);
      }

      int var4 = id_class(var0.id_final());
      var0.id_class(new rgn_3("commands.time.set", var4), true);
      return var4;
   }
}
