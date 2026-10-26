package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Arrays;

public class ti_3<T extends rGA> extends wN_2<T> {
   private final Iq_1[] id_class = new Iq_1[8];
   private final Iq_1 id_break;
   private final ImmutableList<Iq_1> id_byte;

   public ti_3() {
      for (int var1 = 0; var1 < this.id_class.length; var1++) {
         byte var2 = 0;
         int var3 = var1;
         if (var1 == 2) {
            var2 = 24;
            var3 = 10;
         } else if (var1 == 3) {
            var2 = 24;
            var3 = 19;
         }

         this.id_class[var1] = new Iq_1(this, var2, var3);
         this.id_class[var1].id_class(-4.0F, (float)(16 + var1), -4.0F, 8.0F, 1.0F, 8.0F);
      }

      this.id_break = new Iq_1(this, 0, 16);
      this.id_break.id_class(-2.0F, 18.0F, -2.0F, 4.0F, 4.0F, 4.0F);
      Builder var4 = ImmutableList.builder();
      var4.add(this.id_break);
      var4.addAll(Arrays.asList(this.id_class));
      this.id_byte = var4.build();
   }

   public void id_class(T var1, float var2, float var3, float var4) {
      float var5 = rfU_2.id_catch(var4, var1.id_protected, var1.id_break);
      if (var5 < 0.0F) {
         var5 = 0.0F;
      }

      for (int var6 = 0; var6 < this.id_class.length; var6++) {
         this.id_class[var6].id_protected = (float)(-(4 - var6)) * var5 * 1.7F;
      }
   }

   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
   }

   public ImmutableList<Iq_1> id_break() {
      return this.id_byte;
   }
}
