package celestial;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.exceptions.SimpleCommandExceptionType;

public class Kz_1 {
   private static final SimpleCommandExceptionType class_ = new SimpleCommandExceptionType(new rgn_3("commands.summon.failed"));
   private static final SimpleCommandExceptionType break_ = new SimpleCommandExceptionType(new rgn_3("commands.summon.failed.uuid"));
   private static final SimpleCommandExceptionType byte_ = new SimpleCommandExceptionType(new rgn_3("commands.summon.invalidPosition"));

   public static void class_(CommandDispatcher<gy_3> var0) {
      var0.register(
         (LiteralArgumentBuilder)((LiteralArgumentBuilder)gp_3.class_("summon").requires(var0x -> var0x.class_(2)))
            .then(
               ((RequiredArgumentBuilder)gp_3.class_("entity", Rl_1.class_())
                     .suggests(Yl_1.throws_)
                     .executes(var0x -> class_((gy_3)var0x.getSource(), Rl_1.class_(var0x, "entity"), ((gy_3)var0x.getSource()).volatile_(), new rcd_3(), true)))
                  .then(
                     ((RequiredArgumentBuilder)gp_3.class_("pos", Yw_1.class_())
                           .executes(var0x -> class_((gy_3)var0x.getSource(), Rl_1.class_(var0x, "entity"), Yw_1.class_(var0x, "pos"), new rcd_3(), true)))
                        .then(
                           gp_3.class_("nbt", Ys_1.class_())
                              .executes(
                                 var0x -> class_(
                                       (gy_3)var0x.getSource(), Rl_1.class_(var0x, "entity"), Yw_1.class_(var0x, "pos"), Ys_1.class_(var0x, "nbt"), false
                                    )
                              )
                        )
                  )
            )
      );
   }

   private static int class_(gy_3 var0, rqO_2 var1, rjU_2 var2, rcd_3 var3, boolean var4) throws CommandSyntaxException {
      rfH_2 var5 = new rfH_2(var2);
      if (!rYB.continue_(var5)) {
         throw byte_.create();
      } else {
         rcd_3 var6 = var3.catch_();
         var6.class_("id", var1.toString());
         rrEm_1 var7 = var0.final_();
         an_3 var8 = aI_2.class_(var6, var7, var1x -> {
            var1x.class_(var2.break_, var2.byte_, var2.protected_, (Float)var1x.throws_[15], (Float)var1x.throws_[16]);
            return var1x;
         });
         if (var8 == null) {
            throw class_.create();
         } else {
            if (var4 && var8 instanceof is_3) {
               ((is_3)var8).class_(var0.final_(), var0.final_().throws_(var8.Bs()), iO_2.COMMAND, (aU_2)null, (rcd_3)null);
            }

            if (!var7.implements_(var8)) {
               throw break_.create();
            } else {
               var0.class_(new rgn_3("commands.summon.success", var8.L_()), true);
               return 1;
            }
         }
      }
   }
}
