package celestial;

import com.google.common.collect.ImmutableList;

public class ws_3 extends wN_2<rMR> {
   private final Iq_1 id_class;
   private final Iq_1 id_break;
   private final Iq_1 id_byte;
   private final Iq_1 id_protected;
   private final Iq_1 id_throws;
   private final Iq_1 id_case;
   private final Iq_1 id_catch;
   private final Iq_1 id_private;
   private final Iq_1 id_implements;
   private final Iq_1 id_finally;
   private final Iq_1 id_extends;

   public ws_3() {
      this.id_return = 32;
      this.id_public = 32;
      this.id_class = new Iq_1(this, 2, 8);
      this.id_class.id_class(-1.5F, 0.0F, -1.5F, 3.0F, 6.0F, 3.0F);
      this.id_class.id_class(0.0F, 16.5F, -3.0F);
      this.id_break = new Iq_1(this, 22, 1);
      this.id_break.id_class(-1.5F, -1.0F, -1.0F, 3.0F, 4.0F, 1.0F);
      this.id_break.id_class(0.0F, 21.07F, 1.16F);
      this.id_byte = new Iq_1(this, 19, 8);
      this.id_byte.id_class(-0.5F, 0.0F, -1.5F, 1.0F, 5.0F, 3.0F);
      this.id_byte.id_class(1.5F, 16.94F, -2.76F);
      this.id_protected = new Iq_1(this, 19, 8);
      this.id_protected.id_class(-0.5F, 0.0F, -1.5F, 1.0F, 5.0F, 3.0F);
      this.id_protected.id_class(-1.5F, 16.94F, -2.76F);
      this.id_throws = new Iq_1(this, 2, 2);
      this.id_throws.id_class(-1.0F, -1.5F, -1.0F, 2.0F, 3.0F, 2.0F);
      this.id_throws.id_class(0.0F, 15.69F, -2.76F);
      this.id_case = new Iq_1(this, 10, 0);
      this.id_case.id_class(-1.0F, -0.5F, -2.0F, 2.0F, 1.0F, 4.0F);
      this.id_case.id_class(0.0F, -2.0F, -1.0F);
      this.id_throws.id_break(this.id_case);
      this.id_catch = new Iq_1(this, 11, 7);
      this.id_catch.id_class(-0.5F, -1.0F, -0.5F, 1.0F, 2.0F, 1.0F);
      this.id_catch.id_class(0.0F, -0.5F, -1.5F);
      this.id_throws.id_break(this.id_catch);
      this.id_private = new Iq_1(this, 16, 7);
      this.id_private.id_class(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F);
      this.id_private.id_class(0.0F, -1.75F, -2.45F);
      this.id_throws.id_break(this.id_private);
      this.id_implements = new Iq_1(this, 2, 18);
      this.id_implements.id_class(0.0F, -4.0F, -2.0F, 0.0F, 5.0F, 4.0F);
      this.id_implements.id_class(0.0F, -2.15F, 0.15F);
      this.id_throws.id_break(this.id_implements);
      this.id_finally = new Iq_1(this, 14, 18);
      this.id_finally.id_class(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F);
      this.id_finally.id_class(1.0F, 22.0F, -1.05F);
      this.id_extends = new Iq_1(this, 14, 18);
      this.id_extends.id_class(-0.5F, 0.0F, -0.5F, 1.0F, 2.0F, 1.0F);
      this.id_extends.id_class(-1.0F, 22.0F, -1.05F);
   }

   private static wG_2 id_class(rMR var0) {
      if (var0.n()) {
         return wG_2.PARTY;
      } else if (var0.Sc()) {
         return wG_2.SITTING;
      } else {
         return var0.sx() ? wG_2.FLYING : wG_2.STANDING;
      }
   }

   private void id_class(wG_2 var1) {
      this.id_implements.id_case = -0.2214F;
      this.id_class.id_case = 0.4937F;
      this.id_byte.id_case = (float) -Math.PI * 2.0F / 9.0F;
      this.id_byte.id_catch = (float) -Math.PI;
      this.id_protected.id_case = (float) -Math.PI * 2.0F / 9.0F;
      this.id_protected.id_catch = (float) -Math.PI;
      this.id_finally.id_case = -0.0299F;
      this.id_extends.id_case = -0.0299F;
      this.id_finally.id_protected = 22.0F;
      this.id_extends.id_protected = 22.0F;
      this.id_finally.id_private = 0.0F;
      this.id_extends.id_private = 0.0F;
      switch (var1) {
         case SITTING:
            float var2 = 1.9F;
            this.id_throws.id_protected = 17.59F;
            this.id_break.id_case = 1.5388988F;
            this.id_break.id_protected = 22.97F;
            this.id_class.id_protected = 18.4F;
            this.id_byte.id_private = -0.0873F;
            this.id_byte.id_protected = 18.84F;
            this.id_protected.id_private = 0.0873F;
            this.id_protected.id_protected = 18.84F;
            this.id_finally.id_protected++;
            this.id_extends.id_protected++;
            this.id_finally.id_case++;
            this.id_extends.id_case++;
            break;
         case PARTY:
            this.id_finally.id_private = (float) (-Math.PI / 9);
            this.id_extends.id_private = (float) (Math.PI / 9);
         case STANDING:
         case ON_SHOULDER:
         default:
            break;
         case FLYING:
            this.id_finally.id_case += (float) Math.PI * 2.0F / 9.0F;
            this.id_extends.id_case += (float) Math.PI * 2.0F / 9.0F;
      }
   }

   @Override
   public Iterable<Iq_1> id_class() {
      return ImmutableList.of(this.id_class, this.id_byte, this.id_protected, this.id_break, this.id_throws, this.id_finally, this.id_extends);
   }

   public void id_class(rMR var1, float var2, float var3, float var4, float var5, float var6) {
      this.id_class(id_class(var1), (Integer)var1.id_throws[41], var2, var3, var4, var5, var6);
   }

   public void id_class(rMR var1, float var2, float var3, float var4) {
      this.id_class(id_class(var1));
   }

   public void id_class(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8, int var9) {
      this.id_class(wG_2.ON_SHOULDER);
      this.id_class(wG_2.ON_SHOULDER, var9, var5, var6, 0.0F, var7, var8);
      this.id_class().forEach(var4x -> var4x.id_class(var1, var2, var3, var4));
   }

   private void id_class(wG_2 var1, int var2, float var3, float var4, float var5, float var6, float var7) {
      this.id_throws.id_case = var7 * (float) (Math.PI / 180.0);
      this.id_throws.id_catch = var6 * (float) (Math.PI / 180.0);
      this.id_throws.id_private = 0.0F;
      this.id_throws.id_byte = 0.0F;
      this.id_class.id_byte = 0.0F;
      this.id_break.id_byte = 0.0F;
      this.id_protected.id_byte = -1.5F;
      this.id_byte.id_byte = 1.5F;
      switch (var1) {
         case SITTING:
            break;
         case PARTY:
            float var8 = rfU_2.id_break((float)var2);
            float var9 = rfU_2.id_class((float)var2);
            this.id_throws.id_byte = var8;
            this.id_throws.id_protected = 15.69F + var9;
            this.id_throws.id_case = 0.0F;
            this.id_throws.id_catch = 0.0F;
            this.id_throws.id_private = rfU_2.id_class((float)var2) * 0.4F;
            this.id_class.id_byte = var8;
            this.id_class.id_protected = 16.5F + var9;
            this.id_byte.id_private = -0.0873F - var5;
            this.id_byte.id_byte = 1.5F + var8;
            this.id_byte.id_protected = 16.94F + var9;
            this.id_protected.id_private = 0.0873F + var5;
            this.id_protected.id_byte = -1.5F + var8;
            this.id_protected.id_protected = 16.94F + var9;
            this.id_break.id_byte = var8;
            this.id_break.id_protected = 21.07F + var9;
            break;
         case STANDING:
            this.id_finally.id_case = this.id_finally.id_case + rfU_2.id_break(var3 * 0.6662F) * 1.4F * var4;
            this.id_extends.id_case = this.id_extends.id_case + rfU_2.id_break(var3 * 0.6662F + (float) Math.PI) * 1.4F * var4;
         case FLYING:
         case ON_SHOULDER:
         default:
            float var10 = var5 * 0.3F;
            this.id_throws.id_protected = 15.69F + var10;
            this.id_break.id_case = 1.015F + rfU_2.id_break(var3 * 0.6662F) * 0.3F * var4;
            this.id_break.id_protected = 21.07F + var10;
            this.id_class.id_protected = 16.5F + var10;
            this.id_byte.id_private = -0.0873F - var5;
            this.id_byte.id_protected = 16.94F + var10;
            this.id_protected.id_private = 0.0873F + var5;
            this.id_protected.id_protected = 16.94F + var10;
            this.id_finally.id_protected = 22.0F + var10;
            this.id_extends.id_protected = 22.0F + var10;
      }
   }
}
