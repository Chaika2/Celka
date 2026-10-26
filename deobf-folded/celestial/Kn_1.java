package celestial;

import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class Kn_1 {
   private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("commands.whitelist.alreadyOn"));
   private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType(new rgn_3("commands.whitelist.alreadyOff"));
   private static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType(new rgn_3("commands.whitelist.add.failed"));
   private static final SimpleCommandExceptionType id_protected = new SimpleCommandExceptionType(new rgn_3("commands.whitelist.remove.failed"));

   private static int id_byte(gy_3 var0) throws CommandSyntaxException {
      rCr_1 var1 = var0.id_super().x();
      if (!var1.id_int()) {
         throw id_break.create();
      } else {
         var1.id_class(false);
         var0.id_class(new rgn_3("commands.whitelist.disabled"), true);
         return 1;
      }
   }

   private static int id_class(gy_3 var0) {
      var0.id_super().x().id_class();
      var0.id_class(new rgn_3("commands.whitelist.reloaded"), true);
      var0.id_super().id_class(var0);
      return 1;
   }

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class(
                                 "whitelist"
                              )
                              .requires(var0x -> var0x.id_class(3)))
                           .then(gp_3.id_class("on").executes(var0x -> id_break((gy_3)var0x.getSource()))))
                        .then(gp_3.id_class("off").executes(var0x -> id_byte((gy_3)var0x.getSource()))))
                     .then(gp_3.id_class("list").executes(var0x -> id_protected((gy_3)var0x.getSource()))))
                  .then(gp_3.id_class("add").then(gp_3.id_class("targets", RT.id_class()).suggests((var0x, var1) -> {
                     rCr_1 var2 = ((gy_3)var0x.getSource()).id_super().x();
                     return gR_2.id_break(
                        var2.id_super().stream().filter(var1x -> !var2.id_finally().id_class(var1x.sv())).map(var0xx -> var0xx.sv().getName()), var1
                     );
                  }).executes(var0x -> id_class((gy_3)var0x.getSource(), RT.id_class(var0x, "targets"))))))
               .then(
                  gp_3.id_class("remove")
                     .then(
                        gp_3.id_class("targets", RT.id_class())
                           .suggests((var0x, var1) -> gR_2.id_class(((gy_3)var0x.getSource()).id_super().x().id_extends(), var1))
                           .executes(var0x -> id_break((gy_3)var0x.getSource(), RT.id_class(var0x, "targets")))
                     )
               ))
            .then(gp_3.id_class("reload").executes(var0x -> id_class((gy_3)var0x.getSource())))
      );
   }

   private static int id_class(gy_3 var0, Collection<GameProfile> var1) throws CommandSyntaxException {
      rCk_1 var2 = var0.id_super().x().id_finally();
      int var3 = 0;

      for (GameProfile var5 : var1) {
         if (!var2.id_class(var5)) {
            rCW var6 = new rCW(var5);
            var2.id_class(var6);
            var0.id_class(new rgn_3("commands.whitelist.add.success", rgv_3.id_class(var5)), true);
            var3++;
         }
      }

      if (var3 == 0) {
         throw id_byte.create();
      } else {
         return var3;
      }
   }

   private static int id_break(gy_3 var0, Collection<GameProfile> var1) throws CommandSyntaxException {
      rCk_1 var2 = var0.id_super().x().id_finally();
      int var3 = 0;

      for (GameProfile var5 : var1) {
         if (var2.id_class(var5)) {
            rCW var6 = new rCW(var5);
            var2.id_break(var6);
            var0.id_class(new rgn_3("commands.whitelist.remove.success", rgv_3.id_class(var5)), true);
            var3++;
         }
      }

      if (var3 == 0) {
         throw id_protected.create();
      } else {
         var0.id_super().id_class(var0);
         return var3;
      }
   }

   private static int id_break(gy_3 var0) throws CommandSyntaxException {
      rCr_1 var1 = var0.id_super().x();
      if (var1.id_int()) {
         throw id_class.create();
      } else {
         var1.id_class(true);
         var0.id_class(new rgn_3("commands.whitelist.enabled"), true);
         var0.id_super().id_class(var0);
         return 1;
      }
   }

   private static int id_protected(gy_3 var0) {
      String[] var1 = var0.id_super().x().id_extends();
      if (var1.length == 0) {
         var0.id_class(new rgn_3("commands.whitelist.none"), false);
      } else {
         var0.id_class(new rgn_3("commands.whitelist.list", var1.length, String.join(", ", var1)), false);
      }

      return var1.length;
   }
}
