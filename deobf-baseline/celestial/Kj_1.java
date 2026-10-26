package celestial;

import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.function.Function;

class Kj_1 implements Kp_1 {
   Kj_1(String var1) {
      this.id_class = var1;
   }

   @Override
   public KI id_class(CommandContext<gy_3> var1) {
      return new Kf_1(Kf_1.id_class(var1), Ym_1.id_throws(var1, this.id_class));
   }

   @Override
   public ArgumentBuilder<gy_3, ?> id_class(ArgumentBuilder<gy_3, ?> var1, Function<ArgumentBuilder<gy_3, ?>, ArgumentBuilder<gy_3, ?>> var2) {
      return var1.then(gp_3.id_class("storage").then((ArgumentBuilder)var2.apply(gp_3.id_class(this.id_class, Ym_1.id_class()).suggests(Kf_1.id_break))));
   }
}
