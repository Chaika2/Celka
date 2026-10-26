package celestial;

import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;

class KH implements Kp_1 {
   KH(String var1) {
      this.id_class = var1;
   }

   @Override
   public KI id_class(CommandContext<gy_3> var1) throws CommandSyntaxException {
      rfH_2 var2 = RM.id_class(var1, this.id_class + "Pos");
      ryO_2 var3 = ((gy_3)var1.getSource()).id_final().id_class(var2);
      if (var3 == null) {
         throw Kl_1.id_break.create();
      } else {
         return new Kl_1(var3, var2);
      }
   }

   @Override
   public ArgumentBuilder<gy_3, ?> id_class(ArgumentBuilder<gy_3, ?> var1, Function<ArgumentBuilder<gy_3, ?>, ArgumentBuilder<gy_3, ?>> var2) {
      return var1.then(gp_3.id_class("block").then((ArgumentBuilder)var2.apply(gp_3.id_class(this.id_class + "Pos", RM.id_class()))));
   }
}
