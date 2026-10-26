package celestial;

public class wO_2<T extends is_3> extends wh_3<T> {
   public final Iq_1 id_native;
   public final Iq_1 id_volatile;
   private final Iq_1 id_goto;
   private final Iq_1 id_while;
   private final Iq_1 id_try;
   private final Iq_1 id_instanceof;

   public wO_2(float var1, int var2, int var3) {
      super(var1, false);
      this.id_return = var2;
      this.id_public = var3;
      this.id_byte = new Iq_1(this, 16, 16);
      this.id_byte.id_class(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var1);
      this.id_class = new Iq_1(this);
      this.id_class.id_class(0, 0).id_class(-5.0F, -8.0F, -4.0F, 10.0F, 8.0F, 8.0F, var1);
      this.id_class.id_class(31, 1).id_class(-2.0F, -4.0F, -5.0F, 4.0F, 4.0F, 1.0F, var1);
      this.id_class.id_class(2, 4).id_class(2.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, var1);
      this.id_class.id_class(2, 0).id_class(-3.0F, -2.0F, -5.0F, 1.0F, 2.0F, 1.0F, var1);
      this.id_native = new Iq_1(this);
      this.id_native.id_class(4.5F, -6.0F, 0.0F);
      this.id_native.id_class(51, 6).id_class(0.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, var1);
      this.id_class.id_break(this.id_native);
      this.id_volatile = new Iq_1(this);
      this.id_volatile.id_class(-4.5F, -6.0F, 0.0F);
      this.id_volatile.id_class(39, 6).id_class(-1.0F, 0.0F, -2.0F, 1.0F, 5.0F, 4.0F, var1);
      this.id_class.id_break(this.id_volatile);
      this.id_break = new Iq_1(this);
      this.id_goto = this.id_byte.id_class();
      this.id_while = this.id_class.id_class();
      this.id_try = this.id_throws.id_class();
      this.id_instanceof = this.id_throws.id_class();
   }

   private void id_class(T var1) {
      if (var1.Z()) {
         this.id_throws.id_case = -1.8F;
      } else {
         this.id_protected.id_case = -1.8F;
      }
   }

   protected void id_class(T var1, float var2) {
      if (this.id_final > 0.0F && var1 instanceof rbk_3 && ((rbk_3)var1).sd() == rbJ_2.ATTACKING_WITH_MELEE_WEAPON) {
         Iy_1.id_class(this.id_protected, this.id_throws, var1, this.id_final, var2);
      } else {
         super.id_class((T)var1, var2);
      }
   }

   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.id_byte.id_class(this.id_goto);
      this.id_class.id_class(this.id_while);
      this.id_throws.id_class(this.id_try);
      this.id_protected.id_class(this.id_instanceof);
      super.id_class((T)var1, var2, var3, var4, var5, var6);
      float var7 = (float) (Math.PI / 6);
      float var8 = var4 * 0.1F + var2 * 0.5F;
      float var9 = 0.08F + var3 * 0.4F;
      this.id_native.id_private = (float) (-Math.PI / 6) - rfU_2.id_break(var8 * 1.2F) * var9;
      this.id_volatile.id_private = (float) (Math.PI / 6) + rfU_2.id_break(var8) * var9;
      if (var1 instanceof rbM_2 var10) {
         rbJ_2 var11 = var10.sd();
         if (var11 == rbJ_2.DANCING) {
            float var12 = var4 / 60.0F;
            this.id_volatile.id_private = (float) (Math.PI / 6) + (float) (Math.PI / 180.0) * rfU_2.id_class(var12 * 30.0F) * 10.0F;
            this.id_native.id_private = (float) (-Math.PI / 6) - (float) (Math.PI / 180.0) * rfU_2.id_break(var12 * 30.0F) * 10.0F;
            this.id_class.id_byte = rfU_2.id_class(var12 * 10.0F);
            this.id_class.id_protected = rfU_2.id_class(var12 * 40.0F) + 0.4F;
            this.id_protected.id_private = (float) (Math.PI / 180.0) * (70.0F + rfU_2.id_break(var12 * 40.0F) * 10.0F);
            this.id_throws.id_private = this.id_protected.id_private * -1.0F;
            this.id_protected.id_protected = rfU_2.id_class(var12 * 40.0F) * 0.5F + 1.5F;
            this.id_throws.id_protected = rfU_2.id_class(var12 * 40.0F) * 0.5F + 1.5F;
            this.id_byte.id_protected = rfU_2.id_class(var12 * 40.0F) * 0.35F;
         } else if (var11 == rbJ_2.ATTACKING_WITH_MELEE_WEAPON && this.id_final == 0.0F) {
            this.id_class((T)var1);
         } else if (var11 == rbJ_2.CROSSBOW_HOLD) {
            Iy_1.id_class(this.id_protected, this.id_throws, this.id_class, !var1.Z());
         } else if (var11 == rbJ_2.CROSSBOW_CHARGE) {
            Iy_1.id_class(this.id_protected, this.id_throws, var1, !var1.Z());
         } else if (var11 == rbJ_2.ADMIRING_ITEM) {
            this.id_class.id_case = 0.5F;
            this.id_class.id_catch = 0.0F;
            if (var1.Z()) {
               this.id_protected.id_catch = -0.5F;
               this.id_protected.id_case = -0.9F;
            } else {
               this.id_throws.id_catch = 0.5F;
               this.id_throws.id_case = -0.9F;
            }
         }
      } else if (var1.BC() == aI_2.rb) {
         Iy_1.id_class(this.id_throws, this.id_protected, var1.v(), this.id_final, var4);
      }

      this.id_super.id_class(this.id_catch);
      this.id_this.id_class(this.id_case);
      this.id_new.id_class(this.id_throws);
      this.id_continue.id_class(this.id_protected);
      this.id_else.id_class(this.id_byte);
      this.id_break.id_class(this.id_class);
   }
}
