package celestial;

import com.google.common.collect.ImmutableList;

public class tD_2<T extends rMZ> extends wN_2<T> {
   private final Iq_1 id_class;
   private final Iq_1 id_break;
   private final Iq_1 id_byte;
   private final Iq_1 id_protected;
   private final Iq_1 id_throws;
   private final Iq_1 id_case;

   public tD_2() {
      short var1 = 128;
      short var2 = 128;
      this.id_class = new Iq_1(this).id_break(128, 128);
      this.id_class.id_class(0.0F, -7.0F, -2.0F);
      this.id_class.id_class(0, 0).id_class(-4.0F, -12.0F, -5.5F, 8.0F, 10.0F, 8.0F, 0.0F);
      this.id_class.id_class(24, 0).id_class(-1.0F, -5.0F, -7.5F, 2.0F, 4.0F, 2.0F, 0.0F);
      this.id_break = new Iq_1(this).id_break(128, 128);
      this.id_break.id_class(0.0F, -7.0F, 0.0F);
      this.id_break.id_class(0, 40).id_class(-9.0F, -2.0F, -6.0F, 18.0F, 12.0F, 11.0F, 0.0F);
      this.id_break.id_class(0, 70).id_class(-4.5F, 10.0F, -3.0F, 9.0F, 5.0F, 6.0F, 0.5F);
      this.id_byte = new Iq_1(this).id_break(128, 128);
      this.id_byte.id_class(0.0F, -7.0F, 0.0F);
      this.id_byte.id_class(60, 21).id_class(-13.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, 0.0F);
      this.id_protected = new Iq_1(this).id_break(128, 128);
      this.id_protected.id_class(0.0F, -7.0F, 0.0F);
      this.id_protected.id_class(60, 58).id_class(9.0F, -2.5F, -3.0F, 4.0F, 30.0F, 6.0F, 0.0F);
      this.id_throws = new Iq_1(this, 0, 22).id_break(128, 128);
      this.id_throws.id_class(-4.0F, 11.0F, 0.0F);
      this.id_throws.id_class(37, 0).id_class(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F);
      this.id_case = new Iq_1(this, 0, 22).id_break(128, 128);
      this.id_case.id_implements = true;
      this.id_case.id_class(60, 0).id_class(5.0F, 11.0F, 0.0F);
      this.id_case.id_class(-3.5F, -3.0F, -3.0F, 6.0F, 16.0F, 5.0F, 0.0F);
   }

   public void id_class(T var1, float var2, float var3, float var4) {
      int var5 = var1.sJ();
      if (var5 > 0) {
         this.id_byte.id_case = -2.0F + 1.5F * rfU_2.id_throws((float)var5 - var4, 10.0F);
         this.id_protected.id_case = -2.0F + 1.5F * rfU_2.id_throws((float)var5 - var4, 10.0F);
      } else {
         int var6 = var1.sx();
         if (var6 > 0) {
            this.id_byte.id_case = -0.8F + 0.025F * rfU_2.id_throws((float)var6, 70.0F);
            this.id_protected.id_case = 0.0F;
         } else {
            this.id_byte.id_case = (-0.2F + 1.5F * rfU_2.id_throws(var2, 13.0F)) * var3;
            this.id_protected.id_case = (-0.2F - 1.5F * rfU_2.id_throws(var2, 13.0F)) * var3;
         }
      }
   }

   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.id_class.id_catch = var5 * (float) (Math.PI / 180.0);
      this.id_class.id_case = var6 * (float) (Math.PI / 180.0);
      this.id_throws.id_case = -1.5F * rfU_2.id_throws(var2, 13.0F) * var3;
      this.id_case.id_case = 1.5F * rfU_2.id_throws(var2, 13.0F) * var3;
      this.id_throws.id_catch = 0.0F;
      this.id_case.id_catch = 0.0F;
   }

   @Override
   public Iterable<Iq_1> id_class() {
      return ImmutableList.of(this.id_class, this.id_break, this.id_throws, this.id_case, this.id_byte, this.id_protected);
   }

   public Iq_1 id_break() {
      return this.id_byte;
   }
}
