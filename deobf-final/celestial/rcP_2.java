package celestial;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;

public class rcP_2 extends rzO_2 {
   final Map<rLR, rzV_2> break_;

   public static rcB_2 byte_() {
      return new rcB_2();
   }

   rcP_2(rQz_1[] var1, Map<rLR, rzV_2> var2) {
      super(var1);
      this.break_ = ImmutableMap.copyOf(var2);
   }

   @Override
   public rzx_3 break_() {
      return rNl_1.native_;
   }

   @Override
   public rdn_3 break_(rdn_3 var1, rzr_3 var2) {
      if (var1.break_() == rdy_3.ke && !this.break_.isEmpty()) {
         Random var3 = var2.class_();
         int var4 = var3.nextInt(this.break_.size());
         Entry var5 = (Entry)Iterables.get(this.break_.entrySet(), var4);
         rLR var6 = (rLR)var5.getKey();
         int var7 = ((rzV_2)var5.getValue()).class_(var3);
         if (!var6.class_()) {
            var7 *= 20;
         }

         rkJ_2.class_(var1, var6, var7);
         return var1;
      } else {
         return var1;
      }
   }
}
