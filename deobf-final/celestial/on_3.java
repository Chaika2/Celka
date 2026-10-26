package celestial;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;

class on_3 implements rRF {
   @Override
   public <T extends rRC<T>> void byte_(rRA<T> var1, rRn_1<T> var2) {
      this.class_
         .then(
            ((LiteralArgumentBuilder)gp_3.class_(var1.class_()).executes(var1x -> oA_2.class_((gy_3)var1x.getSource(), var1)))
               .then(var2.class_("value").executes(var1x -> oA_2.class_(var1x, var1)))
         );
   }

   on_3(LiteralArgumentBuilder var1) {
      this.class_ = var1;
   }
}
