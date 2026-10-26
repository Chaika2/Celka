package celestial;

import com.google.common.collect.ImmutableList;

public class wQ_2<T extends an_3> extends wN_2<T> {
   private final Iq_1 id_class;
   private final Iq_1 id_break;
   private final Iq_1 id_byte;
   private final Iq_1 id_protected;
   private final Iq_1 id_throws;

   public wQ_2() {
      this.id_return = 32;
      this.id_public = 32;
      byte var1 = 20;
      this.id_class = new Iq_1(this, 0, 0);
      this.id_class.id_class(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F);
      this.id_class.id_class(0.0F, 20.0F, 0.0F);
      this.id_break = new Iq_1(this, 0, 13);
      this.id_break.id_class(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 8.0F);
      this.id_break.id_class(0.0F, 20.0F, 8.0F);
      this.id_byte = new Iq_1(this, 22, 0);
      this.id_byte.id_class(-1.0F, -2.0F, -3.0F, 2.0F, 4.0F, 3.0F);
      this.id_byte.id_class(0.0F, 20.0F, 0.0F);
      Iq_1 var2 = new Iq_1(this, 20, 10);
      var2.id_class(0.0F, -2.5F, 0.0F, 0.0F, 5.0F, 6.0F);
      var2.id_class(0.0F, 0.0F, 8.0F);
      this.id_break.id_break(var2);
      Iq_1 var3 = new Iq_1(this, 2, 1);
      var3.id_class(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 3.0F);
      var3.id_class(0.0F, -4.5F, 5.0F);
      this.id_class.id_break(var3);
      Iq_1 var4 = new Iq_1(this, 0, 2);
      var4.id_class(0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 4.0F);
      var4.id_class(0.0F, -4.5F, -1.0F);
      this.id_break.id_break(var4);
      this.id_protected = new Iq_1(this, -4, 0);
      this.id_protected.id_class(-2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F);
      this.id_protected.id_class(-1.5F, 21.5F, 0.0F);
      this.id_protected.id_private = (float) (-Math.PI / 4);
      this.id_throws = new Iq_1(this, 0, 0);
      this.id_throws.id_class(0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 2.0F);
      this.id_throws.id_class(1.5F, 21.5F, 0.0F);
      this.id_throws.id_private = (float) (Math.PI / 4);
   }

   @Override
   public Iterable<Iq_1> id_class() {
      return ImmutableList.of(this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws);
   }

   @Override
   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = 1.0F;
      float var8 = 1.0F;
      if (!var1.rT()) {
         var7 = 1.3F;
         var8 = 1.7F;
      }

      this.id_break.id_catch = -var7 * 0.25F * rfU_2.id_class(var8 * 0.6F * var4);
   }
}
