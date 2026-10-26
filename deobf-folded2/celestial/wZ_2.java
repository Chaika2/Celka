package celestial;

import com.google.common.collect.ImmutableList;

public class wZ_2<T extends an_3> extends wN_2<T> {
   private final Iq_1 id_class;

   public wZ_2() {
      this.id_return = 64;
      this.id_public = 32;
      this.id_class = new Iq_1(this);
      this.id_class.id_class(0, 0).id_class(-4.0F, -4.0F, -1.0F, 8.0F, 8.0F, 2.0F, 0.0F);
      this.id_class.id_class(0, 10).id_class(-1.0F, -4.0F, -4.0F, 2.0F, 8.0F, 8.0F, 0.0F);
      this.id_class.id_class(20, 0).id_class(-4.0F, -1.0F, -4.0F, 8.0F, 2.0F, 8.0F, 0.0F);
      this.id_class.id_class(0.0F, 0.0F, 0.0F);
   }

   @Override
   public Iterable<Iq_1> id_class() {
      return ImmutableList.of(this.id_class);
   }

   @Override
   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.id_class.id_catch = var5 * (float) (Math.PI / 180.0);
      this.id_class.id_case = var6 * (float) (Math.PI / 180.0);
   }
}
