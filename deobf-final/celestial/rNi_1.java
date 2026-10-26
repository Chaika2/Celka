package celestial;

import com.google.common.collect.ImmutableSet;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Set;
import java.util.function.UnaryOperator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rNi_1 extends rzO_2 {
   private static final Logger break_ = LogManager.getLogger();
   final rgP_2 byte_;
   final rzB_2 protected_;

   rNi_1(rQz_1[] var1, rgP_2 var2, rzB_2 var3) {
      super(var1);
      this.byte_ = var2;
      this.protected_ = var3;
   }

   @Override
   public Set<rzd_3<?>> class_() {
      return this.protected_ != null ? ImmutableSet.of(this.protected_.class_()) : ImmutableSet.of();
   }

   public static UnaryOperator<rgP_2> class_(rzr_3 var0, rzB_2 var1) {
      if (var1 != null) {
         an_3 var2 = var0.break_(var1.class_());
         if (var2 != null) {
            gy_3 var3 = var2.PL().break_(2);
            return var2x -> {
               try {
                  return rgv_3.class_(var3, var2x, var2, 0);
               } catch (CommandSyntaxException var4) {
                  break_.warn("Failed to resolve text component", var4);
                  return var2x;
               }
            };
         }
      }

      return var0x -> var0x;
   }

   @Override
   public rdn_3 break_(rdn_3 var1, rzr_3 var2) {
      if (this.byte_ != null) {
         var1.class_(class_(var2, this.protected_).apply(this.byte_));
      }

      return var1;
   }

   @Override
   public rzx_3 break_() {
      return rNl_1.finally_;
   }
}
