package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class FO extends FG<rJf_1> implements rrvs_1 {
   private static final rqO_2 id_class = new rqO_2("textures/gui/container/anvil.png");
   private static final rgP_2 id_throws = new rgn_3("container.repair.expensive");
   private Lu_1 id_case;

   public FO(rJf_1 var1, rhz_3 var2, rgP_2 var3) {
      super(var1, var2, var3, id_class);
      this.id_public = 60;
   }

   @Override
   public void id_class(rJr_1 var1, int var2, rdn_3 var3) {
      if (var2 == 0) {
         this.id_case.id_class(var3.id_class() ? "" : var3.id_continue().getString());
         this.id_case.id_case(!var3.id_class());
         this.id_class(this.id_case);
      }
   }

   private void id_class(String var1) {
      if (!var1.isEmpty()) {
         String var2 = var1;
         rJY var3 = this.id_instanceof.id_class(0);
         if (var3 != null && var3.id_break() && !var3.id_class().id_this() && var1.equals(var3.id_class().id_continue().getString())) {
            var2 = "";
         }

         this.id_instanceof.id_class(var2);
         ((Aq_1)((cb_3)this.id_volatile.id_class[57]).id_break[0]).id_class(new rZz_1(var2));
      }
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      if (var1 == 256) {
         ((cb_3)this.id_volatile.id_class[57]).id_strictfp();
      }

      return !this.id_case.id_class(var1, var2, var3) && !this.id_case.id_volatile() ? super.id_class(var1, var2, var3) : true;
   }

   @Override
   protected void id_class(Ml_1 var1, int var2, int var3) {
      RenderSystem.disableBlend();
      super.id_class(var1, var2, var3);
      int var4 = this.id_instanceof.id_break();
      if (var4 > 0) {
         int var5 = 8453920;
         Object var6;
         if (var4 >= 40 && !((rhx_3)((cb_3)this.id_volatile.id_class[57]).id_implements[18]).id_protected) {
            var6 = id_throws;
            var5 = 16736352;
         } else if (!this.id_instanceof.id_class(2).id_break()) {
            var6 = null;
         } else {
            var6 = new rgn_3("container.repair.cost", var4);
            if (this.id_throw != null && !this.id_instanceof.id_class(2).id_class(this.id_throw.id_throws)) {
               var5 = 16736352;
            }
         }

         if (var6 != null) {
            int var7 = this.id_synchronized - 8 - this.id_super.id_class((rgS_2)var6) - 2;
            byte var8 = 69;
            id_class(var1, var7 - 2, 67, this.id_synchronized - 8, 79, 1325400064);
            this.id_super.id_break(var1, (rgP_2)var6, (float)var7, 69.0F, var5);
         }
      }
   }

   @Override
   public void id_class(QY var1, int var2, int var3) {
      String var4 = this.id_case.id_private();
      this.id_break(var1, var2, var3);
      this.id_case.id_class(var4);
   }

   @Override
   public void id_break(Ml_1 var1, int var2, int var3, float var4) {
      this.id_case.id_class(var1, var2, var3, var4);
   }

   @Override
   public void id_private() {
      super.id_private();
      this.id_case.id_catch();
   }

   @Override
   protected void id_native() {
      ((Qj_1)this.id_volatile.id_class[23]).id_class(true);
      int var1 = (this.id_package - this.id_synchronized) / 2;
      int var2 = (this.id_int - this.id_return) / 2;
      this.id_case = new Lu_1(this.id_super, var1 + 62, var2 + 24, 103, 12, null, new rgn_3("container.repair"), false);
      this.id_case.id_catch(false);
      this.id_case.id_finally(-1);
      this.id_case.id_extends(-1);
      this.id_case.id_protected(false);
      this.id_case.id_implements(35);
      this.id_case.id_class(this::id_class);
      this.id_native.add(this.id_case);
      this.id_break(this.id_case);
      vs_3.INSTANCE.id_class(this);
   }

   @Override
   public boolean aO_() {
      return this.id_case.id_volatile();
   }

   @Override
   public void w_() {
      super.w_();
      ((Qj_1)this.id_volatile.id_class[23]).id_class(false);
   }
}
