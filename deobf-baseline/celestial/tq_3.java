package celestial;

import com.google.common.collect.ImmutableList;

public class tq_3<T extends an_3> extends wN_2<T> {
   private final Iq_1 id_class = new Iq_1(this, 0, 0);
   private final Iq_1 id_break;
   private final Iq_1 id_byte;

   public tq_3() {
      this.id_class.id_class(-5.0F, 22.0F, -5.0F);
      this.id_class.id_class(0.0F, 0.0F, 0.0F, 10.0F, 12.0F, 10.0F);
      this.id_break = new Iq_1(this, 40, 0);
      this.id_break.id_class(1.5F, 22.0F, -4.0F);
      this.id_break.id_class(0.0F, 0.0F, 0.0F, 4.0F, 14.0F, 8.0F);
      this.id_byte = new Iq_1(this, 40, 0);
      this.id_byte.id_class(-1.5F, 22.0F, 4.0F);
      this.id_byte.id_class(0.0F, 0.0F, 0.0F, 4.0F, 14.0F, 8.0F);
   }

   @Override
   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = var2 * 2.0F;
      if (var7 > 1.0F) {
         var7 = 1.0F;
      }

      var7 = 1.0F - var7 * var7 * var7;
      this.id_break.id_private = (float) Math.PI - var7 * 0.35F * (float) Math.PI;
      this.id_byte.id_private = (float) Math.PI + var7 * 0.35F * (float) Math.PI;
      this.id_byte.id_catch = (float) Math.PI;
      float var8 = (var2 + rfU_2.id_class(var2 * 2.7F)) * 0.6F * 12.0F;
      this.id_break.id_protected = 24.0F - var8;
      this.id_byte.id_protected = this.id_break.id_protected;
      this.id_class.id_protected = this.id_break.id_protected;
   }

   @Override
   public Iterable<Iq_1> id_class() {
      return ImmutableList.of(this.id_class, this.id_break, this.id_byte);
   }
}
