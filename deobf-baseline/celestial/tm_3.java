package celestial;

import com.google.common.collect.ImmutableList;
import java.util.List;

public class tm_3 extends In_1 {
   private final Iq_1 id_class = new Iq_1(64, 32, 0, 0).id_class(-6.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F);
   private final Iq_1 id_break = new Iq_1(64, 32, 16, 0).id_class(0.0F, -5.0F, -0.005F, 6.0F, 10.0F, 0.005F);
   private final Iq_1 id_byte;
   private final Iq_1 id_protected;
   private final Iq_1 id_throws;
   private final Iq_1 id_case;
   private final Iq_1 id_catch = new Iq_1(64, 32, 12, 0).id_class(-1.0F, -5.0F, 0.0F, 2.0F, 10.0F, 0.005F);
   private final List<Iq_1> id_private;

   public tm_3() {
      super(HU::id_break);
      this.id_byte = new Iq_1(64, 32, 0, 10).id_class(0.0F, -4.0F, -0.99F, 5.0F, 8.0F, 1.0F);
      this.id_protected = new Iq_1(64, 32, 12, 10).id_class(0.0F, -4.0F, -0.01F, 5.0F, 8.0F, 1.0F);
      this.id_throws = new Iq_1(64, 32, 24, 10).id_class(0.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.005F);
      this.id_case = new Iq_1(64, 32, 24, 10).id_class(0.0F, -4.0F, 0.0F, 5.0F, 8.0F, 0.005F);
      this.id_private = ImmutableList.of(this.id_class, this.id_break, this.id_catch, this.id_byte, this.id_protected, this.id_throws, this.id_case);
      this.id_class.id_class(0.0F, 0.0F, -1.0F);
      this.id_break.id_class(0.0F, 0.0F, 1.0F);
      this.id_catch.id_catch = (float) (Math.PI / 2);
   }

   public void id_class(float var1, float var2, float var3, float var4) {
      float var5 = (rfU_2.id_class(var1 * 0.02F) * 0.1F + 1.25F) * var4;
      this.id_class.id_catch = (float) Math.PI + var5;
      this.id_break.id_catch = -var5;
      this.id_byte.id_catch = var5;
      this.id_protected.id_catch = -var5;
      this.id_throws.id_catch = var5 - var5 * 2.0F * var2;
      this.id_case.id_catch = var5 - var5 * 2.0F * var3;
      this.id_byte.id_byte = rfU_2.id_class(var5);
      this.id_protected.id_byte = rfU_2.id_class(var5);
      this.id_throws.id_byte = rfU_2.id_class(var5);
      this.id_case.id_byte = rfU_2.id_class(var5);
   }

   @Override
   public void id_class(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.id_break(var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void id_break(Ml_1 var1, Ok_1 var2, int var3, int var4, float var5, float var6, float var7, float var8) {
      this.id_private.forEach(var8x -> var8x.id_class(var1, var2, var3, var4, var5, var6, var7, var8));
   }
}
