package celestial;

import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.function.Function;

class Kw_1 implements Kp_1 {
   Kw_1(String var1) {
      this.class_ = var1;
   }

   @Override
   public KI class_(CommandContext<gy_3> var1) throws CommandSyntaxException {
      return new Kt_1(RZ.class_(var1, this.class_));
   }

   @Override
   public ArgumentBuilder<gy_3, ?> class_(ArgumentBuilder<gy_3, ?> var1, Function<ArgumentBuilder<gy_3, ?>, ArgumentBuilder<gy_3, ?>> var2) {
      return var1.then(gp_3.class_("entity").then((ArgumentBuilder)var2.apply(gp_3.class_(this.class_, RZ.class_()))));
   }
}
