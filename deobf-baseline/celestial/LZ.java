package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public abstract class LZ extends ch_3 implements cC_2, cp_3 {
   public static final rqO_2 id_finally = new rqO_2("textures/gui/widgets.png");
   protected int id_extends;
   protected int id_native;
   public int id_volatile;
   public int id_final;
   private rgP_2 id_class;
   protected boolean id_package;
   public boolean id_int = true;
   public boolean id_new = true;
   protected float id_continue = 1.0F;
   private boolean id_throws;
   private float id_case;
   private boolean id_catch = true;

   public void id_byte(double var1, double var3) {
   }

   public void id_int(int var1) {
      this.id_extends = var1;
   }

   public LZ(int var1, int var2, int var3, int var4, rgP_2 var5) {
      this.id_volatile = var1;
      this.id_final = var2;
      this.id_extends = var3;
      this.id_native = var4;
      this.id_class = var5;
   }

   @Override
   public boolean id_class(double var1, double var3, int var5) {
      if (this.id_break(var5)) {
         this.id_protected(var1, var3);
         return true;
      } else {
         return false;
      }
   }

   protected void id_class(double var1, double var3, double var5, double var7) {
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      if (this.id_new) {
         this.id_package = var2 >= this.id_volatile
            && var3 >= this.id_final
            && var2 < this.id_volatile + this.id_extends
            && var3 < this.id_final + this.id_native;
         this.id_break(var1, var2, var3, var4);
      }
   }

   protected void id_class(Ml_1 var1, QY var2, int var3, int var4) {
   }

   public void id_class(Nf_1 var1) {
      var1.id_class(Np_1.id_class(rqn_3.dw, 1.0F));
   }

   @Override
   public boolean id_class(double var1, double var3, int var5, double var6, double var8) {
      if (this.id_break(var5)) {
         this.id_class(var1, var3, var6, var8);
         return true;
      } else {
         return false;
      }
   }

   public void id_class(float var1) {
      this.id_continue = var1;
   }

   public void id_class(Ml_1 var1, int var2, int var3) {
   }

   public void id_class(Ml_1 var1, cm_3 var2, int var3) {
      this.id_class(var1, var2, 2, var3);
   }

   protected void id_class(Ml_1 var1, cm_3 var2, rgP_2 var3, int var4, int var5, int var6, int var7, int var8) {
      this.id_class(var1, var2, var3, (var4 + var6) / 2, var4, var5, var6, var7, var8);
   }

   protected void id_class(Ml_1 var1, cm_3 var2, int var3, int var4) {
      int var5 = this.id_volatile + var3;
      int var6 = this.id_volatile + this.id_case() - var3;
      this.id_class(var1, var2, this.C_(), var5, this.id_final, var6, this.id_final + this.id_native, var4);
   }

   protected void id_class(Ml_1 var1, cm_3 var2, rgP_2 var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      int var10 = var2.id_class(var3) + 4;
      float var11 = (float)(var6 + var8 - 9) / 2.0F + 1.0F;
      float var12 = (float)(var7 - var5 + 1);
      if ((float)var10 > var12) {
         boolean var13 = this.id_package && this.id_public() != 0.0F;
         float var14 = (float)var10 - var12;
         double var15 = (double)rqR_2.id_break() / 500.0;
         double var17 = Math.max((double)var14 * 0.5, 3.0);
         double var19 = var13 ? (double)this.id_public() : Math.sin((Math.PI / 2) * Math.cos((Math.PI * 2) * var15 / var17)) / 2.0 + 0.5;
         double var21 = rfU_2.id_protected(var19, 0.0, (double)var14);
         this.id_class(var5, var6, var7, var8);
         var2.id_break(var1, var3, (float)((double)var5 - var21) + 2.0F, var11, var9);
         this.y_();
      } else {
         int var23 = rfU_2.id_class(var4, var5 + var10 / 2, var7 - var10 / 2);
         var2.id_break(var1, var3, var23, (int)var11, var9);
      }
   }

   @Override
   public boolean id_break(boolean var1) {
      if (this.id_return() && this.id_int && this.id_new) {
         this.id_throws = !this.id_throws;
         this.id_throws(this.id_throws);
         return this.id_throws;
      } else {
         return false;
      }
   }

   public LZ id_break(float var1) {
      this.id_case = var1;
      return this;
   }

   @Override
   public boolean id_break(double var1, double var3) {
      return this.id_int
         && this.id_new
         && var1 >= (double)this.id_volatile
         && var3 >= (double)this.id_final
         && var1 < (double)(this.id_volatile + this.id_extends)
         && var3 < (double)(this.id_final + this.id_native);
   }

   public void id_break(rgP_2 var1) {
      this.id_class = var1;
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      if (this.id_int && this.id_new && this.id_break(var5)) {
         boolean var6 = this.id_throws(var1, var3);
         if (var6) {
            if (this.id_synchronized()) {
               this.id_class(QY.id_instanceof().c());
            }

            this.id_byte(var1, var3);
            return true;
         }
      }

      return false;
   }

   protected boolean id_break(int var1) {
      return var1 == 0;
   }

   public void id_break(Ml_1 var1, int var2, int var3, float var4) {
      QY var5 = QY.id_instanceof();
      cm_3 var6 = (cm_3)var5.id_class[15];
      var5.A().id_class(id_finally);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, this.id_continue);
      int var7 = this.a_(this.B_());
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableDepthTest();
      this.id_break(var1, this.id_volatile, this.id_final, 0, 46 + var7 * 20, this.id_extends / 2, this.id_native);
      this.id_break(var1, this.id_volatile + this.id_extends / 2, this.id_final, 200 - this.id_extends / 2, 46 + var7 * 20, this.id_extends / 2, this.id_native);
      this.id_class(var1, var5, var2, var3);
      int var8 = this.id_int ? 16777215 : 10526880;
      this.id_class(var1, var6, var8 | rfU_2.id_case(this.id_continue * 255.0F) << 24);
   }

   protected boolean id_throws(double var1, double var3) {
      return this.id_int
         && this.id_new
         && var1 >= (double)this.id_volatile
         && var3 >= (double)this.id_final
         && var1 < (double)(this.id_volatile + this.id_extends)
         && var3 < (double)(this.id_final + this.id_native);
   }

   protected void id_throws(boolean var1) {
   }

   public LZ id_finally(boolean var1) {
      this.id_catch = var1;
      return this;
   }

   public int id_case() {
      return this.id_extends;
   }

   public int id_else() {
      return this.id_native;
   }

   public void id_implements(boolean var1) {
      this.id_throws = var1;
   }

   public boolean id_return() {
      return this.id_catch;
   }

   public float id_public() {
      return this.id_case;
   }

   public void id_protected(double var1, double var3) {
   }

   public boolean id_synchronized() {
      return true;
   }

   public boolean aO_() {
      return this.id_throws;
   }

   protected int a_(boolean var1) {
      byte var2 = 1;
      if (!this.id_int) {
         var2 = 0;
      } else if (var1) {
         var2 = 2;
      }

      return var2;
   }

   public boolean B_() {
      return this.id_package || this.id_throws;
   }

   protected rVi_1 A_() {
      return new rgn_3("gui.narrate.button", this.C_());
   }

   public rgP_2 C_() {
      return this.id_class;
   }
}
