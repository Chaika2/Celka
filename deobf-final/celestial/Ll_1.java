package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class Ll_1 extends LF {
   private final rqO_2 class_;
   private final int throws_;
   private final int case_;
   private final int catch_;
   private final int this_;
   private final int else_;

   public Ll_1(int var1, int var2, int var3, int var4, int var5, int var6, int var7, rqO_2 var8, int var9, int var10, LL var11, LA var12, rgP_2 var13) {
      super(var1, var2, var3, var4, var13, var11, var12);
      this.this_ = var9;
      this.else_ = var10;
      this.throws_ = var5;
      this.case_ = var6;
      this.catch_ = var7;
      this.class_ = var8;
   }

   public Ll_1(int var1, int var2, int var3, int var4, int var5, int var6, int var7, rqO_2 var8, int var9, int var10, LL var11, rgP_2 var12) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, private_, var12);
   }

   public Ll_1(int var1, int var2, int var3, int var4, int var5, int var6, int var7, rqO_2 var8, int var9, int var10, LL var11) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, rgN_2.byte_);
   }

   public Ll_1(int var1, int var2, int var3, int var4, int var5, int var6, int var7, rqO_2 var8, LL var9) {
      this(var1, var2, var3, var4, var5, var6, var7, var8, 256, 256, var9);
   }

   public void class_(int var1, int var2) {
      this.volatile_ = var1;
      this.final_ = var2;
   }

   @Override
   public void break_(Ml_1 var1, int var2, int var3, float var4) {
      QY var5 = QY.instanceof_();
      var5.A().class_(this.class_);
      int var6 = this.case_;
      if (this.B_()) {
         var6 += this.catch_;
      }

      RenderSystem.enableDepthTest();
      class_(var1, this.volatile_, this.final_, (float)this.throws_, (float)var6, this.extends_, this.native_, this.this_, this.else_);
      if (this.B_()) {
         this.class_(var1, var2, var3);
      }
   }
}
