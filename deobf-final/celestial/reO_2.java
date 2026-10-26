package celestial;

import com.mojang.serialization.Codec;
import java.util.Random;

public class reO_2 extends rUO<rUt_1> {
   private static final rfH_2 class_ = new rfH_2(8, 3, 8);
   private static final rfj_3 b = new rfj_3(class_);

   public reO_2(Codec<rUt_1> var1) {
      super(var1);
   }

   private static int class_(int var0, int var1, int var2, int var3) {
      return Math.max(Math.abs(var0 - var2), Math.abs(var1 - var3));
   }

   public boolean class_(rRI var1, rKd_1 var2, Random var3, rfH_2 var4, rUt_1 var5) {
      rfj_3 var6 = new rfj_3(var4);
      if (class_(var6.break_, var6.byte_, b.break_, b.byte_) > 1) {
         return true;
      } else {
         rfw_3 var7 = new rfw_3();

         for (int var8 = var6.byte_(); var8 <= var6.throws_(); var8++) {
            for (int var9 = var6.break_(); var9 <= var6.protected_(); var9++) {
               if (class_(class_.b_(), class_.d_(), var9, var8) <= 16) {
                  var7.class_(var9, class_.c_(), var8);
                  if (var7.equals(class_)) {
                     var1.class_(var7, xu_3.volatile_.continue_(), 2);
                  } else {
                     var1.class_(var7, xu_3.break_.continue_(), 2);
                  }
               }
            }
         }

         return true;
      }
   }
}
