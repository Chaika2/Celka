package celestial;

import com.google.common.collect.ImmutableList;

public class wb_3<T extends an_3> extends wN_2<T> {
   private final Iq_1 id_class;
   private final Iq_1 id_break;
   private final Iq_1 id_byte;
   private final Iq_1 id_protected;
   private final Iq_1 id_throws;
   private final Iq_1 id_case;
   private final Iq_1 id_catch;

   public wb_3() {
      this.id_return = 64;
      this.id_public = 64;
      this.id_class = new Iq_1(this, 0, 8);
      this.id_class.id_class(-3.0F, -2.0F, -8.0F, 5.0F, 3.0F, 9.0F);
      this.id_case = new Iq_1(this, 3, 20);
      this.id_case.id_class(-2.0F, 0.0F, 0.0F, 3.0F, 2.0F, 6.0F);
      this.id_case.id_class(0.0F, -2.0F, 1.0F);
      this.id_class.id_break(this.id_case);
      this.id_catch = new Iq_1(this, 4, 29);
      this.id_catch.id_class(-1.0F, 0.0F, 0.0F, 1.0F, 1.0F, 6.0F);
      this.id_catch.id_class(0.0F, 0.5F, 6.0F);
      this.id_case.id_break(this.id_catch);
      this.id_break = new Iq_1(this, 23, 12);
      this.id_break.id_class(0.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F);
      this.id_break.id_class(2.0F, -2.0F, -8.0F);
      this.id_byte = new Iq_1(this, 16, 24);
      this.id_byte.id_class(0.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F);
      this.id_byte.id_class(6.0F, 0.0F, 0.0F);
      this.id_break.id_break(this.id_byte);
      this.id_protected = new Iq_1(this, 23, 12);
      this.id_protected.id_implements = true;
      this.id_protected.id_class(-6.0F, 0.0F, 0.0F, 6.0F, 2.0F, 9.0F);
      this.id_protected.id_class(-3.0F, -2.0F, -8.0F);
      this.id_throws = new Iq_1(this, 16, 24);
      this.id_throws.id_implements = true;
      this.id_throws.id_class(-13.0F, 0.0F, 0.0F, 13.0F, 1.0F, 9.0F);
      this.id_throws.id_class(-6.0F, 0.0F, 0.0F);
      this.id_protected.id_break(this.id_throws);
      this.id_break.id_private = 0.1F;
      this.id_byte.id_private = 0.1F;
      this.id_protected.id_private = -0.1F;
      this.id_throws.id_private = -0.1F;
      this.id_class.id_case = -0.1F;
      Iq_1 var1 = new Iq_1(this, 0, 0);
      var1.id_class(-4.0F, -2.0F, -5.0F, 7.0F, 3.0F, 5.0F);
      var1.id_class(0.0F, 1.0F, -7.0F);
      var1.id_case = 0.2F;
      this.id_class.id_break(var1);
      this.id_class.id_break(this.id_break);
      this.id_class.id_break(this.id_protected);
   }

   @Override
   public Iterable<Iq_1> id_class() {
      return ImmutableList.of(this.id_class);
   }

   @Override
   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = ((float)(var1.V() * 3) + var4) * 0.13F;
      float var8 = 16.0F;
      this.id_break.id_private = rfU_2.id_break(var7) * 16.0F * (float) (Math.PI / 180.0);
      this.id_byte.id_private = rfU_2.id_break(var7) * 16.0F * (float) (Math.PI / 180.0);
      this.id_protected.id_private = -this.id_break.id_private;
      this.id_throws.id_private = -this.id_byte.id_private;
      this.id_case.id_case = -(5.0F + rfU_2.id_break(var7 * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
      this.id_catch.id_case = -(5.0F + rfU_2.id_break(var7 * 2.0F) * 5.0F) * (float) (Math.PI / 180.0);
   }
}
