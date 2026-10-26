package celestial;

import com.google.common.collect.ImmutableList;

public class tF_2<T extends an_3> extends wN_2<T> {
   private final Iq_1 id_class;
   private final Iq_1 id_break;
   private final Iq_1 id_byte;
   private final Iq_1 id_protected;
   private final Iq_1 id_throws;
   private final Iq_1 id_case;
   private final Iq_1 id_catch;

   public tF_2() {
      this.id_return = 32;
      this.id_public = 32;
      byte var1 = 22;
      this.id_class = new Iq_1(this, 0, 0);
      this.id_class.id_class(-1.0F, -2.0F, 0.0F, 2.0F, 4.0F, 7.0F);
      this.id_class.id_class(0.0F, 22.0F, 0.0F);
      this.id_byte = new Iq_1(this, 11, 0);
      this.id_byte.id_class(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F);
      this.id_byte.id_class(0.0F, 22.0F, 0.0F);
      this.id_protected = new Iq_1(this, 0, 0);
      this.id_protected.id_class(-1.0F, -2.0F, -1.0F, 2.0F, 3.0F, 1.0F);
      this.id_protected.id_class(0.0F, 22.0F, -3.0F);
      this.id_throws = new Iq_1(this, 22, 1);
      this.id_throws.id_class(-2.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F);
      this.id_throws.id_class(-1.0F, 23.0F, 0.0F);
      this.id_throws.id_private = (float) (-Math.PI / 4);
      this.id_case = new Iq_1(this, 22, 4);
      this.id_case.id_class(0.0F, 0.0F, -1.0F, 2.0F, 0.0F, 2.0F);
      this.id_case.id_class(1.0F, 23.0F, 0.0F);
      this.id_case.id_private = (float) (Math.PI / 4);
      this.id_catch = new Iq_1(this, 22, 3);
      this.id_catch.id_class(0.0F, -2.0F, 0.0F, 0.0F, 4.0F, 4.0F);
      this.id_catch.id_class(0.0F, 22.0F, 7.0F);
      this.id_break = new Iq_1(this, 20, -6);
      this.id_break.id_class(0.0F, -1.0F, -1.0F, 0.0F, 1.0F, 6.0F);
      this.id_break.id_class(0.0F, 20.0F, 0.0F);
   }

   @Override
   public Iterable<Iq_1> id_class() {
      return ImmutableList.of(this.id_class, this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch, this.id_break);
   }

   @Override
   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = 1.0F;
      if (!var1.rT()) {
         var7 = 1.5F;
      }

      this.id_catch.id_catch = -var7 * 0.45F * rfU_2.id_class(0.6F * var4);
   }
}
