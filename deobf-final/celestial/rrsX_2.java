package celestial;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class rrsX_2 extends rrsk_3 {
   public static final Codec<rrsX_2> class_ = rKi_1.break_.fieldOf("provider").xmap(rrsX_2::new, var0 -> var0.break_).codec();
   private final rKi_1 break_;

   public rrsX_2(rKi_1 var1) {
      this.break_ = var1;
   }

   @Override
   public void class_(rRI var1, Random var2, List<rfH_2> var3, List<rfH_2> var4, Set<rfH_2> var5, rfi_3 var6) {
      int var7 = ((rfH_2)var3.get(0)).c_();
      var3.stream().filter(var1x -> var1x.c_() == var7).forEach(var3x -> {
         this.class_((rKH)var1, var2, var3x.byte_().private_());
         this.class_((rKH)var1, var2, var3x.volatile_(2).private_());
         this.class_((rKH)var1, var2, var3x.byte_().private_(2));
         this.class_((rKH)var1, var2, var3x.volatile_(2).private_(2));

         for (int var4x = 0; var4x < 5; var4x++) {
            int var5x = var2.nextInt(64);
            int var6x = var5x % 8;
            int var7x = var5x / 8;
            if (var6x == 0 || var6x == 7 || var7x == 0 || var7x == 7) {
               this.class_((rKH)var1, var2, var3x.break_(-3 + var6x, 0, -3 + var7x));
            }
         }
      });
   }

   private void class_(rKH var1, Random var2, rfH_2 var3) {
      for (int var4 = -2; var4 <= 2; var4++) {
         for (int var5 = -2; var5 <= 2; var5++) {
            if (Math.abs(var4) != 2 || Math.abs(var5) != 2) {
               this.break_(var1, var2, var3.break_(var4, 0, var5));
            }
         }
      }
   }

   @Override
   protected rrsW_2<?> class_() {
      return rrsW_2.throws_;
   }

   private void break_(rKH var1, Random var2, rfH_2 var3) {
      for (int var4 = 2; var4 >= -3; var4--) {
         rfH_2 var5 = var3.break_(var4);
         if (rUO.class_(var1, var5)) {
            var1.class_(var5, this.break_.class_(var2, var3), 19);
            break;
         }

         if (!rUO.break_(var1, var5) && var4 < 0) {
            break;
         }
      }
   }
}
