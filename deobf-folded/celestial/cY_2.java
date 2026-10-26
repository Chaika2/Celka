package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class cY_2 extends ch_3 implements Ls_1 {
   private static final rqO_2 id_throws = new rqO_2("textures/gui/widgets.png");
   public static final rqO_2 id_class = new rqO_2("textures/gui/spectator_widgets.png");
   private final QY id_case;
   private long id_catch;
   private Lb_1 id_private;

   public cY_2(QY var1) {
      this.id_case = var1;
   }

   private void id_class(Ml_1 var1, int var2, int var3, float var4, float var5, LS var6) {
      this.id_case.A().id_class(id_class);
      if (var6 != Lb_1.id_class) {
         int var7 = (int)(var5 * 255.0F);
         RenderSystem.pushMatrix();
         RenderSystem.translatef((float)var3, var4, 0.0F);
         float var8 = var6.id_protected() ? 1.0F : 0.25F;
         RenderSystem.color4f(var8, var8, var8, var5);
         var6.id_class(var1, var8, var7);
         RenderSystem.popMatrix();
         if (var7 > 3 && var6.id_protected()) {
            rgP_2 var9 = ((Qw_1)this.id_case.id_class[20]).t[var2].id_native();
            ((cm_3)this.id_case.id_class[15])
               .id_break(var1, var9, (float)(var3 + 19 - 2 - ((cm_3)this.id_case.id_class[15]).id_class(var9)), var4 + 6.0F + 3.0F, 16777215 + (var7 << 24));
         }
      }
   }

   public void id_class(Ml_1 var1) {
      int var2 = (int)(this.id_throws() * 255.0F);
      if (var2 > 3 && this.id_private != null) {
         LS var3 = this.id_private.id_break();
         rgP_2 var4 = var3 == Lb_1.id_class ? this.id_private.id_byte().id_break() : var3.id_byte();
         if (var4 != null) {
            int var5 = (this.id_case.id_else().id_super() - ((cm_3)this.id_case.id_class[15]).id_class(var4)) / 2;
            int var6 = this.id_case.id_else().id_this() - 35;
            RenderSystem.pushMatrix();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            ((cm_3)this.id_case.id_class[15]).id_break(var1, var4, (float)var5, (float)var6, 16777215 + (var2 << 24));
            RenderSystem.disableBlend();
            RenderSystem.popMatrix();
         }
      }
   }

   public boolean id_class() {
      return this.id_private != null;
   }

   public void id_class(double var1) {
      int var3 = this.id_private.id_throws() + (int)var1;

      while (var3 >= 0 && var3 <= 8 && (this.id_private.id_class(var3) == Lb_1.id_class || !this.id_private.id_class(var3).id_protected())) {
         var3 = (int)((double)var3 + var1);
      }

      if (var3 >= 0 && var3 <= 8) {
         this.id_private.id_break(var3);
         this.id_catch = rqR_2.id_break();
      }
   }

   public void id_class(Ml_1 var1, float var2) {
      if (this.id_private != null) {
         float var3 = this.id_throws();
         if (var3 <= 0.0F) {
            this.id_private.id_protected();
         } else {
            int var4 = this.id_case.id_else().id_super() / 2;
            int var5 = this.h_();
            this.id_class(-90);
            int var6 = rfU_2.id_protected((float)this.id_case.id_else().id_this() - 22.0F * var3);
            LX var7 = this.id_private.id_case();
            this.id_class(var1, var3, var4, var6, var7);
            this.id_class(var5);
         }
      }
   }

   protected void id_class(Ml_1 var1, float var2, int var3, int var4, LX var5) {
      RenderSystem.enableRescaleNormal();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, var2);
      this.id_case.A().id_class(id_throws);
      this.id_break(var1, var3 - 91, var4, 0, 0, 182, 22);
      if (var5.id_class() >= 0) {
         this.id_break(var1, var3 - 91 - 1 + var5.id_class() * 20, var4 - 1, 0, 22, 24, 22);
      }

      for (int var6 = 0; var6 < 9; var6++) {
         this.id_class(var1, var6, this.id_case.id_else().id_super() / 2 - 90 + var6 * 20 + 2, (float)(var4 + 3), var2, var5.id_class(var6));
      }

      RenderSystem.disableRescaleNormal();
      RenderSystem.disableBlend();
   }

   @Override
   public void id_class(Lb_1 var1) {
      this.id_private = null;
      this.id_catch = 0L;
   }

   public void id_break(int var1) {
      this.id_catch = rqR_2.id_break();
      if (this.id_private != null) {
         this.id_private.id_break(var1);
      } else {
         this.id_private = new Lb_1(this);
      }
   }

   private float id_throws() {
      long var1 = this.id_catch - rqR_2.id_break() + 5000L;
      return rfU_2.id_class((float)var1 / 2000.0F, 0.0F, 1.0F);
   }

   public void id_protected() {
      this.id_catch = rqR_2.id_break();
      if (this.id_class()) {
         int var1 = this.id_private.id_throws();
         if (var1 != -1) {
            this.id_private.id_break(var1);
         }
      } else {
         this.id_private = new Lb_1(this);
      }
   }
}
