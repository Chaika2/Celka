package celestial;

import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Random;

class Ld_1 implements LS {
   private final rnB_2 class_;
   private final rqO_2 break_;
   private final List<Aw_1> byte_;

   @Override
   public rgP_2 byte_() {
      return this.class_.break_();
   }

   public Ld_1(Lx_1 var1, rnB_2 var2) {
      this.class_ = var2;
      this.byte_ = Lists.newArrayList();

      for (String var4 : var2.case_()) {
         Aw_1 var5 = QY.instanceof_().void_().class_(var4);
         if (var5 != null) {
            this.byte_.add(var5);
         }
      }

      if (this.byte_.isEmpty()) {
         this.break_ = jH_2.class_();
      } else {
         String var6 = this.byte_.get(new Random().nextInt(this.byte_.size())).class_().getName();
         this.break_ = cG_2.class_(var6);
         cG_2.class_(this.break_, var6);
      }
   }

   @Override
   public void class_(Lb_1 var1) {
      var1.class_(new LJ(this.byte_));
   }

   @Override
   public void class_(Ml_1 var1, float var2, int var3) {
      Integer var4 = this.class_.volatile_().protected_();
      if (var4 != null) {
         float var5 = (float)(var4 >> 16 & 0xFF) / 255.0F;
         float var6 = (float)(var4 >> 8 & 0xFF) / 255.0F;
         float var7 = (float)(var4 & 0xFF) / 255.0F;
         ch_3.class_(var1, 1, 1, 15, 15, rfU_2.throws_(var5 * var2, var6 * var2, var7 * var2) | var3 << 24);
      }

      QY.instanceof_().A().class_(this.break_);
      RenderSystem.color4f(var2, var2, var2, (float)var3 / 255.0F);
      ch_3.class_(var1, 2, 2, 12, 12, 8.0F, 8.0F, 8, 8, 64, 64);
      ch_3.class_(var1, 2, 2, 12, 12, 40.0F, 8.0F, 8, 8, 64, 64);
   }

   @Override
   public boolean protected_() {
      return !this.byte_.isEmpty();
   }
}
