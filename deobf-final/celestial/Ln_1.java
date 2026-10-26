package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class Ln_1 extends LF {
   private final boolean class_;
   private final boolean throws_;

   public Ln_1(int var1, int var2, boolean var3, LL var4, boolean var5) {
      super(var1, var2, 23, 13, rgN_2.byte_, var4);
      this.class_ = var3;
      this.throws_ = var5;
   }

   @Override
   public void class_(Nf_1 var1) {
      if (this.throws_) {
         var1.class_(Np_1.class_(rqn_3.rS, 1.0F));
      }
   }

   @Override
   public void break_(Ml_1 var1, int var2, int var3, float var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      QY.instanceof_().A().class_(vz_3.throws_);
      byte var5 = 0;
      short var6 = 192;
      if (this.B_()) {
         var5 += 23;
      }

      if (!this.class_) {
         var6 += 13;
      }

      this.break_(var1, this.volatile_, this.final_, var5, var6, 23, 13);
   }
}
