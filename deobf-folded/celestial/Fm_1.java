package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public class Fm_1 extends Fu_1<rJa_1> implements mB_2 {
   private static final rqO_2 id_class = new rqO_2("textures/gui/container/crafting_table.png");
   private static final rqO_2 id_throws = new rqO_2("textures/gui/recipe_button.png");
   private final ms_3 id_case = new ms_3();
   private boolean id_catch;

   public Fm_1(rJa_1 var1, rhz_3 var2, rgP_2 var3) {
      super(var1, var2, var3);
   }

   @Override
   protected boolean id_class(int var1, int var2, int var3, int var4, double var5, double var7) {
      return (!this.id_catch || !this.id_case.id_private()) && super.id_class(var1, var2, var3, var4, var5, var7);
   }

   @Override
   protected boolean id_class(double var1, double var3, int var5, int var6, int var7) {
      boolean var8 = var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + this.id_synchronized) || var3 >= (double)(var6 + this.id_return);
      return this.id_case.id_class(var1, var3, this.id_char, this.id_abstract, this.id_synchronized, this.id_return, var7) && var8;
   }

   @Override
   public void id_class() {
      this.id_case.id_finally();
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      if (this.id_case.id_private() && this.id_catch) {
         this.id_class(var1, var4, var2, var3);
         this.id_case.id_class(var1, var2, var3, var4);
      } else {
         this.id_case.id_class(var1, var2, var3, var4);
         super.id_class(var1, var2, var3, var4);
         this.id_case.id_class(var1, this.id_char, this.id_abstract, true, var4);
      }

      this.id_break(var1, var2, var3);
      this.id_case.id_byte(var1, this.id_char, this.id_abstract, var2, var3);
   }

   @Override
   public void id_class(rJY var1, int var2, int var3, rXa_1 var4) {
      super.id_class(var1, var2, var3, var4);
      this.id_case.id_class(var1);
   }

   @Override
   protected void id_class(Ml_1 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.id_volatile.A().id_class(id_class);
      int var5 = this.id_char;
      int var6 = (this.id_int - this.id_return) / 2;
      this.id_break(var1, var5, var6, 0, 0, this.id_synchronized, this.id_return);
   }

   @Override
   public ms_3 id_break() {
      return this.id_case;
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      if (this.id_case.id_break(var1, var3, var5)) {
         this.id_class(this.id_case);
         return true;
      } else {
         return this.id_catch && this.id_case.id_private() ? true : super.id_break(var1, var3, var5);
      }
   }

   @Override
   public void id_private() {
      super.id_private();
      this.id_case.id_implements();
   }

   @Override
   protected void v_() {
      super.v_();
      this.id_catch = this.id_package < 379;
      this.id_case.id_class(this.id_package, this.id_int, this.id_volatile, this.id_catch, this.id_instanceof);
      this.id_char = this.id_case.id_class(this.id_catch, this.id_package, this.id_synchronized);
      this.id_native.add(this.id_case);
      this.id_break(this.id_case);
      this.id_class(new Ll_1(this.id_char + 5, this.id_int / 2 - 49, 20, 18, 0, 0, 19, id_throws, var1 -> {
         this.id_case.id_class(this.id_catch);
         this.id_case.id_catch();
         this.id_char = this.id_case.id_class(this.id_catch, this.id_package, this.id_synchronized);
         ((Ll_1)var1).id_class(this.id_char + 5, this.id_int / 2 - 49);
      }));
      this.id_public = 29;
   }

   @Override
   public void w_() {
      super.w_();
      this.id_case.id_case();
   }
}
