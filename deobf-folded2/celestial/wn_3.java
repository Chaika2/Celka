package celestial;

import com.google.common.collect.ImmutableList;

public class wn_3<T extends an_3> extends wN_2<T> {
   private final Iq_1 id_class;
   private final Iq_1 id_break;
   private final Iq_1 id_byte;
   private final Iq_1 id_protected;
   private final Iq_1 id_throws;

   public wn_3() {
      float var1 = 4.0F;
      float var2 = 0.0F;
      this.id_byte = new Iq_1(this, 0, 0).id_break(64, 64);
      this.id_byte.id_class(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, -0.5F);
      this.id_byte.id_class(0.0F, 4.0F, 0.0F);
      this.id_protected = new Iq_1(this, 32, 0).id_break(64, 64);
      this.id_protected.id_class(-1.0F, 0.0F, -1.0F, 12.0F, 2.0F, 2.0F, -0.5F);
      this.id_protected.id_class(0.0F, 6.0F, 0.0F);
      this.id_throws = new Iq_1(this, 32, 0).id_break(64, 64);
      this.id_throws.id_class(-1.0F, 0.0F, -1.0F, 12.0F, 2.0F, 2.0F, -0.5F);
      this.id_throws.id_class(0.0F, 6.0F, 0.0F);
      this.id_class = new Iq_1(this, 0, 16).id_break(64, 64);
      this.id_class.id_class(-5.0F, -10.0F, -5.0F, 10.0F, 10.0F, 10.0F, -0.5F);
      this.id_class.id_class(0.0F, 13.0F, 0.0F);
      this.id_break = new Iq_1(this, 0, 36).id_break(64, 64);
      this.id_break.id_class(-6.0F, -12.0F, -6.0F, 12.0F, 12.0F, 12.0F, -0.5F);
      this.id_break.id_class(0.0F, 24.0F, 0.0F);
   }

   @Override
   public Iterable<Iq_1> id_class() {
      return ImmutableList.of(this.id_class, this.id_break, this.id_byte, this.id_protected, this.id_throws);
   }

   @Override
   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.id_byte.id_catch = var5 * (float) (Math.PI / 180.0);
      this.id_byte.id_case = var6 * (float) (Math.PI / 180.0);
      this.id_class.id_catch = var5 * (float) (Math.PI / 180.0) * 0.25F;
      float var7 = rfU_2.id_class(this.id_class.id_catch);
      float var8 = rfU_2.id_break(this.id_class.id_catch);
      this.id_protected.id_private = 1.0F;
      this.id_throws.id_private = -1.0F;
      this.id_protected.id_catch = 0.0F + this.id_class.id_catch;
      this.id_throws.id_catch = (float) Math.PI + this.id_class.id_catch;
      this.id_protected.id_byte = var8 * 5.0F;
      this.id_protected.id_throws = -var7 * 5.0F;
      this.id_throws.id_byte = -var8 * 5.0F;
      this.id_throws.id_throws = var7 * 5.0F;
   }

   public Iq_1 id_break() {
      return this.id_byte;
   }
}
