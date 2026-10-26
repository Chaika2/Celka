package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Random;

public class tw_3<T extends an_3> extends wN_2<T> {
   private final Iq_1[] id_class = new Iq_1[9];
   private final ImmutableList<Iq_1> id_break;

   public tw_3() {
      Builder var1 = ImmutableList.builder();
      Iq_1 var2 = new Iq_1(this, 0, 0);
      var2.id_class(-8.0F, -8.0F, -8.0F, 16.0F, 16.0F, 16.0F);
      var2.id_protected = 17.6F;
      var1.add(var2);
      Random var3 = new Random(1660L);

      for (int var4 = 0; var4 < this.id_class.length; var4++) {
         this.id_class[var4] = new Iq_1(this, 0, 0);
         float var5 = (((float)(var4 % 3) - (float)(var4 / 3 % 2) * 0.5F + 0.25F) / 2.0F * 2.0F - 1.0F) * 5.0F;
         float var6 = ((float)(var4 / 3) / 2.0F * 2.0F - 1.0F) * 5.0F;
         int var7 = var3.nextInt(7) + 8;
         this.id_class[var4].id_class(-1.0F, 0.0F, -1.0F, 2.0F, (float)var7, 2.0F);
         this.id_class[var4].id_byte = var5;
         this.id_class[var4].id_throws = var6;
         this.id_class[var4].id_protected = 24.6F;
         var1.add(this.id_class[var4]);
      }

      this.id_break = var1.build();
   }

   @Override
   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      for (int var7 = 0; var7 < this.id_class.length; var7++) {
         this.id_class[var7].id_case = 0.2F * rfU_2.id_class(var4 * 0.3F + (float)var7) + 0.4F;
      }
   }

   @Override
   public Iterable<Iq_1> id_class() {
      return this.id_break;
   }
}
