package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;

public class wt_3<T extends rON> extends wk_3<T> {
   private final Iq_1 id_catch;

   public wt_3(float var1) {
      super(12, var1, true, 120.0F, 0.0F, 9.0F, 6.0F, 120);
      this.id_return = 128;
      this.id_public = 64;
      this.id_class = new Iq_1(this, 3, 0);
      this.id_class.id_class(-3.0F, -1.0F, -3.0F, 6.0F, 5.0F, 6.0F, 0.0F);
      this.id_class.id_class(0.0F, 19.0F, -10.0F);
      this.id_break = new Iq_1(this);
      this.id_break.id_class(7, 37).id_class(-9.5F, 3.0F, -10.0F, 19.0F, 20.0F, 6.0F, 0.0F);
      this.id_break.id_class(31, 1).id_class(-5.5F, 3.0F, -13.0F, 11.0F, 18.0F, 3.0F, 0.0F);
      this.id_break.id_class(0.0F, 11.0F, -10.0F);
      this.id_catch = new Iq_1(this);
      this.id_catch.id_class(70, 33).id_class(-4.5F, 3.0F, -14.0F, 9.0F, 18.0F, 1.0F, 0.0F);
      this.id_catch.id_class(0.0F, 11.0F, -10.0F);
      boolean var2 = true;
      this.id_byte = new Iq_1(this, 1, 23);
      this.id_byte.id_class(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 10.0F, 0.0F);
      this.id_byte.id_class(-3.5F, 22.0F, 11.0F);
      this.id_protected = new Iq_1(this, 1, 12);
      this.id_protected.id_class(-2.0F, 0.0F, 0.0F, 4.0F, 1.0F, 10.0F, 0.0F);
      this.id_protected.id_class(3.5F, 22.0F, 11.0F);
      this.id_throws = new Iq_1(this, 27, 30);
      this.id_throws.id_class(-13.0F, 0.0F, -2.0F, 13.0F, 1.0F, 5.0F, 0.0F);
      this.id_throws.id_class(-5.0F, 21.0F, -4.0F);
      this.id_case = new Iq_1(this, 27, 24);
      this.id_case.id_class(0.0F, 0.0F, -2.0F, 13.0F, 1.0F, 5.0F, 0.0F);
      this.id_case.id_class(5.0F, 21.0F, -4.0F);
   }

   @Override
   public void id_class(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      boolean var9 = this.id_catch.id_finally;
      if (var9) {
         var1.id_class();
         var1.id_class(0.0, -0.08F, 0.0);
      }

      super.id_class(var1, var2, var3, var4, var5, var6, var7, var8);
      if (var9) {
         var1.id_break();
      }
   }

   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      super.id_class((T)var1, var2, var3, var4, var5, var6);
      this.id_byte.id_case = rfU_2.id_break(var2 * 0.6662F * 0.6F) * 0.5F * var3;
      this.id_protected.id_case = rfU_2.id_break(var2 * 0.6662F * 0.6F + (float) Math.PI) * 0.5F * var3;
      this.id_throws.id_private = rfU_2.id_break(var2 * 0.6662F * 0.6F + (float) Math.PI) * 0.5F * var3;
      this.id_case.id_private = rfU_2.id_break(var2 * 0.6662F * 0.6F) * 0.5F * var3;
      this.id_throws.id_case = 0.0F;
      this.id_case.id_case = 0.0F;
      this.id_throws.id_catch = 0.0F;
      this.id_case.id_catch = 0.0F;
      this.id_byte.id_catch = 0.0F;
      this.id_protected.id_catch = 0.0F;
      this.id_catch.id_case = (float) (Math.PI / 2);
      if (!var1.rT() && var1.BL()) {
         float var7 = var1.n() ? 4.0F : 1.0F;
         float var8 = var1.n() ? 2.0F : 1.0F;
         float var9 = 5.0F;
         this.id_throws.id_catch = rfU_2.id_break(var7 * var2 * 5.0F + (float) Math.PI) * 8.0F * var3 * var8;
         this.id_throws.id_private = 0.0F;
         this.id_case.id_catch = rfU_2.id_break(var7 * var2 * 5.0F) * 8.0F * var3 * var8;
         this.id_case.id_private = 0.0F;
         this.id_byte.id_catch = rfU_2.id_break(var2 * 5.0F + (float) Math.PI) * 3.0F * var3;
         this.id_byte.id_case = 0.0F;
         this.id_protected.id_catch = rfU_2.id_break(var2 * 5.0F) * 3.0F * var3;
         this.id_protected.id_case = 0.0F;
      }

      this.id_catch.id_finally = !this.id_int && var1.L();
   }

   @Override
   protected Iterable<Iq_1> id_break() {
      return Iterables.concat(super.id_break(), ImmutableList.of(this.id_catch));
   }
}
