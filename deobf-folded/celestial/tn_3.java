package celestial;

import com.google.common.collect.ImmutableList;

public class tn_3<T extends an_3> extends wN_2<T> {
   private final Iq_1 id_class;
   private final Iq_1 id_break;
   private final Iq_1 id_byte;

   public tn_3() {
      this.id_return = 64;
      this.id_public = 64;
      float var1 = 18.0F;
      float var2 = -8.0F;
      this.id_class = new Iq_1(this, 22, 0);
      this.id_class.id_class(-4.0F, -7.0F, 0.0F, 8.0F, 7.0F, 13.0F);
      this.id_class.id_class(0.0F, 22.0F, -5.0F);
      Iq_1 var3 = new Iq_1(this, 51, 0);
      var3.id_class(-0.5F, 0.0F, 8.0F, 1.0F, 4.0F, 5.0F);
      var3.id_case = (float) (Math.PI / 3);
      this.id_class.id_break(var3);
      Iq_1 var4 = new Iq_1(this, 48, 20);
      var4.id_implements = true;
      var4.id_class(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F);
      var4.id_class(2.0F, -2.0F, 4.0F);
      var4.id_case = (float) (Math.PI / 3);
      var4.id_private = (float) (Math.PI * 2.0 / 3.0);
      this.id_class.id_break(var4);
      Iq_1 var5 = new Iq_1(this, 48, 20);
      var5.id_class(-0.5F, -4.0F, 0.0F, 1.0F, 4.0F, 7.0F);
      var5.id_class(-2.0F, -2.0F, 4.0F);
      var5.id_case = (float) (Math.PI / 3);
      var5.id_private = (float) (-Math.PI * 2.0 / 3.0);
      this.id_class.id_break(var5);
      this.id_break = new Iq_1(this, 0, 19);
      this.id_break.id_class(-2.0F, -2.5F, 0.0F, 4.0F, 5.0F, 11.0F);
      this.id_break.id_class(0.0F, -2.5F, 11.0F);
      this.id_break.id_case = -0.10471976F;
      this.id_class.id_break(this.id_break);
      this.id_byte = new Iq_1(this, 19, 20);
      this.id_byte.id_class(-5.0F, -0.5F, 0.0F, 10.0F, 1.0F, 6.0F);
      this.id_byte.id_class(0.0F, 0.0F, 9.0F);
      this.id_byte.id_case = 0.0F;
      this.id_break.id_break(this.id_byte);
      Iq_1 var6 = new Iq_1(this, 0, 0);
      var6.id_class(-4.0F, -3.0F, -3.0F, 8.0F, 7.0F, 6.0F);
      var6.id_class(0.0F, -4.0F, -3.0F);
      Iq_1 var7 = new Iq_1(this, 0, 13);
      var7.id_class(-1.0F, 2.0F, -7.0F, 2.0F, 2.0F, 4.0F);
      var6.id_break(var7);
      this.id_class.id_break(var6);
   }

   @Override
   public Iterable<Iq_1> id_class() {
      return ImmutableList.of(this.id_class);
   }

   @Override
   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.id_class.id_case = var6 * (float) (Math.PI / 180.0);
      this.id_class.id_catch = var5 * (float) (Math.PI / 180.0);
      if (an_3.id_case(var1.rv()) > 1.0E-7) {
         this.id_class.id_case = this.id_class.id_case + -0.05F + -0.05F * rfU_2.id_break(var4 * 0.3F);
         this.id_break.id_case = -0.1F * rfU_2.id_break(var4 * 0.3F);
         this.id_byte.id_case = -0.2F * rfU_2.id_break(var4 * 0.3F);
      }
   }
}
