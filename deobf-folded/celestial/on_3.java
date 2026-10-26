package celestial;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;

class on_3 implements rRF {
   @Override
   public <T extends rRC<T>> void id_byte(rRA<T> var1, rRn_1<T> var2) {
      this.id_class
         .then(
            ((LiteralArgumentBuilder)gp_3.id_class(var1.id_class()).executes(var1x -> oA_2.id_class((gy_3)var1x.getSource(), var1)))
               .then(var2.id_class("value").executes(var1x -> oA_2.id_class(var1x, var1)))
         );
   }

   on_3(LiteralArgumentBuilder var1) {
      this.id_class = var1;
   }
}
