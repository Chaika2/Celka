package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class Fy_1 extends Fu_1<rJp_1> {
   private static final rqO_2 id_class = new rqO_2("textures/gui/container/villager2.png");
   private static final rgP_2 id_throws = new rgn_3("merchant.trades");
   private static final rgP_2 id_case = new rgN_2(" - ");
   private static final rgP_2 id_catch = new rgn_3("merchant.deprecated");
   private int id_private;
   private final Fp_1[] id_implements = new Fp_1[7];
   int id_finally;
   private boolean id_boolean;

   public Fy_1(rJp_1 var1, rhz_3 var2, rgP_2 var3) {
      super(var1, var2, var3);
      this.id_synchronized = 276;
      this.id_while = 107;
   }

   private void id_class(Ml_1 var1, rdI_2 var2, int var3, int var4) {
      RenderSystem.enableBlend();
      this.id_volatile.A().id_class(id_class);
      if (var2.id_int()) {
         id_class(var1, var3 + 5 + 35 + 20, var4 + 3, this.h_(), 25.0F, 171.0F, 10, 9, 256, 512);
      } else {
         id_class(var1, var3 + 5 + 35 + 20, var4 + 3, this.h_(), 15.0F, 171.0F, 10, 9, 256, 512);
      }
   }

   @Override
   public boolean id_class(double var1, double var3, double var5) {
      int var7 = this.id_instanceof.id_throws().size();
      if (this.id_break(var7)) {
         int var8 = var7 - 7;
         this.id_finally = (int)((double)this.id_finally - var5);
         this.id_finally = rfU_2.id_class(this.id_finally, 0, var8);
      }

      return true;
   }

   @Override
   public boolean id_class(double var1, double var3, int var5, double var6, double var8) {
      int var10 = this.id_instanceof.id_throws().size();
      if (this.id_boolean) {
         int var11 = this.id_abstract + 18;
         int var12 = var11 + 139;
         int var13 = var10 - 7;
         float var14 = ((float)var3 - (float)var11 - 13.5F) / ((float)(var12 - var11) - 27.0F);
         var14 = var14 * (float)var13 + 0.5F;
         this.id_finally = rfU_2.id_class((int)var14, 0, var13);
         return true;
      } else {
         return super.id_class(var1, var3, var5, var6, var8);
      }
   }

   private void id_class(Ml_1 var1, rdn_3 var2, rdn_3 var3, int var4, int var5) {
      this.id_final.id_break(var2, var4, var5);
      if (var3.id_char() == var2.id_char()) {
         this.id_final.id_class(this.id_super, var2, (float)var4, (float)var5);
      } else {
         this.id_final.id_class(this.id_super, var3, (float)var4, (float)var5, var3.id_char() == 1 ? "1" : null);
         this.id_final.id_class(this.id_super, var2, (float)(var4 + 14), (float)var5, var2.id_char() == 1 ? "1" : null);
         this.id_volatile.A().id_class(id_class);
         this.id_class(this.h_() + 300);
         id_class(var1, var4 + 7, var5 + 12, this.h_(), 0.0F, 176.0F, 9, 2, 256, 512);
         this.id_class(this.h_() - 300);
      }
   }

   @Override
   protected void id_class(Ml_1 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.id_volatile.A().id_class(id_class);
      int var5 = (this.id_package - this.id_synchronized) / 2;
      int var6 = (this.id_int - this.id_return) / 2;
      id_class(var1, var5, var6, this.h_(), 0.0F, 0.0F, this.id_synchronized, this.id_return, 256, 512);
      rdf_3 var7 = this.id_instanceof.id_throws();
      if (!var7.isEmpty()) {
         int var8 = this.id_private;
         if (var8 < 0 || var8 >= var7.size()) {
            return;
         }

         rdI_2 var9 = var7.get(var8);
         if (var9.id_int()) {
            this.id_volatile.A().id_class(id_class);
            RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
            id_class(var1, this.id_char + 83 + 99, this.id_abstract + 35, this.h_(), 311.0F, 0.0F, 28, 21, 256, 512);
         }
      }
   }

   @Override
   protected void id_class(Ml_1 var1, int var2, int var3) {
      int var4 = this.id_instanceof.id_byte();
      if (var4 > 0 && var4 <= 5 && this.id_instanceof.id_case()) {
         rVi_1 var5 = this.id_extends.id_case().id_class(id_case).id_class(new rgn_3("merchant.level." + var4));
         int var6 = this.id_super.id_class(var5);
         int var7 = 49 + this.id_synchronized / 2 - var6 / 2;
         this.id_super.id_byte(var1, var5, (float)var7, 6.0F, 4210752);
      } else {
         this.id_super.id_byte(var1, this.id_extends, (float)(49 + this.id_synchronized / 2 - this.id_super.id_class(this.id_extends) / 2), 6.0F, 4210752);
      }

      if (this.id_throw != null) {
         this.id_super.id_byte(var1, this.id_throw.L_(), (float)this.id_while, (float)this.id_try, 4210752);
      }

      int var8 = this.id_super.id_class(id_throws);
      this.id_super.id_byte(var1, id_throws, (float)(5 - var8 / 2 + 48), 6.0F, 4210752);
   }

   private void id_class(Ml_1 var1, int var2, int var3, rdf_3 var4) {
      int var5 = var4.size() + 1 - 7;
      if (var5 > 1) {
         int var6 = 139 - (27 + (var5 - 1) * 139 / var5);
         int var7 = 1 + var6 / var5 + 139 / var5;
         byte var8 = 113;
         int var9 = Math.min(113, this.id_finally * var7);
         if (this.id_finally == var5 - 1) {
            var9 = 113;
         }

         id_class(var1, var2 + 94, var3 + 18 + var9, this.h_(), 0.0F, 199.0F, 6, 27, 256, 512);
      } else {
         id_class(var1, var2 + 94, var3 + 18, this.h_(), 6.0F, 199.0F, 6, 27, 256, 512);
      }
   }

   private void id_class(Ml_1 var1, int var2, int var3, rdI_2 var4) {
      this.id_volatile.A().id_class(id_class);
      int var5 = this.id_instanceof.id_byte();
      int var6 = this.id_instanceof.id_class();
      if (var5 < 5) {
         id_class(var1, var2 + 136, var3 + 16, this.h_(), 0.0F, 186.0F, 102, 5, 256, 512);
         int var7 = rsp_3.id_break(var5);
         if (var6 >= var7 && rsp_3.id_protected(var5)) {
            byte var8 = 100;
            float var9 = 100.0F / (float)(rsp_3.id_byte(var5) - var7);
            int var10 = Math.min(rfU_2.id_protected(var9 * (float)(var6 - var7)), 100);
            id_class(var1, var2 + 136, var3 + 16, this.h_(), 0.0F, 191.0F, var10 + 1, 5, 256, 512);
            int var11 = this.id_instanceof.id_break();
            if (var11 > 0) {
               int var12 = Math.min(rfU_2.id_protected((float)var11 * var9), 100 - var10);
               id_class(var1, var2 + 136 + var10 + 1, var3 + 16 + 1, this.h_(), 2.0F, 182.0F, var12, 3, 256, 512);
            }
         }
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      super.id_class(var1, var2, var3, var4);
      rdf_3 var5 = this.id_instanceof.id_throws();
      if (!var5.isEmpty()) {
         int var6 = (this.id_package - this.id_synchronized) / 2;
         int var7 = (this.id_int - this.id_return) / 2;
         int var8 = var7 + 16 + 1;
         int var9 = var6 + 5 + 5;
         RenderSystem.pushMatrix();
         RenderSystem.enableRescaleNormal();
         this.id_volatile.A().id_class(id_class);
         this.id_class(var1, var6, var7, var5);
         int var10 = 0;

         for (rdI_2 var12 : var5) {
            if (!this.id_break(var5.size()) || var10 >= this.id_finally && var10 < 7 + this.id_finally) {
               rdn_3 var13 = var12.id_class();
               rdn_3 var14 = var12.id_break();
               rdn_3 var15 = var12.id_byte();
               rdn_3 var16 = var12.id_protected();
               this.id_final.id_break = 100.0F;
               int var17 = var8 + 2;
               this.id_class(var1, var14, var13, var9, var17);
               if (!var15.id_class()) {
                  this.id_final.id_break(var15, var6 + 5 + 35, var17);
                  this.id_final.id_class(this.id_super, var15, (float)(var6 + 5 + 35), (float)var17);
               }

               this.id_class(var1, var12, var6, var17);
               this.id_final.id_break(var16, var6 + 5 + 68, var17);
               this.id_final.id_class(this.id_super, var16, (float)(var6 + 5 + 68), (float)var17);
               this.id_final.id_break = 0.0F;
               var8 += 20;
               var10++;
            } else {
               var10++;
            }
         }

         int var18 = this.id_private;
         rdI_2 var19 = var5.get(var18);
         if (this.id_instanceof.id_case()) {
            this.id_class(var1, var6, var7, var19);
         }

         if (var19.id_int() && this.id_class(186, 35, 22, 21, (double)var2, (double)var3) && this.id_instanceof.id_protected()) {
            this.id_class(var1, id_catch, var2, var3);
         }

         for (Fp_1 var23 : this.id_implements) {
            if (var23.B_()) {
               var23.id_class(var1, var2, var3);
            }

            var23.id_new = var23.id_class < this.id_instanceof.id_throws().size();
         }

         RenderSystem.popMatrix();
         RenderSystem.enableDepthTest();
      }

      this.id_break(var1, var2, var3);
   }

   private boolean id_break(int var1) {
      return var1 > 7;
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      this.id_boolean = false;
      int var6 = (this.id_package - this.id_synchronized) / 2;
      int var7 = (this.id_int - this.id_return) / 2;
      if (this.id_break(this.id_instanceof.id_throws().size())
         && var1 > (double)(var6 + 94)
         && var1 < (double)(var6 + 94 + 6)
         && var3 > (double)(var7 + 18)
         && var3 <= (double)(var7 + 18 + 139 + 1)) {
         this.id_boolean = true;
      }

      return super.id_break(var1, var3, var5);
   }

   private void id_finally() {
      this.id_instanceof.id_protected(this.id_private);
      this.id_instanceof.id_catch(this.id_private);
      this.id_volatile.id_void().id_class(new rZm_1(this.id_private));
   }

   @Override
   protected void v_() {
      super.v_();
      int var1 = (this.id_package - this.id_synchronized) / 2;
      int var2 = (this.id_int - this.id_return) / 2;
      int var3 = var2 + 16 + 2;

      for (int var4 = 0; var4 < 7; var4++) {
         this.id_implements[var4] = this.id_class(new Fp_1(this, var1 + 5, var3, var4, var1x -> {
            if (var1x instanceof Fp_1) {
               this.id_private = ((Fp_1)var1x).id_private() + this.id_finally;
               this.id_finally();
            }
         }));
         var3 += 20;
      }
   }
}
