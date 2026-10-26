package celestial;

import com.google.common.collect.ImmutableList;

public class wT_2<T extends an_3> extends tO_2<T> {
   private final Iq_1 id_class;
   private final Iq_1 id_break;
   private final Iq_1 id_byte;
   private final Iq_1 id_protected;
   private final Iq_1 id_throws;
   private final Iq_1 id_case;

   public wT_2(float var1) {
      this.id_return = 32;
      this.id_public = 32;
      byte var2 = 19;
      this.id_class = new Iq_1(this, 0, 20);
      this.id_class.id_class(-1.0F, -3.0F, -3.0F, 2.0F, 6.0F, 6.0F, var1);
      this.id_class.id_class(0.0F, 19.0F, 0.0F);
      this.id_break = new Iq_1(this, 21, 16);
      this.id_break.id_class(0.0F, -3.0F, 0.0F, 0.0F, 6.0F, 5.0F, var1);
      this.id_break.id_class(0.0F, 19.0F, 3.0F);
      this.id_byte = new Iq_1(this, 2, 16);
      this.id_byte.id_class(-2.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, var1);
      this.id_byte.id_class(-1.0F, 20.0F, 0.0F);
      this.id_byte.id_catch = (float) (Math.PI / 4);
      this.id_protected = new Iq_1(this, 2, 12);
      this.id_protected.id_class(0.0F, 0.0F, 0.0F, 2.0F, 2.0F, 0.0F, var1);
      this.id_protected.id_class(1.0F, 20.0F, 0.0F);
      this.id_protected.id_catch = (float) (-Math.PI / 4);
      this.id_throws = new Iq_1(this, 20, 11);
      this.id_throws.id_class(0.0F, -4.0F, 0.0F, 0.0F, 4.0F, 6.0F, var1);
      this.id_throws.id_class(0.0F, 16.0F, -3.0F);
      this.id_case = new Iq_1(this, 20, 21);
      this.id_case.id_class(0.0F, 0.0F, 0.0F, 0.0F, 4.0F, 6.0F, var1);
      this.id_case.id_class(0.0F, 22.0F, -3.0F);
   }

   @Override
   public Iterable<Iq_1> id_class() {
      return ImmutableList.of(this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws, this.id_case);
   }

   @Override
   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = 1.0F;
      if (!var1.rT()) {
         var7 = 1.5F;
      }

      this.id_break.id_catch = -var7 * 0.45F * rfU_2.id_class(0.6F * var4);
   }
}
