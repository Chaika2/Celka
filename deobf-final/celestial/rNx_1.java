package celestial;

import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rNx_1 extends rzO_2 {
   private static final Logger break_ = LogManager.getLogger();
   final List<ev_3> byte_;

   public static rzh_3<?> byte_() {
      return class_(var0 -> new rNx_1(var0, ImmutableList.of()));
   }

   rNx_1(rQz_1[] var1, Collection<ev_3> var2) {
      super(var1);
      this.byte_ = ImmutableList.copyOf(var2);
   }

   private static rdn_3 class_(rdn_3 var0, ev_3 var1, Random var2) {
      int var3 = rfU_2.class_(var2, var1.throws_(), var1.class_());
      if (var0.break_() == rdy_3.XM) {
         var0 = new rdn_3(rdy_3.dm);
         rxy_3.class_(var0, new eL_2(var1, var3));
      } else {
         var0.class_(var1, var3);
      }

      return var0;
   }

   @Override
   public rzx_3 break_() {
      return rNl_1.protected_;
   }

   @Override
   public rdn_3 break_(rdn_3 var1, rzr_3 var2) {
      Random var3 = var2.class_();
      ev_3 var4;
      if (this.byte_.isEmpty()) {
         boolean var5 = var1.break_() == rdy_3.XM;
         List var6 = rVL.boolean_.case_().filter(ev_3::implements_).filter(var2x -> var5 || var2x.class_(var1)).collect(Collectors.toList());
         if (var6.isEmpty()) {
            break_.warn("Couldn't find a compatible enchantment for {}", var1);
            return var1;
         }

         var4 = (ev_3)var6.get(var3.nextInt(var6.size()));
      } else {
         var4 = this.byte_.get(var3.nextInt(this.byte_.size()));
      }

      return class_(var1, var4, var3);
   }
}
