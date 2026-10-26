package celestial;

import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import java.util.function.Function;

class Kj_1 implements Kp_1 {
   Kj_1(String var1) {
      this.class_ = var1;
   }

   @Override
   public KI class_(CommandContext<gy_3> var1) {
      return new Kf_1(Kf_1.class_(var1), Ym_1.throws_(var1, this.class_));
   }

   @Override
   public ArgumentBuilder<gy_3, ?> class_(ArgumentBuilder<gy_3, ?> var1, Function<ArgumentBuilder<gy_3, ?>, ArgumentBuilder<gy_3, ?>> var2) {
      return var1.then(gp_3.class_("storage").then((ArgumentBuilder)var2.apply(gp_3.class_(this.class_, Ym_1.class_()).suggests(Kf_1.break_))));
   }
}
