package celestial;

import com.google.common.collect.ImmutableList;

public class wA_2<T extends an_3> extends wN_2<T> {
   private final Iq_1 id_class;
   private final Iq_1 id_break;
   private final Iq_1 id_byte;
   private final Iq_1 id_protected;

   public wA_2(int var1) {
      this.id_class = new Iq_1(this, 0, var1);
      this.id_break = new Iq_1(this, 32, 0);
      this.id_byte = new Iq_1(this, 32, 4);
      this.id_protected = new Iq_1(this, 32, 8);
      if (var1 > 0) {
         this.id_class.id_class(-3.0F, 17.0F, -3.0F, 6.0F, 6.0F, 6.0F);
         this.id_break.id_class(-3.25F, 18.0F, -3.5F, 2.0F, 2.0F, 2.0F);
         this.id_byte.id_class(1.25F, 18.0F, -3.5F, 2.0F, 2.0F, 2.0F);
         this.id_protected.id_class(0.0F, 21.0F, -3.5F, 1.0F, 1.0F, 1.0F);
      } else {
         this.id_class.id_class(-4.0F, 16.0F, -4.0F, 8.0F, 8.0F, 8.0F);
      }
   }

   @Override
   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
   }

   @Override
   public Iterable<Iq_1> id_class() {
      return ImmutableList.of(this.id_class, this.id_break, this.id_byte, this.id_protected);
   }
}
