package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Kz_1 {
   private static final SimpleCommandExceptionType id_class = new SimpleCommandExceptionType(new rgn_3("commands.summon.failed"));
   private static final SimpleCommandExceptionType id_break = new SimpleCommandExceptionType(new rgn_3("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType id_byte = new SimpleCommandExceptionType(new rgn_3("commands.summon.invalidPosition"));

   public static void id_class(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.id_class("summon").requires(var0x -> var0x.id_class(2)))
            .then(
               ((RequiredArgumentBuilder)gp_3.id_class("entity", Rl_1.id_class())
                     .suggests(Yl_1.id_throws)
                     .executes(
                        var0x -> id_class((gy_3)var0x.getSource(), Rl_1.id_class(var0x, "entity"), ((gy_3)var0x.getSource()).id_volatile(), new rcd_3(), true)
                     ))
                  .then(
                     ((RequiredArgumentBuilder)gp_3.id_class("pos", Yw_1.id_class())
                           .executes(var0x -> id_class((gy_3)var0x.getSource(), Rl_1.id_class(var0x, "entity"), Yw_1.id_class(var0x, "pos"), new rcd_3(), true)))
                        .then(
                           gp_3.id_class("nbt", Ys_1.id_class())
                              .executes(
                                 var0x -> id_class(
                                       (gy_3)var0x.getSource(), Rl_1.id_class(var0x, "entity"), Yw_1.id_class(var0x, "pos"), Ys_1.id_class(var0x, "nbt"), false
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int id_class(gy_3 var0, rqO_2 var1, rjU_2 var2, rcd_3 var3, boolean var4) throws CommandSyntaxException {
      rfH_2 var5 = new rfH_2(var2);
      if (!rYB.id_continue(var5)) {
         throw id_byte.create();
      } else {
         rcd_3 var6 = var3.id_catch();
         var6.id_class("id", var1.toString());
         rrEm_1 var7 = var0.id_final();
         an_3 var8 = aI_2.id_class(var6, var7, var1x -> {
            var1x.id_class(var2.id_break, var2.id_byte, var2.id_protected, (Float)var1x.id_throws[15], (Float)var1x.id_throws[16]);
            return var1x;
         });
         if (var8 == null) {
            throw id_class.create();
         } else {
            if (var4 && var8 instanceof is_3) {
               ((is_3)var8).id_class(var0.id_final(), var0.id_final().id_throws(var8.Bs()), iO_2.COMMAND, (aU_2)null, (rcd_3)null);
            }

            if (!var7.id_implements(var8)) {
               throw id_break.create();
            } else {
               var0.id_class(new rgn_3("commands.summon.success", var8.L_()), true);
               return 1;
            }
         }
      }
   }
}
