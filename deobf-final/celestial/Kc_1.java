package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class Kc_1 {
   private static final rgc_3 class_ = rgc_3.class_
      .class_(new rgy_3(rgp_3.class_, new rgn_3("chat.type.team.hover")))
      .class_(new rgl_3(rgH_2.SUGGEST_COMMAND, "/teammsg "));
   private static final SimpleCommandExceptionType break_ = new SimpleCommandExceptionType(new rgn_3("commands.teammsg.failed.noteam"));

   public static void class_(CommandDispatcher<gy_3> var0) {
      LiteralCommandNode var1 = var0.register(
         (LiteralArgumentBuilder)gp_3.class_("teammsg")
            .then(gp_3.class_("message", YP.class_()).executes(var0x -> class_((gy_3)var0x.getSource(), YP.class_(var0x, "message"))))
      );
      var0.register((LiteralArgumentBuilder)gp_3.class_("tm").redirect(var1));
   }

   private static int class_(gy_3 var0, rgP_2 var1) throws CommandSyntaxException {
      an_3 var2 = var0.int_();
      rnB_2 var3 = (rnB_2)var2.BG();
      if (var3 == null) {
         throw break_.create();
      } else {
         rVi_1 var4 = var3.byte_().break_(class_);
         List var5 = var0.super_().x().super_();

         for (rhN_2 var7 : var5) {
            if (var7 == var2) {
               var7.class_(new rgn_3("chat.type.team.sent", var4, var0.extends_(), var1), var2.ro());
            } else if (var7.BG() == var3) {
               var7.class_(new rgn_3("chat.type.team.text", var4, var0.extends_(), var1), var2.ro());
            }
         }

         return var5.size();
      }
   }
}
