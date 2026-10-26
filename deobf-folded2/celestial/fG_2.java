package celestial;

import com.google.common.base.MoreObjects;
import com.google.common.base.Splitter;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class fG_2 implements fB_2 {
   private static final Splitter id_byte = Splitter.on('|').omitEmptyStrings();
   private final String id_protected;
   private final String id_throws;

   public fG_2(String var1, String var2) {
      this.id_protected = var1;
      this.id_throws = var2;
   }

   @Override
   public String toString() {
      return MoreObjects.toStringHelper(this).add("key", this.id_protected).add("value", this.id_throws).toString();
   }

   private Predicate<xc_3> id_class(rCF<xd_3, xc_3> var1, rCZ<?> var2, String var3) {
      Optional var4 = var2.id_break(var3);
      if (!var4.isPresent()) {
         throw new RuntimeException(
            String.format("Unknown value '%s' for property '%s' on '%s' in '%s'", var3, this.id_protected, ((xd_3)var1.id_byte()).toString(), this.id_throws)
         );
      } else {
         return var2x -> var2x.id_byte(var2).equals(var4.get());
      }
   }

   @Override
   public Predicate<xc_3> getPredicate(rCF<xd_3, xc_3> var1) {
      rCZ var2 = var1.id_class(this.id_protected);
      if (var2 == null) {
         throw new RuntimeException(String.format("Unknown property '%s' on '%s'", this.id_protected, ((xd_3)var1.id_byte()).toString()));
      } else {
         String var3 = this.id_throws;
         boolean var4 = !var3.isEmpty() && var3.charAt(0) == '!';
         if (var4) {
            var3 = var3.substring(1);
         }

         List var5 = id_byte.splitToList(var3);
         if (var5.isEmpty()) {
            throw new RuntimeException(
               String.format("Empty value '%s' for property '%s' on '%s'", this.id_throws, this.id_protected, ((xd_3)var1.id_byte()).toString())
            );
         } else {
            Predicate var6;
            if (var5.size() == 1) {
               var6 = this.id_class(var1, var2, var3);
            } else {
               List var7 = var5.stream().map(var3x -> this.id_class(var1, var2, var3x)).collect(Collectors.toList());
               var6 = var1x -> var7.stream().anyMatch(var1xx -> var1xx.test(var1x));
            }

            return var4 ? var6.negate() : var6;
         }
      }
   }
}
