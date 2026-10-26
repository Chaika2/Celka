package celestial;

import com.google.common.collect.ImmutableList;

public class wd_3<T extends an_3> extends wN_2<T> {
   private final Iq_1 id_class;
   private final Iq_1 id_break;
   private final Iq_1 id_byte;
   private final Iq_1 id_protected;
   private final Iq_1 id_throws;
   private final Iq_1 id_case;

   public wd_3() {
      this.id_return = 32;
      this.id_public = 32;
      byte var1 = 23;
      this.id_class = new Iq_1(this, 0, 27);
      this.id_class.id_class(-1.5F, -2.0F, -1.5F, 3.0F, 2.0F, 3.0F);
      this.id_class.id_class(0.0F, 23.0F, 0.0F);
      this.id_break = new Iq_1(this, 24, 6);
      this.id_break.id_class(-1.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F);
      this.id_break.id_class(0.0F, 20.0F, 0.0F);
      this.id_byte = new Iq_1(this, 28, 6);
      this.id_byte.id_class(0.5F, 0.0F, -1.5F, 1.0F, 1.0F, 1.0F);
      this.id_byte.id_class(0.0F, 20.0F, 0.0F);
      this.id_case = new Iq_1(this, -3, 0);
      this.id_case.id_class(-1.5F, 0.0F, 0.0F, 3.0F, 0.0F, 3.0F);
      this.id_case.id_class(0.0F, 22.0F, 1.5F);
      this.id_protected = new Iq_1(this, 25, 0);
      this.id_protected.id_class(-1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F);
      this.id_protected.id_class(-1.5F, 22.0F, -1.5F);
      this.id_throws = new Iq_1(this, 25, 0);
      this.id_throws.id_class(0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 2.0F);
      this.id_throws.id_class(1.5F, 22.0F, -1.5F);
   }

   @Override
   public Iterable<Iq_1> id_class() {
      return ImmutableList.of(this.id_class, this.id_break, this.id_byte, this.id_case, this.id_protected, this.id_throws);
   }

   @Override
   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.id_protected.id_private = -0.2F + 0.4F * rfU_2.id_class(var4 * 0.2F);
      this.id_throws.id_private = 0.2F - 0.4F * rfU_2.id_class(var4 * 0.2F);
   }
}
