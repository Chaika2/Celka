package celestial;

import com.mojang.datafixers.util.Pair;
import java.util.List;

public class vP_2 extends Fu_1<rJL> {
   private static final rqO_2 id_class = new rqO_2("textures/gui/container/loom.png");
   private static final int id_throws = (rHE.BANNER_PATTERNS_COUNT - rHE.BANNERS_WITH_ITEMS - 1 + 4 - 1) / 4;
   private final Iq_1 id_case;
   private List<Pair<rHE, rxL_2>> id_catch;
   private rdn_3 id_private = rdn_3.id_break;
   private rdn_3 id_implements = rdn_3.id_break;
   private rdn_3 id_finally = rdn_3.id_break;
   private boolean id_boolean;
   private boolean id_transient;
   private boolean id_for;
   private float id_double;
   private boolean id_switch;
   private int r = 1;

   private void id_byte(int var1, int var2, int var3) {
      rdn_3 var4 = new rdn_3(rdy_3.di);
      rcd_3 var5 = var4.id_class("BlockEntityTag");
      rcy_3 var6 = new rHG().id_class(rHE.BASE, rxL_2.GRAY).id_class(rHE.values()[var1], rxL_2.WHITE).id_class();
      var5.id_class("Patterns", var6);
      Ml_1 var7 = new Ml_1();
      var7.id_class();
      var7.id_class((double)((float)var2 + 0.5F), (double)(var3 + 16), 0.0);
      var7.id_class(6.0F, -6.0F, 1.0F);
      var7.id_class(0.5, 0.5, 0.0);
      var7.id_class(0.5, 0.5, 0.5);
      float var8 = 0.6666667F;
      var7.id_class(0.6666667F, -0.6666667F, -0.6666667F);
      Hd_1 var9 = this.id_volatile.id_interface().id_break();
      this.id_case.id_case = 0.0F;
      this.id_case.id_protected = -32.0F;
      List var10 = rHb_1.id_class(rxL_2.GRAY, rHb_1.id_class(var4));
      fD_2.id_class(var7, var9, 15728880, fZ_2.id_class, this.id_case, IC.id_case, true, var10);
      var7.id_break();
      var9.id_break();
   }

   public vP_2(rJL var1, rhz_3 var2, rgP_2 var3) {
      super(var1, var2, var3);
      this.id_case = fD_2.id_class();
      var1.id_class(this::id_finally);
      this.id_goto -= 2;
   }

   @Override
   public boolean id_class(double var1, double var3, int var5, double var6, double var8) {
      if (this.id_switch && this.id_boolean) {
         int var10 = this.id_abstract + 13;
         int var11 = var10 + 56;
         this.id_double = ((float)var3 - (float)var10 - 7.5F) / ((float)(var11 - var10) - 15.0F);
         this.id_double = rfU_2.id_class(this.id_double, 0.0F, 1.0F);
         int var12 = id_throws - 4;
         int var13 = (int)((double)(this.id_double * (float)var12) + 0.5);
         if (var13 < 0) {
            var13 = 0;
         }

         this.r = 1 + var13 * 4;
         return true;
      } else {
         return super.id_class(var1, var3, var5, var6, var8);
      }
   }

   @Override
   protected boolean id_class(double var1, double var3, int var5, int var6, int var7) {
      return var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + this.id_synchronized) || var3 >= (double)(var6 + this.id_return);
   }

   @Override
   public boolean id_class(double var1, double var3, double var5) {
      if (this.id_boolean) {
         int var7 = id_throws - 4;
         this.id_double = (float)((double)this.id_double - var5 / (double)var7);
         this.id_double = rfU_2.id_class(this.id_double, 0.0F, 1.0F);
         this.r = 1 + (int)((double)(this.id_double * (float)var7) + 0.5) * 4;
      }

      return true;
   }

   @Override
   protected void id_class(Ml_1 var1, float var2, int var3, int var4) {
      this.id_class(var1);
      this.id_volatile.A().id_class(id_class);
      int var5 = this.id_char;
      int var6 = this.id_abstract;
      this.id_break(var1, var5, var6, 0, 0, this.id_synchronized, this.id_return);
      rJY var7 = this.id_instanceof.id_break();
      rJY var8 = this.id_instanceof.id_byte();
      rJY var9 = this.id_instanceof.id_protected();
      rJY var10 = this.id_instanceof.id_throws();
      if (!var7.id_break()) {
         this.id_break(var1, var5 + var7.id_throws, var6 + var7.id_case, this.id_synchronized, 0, 16, 16);
      }

      if (!var8.id_break()) {
         this.id_break(var1, var5 + var8.id_throws, var6 + var8.id_case, this.id_synchronized + 16, 0, 16, 16);
      }

      if (!var9.id_break()) {
         this.id_break(var1, var5 + var9.id_throws, var6 + var9.id_case, this.id_synchronized + 32, 0, 16, 16);
      }

      int var11 = (int)(41.0F * this.id_double);
      this.id_break(var1, var5 + 119, var6 + 13 + var11, 232 + (this.id_boolean ? 0 : 12), 0, 12, 15);
      HF.id_byte();
      if (this.id_catch != null && !this.id_for) {
         Hd_1 var12 = this.id_volatile.id_interface().id_break();
         var1.id_class();
         var1.id_class((double)(var5 + 139), (double)(var6 + 52), 0.0);
         var1.id_class(24.0F, -24.0F, 1.0F);
         var1.id_class(0.5, 0.5, 0.5);
         float var13 = 0.6666667F;
         var1.id_class(0.6666667F, -0.6666667F, -0.6666667F);
         this.id_case.id_case = 0.0F;
         this.id_case.id_protected = -32.0F;
         fD_2.id_class(var1, var12, 15728880, fZ_2.id_class, this.id_case, IC.id_case, true, this.id_catch);
         var1.id_break();
         var12.id_break();
      } else if (this.id_for) {
         this.id_break(var1, var5 + var10.id_throws - 2, var6 + var10.id_case - 2, this.id_synchronized, 17, 17, 16);
      }

      if (this.id_boolean) {
         int var20 = var5 + 60;
         int var22 = var6 + 13;
         int var14 = this.r + 16;

         for (int var15 = this.r; var15 < var14 && var15 < rHE.BANNER_PATTERNS_COUNT - rHE.BANNERS_WITH_ITEMS; var15++) {
            int var16 = var15 - this.r;
            int var17 = var20 + var16 % 4 * 14;
            int var18 = var22 + var16 / 4 * 14;
            this.id_volatile.A().id_class(id_class);
            int var19 = this.id_return;
            if (var15 == this.id_instanceof.id_class()) {
               var19 += 14;
            } else if (var3 >= var17 && var4 >= var18 && var3 < var17 + 14 && var4 < var18 + 14) {
               var19 += 28;
            }

            this.id_break(var1, var17, var18, 0, var19, 14, 14);
            this.id_byte(var15, var17, var18);
         }
      } else if (this.id_transient) {
         int var21 = var5 + 60;
         int var23 = var6 + 13;
         this.id_volatile.A().id_class(id_class);
         this.id_break(var1, var21, var23, 0, this.id_return, 14, 14);
         int var24 = this.id_instanceof.id_class();
         this.id_byte(var24, var21, var23);
      }

      HF.id_protected();
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      super.id_class(var1, var2, var3, var4);
      this.id_break(var1, var2, var3);
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      this.id_switch = false;
      if (this.id_boolean) {
         int var6 = this.id_char + 60;
         int var7 = this.id_abstract + 13;
         int var8 = this.r + 16;

         for (int var9 = this.r; var9 < var8; var9++) {
            int var10 = var9 - this.r;
            double var11 = var1 - (double)(var6 + var10 % 4 * 14);
            double var13 = var3 - (double)(var7 + var10 / 4 * 14);
            if (var11 >= 0.0 && var13 >= 0.0 && var11 < 14.0 && var13 < 14.0 && this.id_instanceof.id_break((cb_3)this.id_volatile.id_class[57], var9)) {
               QY.id_instanceof().c().id_class(Np_1.id_class(rqn_3.dI, 1.0F));
               ((Ax_1)this.id_volatile.id_class[55]).id_class(this.id_instanceof.id_case, var9);
               return true;
            }
         }

         var6 = this.id_char + 119;
         var7 = this.id_abstract + 9;
         if (var1 >= (double)var6 && var1 < (double)(var6 + 12) && var3 >= (double)var7 && var3 < (double)(var7 + 56)) {
            this.id_switch = true;
         }
      }

      return super.id_break(var1, var3, var5);
   }

   private void id_finally() {
      rdn_3 var1 = this.id_instanceof.id_throws().id_class();
      if (var1.id_class()) {
         this.id_catch = null;
      } else {
         this.id_catch = rHb_1.id_class(((rxO_2)var1.id_break()).id_byte(), rHb_1.id_class(var1));
      }

      rdn_3 var2 = this.id_instanceof.id_break().id_class();
      rdn_3 var3 = this.id_instanceof.id_byte().id_class();
      rdn_3 var4 = this.id_instanceof.id_protected().id_class();
      rcd_3 var5 = var2.id_class("BlockEntityTag");
      this.id_for = var5.id_byte("Patterns", 9) && !var2.id_class() && var5.id_protected("Patterns", 10).size() >= 6;
      if (this.id_for) {
         this.id_catch = null;
      }

      if (!rdn_3.id_break(var2, this.id_private) || !rdn_3.id_break(var3, this.id_implements) || !rdn_3.id_break(var4, this.id_finally)) {
         this.id_boolean = !var2.id_class() && !var3.id_class() && var4.id_class() && !this.id_for;
         this.id_transient = !this.id_for && !var4.id_class() && !var2.id_class() && !var3.id_class();
      }

      this.id_private = var2.id_implements();
      this.id_implements = var3.id_implements();
      this.id_finally = var4.id_implements();
   }
}
