package celestial;

import com.google.common.collect.ImmutableList;

public class wk_3<T extends an_3> extends tX_2<T> {
   protected Iq_1 id_class = new Iq_1(this, 0, 0);
   protected Iq_1 id_break;
   protected Iq_1 id_byte;
   protected Iq_1 id_protected;
   protected Iq_1 id_throws;
   protected Iq_1 id_case;

   public wk_3(int var1, float var2, boolean var3, float var4, float var5, float var6, float var7, int var8) {
      super(var3, var4, var5, var6, var7, (float)var8);
      this.id_class.id_class(-4.0F, -4.0F, -8.0F, 8.0F, 8.0F, 8.0F, var2);
      this.id_class.id_class(0.0F, (float)(18 - var1), -6.0F);
      this.id_break = new Iq_1(this, 28, 8);
      this.id_break.id_class(-5.0F, -10.0F, -7.0F, 10.0F, 16.0F, 8.0F, var2);
      this.id_break.id_class(0.0F, (float)(17 - var1), 2.0F);
      this.id_byte = new Iq_1(this, 0, 16);
      this.id_byte.id_class(-2.0F, 0.0F, -2.0F, 4.0F, (float)var1, 4.0F, var2);
      this.id_byte.id_class(-3.0F, (float)(24 - var1), 7.0F);
      this.id_protected = new Iq_1(this, 0, 16);
      this.id_protected.id_class(-2.0F, 0.0F, -2.0F, 4.0F, (float)var1, 4.0F, var2);
      this.id_protected.id_class(3.0F, (float)(24 - var1), 7.0F);
      this.id_throws = new Iq_1(this, 0, 16);
      this.id_throws.id_class(-2.0F, 0.0F, -2.0F, 4.0F, (float)var1, 4.0F, var2);
      this.id_throws.id_class(-3.0F, (float)(24 - var1), -5.0F);
      this.id_case = new Iq_1(this, 0, 16);
      this.id_case.id_class(-2.0F, 0.0F, -2.0F, 4.0F, (float)var1, 4.0F, var2);
      this.id_case.id_class(3.0F, (float)(24 - var1), -5.0F);
   }

   @Override
   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      this.id_class.id_case = var6 * (float) (Math.PI / 180.0);
      this.id_class.id_catch = var5 * (float) (Math.PI / 180.0);
      this.id_break.id_case = (float) (Math.PI / 2);
      this.id_byte.id_case = rfU_2.id_break(var2 * 0.6662F) * 1.4F * var3;
      this.id_protected.id_case = rfU_2.id_break(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.id_throws.id_case = rfU_2.id_break(var2 * 0.6662F + (float) Math.PI) * 1.4F * var3;
      this.id_case.id_case = rfU_2.id_break(var2 * 0.6662F) * 1.4F * var3;
   }

   @Override
   protected Iterable<Iq_1> id_class() {
      return ImmutableList.of(this.id_class);
   }

   @Override
   protected Iterable<Iq_1> id_break() {
      return ImmutableList.of(this.id_break, this.id_byte, this.id_protected, this.id_throws, this.id_case);
   }
}
