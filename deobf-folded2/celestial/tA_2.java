package celestial;

import com.google.common.collect.ImmutableList;

public class tA_2<T extends an_3> extends wN_2<T> {
   private final Iq_1 id_class;
   private final Iq_1 id_break;
   private final Iq_1 id_byte;
   private final Iq_1 id_protected;
   private final Iq_1 id_throws;
   private final Iq_1 id_case;
   private final Iq_1 id_catch;

   public tA_2() {
      this(0.0F);
   }

   public tA_2(float var1) {
      byte var2 = 6;
      this.id_class = new Iq_1(this, 0, 0);
      this.id_class.id_class(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var1);
      this.id_class.id_class(0.0F, 6.0F, 0.0F);
      this.id_break = new Iq_1(this, 32, 0);
      this.id_break.id_class(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, var1 + 0.5F);
      this.id_break.id_class(0.0F, 6.0F, 0.0F);
      this.id_byte = new Iq_1(this, 16, 16);
      this.id_byte.id_class(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, var1);
      this.id_byte.id_class(0.0F, 6.0F, 0.0F);
      this.id_protected = new Iq_1(this, 0, 16);
      this.id_protected.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, var1);
      this.id_protected.id_class(-2.0F, 18.0F, 4.0F);
      this.id_throws = new Iq_1(this, 0, 16);
      this.id_throws.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, var1);
      this.id_throws.id_class(2.0F, 18.0F, 4.0F);
      this.id_case = new Iq_1(this, 0, 16);
      this.id_case.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, var1);
      this.id_case.id_class(-2.0F, 18.0F, -4.0F);
      this.id_catch = new Iq_1(this, 0, 16);
      this.id_catch.id_class(-2.0F, 0.0F, -2.0F, 4.0F, 6.0F, 4.0F, var1);
      this.id_catch.id_class(2.0F, 18.0F, -4.0F);
   }

   @Override
   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.id_class.id_catch = var5 * (float) (Math.PI / 180.0);
      this.id_class.id_case = var6 * (float) (Math.PI / 180.0);
      this.id_protected.id_case = rfU_2.id_break(var2 * 0.6662F) * 1.4F * var3;
      this.id_throws.id_case = rfU_2.id_break(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.id_case.id_case = rfU_2.id_break(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.id_catch.id_case = rfU_2.id_break(var2 * 0.6662F) * 1.4F * var3;
   }

   @Override
   public Iterable<Iq_1> id_class() {
      return ImmutableList.of(this.id_class, this.id_byte, this.id_protected, this.id_throws, this.id_case, this.id_catch);
   }
}
