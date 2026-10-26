package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Arrays;

public class tN_2<T extends an_3> extends wN_2<T> {
   private final Iq_1[] id_class;
   private final Iq_1 id_break = new Iq_1(this, 0, 0);
   private final ImmutableList<Iq_1> id_byte;

   public tN_2() {
      this.id_break.id_class(-4.0F, -4.0F, -4.0F, 8.0F, 8.0F, 8.0F);
      this.id_class = new Iq_1[12];

      for (int var1 = 0; var1 < this.id_class.length; var1++) {
         this.id_class[var1] = new Iq_1(this, 0, 16);
         this.id_class[var1].id_class(0.0F, 0.0F, 0.0F, 2.0F, 8.0F, 2.0F);
      }

      Builder var2 = ImmutableList.builder();
      var2.add(this.id_break);
      var2.addAll(Arrays.asList(this.id_class));
      this.id_byte = var2.build();
   }

   @Override
   public Iterable<Iq_1> id_class() {
      return this.id_byte;
   }

   @Override
   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = var4 * (float) Math.PI * -0.1F;

      for (int var8 = 0; var8 < 4; var8++) {
         this.id_class[var8].id_protected = -2.0F + rfU_2.id_break(((float)(var8 * 2) + var4) * 0.25F);
         this.id_class[var8].id_byte = rfU_2.id_break(var7) * 9.0F;
         this.id_class[var8].id_throws = rfU_2.id_class(var7) * 9.0F;
         var7++;
      }

      var7 = (float) (Math.PI / 4) + var4 * (float) Math.PI * 0.03F;

      for (int var11 = 4; var11 < 8; var11++) {
         this.id_class[var11].id_protected = 2.0F + rfU_2.id_break(((float)(var11 * 2) + var4) * 0.25F);
         this.id_class[var11].id_byte = rfU_2.id_break(var7) * 7.0F;
         this.id_class[var11].id_throws = rfU_2.id_class(var7) * 7.0F;
         var7++;
      }

      var7 = 0.47123894F + var4 * (float) Math.PI * -0.05F;

      for (int var12 = 8; var12 < 12; var12++) {
         this.id_class[var12].id_protected = 11.0F + rfU_2.id_break(((float)var12 * 1.5F + var4) * 0.5F);
         this.id_class[var12].id_byte = rfU_2.id_break(var7) * 5.0F;
         this.id_class[var12].id_throws = rfU_2.id_class(var7) * 5.0F;
         var7++;
      }

      this.id_break.id_catch = var5 * (float) (Math.PI / 180.0);
      this.id_break.id_case = var6 * (float) (Math.PI / 180.0);
   }
}
