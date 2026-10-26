package celestial;

import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Collection;

public class Kn_1 {
   private static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("commands.whitelist.alreadyOn"));
   private static final SimpleCommandExceptionType break_ = new SimpleCommandExceptionType(new rgn_3("commands.whitelist.alreadyOff"));
   private static final SimpleCommandExceptionType byte_ = new SimpleCommandExceptionType(new rgn_3("commands.whitelist.add.failed"));
   private static final SimpleCommandExceptionType protected_ = new SimpleCommandExceptionType(new rgn_3("commands.whitelist.remove.failed"));

   private static int byte_(gy_3 var0) throws CommandSyntaxException {
      rCr_1 var1 = var0.super_().x();
      if (!var1.int_()) {
         throw break_.create();
      } else {
         var1.class_(false);
         var0.class_(new rgn_3("commands.whitelist.disabled"), true);
         return 1;
      }
   }

   private static int class_(gy_3 var0) {
      var0.super_().x().class_();
      var0.class_(new rgn_3("commands.whitelist.reloaded"), true);
      var0.super_().class_(var0);
      return 1;
   }

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_(
                                 "whitelist"
                              )
                              .requires(var0x -> var0x.class_(3)))
                           .then(gp_3.class_("on").executes(var0x -> break_((gy_3)var0x.getSource()))))
                        .then(gp_3.class_("off").executes(var0x -> byte_((gy_3)var0x.getSource()))))
                     .then(gp_3.class_("list").executes(var0x -> protected_((gy_3)var0x.getSource()))))
                  .then(gp_3.class_("add").then(gp_3.class_("targets", RT.class_()).suggests((var0x, var1) -> {
                     rCr_1 var2 = ((gy_3)var0x.getSource()).super_().x();
                     return gR_2.break_(var2.super_().stream().filter(var1x -> !var2.finally_().class_(var1x.sv())).map(var0xx -> var0xx.sv().getName()), var1);
                  }).executes(var0x -> class_((gy_3)var0x.getSource(), RT.class_(var0x, "targets"))))))
               .then(
                  gp_3.class_("remove")
                     .then(
                        gp_3.class_("targets", RT.class_())
                           .suggests((var0x, var1) -> gR_2.class_(((gy_3)var0x.getSource()).super_().x().extends_(), var1))
                           .executes(var0x -> break_((gy_3)var0x.getSource(), RT.class_(var0x, "targets")))
                     )
               ))
            .then(gp_3.class_("reload").executes(var0x -> class_((gy_3)var0x.getSource())))
      );
   }

   private static int class_(gy_3 var0, Collection<GameProfile> var1) throws CommandSyntaxException {
      rCk_1 var2 = var0.super_().x().finally_();
      int var3 = 0;

      for (GameProfile var5 : var1) {
         if (!var2.class_(var5)) {
            rCW var6 = new rCW(var5);
            var2.class_(var6);
            var0.class_(new rgn_3("commands.whitelist.add.success", rgv_3.class_(var5)), true);
            var3++;
         }
      }

      if (var3 == 0) {
         throw byte_.create();
      } else {
         return var3;
      }
   }

   private static int break_(gy_3 var0, Collection<GameProfile> var1) throws CommandSyntaxException {
      rCk_1 var2 = var0.super_().x().finally_();
      int var3 = 0;

      for (GameProfile var5 : var1) {
         if (var2.class_(var5)) {
            rCW var6 = new rCW(var5);
            var2.break_(var6);
            var0.class_(new rgn_3("commands.whitelist.remove.success", rgv_3.class_(var5)), true);
            var3++;
         }
      }

      if (var3 == 0) {
         throw protected_.create();
      } else {
         var0.super_().class_(var0);
         return var3;
      }
   }

   private static int break_(gy_3 var0) throws CommandSyntaxException {
      rCr_1 var1 = var0.super_().x();
      if (var1.int_()) {
         throw class_.create();
      } else {
         var1.class_(true);
         var0.class_(new rgn_3("commands.whitelist.enabled"), true);
         var0.super_().class_(var0);
         return 1;
      }
   }

   private static int protected_(gy_3 var0) {
      String[] var1 = var0.super_().x().extends_();
      if (var1.length == 0) {
         var0.class_(new rgn_3("commands.whitelist.none"), false);
      } else {
         var0.class_(new rgn_3("commands.whitelist.list", var1.length, String.join(", ", var1)), false);
      }

      return var1.length;
   }
}
