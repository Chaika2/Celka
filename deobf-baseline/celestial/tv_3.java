package celestial;

import com.google.common.collect.ImmutableList;

public class tv_3<T extends an_3> extends tX_2<T> {
   private final Iq_1 id_class;
   private final Iq_1 id_break;
   private final Iq_1 id_byte;
   private final Iq_1 id_protected;
   private final Iq_1 id_throws;
   private final Iq_1 id_case;
   private final Iq_1 id_catch;
   private final Iq_1 id_private;

   public tv_3() {
      byte var1 = 16;
      this.id_class = new Iq_1(this, 0, 0);
      this.id_class.id_class(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 3.0F, 0.0F);
      this.id_class.id_class(0.0F, 15.0F, -4.0F);
      this.id_catch = new Iq_1(this, 14, 0);
      this.id_catch.id_class(-2.0F, -4.0F, -4.0F, 4.0F, 2.0F, 2.0F, 0.0F);
      this.id_catch.id_class(0.0F, 15.0F, -4.0F);
      this.id_private = new Iq_1(this, 14, 4);
      this.id_private.id_class(-1.0F, -2.0F, -3.0F, 2.0F, 2.0F, 2.0F, 0.0F);
      this.id_private.id_class(0.0F, 15.0F, -4.0F);
      this.id_break = new Iq_1(this, 0, 9);
      this.id_break.id_class(-3.0F, -4.0F, -3.0F, 6.0F, 8.0F, 6.0F, 0.0F);
      this.id_break.id_class(0.0F, 16.0F, 0.0F);
      this.id_byte = new Iq_1(this, 26, 0);
      this.id_byte.id_class(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F);
      this.id_byte.id_class(-2.0F, 19.0F, 1.0F);
      this.id_protected = new Iq_1(this, 26, 0);
      this.id_protected.id_class(-1.0F, 0.0F, -3.0F, 3.0F, 5.0F, 3.0F);
      this.id_protected.id_class(1.0F, 19.0F, 1.0F);
      this.id_throws = new Iq_1(this, 24, 13);
      this.id_throws.id_class(0.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F);
      this.id_throws.id_class(-4.0F, 13.0F, 0.0F);
      this.id_case = new Iq_1(this, 24, 13);
      this.id_case.id_class(-1.0F, 0.0F, -3.0F, 1.0F, 4.0F, 6.0F);
      this.id_case.id_class(4.0F, 13.0F, 0.0F);
   }

   @Override
   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.id_class.id_case = var6 * (float) (Math.PI / 180.0);
      this.id_class.id_catch = var5 * (float) (Math.PI / 180.0);
      this.id_catch.id_case = this.id_class.id_case;
      this.id_catch.id_catch = this.id_class.id_catch;
      this.id_private.id_case = this.id_class.id_case;
      this.id_private.id_catch = this.id_class.id_catch;
      this.id_break.id_case = (float) (Math.PI / 2);
      this.id_byte.id_case = rfU_2.id_break(var2 * 0.6662F) * 1.4F * var3;
      this.id_protected.id_case = rfU_2.id_break(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.id_throws.id_private = var4;
      this.id_case.id_private = -var4;
   }

   @Override
   protected Iterable<Iq_1> id_class() {
      return ImmutableList.of(this.id_class, this.id_catch, this.id_private);
   }

   @Override
   protected Iterable<Iq_1> id_break() {
      return ImmutableList.of(this.id_break, this.id_byte, this.id_protected, this.id_throws, this.id_case);
   }
}
