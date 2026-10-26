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
   public static final Pattern id_class = Pattern.compile(
      "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$"
   );
   private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType(new rgn_3("commands.banip.invalid"));
   private static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType(new rgn_3("commands.banip.failed"));

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("ban-ip").requires(var0x -> var0x.id_class(3)))
            .then(
               ((RequiredArgumentBuilder)gp_3.id_class("target", StringArgumentType.word())
                     .executes(var0x -> id_class((gy_3)var0x.getSource(), StringArgumentType.getString(var0x, "target"), (rgP_2)null)))
                  .then(
                     gp_3.id_class("reason", YP.id_class())
                        .executes(var0x -> id_class((gy_3)var0x.getSource(), StringArgumentType.getString(var0x, "target"), YP.id_class(var0x, "reason")))
                  )
            )
      );
   }

   private static int id_class(gy_3 var0, String var1, rgP_2 var2) throws CommandSyntaxException {
      Matcher var3 = id_class.matcher(var1);
      if (var3.matches()) {
         return id_break(var0, var1, var2);
      } else {
         rhN_2 var4 = var0.id_super().x().id_class(var1);
         if (var4 != null) {
            return id_break(var0, var4.id_super(), var2);
         } else {
            throw id_break.create();
         }
      }
   }

   private static int id_break(gy_3 var0, String var1, rgP_2 var2) throws CommandSyntaxException {
      rnU_2 var3 = var0.id_super().x().id_private();
      if (var3.id_class(var1)) {
         throw id_byte.create();
      } else {
         List var4 = var0.id_super().x().id_break(var1);
         rnD_2 var5 = new rnD_2(var1, (Date)null, var0.id_native(), (Date)null, var2 == null ? null : var2.getString());
         var3.id_class(var5);
         var0.id_class(new rgn_3("commands.banip.success", var1, var5.id_byte()), true);
         if (!var4.isEmpty()) {
            var0.id_class(new rgn_3("commands.banip.info", var4.size(), Rn_1.id_class(var4)), true);
         }

         for (rhN_2 var7 : var4) {
            var7.id_class.id_class(new rgn_3("multiplayer.disconnect.ip_banned"));
         }

         return var4.size();
      }
   }
}
