package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class FN extends Fu_1<rXR> {
   private static final rqO_2 id_class = new rqO_2("textures/gui/container/cartography_table.png");

   public FN(rXR var1, rhz_3 var2, rgP_2 var3) {
      super(var1, var2, var3);
      this.id_goto -= 2;
   }

   private void id_class(Ml_1 var1, rrGb_1 var2, boolean var3, boolean var4, boolean var5, boolean var6) {
      int var7 = this.id_char;
      int var8 = this.id_abstract;
      if (var4 && !var6) {
         this.id_break(var1, var7 + 67, var8 + 13, this.id_synchronized, 66, 66, 66);
         this.id_class(var2, var7 + 85, var8 + 31, 0.226F);
      } else if (var3) {
         this.id_break(var1, var7 + 67 + 16, var8 + 13, this.id_synchronized, 132, 50, 66);
         this.id_class(var2, var7 + 86, var8 + 16, 0.34F);
         this.id_volatile.A().id_class(id_class);
         RenderSystem.pushMatrix();
         RenderSystem.translatef(0.0F, 0.0F, 1.0F);
         this.id_break(var1, var7 + 67, var8 + 13 + 16, this.id_synchronized, 132, 50, 66);
         this.id_class(var2, var7 + 70, var8 + 32, 0.34F);
         RenderSystem.popMatrix();
      } else if (var5) {
         this.id_break(var1, var7 + 67, var8 + 13, this.id_synchronized, 0, 66, 66);
         this.id_class(var2, var7 + 71, var8 + 17, 0.45F);
         this.id_volatile.A().id_class(id_class);
         RenderSystem.pushMatrix();
         RenderSystem.translatef(0.0F, 0.0F, 1.0F);
         this.id_break(var1, var7 + 66, var8 + 12, 0, this.id_return, 66, 66);
         RenderSystem.popMatrix();
      } else {
         this.id_break(var1, var7 + 67, var8 + 13, this.id_synchronized, 0, 66, 66);
         this.id_class(var2, var7 + 71, var8 + 17, 0.45F);
      }
   }

   private void id_class(rrGb_1 var1, int var2, int var3, float var4) {
      if (var1 != null) {
         RenderSystem.pushMatrix();
         RenderSystem.translatef((float)var2, (float)var3, 1.0F);
         RenderSystem.scalef(var4, var4, 1.0F);
         Hd_1 var5 = Hx_1.id_class(yb_3.id_class().id_byte());
         ((Hh_1)this.id_volatile.id_class[16]).id_catch().id_class(new Ml_1(), var5, var1, true, 15728880);
         var5.id_break();
         RenderSystem.popMatrix();
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      super.id_class(var1, var2, var3, var4);
      this.id_break(var1, var2, var3);
   }

   @Override
   protected void id_class(Ml_1 var1, float var2, int var3, int var4) {
      this.id_class(var1);
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.id_volatile.A().id_class(id_class);
      int var5 = this.id_char;
      int var6 = this.id_abstract;
      this.id_break(var1, var5, var6, 0, 0, this.id_synchronized, this.id_return);
      rdb_3 var7 = this.id_instanceof.id_class(1).id_class().id_break();
      boolean var8 = var7 == rdy_3.dM;
      boolean var9 = var7 == rdy_3.Xb;
      boolean var10 = var7 == rdy_3.BD;
      rdn_3 var11 = this.id_instanceof.id_class(0).id_class();
      boolean var12 = false;
      rrGb_1 var13;
      if (var11.id_break() == rdy_3.JX) {
         var13 = rxI_2.id_class(var11, (gm_3)this.id_volatile.id_class[56]);
         if (var13 != null) {
            if (var13.id_private) {
               var12 = true;
               if (var9 || var10) {
                  this.id_break(var1, var5 + 35, var6 + 31, this.id_synchronized + 50, 132, 28, 21);
               }
            }

            if (var9 && var13.id_case >= 4) {
               var12 = true;
               this.id_break(var1, var5 + 35, var6 + 31, this.id_synchronized + 50, 132, 28, 21);
            }
         }
      } else {
         var13 = null;
      }

      this.id_class(var1, var13, var8, var9, var10, var12);
   }
}
