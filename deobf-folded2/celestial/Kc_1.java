package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;
import com.mojang.brigadier.tree.LiteralCommandNode;
import java.util.List;

public class Kc_1 {
   private static final rgc_3 id_class = rgc_3.id_class
      .id_class(new rgy_3(rgp_3.id_class, new rgn_3("chat.type.team.hover")))
      .id_class(new rgl_3(rgH_2.SUGGEST_COMMAND, "/teammsg "));
   private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType(new rgn_3("commands.teammsg.failed.noteam"));

   public static void id_class(CommandDispatcher<gy_3> var0) {
      LiteralCommandNode var1 = var0.register(
         (LiteralArgumentBuilder)gp_3.id_class("teammsg")
            .then(gp_3.id_class("message", YP.id_class()).executes(var0x -> id_class((gy_3)var0x.getSource(), YP.id_class(var0x, "message"))))
      );
      var0.register((LiteralArgumentBuilder)gp_3.id_class("tm").redirect(var1));
   }

   private static int id_class(gy_3 var0, rgP_2 var1) throws CommandSyntaxException {
      an_3 var2 = var0.id_int();
      rnB_2 var3 = (rnB_2)var2.BG();
      if (var3 == null) {
         throw id_break.create();
      } else {
         rVi_1 var4 = var3.id_byte().id_break(id_class);
         List var5 = var0.id_super().x().id_super();

         for (rhN_2 var7 : var5) {
            if (var7 == var2) {
               var7.id_class(new rgn_3("chat.type.team.sent", var4, var0.id_extends(), var1), var2.ro());
            } else if (var7.BG() == var3) {
               var7.id_class(new rgn_3("chat.type.team.text", var4, var0.id_extends(), var1), var2.ro());
            }
         }

         return var5.size();
      }
   }
}
