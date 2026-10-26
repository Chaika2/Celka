package celestial;

import java.util.Arrays;

public class wr_3<T extends an_3> extends wN_2<T> {
   private final Iq_1[] id_class = new Iq_1[6];

   public wr_3() {
      this.id_class[0] = new Iq_1(this, 0, 10);
      this.id_class[1] = new Iq_1(this, 0, 0);
      this.id_class[2] = new Iq_1(this, 0, 0);
      this.id_class[3] = new Iq_1(this, 0, 0);
      this.id_class[4] = new Iq_1(this, 0, 0);
      this.id_class[5] = new Iq_1(this, 44, 10);
      byte var1 = 20;
      byte var2 = 8;
      byte var3 = 16;
      byte var4 = 4;
      this.id_class[0].id_class(-10.0F, -8.0F, -1.0F, 20.0F, 16.0F, 2.0F, 0.0F);
      this.id_class[0].id_class(0.0F, 4.0F, 0.0F);
      this.id_class[5].id_class(-9.0F, -7.0F, -1.0F, 18.0F, 14.0F, 1.0F, 0.0F);
      this.id_class[5].id_class(0.0F, 4.0F, 0.0F);
      this.id_class[1].id_class(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F);
      this.id_class[1].id_class(-9.0F, 4.0F, 0.0F);
      this.id_class[2].id_class(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F);
      this.id_class[2].id_class(9.0F, 4.0F, 0.0F);
      this.id_class[3].id_class(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F);
      this.id_class[3].id_class(0.0F, 4.0F, -7.0F);
      this.id_class[4].id_class(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F, 0.0F);
      this.id_class[4].id_class(0.0F, 4.0F, 7.0F);
      this.id_class[0].id_case = (float) (Math.PI / 2);
      this.id_class[1].id_catch = (float) (Math.PI * 3.0 / 2.0);
      this.id_class[2].id_catch = (float) (Math.PI / 2);
      this.id_class[3].id_catch = (float) Math.PI;
      this.id_class[5].id_case = (float) (-Math.PI / 2);
   }

   @Override
   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.id_class[5].id_protected = 4.0F - var4;
   }

   @Override
   public Iterable<Iq_1> id_class() {
      return Arrays.asList(this.id_class);
   }
}
