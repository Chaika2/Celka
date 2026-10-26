package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class Lm_1 extends LZ {
   protected rqO_2 class_;
   protected boolean throws_;
   protected int case_;
   protected int catch_;
   protected int private_;
   protected int implements_;

   public void byte_(boolean var1) {
      this.throws_ = var1;
   }

   public Lm_1(int var1, int var2, int var3, int var4, boolean var5) {
      super(var1, var2, var3, var4, rgN_2.byte_);
      this.throws_ = var5;
   }

   public void class_(int var1, int var2, int var3, int var4, rqO_2 var5) {
      this.case_ = var1;
      this.catch_ = var2;
      this.private_ = var3;
      this.implements_ = var4;
      this.class_ = var5;
   }

   public void class_(int var1, int var2) {
      this.volatile_ = var1;
      this.final_ = var2;
   }

   @Override
   public void break_(Ml_1 var1, int var2, int var3, float var4) {
      QY var5 = QY.instanceof_();
      var5.A().class_(this.class_);
      RenderSystem.disableDepthTest();
      int var6 = this.case_;
      int var7 = this.catch_;
      if (this.throws_) {
         var6 += this.private_;
      }

      if (this.B_()) {
         var7 += this.implements_;
      }

      this.break_(var1, this.volatile_, this.final_, var6, var7, this.extends_, this.native_);
      RenderSystem.enableDepthTest();
   }

   public boolean catch_() {
      return this.throws_;
   }
}
