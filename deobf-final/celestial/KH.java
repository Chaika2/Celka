package celestial;

import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;

class KH implements Kp_1 {
   KH(String var1) {
      this.class_ = var1;
   }

   @Override
   public KI class_(CommandContext<gy_3> var1) throws CommandSyntaxException {
      rfH_2 var2 = RM.class_(var1, this.class_ + "Pos");
      ryO_2 var3 = ((gy_3)var1.getSource()).final_().class_(var2);
      if (var3 == null) {
         throw Kl_1.break_.create();
      } else {
         return new Kl_1(var3, var2);
      }
   }

   @Override
   public ArgumentBuilder<gy_3, ?> class_(ArgumentBuilder<gy_3, ?> var1, Function<ArgumentBuilder<gy_3, ?>, ArgumentBuilder<gy_3, ?>> var2) {
      return var1.then(gp_3.class_("block").then((ArgumentBuilder)var2.apply(gp_3.class_(this.class_ + "Pos", RM.class_()))));
   }
}
