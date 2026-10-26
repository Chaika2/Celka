package celestial;

import com.mojang.blaze3d.systems.RenderSystem;

public abstract class FE<T extends rXH> extends Fu_1<T> implements mB_2 {
   private static final rqO_2 id_throws = new rqO_2("textures/gui/recipe_button.png");
   public final ue_3 id_class;
   private boolean id_case;
   private final rqO_2 id_catch;

   public FE(T var1, ue_3 var2, rhz_3 var3, rgP_2 var4, rqO_2 var5) {
      super((T)var1, var3, var4);
      this.id_class = var2;
      this.id_catch = var5;
   }

   @Override
   public void id_class(rJY var1, int var2, int var3, rXa_1 var4) {
      super.id_class(var1, var2, var3, var4);
      this.id_class.id_class(var1);
   }

   @Override
   public boolean id_class(int var1, int var2, int var3) {
      return this.id_class.id_class(var1, var2, var3) ? false : super.id_class(var1, var2, var3);
   }

   @Override
   public boolean id_class(char var1, int var2) {
      return this.id_class.id_class(var1, var2) ? true : super.id_class(var1, var2);
   }

   @Override
   public void id_class() {
      this.id_class.id_finally();
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      this.id_class(var1);
      if (this.id_class.id_private() && this.id_case) {
         this.id_class(var1, var4, var2, var3);
         this.id_class.id_class(var1, var2, var3, var4);
      } else {
         this.id_class.id_class(var1, var2, var3, var4);
         super.id_class(var1, var2, var3, var4);
         this.id_class.id_class(var1, this.id_char, this.id_abstract, true, var4);
      }

      this.id_break(var1, var2, var3);
      this.id_class.id_byte(var1, this.id_char, this.id_abstract, var2, var3);
   }

   @Override
   protected boolean id_class(double var1, double var3, int var5, int var6, int var7) {
      boolean var8 = var1 < (double)var5 || var3 < (double)var6 || var1 >= (double)(var5 + this.id_synchronized) || var3 >= (double)(var6 + this.id_return);
      return this.id_class.id_class(var1, var3, this.id_char, this.id_abstract, this.id_synchronized, this.id_return, var7) && var8;
   }

   @Override
   protected void id_class(Ml_1 var1, float var2, int var3, int var4) {
      RenderSystem.color4f(1.0F, 1.0F, 1.0F, 1.0F);
      this.id_volatile.A().id_class(this.id_catch);
      int var5 = this.id_char;
      int var6 = this.id_abstract;
      this.id_break(var1, var5, var6, 0, 0, this.id_synchronized, this.id_return);
      if (this.id_instanceof.id_private()) {
         int var7 = this.id_instanceof.id_catch();
         this.id_break(var1, var5 + 56, var6 + 36 + 12 - var7, 176, 12 - var7, 14, var7 + 1);
      }

      int var8 = this.id_instanceof.id_case();
      this.id_break(var1, var5 + 79, var6 + 34, 176, 14, var8 + 1, 16);
   }

   @Override
   public boolean id_break(double var1, double var3, int var5) {
      if (this.id_class.id_break(var1, var3, var5)) {
         return true;
      } else {
         return this.id_case && this.id_class.id_private() ? true : super.id_break(var1, var3, var5);
      }
   }

   @Override
   public ms_3 id_break() {
      return this.id_class;
   }

   @Override
   public void id_private() {
      super.id_private();
      this.id_class.id_implements();
   }

   @Override
   public void v_() {
      super.v_();
      this.id_case = this.id_package < 379;
      this.id_class.id_class(this.id_package, this.id_int, this.id_volatile, this.id_case, this.id_instanceof);
      this.id_char = this.id_class.id_class(this.id_case, this.id_package, this.id_synchronized);
      this.id_class(new Ll_1(this.id_char + 20, this.id_int / 2 - 49, 20, 18, 0, 0, 19, id_throws, var1 -> {
         this.id_class.id_class(this.id_case);
         this.id_class.id_catch();
         this.id_char = this.id_class.id_class(this.id_case, this.id_package, this.id_synchronized);
         ((Ll_1)var1).id_class(this.id_char + 20, this.id_int / 2 - 49);
      }));
      this.id_public = (this.id_synchronized - this.id_super.id_class(this.id_extends)) / 2;
   }

   @Override
   public void w_() {
      super.w_();
      this.id_class.id_case();
   }
}
