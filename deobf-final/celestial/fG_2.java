package celestial;

import com.google.common.base.MoreObjects;
import com.google.common.base.Splitter;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class fG_2 implements fB_2 {
   private static final Splitter byte_ = Splitter.on('|').omitEmptyStrings();
   private final String protected_;
   private final String throws_;

   public fG_2(String var1, String var2) {
      this.protected_ = var1;
      this.throws_ = var2;
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("key", this.protected_).add("value", this.throws_).toString();
   }

   private Predicate<xc_3> class_(rCF<xd_3, xc_3> var1, rCZ<?> var2, String var3) {
      Optional var4 = var2.break_(var3);
      if (!var4.isPresent()) {
         throw new RuntimeException(
            String.format("Unknown value '%s' for property '%s' on '%s' in '%s'", var3, this.protected_, ((xd_3)var1.byte_()).toString(), this.throws_)
         );
      } else {
         return var2x -> var2x.byte_(var2).equals(var4.get());
      }
   }

   @Override
   public Predicate<xc_3> getPredicate(rCF<xd_3, xc_3> var1) {
      rCZ var2 = var1.class_(this.protected_);
      if (var2 == null) {
         throw new RuntimeException(String.format("Unknown property '%s' on '%s'", this.protected_, ((xd_3)var1.byte_()).toString()));
      } else {
         String var3 = this.throws_;
         boolean var4 = !var3.isEmpty() && var3.charAt(0) == '!';
         if (var4) {
            var3 = var3.substring(1);
         }

         List var5 = byte_.splitToList(var3);
         if (var5.isEmpty()) {
            throw new RuntimeException(
               String.format("Empty value '%s' for property '%s' on '%s'", this.throws_, this.protected_, ((xd_3)var1.byte_()).toString())
            );
         } else {
            Predicate var6;
            if (var5.size() == 1) {
               var6 = this.class_(var1, var2, var3);
            } else {
               List var7 = var5.stream().map(var3x -> this.class_(var1, var2, var3x)).collect(Collectors.toList());
               var6 = var1x -> var7.stream().anyMatch(var1xx -> var1xx.test(var1x));
            }

            return var4 ? var6.negate() : var6;
         }
      }
   }
}
