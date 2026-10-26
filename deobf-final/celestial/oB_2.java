package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class oB_2 {
   public static final Pattern class_ = Pattern.compile(
      "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$"
   );
   private static final SimpleCommandExceptionType break_ = new SimpleCommandExceptionType(new rgn_3("commands.banip.invalid"));
   private static final SimpleCommandExceptionType byte_ = new SimpleCommandExceptionType(new rgn_3("commands.banip.failed"));

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("ban-ip").requires(var0x -> var0x.class_(3)))
            .then(
               ((RequiredArgumentBuilder)gp_3.class_("target", StringArgumentType.word())
                     .executes(var0x -> class_((gy_3)var0x.getSource(), StringArgumentType.getString(var0x, "target"), (rgP_2)null)))
                  .then(
                     gp_3.class_("reason", YP.class_())
                        .executes(var0x -> class_((gy_3)var0x.getSource(), StringArgumentType.getString(var0x, "target"), YP.class_(var0x, "reason")))
                  )
            )
      );
   }

   private static int class_(gy_3 var0, String var1, rgP_2 var2) throws CommandSyntaxException {
      Matcher var3 = class_.matcher(var1);
      if (var3.matches()) {
         return break_(var0, var1, var2);
      } else {
         rhN_2 var4 = var0.super_().x().class_(var1);
         if (var4 != null) {
            return break_(var0, var4.super_(), var2);
         } else {
            throw break_.create();
         }
      }
   }

   private static int break_(gy_3 var0, String var1, rgP_2 var2) throws CommandSyntaxException {
      rnU_2 var3 = var0.super_().x().private_();
      if (var3.class_(var1)) {
         throw byte_.create();
      } else {
         List var4 = var0.super_().x().break_(var1);
         rnD_2 var5 = new rnD_2(var1, (Date)null, var0.native_(), (Date)null, var2 == null ? null : var2.getString());
         var3.class_(var5);
         var0.class_(new rgn_3("commands.banip.success", var1, var5.byte_()), true);
         if (!var4.isEmpty()) {
            var0.class_(new rgn_3("commands.banip.info", var4.size(), Rn_1.class_(var4)), true);
         }

         for (rhN_2 var7 : var4) {
            var7.class_.class_(new rgn_3("multiplayer.disconnect.ip_banned"));
         }

         return var4.size();
      }
   }
}
