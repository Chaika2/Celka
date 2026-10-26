package celestial;

import com.google.common.collect.ImmutableList;

public class te_3<T extends rOK> extends tp_3<T> {
   private final Iq_1 id_class;
   private final Iq_1 id_break;
   private final Iq_1 id_byte;
   private final Iq_1 id_protected;
   private final Iq_1 id_throws;
   private final Iq_1 id_case;
   private final Iq_1 id_catch;
   private final Iq_1 id_private;

   public te_3(float var1) {
      this.id_return = 128;
      this.id_public = 64;
      this.id_class = new Iq_1(this, 0, 0);
      this.id_class.id_class(-2.0F, -14.0F, -10.0F, 4.0F, 4.0F, 9.0F, var1);
      this.id_class.id_class(0.0F, 7.0F, -6.0F);
      this.id_class.id_class(0, 14).id_class(-4.0F, -16.0F, -6.0F, 8.0F, 18.0F, 6.0F, var1);
      this.id_class.id_class(17, 0).id_class(-4.0F, -19.0F, -4.0F, 3.0F, 3.0F, 2.0F, var1);
      this.id_class.id_class(17, 0).id_class(1.0F, -19.0F, -4.0F, 3.0F, 3.0F, 2.0F, var1);
      this.id_break = new Iq_1(this, 29, 0);
      this.id_break.id_class(-6.0F, -10.0F, -7.0F, 12.0F, 18.0F, 10.0F, var1);
      this.id_break.id_class(0.0F, 5.0F, 2.0F);
      this.id_catch = new Iq_1(this, 45, 28);
      this.id_catch.id_class(-3.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, var1);
      this.id_catch.id_class(-8.5F, 3.0F, 3.0F);
      this.id_catch.id_catch = (float) (Math.PI / 2);
      this.id_private = new Iq_1(this, 45, 41);
      this.id_private.id_class(-3.0F, 0.0F, 0.0F, 8.0F, 8.0F, 3.0F, var1);
      this.id_private.id_class(5.5F, 3.0F, 3.0F);
      this.id_private.id_catch = (float) (Math.PI / 2);
      byte var2 = 4;
      byte var3 = 14;
      this.id_byte = new Iq_1(this, 29, 29);
      this.id_byte.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, var1);
      this.id_byte.id_class(-2.5F, 10.0F, 6.0F);
      this.id_protected = new Iq_1(this, 29, 29);
      this.id_protected.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, var1);
      this.id_protected.id_class(2.5F, 10.0F, 6.0F);
      this.id_throws = new Iq_1(this, 29, 29);
      this.id_throws.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, var1);
      this.id_throws.id_class(-2.5F, 10.0F, -4.0F);
      this.id_case = new Iq_1(this, 29, 29);
      this.id_case.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 14.0F, 4.0F, var1);
      this.id_case.id_class(2.5F, 10.0F, -4.0F);
      this.id_byte.id_byte--;
      this.id_protected.id_byte++;
      this.id_byte.id_throws += 0.0F;
      this.id_protected.id_throws += 0.0F;
      this.id_throws.id_byte--;
      this.id_case.id_byte++;
      this.id_throws.id_throws--;
      this.id_case.id_throws--;
   }

   @Override
   public void id_class(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      if (this.id_int) {
         float var9 = 2.0F;
         var1.id_class();
         float var10 = 0.7F;
         var1.id_class(0.71428573F, 0.64935064F, 0.7936508F);
         var1.id_class(0.0, 1.3125, 0.22F);
         this.id_class.id_class(var1, var2, var3, var4, var5, var6, var7, var8);
         var1.id_break();
         var1.id_class();
         float var11 = 1.1F;
         var1.id_class(0.625F, 0.45454544F, 0.45454544F);
         var1.id_class(0.0, 2.0625, 0.0);
         this.id_break.id_class(var1, var2, var3, var4, var5, var6, var7, var8);
         var1.id_break();
         var1.id_class();
         var1.id_class(0.45454544F, 0.41322312F, 0.45454544F);
         var1.id_class(0.0, 2.0625, 0.0);
         ImmutableList.of(this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch, this.id_private)
            .forEach(var8x -> var8x.id_class(var1, var2, var3, var4, var5, var6, var7, var8));
         var1.id_break();
      } else {
         ImmutableList.of(this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch, this.id_private)
            .forEach(var8x -> var8x.id_class(var1, var2, var3, var4, var5, var6, var7, var8));
      }
   }

   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.id_class.id_case = var6 * (float) (Math.PI / 180.0);
      this.id_class.id_catch = var5 * (float) (Math.PI / 180.0);
      this.id_break.id_case = (float) (Math.PI / 2);
      this.id_byte.id_case = rfU_2.id_break(var2 * 0.6662F) * 1.4F * var3;
      this.id_protected.id_case = rfU_2.id_break(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.id_throws.id_case = rfU_2.id_break(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.id_case.id_case = rfU_2.id_break(var2 * 0.6662F) * 1.4F * var3;
      boolean var7 = !var1.n_() && var1.sJ();
      this.id_catch.id_finally = var7;
      this.id_private.id_finally = var7;
   }
}
