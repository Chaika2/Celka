package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import java.util.Arrays;

public class wl_3<T extends an_3> extends wN_2<T> {
   private final Iq_1 id_class;
   private final Iq_1[] id_break = new Iq_1[8];
   private final ImmutableList<Iq_1> id_byte;

   public wl_3() {
      byte var1 = -16;
      this.id_class = new Iq_1(this, 0, 0);
      this.id_class.id_class(-6.0F, -8.0F, -6.0F, 12.0F, 16.0F, 12.0F);
      this.id_class.id_protected += 8.0F;

      for (int var2 = 0; var2 < this.id_break.length; var2++) {
         this.id_break[var2] = new Iq_1(this, 48, 0);
         double var3 = (double)var2 * Math.PI * 2.0 / (double)this.id_break.length;
         float var5 = (float)Math.cos(var3) * 5.0F;
         float var6 = (float)Math.sin(var3) * 5.0F;
         this.id_break[var2].id_class(-1.0F, 0.0F, -1.0F, 2.0F, 18.0F, 2.0F);
         this.id_break[var2].id_byte = var5;
         this.id_break[var2].id_throws = var6;
         this.id_break[var2].id_protected = 15.0F;
         var3 = (double)var2 * Math.PI * -2.0 / (double)this.id_break.length + (Math.PI / 2);
         this.id_break[var2].id_catch = (float)var3;
      }

      Builder var7 = ImmutableList.builder();
      var7.add(this.id_class);
      var7.addAll(Arrays.asList(this.id_break));
      this.id_byte = var7.build();
   }

   @Override
   public void id_class(T var1, float var2, float var3, float var4, float var5, float var6) {
      for (Iq_1 var10 : this.id_break) {
         var10.id_case = var4;
      }
   }

   @Override
   public Iterable<Iq_1> id_class() {
      return this.id_byte;
   }
}
