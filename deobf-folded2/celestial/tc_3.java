package celestial;

import com.google.common.collect.ImmutableList;

public class tc_3<T extends is_3 & rEo_1> extends tX_2<T> {
   private final Iq_1 id_class;
   private final Iq_1 id_break;
   private final Iq_1 id_byte;
   private final Iq_1 id_protected;
   private final Iq_1 id_throws;
   private final Iq_1 id_case;
   private final Iq_1 id_catch;
   private final Iq_1 id_private;
   private final Iq_1 id_implements;

   public tc_3() {
      super(true, 8.0F, 6.0F, 1.9F, 2.0F, 24.0F);
      this.id_return = 128;
      this.id_public = 64;
      this.id_protected = new Iq_1(this);
      this.id_protected.id_class(0.0F, 7.0F, 0.0F);
      this.id_protected.id_class(1, 1).id_class(-8.0F, -7.0F, -13.0F, 16.0F, 14.0F, 26.0F);
      this.id_implements = new Iq_1(this);
      this.id_implements.id_class(0.0F, -14.0F, -5.0F);
      this.id_implements.id_class(90, 33).id_class(0.0F, 0.0F, -9.0F, 0.0F, 10.0F, 19.0F, 0.001F);
      this.id_protected.id_break(this.id_implements);
      this.id_class = new Iq_1(this);
      this.id_class.id_class(0.0F, 2.0F, -12.0F);
      this.id_class.id_class(61, 1).id_class(-7.0F, -3.0F, -19.0F, 14.0F, 6.0F, 19.0F);
      this.id_break = new Iq_1(this);
      this.id_break.id_class(-6.0F, -2.0F, -3.0F);
      this.id_break.id_class(1, 1).id_class(-6.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F);
      this.id_break.id_private = (float) -Math.PI * 2.0F / 9.0F;
      this.id_class.id_break(this.id_break);
      this.id_byte = new Iq_1(this);
      this.id_byte.id_class(6.0F, -2.0F, -3.0F);
      this.id_byte.id_class(1, 6).id_class(0.0F, -1.0F, -2.0F, 6.0F, 1.0F, 4.0F);
      this.id_byte.id_private = (float) Math.PI * 2.0F / 9.0F;
      this.id_class.id_break(this.id_byte);
      Iq_1 var1 = new Iq_1(this);
      var1.id_class(-7.0F, 2.0F, -12.0F);
      var1.id_class(10, 13).id_class(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F);
      this.id_class.id_break(var1);
      Iq_1 var2 = new Iq_1(this);
      var2.id_class(7.0F, 2.0F, -12.0F);
      var2.id_class(1, 13).id_class(-1.0F, -11.0F, -1.0F, 2.0F, 11.0F, 2.0F);
      this.id_class.id_break(var2);
      this.id_class.id_case = 0.87266463F;
      byte var3 = 14;
      byte var4 = 11;
      this.id_throws = new Iq_1(this);
      this.id_throws.id_class(-4.0F, 10.0F, -8.5F);
      this.id_throws.id_class(66, 42).id_class(-3.0F, 0.0F, -3.0F, 6.0F, 14.0F, 6.0F);
      this.id_case = new Iq_1(this);
      this.id_case.id_class(4.0F, 10.0F, -8.5F);
      this.id_case.id_class(41, 42).id_class(-3.0F, 0.0F, -3.0F, 6.0F, 14.0F, 6.0F);
      this.id_catch = new Iq_1(this);
      this.id_catch.id_class(-5.0F, 13.0F, 10.0F);
      this.id_catch.id_class(21, 45).id_class(-2.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F);
      this.id_private = new Iq_1(this);
      this.id_private.id_class(5.0F, 13.0F, 10.0F);
      this.id_private.id_class(0, 45).id_class(-2.5F, 0.0F, -2.5F, 5.0F, 11.0F, 5.0F);
   }

   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.id_break.id_private = ((float) -Math.PI * 2.0F / 9.0F) - var3 * rfU_2.id_class(var2);
      this.id_byte.id_private = ((float) Math.PI * 2.0F / 9.0F) + var3 * rfU_2.id_class(var2);
      this.id_class.id_catch = var5 * (float) (Math.PI / 180.0);
      int var7 = ((rEo_1)var1).n();
      float var8 = 1.0F - (float)rfU_2.id_class(10 - 2 * var7) / 10.0F;
      this.id_class.id_case = rfU_2.id_catch(var8, 0.87266463F, (float) (-Math.PI / 9));
      if (var1.n_()) {
         this.id_class.id_protected = rfU_2.id_catch(var8, 2.0F, 5.0F);
         this.id_implements.id_throws = -3.0F;
      } else {
         this.id_class.id_protected = 2.0F;
         this.id_implements.id_throws = -7.0F;
      }

      float var9 = 1.2F;
      this.id_throws.id_case = rfU_2.id_break(var2) * 1.2F * var3;
      this.id_case.id_case = rfU_2.id_break(var2 + (float) Math.PI) * 1.2F * var3;
      this.id_catch.id_case = this.id_case.id_case;
      this.id_private.id_case = this.id_throws.id_case;
   }

   @Override
   protected Iterable<Iq_1> id_class() {
      return ImmutableList.of(this.id_class);
   }

   @Override
   protected Iterable<Iq_1> id_break() {
      return ImmutableList.of(this.id_protected, this.id_throws, this.id_case, this.id_catch, this.id_private);
   }
}
