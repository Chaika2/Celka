package celestial;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class rrsz_3 extends rrsk_3 {
   public static final Codec<rrsz_3> class_ = Codec.unit(() -> rrsz_3.break_);
   public static final rrsz_3 break_ = new rrsz_3();

   @Override
   protected rrsW_2<?> class_() {
      return rrsW_2.class_;
   }

   @Override
   public void class_(rRI var1, Random var2, List<rfH_2> var3, List<rfH_2> var4, Set<rfH_2> var5, rfi_3 var6) {
      var3.forEach(var5x -> {
         if (var2.nextInt(3) > 0) {
            rfH_2 var6x = var5x.byte_();
            if (rUO.break_(var1, var6x)) {
               this.class_(var1, var6x, zq_3.package_, var5, var6);
            }
         }

         if (var2.nextInt(3) > 0) {
            rfH_2 var7 = var5x.extends_();
            if (rUO.break_(var1, var7)) {
               this.class_(var1, var7, zq_3.new_, var5, var6);
            }
         }

         if (var2.nextInt(3) > 0) {
            rfH_2 var8 = var5x.private_();
            if (rUO.break_(var1, var8)) {
               this.class_(var1, var8, zq_3.int_, var5, var6);
            }
         }

         if (var2.nextInt(3) > 0) {
            rfH_2 var9 = var5x.protected_();
            if (rUO.break_(var1, var9)) {
               this.class_(var1, var9, zq_3.final_, var5, var6);
            }
         }
      });
   }
}
