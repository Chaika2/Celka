package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class Zp_1 extends Lg_1<Zp_1> {
   public Zp_1(Zy_1 var1) {
      this.class_ = var1;
   }

   void class_() {
      this.class_.class_(this);
      ZH var1 = Zl_1.throws_.get(this.class_.x_().indexOf(this));
      rVF var2 = this.class_.class_.case_.class_.case_.break_().break_(rVL.n);
      this.class_.class_.synchronized_ = var1.byte_.apply(var2);
      this.class_.class_.else_.class_(Zl_1.class_(var2, this.class_.class_.synchronized_));
      this.class_.class_.else_.extends_();
   }

   private void class_(Ml_1 var1, int var2, int var3, rdb_3 var4) {
      this.class_(var1, var2 + 1, var3 + 1);
      RenderSystem.enableRescaleNormal();
      this.class_.class_.final_.class_(new rdn_3(var4), (float)(var2 + 2), (float)(var3 + 2));
      RenderSystem.disableRescaleNormal();
   }

   private void class_(Ml_1 var1, int var2, int var3) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      Zy_1.class_(this.class_).A().class_(ch_3.byte_);
      ch_3.class_(var1, var2, var3, this.class_.class_.h_(), 0.0F, 0.0F, 18, 18, 128, 128);
   }

   @Override
   public void class_(Ml_1 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, boolean var9, float var10) {
      ZH var11 = Zl_1.throws_.get(var2);
      this.class_(var1, var4, var3, var11.class_);
      this.class_.class_.super_.byte_(var1, var11.break_, (float)(var4 + 18 + 5), (float)(var3 + 6), 16777215);
   }

   @Override
   public boolean break_(double var1, double var3, int var5) {
      if (var5 == 0) {
         this.class_();
      }

      return false;
   }
}
