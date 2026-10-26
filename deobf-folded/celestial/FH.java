package celestial;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;

public class FH extends cc_3<rJT> implements mB_2 {
   private static final rqO_2 id_throws = new rqO_2("textures/gui/recipe_button.png");
   private float id_case;
   private float id_catch;
   private final ms_3 id_private = new ms_3();
   private boolean id_implements;
   private boolean id_finally;
   private boolean id_boolean;
   private LZ id_transient;

   public FH(rhd_3 var1) {
      super((rJT)var1.id_implements[3], (rhz_3)var1.id_implements[1], new rgn_3("container.crafting"));
      this.id_continue = true;
      this.id_public = 97;
   }

   @Override
   protected void id_class(Ml_1 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.id_volatile.A().id_class(id_else);
      int var5 = this.id_char;
      int var6 = this.id_abstract;
      this.id_break(var1, var5, var6, 0, 0, this.id_synchronized, this.id_return);
      id_class(var5 + 51, var6 + 75, 30, (float)(var5 + 51) - this.id_case, (float)(var6 + 75 - 50) - this.id_catch, (cb_3)this.id_volatile.id_class[57]);
   }

   public static void id_class(int var0, int var1, int var2, float var3, float var4, iB_2 var5) {
      float var6 = (float)Math.atan((double)(var3 / 40.0F));
      float var7 = (float)Math.atan((double)(var4 / 40.0F));
      RenderSystem.pushMatrix();
      RenderSystem.translatef((float)var0, (float)var1, 1050.0F);
      RenderSystem.scalef(1.0F, 1.0F, -1.0F);
      Ml_1 var8 = new Ml_1();
      var8.id_class(0.0, 0.0, 1000.0);
      var8.id_class((float)var2, (float)var2, (float)var2);
      rjY_2 var9 = rje_3.id_case.id_byte(180.0F);
      rjY_2 var10 = rje_3.id_break.id_byte(var7 * 20.0F);
      var9.id_class(var10);
      var8.id_class(var9);
      float var11 = (Float)var5.id_private[23];
      float var12 = (Float)var5.id_throws[15];
      float var13 = (Float)var5.id_private[26];
      float var14 = (Float)var5.id_private[27];
      float var15 = (Float)var5.id_private[25];
      Float var23 = 180.0F + var6 * 20.0F;
      var5.id_private[23] = var23;
      Float var24 = 180.0F + var6 * 40.0F;
      var5.id_throws[15] = var24;
      Float var25 = -var7 * 20.0F;
      var5.id_private[26] = var25;
      Float var26 = (Float)var5.id_throws[15];
      var5.id_private[25] = var26;
      Float var27 = (Float)var5.id_throws[15];
      var5.id_private[27] = var27;
      PX var16 = var5 == (cb_3)id_import.id_class[57] ? ((cb_3)id_import.id_class[57]).id_switch() : null;
      if (var5 == (cb_3)id_import.id_class[57]) {
         ((cb_3)id_import.id_class[57]).id_class(new PX((Float)var5.id_throws[15], (Float)var5.id_private[26]));
      }

      pg_3 var17 = QY.id_instanceof().id_case();
      var10.id_throws();
      var17.id_class(var10);
      var17.id_class(false);
      Hd_1 var18 = QY.id_instanceof().id_interface().id_break();
      RenderSystem.runAsFancy(() -> var17.id_class(var5, 0.0, 0.0, 0.0, 0.0F, 1.0F, var8, var18, 15728880));
      var18.id_break();
      var17.id_class(true);
      Float var28 = var11;
      var5.id_private[23] = var28;
      Float var29 = var12;
      var5.id_throws[15] = var29;
      Float var30 = var13;
      var5.id_private[26] = var30;
      Float var31 = var14;
      var5.id_private[27] = var31;
      Float var32 = var15;
      var5.id_private[25] = var32;
      if (var16 != null) {
         ((cb_3)id_import.id_class[57]).id_class(var16);
      }

      RenderSystem.popMatrix();
   }

   @Override
   protected boolean id_class(int var1, int var2, int var3, int var4, double var5, double var7) {
      return (!this.id_finally || !this.id_private.id_private()) && super.id_class(var1, var2, var3, var4, var5, var7);
   }

   @Override
   public void id_class() {
      this.id_private.id_finally();
   }

   @Override
   protected boolean id_class(double var1, double var3, int var5, int var6, int var7) {
      boolean var8 = var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + this.id_synchronized) || var3 >= (double)(var6 + this.id_return);
      return this.id_private.id_class(var1, var3, this.id_char, this.id_abstract, this.id_synchronized, this.id_return, var7) && var8;
   }

   @Override
   public void id_class(rJY var1, int var2, int var3, rXa_1 var4) {
      super.id_class(var1, var2, var3, var4);
      this.id_private.id_class(var1);
   }

   @Override
   public boolean id_class(double var1, double var3, int var5) {
      if (this.id_boolean) {
         this.id_boolean = false;
         return true;
      } else {
         return super.id_class(var1, var3, var5);
      }
   }

   @Override
   protected void id_class(Ml_1 var1, int var2, int var3) {
      this.id_super.id_byte(var1, this.id_extends, (float)this.id_public, (float)this.id_goto, 4210752);
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      this.id_class = !this.id_private.id_private();
      if (this.id_private.id_private() && this.id_finally) {
         this.id_class(var1, var4, var2, var3);
         this.id_private.id_class(var1, var2, var3, var4);
      } else {
         this.id_private.id_class(var1, var2, var3, var4);
         super.id_class(var1, var2, var3, var4);
         this.id_private.id_class(var1, this.id_char, this.id_abstract, false, var4);
      }

      this.id_break(var1, var2, var3);
      this.id_private.id_byte(var1, this.id_char, this.id_abstract, var2, var3);
      this.id_case = (float)var2;
      this.id_catch = (float)var3;
   }

   @Override
   public ms_3 id_break() {
      return this.id_private;
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      if (this.id_private.id_break(var1, var3, var5)) {
         this.id_class(this.id_private);
         return true;
      } else {
         return (!this.id_finally || !this.id_private.id_private()) && super.id_break(var1, var3, var5);
      }
   }

   @Override
   public boolean id_finally() {
      return true;
   }

   @Override
   public void id_private() {
      super.id_private();
      if (((Ax_1)this.id_volatile.id_class[55]).id_catch()) {
         this.id_volatile.id_break(new Fv_1((cb_3)this.id_volatile.id_class[57]));
      } else {
         this.id_private.id_implements();
      }
   }

   @Override
   public void id_final() {
      super.id_final();
      this.id_private.id_class(this.id_package, this.id_int, this.id_volatile, this.id_finally, this.id_instanceof);
      this.id_implements = true;
      this.id_char = this.id_private.id_class(this.id_finally, this.id_package, this.id_synchronized);
   }

   @Override
   public List<LZ> id_native() {
      ArrayList var1 = new ArrayList();
      var1.add(
         this.id_transient = new Ff_1(this, this.id_char + this.id_synchronized / 2 - 50, this.id_abstract - 23, 100, 20, var1x -> this.id_class(FM.DROP_ALL))
            .id_finally(false)
      );
      return var1;
   }

   @Override
   protected void v_() {
      if (((Ax_1)this.id_volatile.id_class[55]).id_catch()) {
         this.id_volatile.id_break(new Fv_1((cb_3)this.id_volatile.id_class[57]));
      } else {
         super.v_();
         this.id_finally = this.id_package < 379;
         this.id_native.add(this.id_private);
         this.id_break(this.id_private);
         this.id_class(new Ll_1(this.id_char + 104, this.id_int / 2 - 22, 20, 18, 0, 0, 19, id_throws, var1 -> {
            this.id_private.id_class(this.id_finally);
            this.id_private.id_catch();
            this.id_char = this.id_private.id_class(this.id_finally, this.id_package, this.id_synchronized);
            ((Ll_1)var1).id_class(this.id_char + 104, this.id_int / 2 - 22);
            this.id_boolean = true;
            this.id_transient.id_volatile = this.id_char + this.id_synchronized / 2 - 50;
         }));
      }
   }

   @Override
   public void w_() {
      super.w_();
      if (this.id_implements) {
         this.id_private.id_case();
      }
   }
}
