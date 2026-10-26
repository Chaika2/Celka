package celestial;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.UnaryOperator;

public class VV {
   private final String class_;
   private final List<rgc_3> break_;
   private final Int2IntFunction byte_;

   private VV(String var1, List<rgc_3> var2, Int2IntFunction var3) {
      this.class_ = var1;
      this.break_ = ImmutableList.copyOf(var2);
      this.byte_ = var3;
   }

   public static VV class_(rgS_2 var0, Int2IntFunction var1, UnaryOperator<String> var2) {
      StringBuilder var3 = new StringBuilder();
      ArrayList var4 = Lists.newArrayList();
      var0.class_((var2x, var3x) -> {
         rgL_2.byte_(var3x, var2x, (var2xx, var3xx, var4x) -> {
            var3.appendCodePoint(var4x);
            int var5 = Character.charCount(var4x);

            for (int var6 = 0; var6 < var5; var6++) {
               var4.add(var3xx);
            }

            return true;
         });
         return Optional.empty();
      }, rgc_3.class_);
      return new VV(var2.apply(var3.toString()), var4, var1);
   }

   public List<rpl_3> class_(int var1, int var2, boolean var3) {
      if (var2 == 0) {
         return ImmutableList.of();
      } else {
         ArrayList var4 = Lists.newArrayList();
         rgc_3 var5 = this.break_.get(var1);
         int var6 = var1;

         for (int var7 = 1; var7 < var2; var7++) {
            int var8 = var1 + var7;
            rgc_3 var9 = this.break_.get(var8);
            if (!var9.equals(var5)) {
               String var10 = this.class_.substring(var6, var8);
               var4.add(var3 ? rpl_3.class_(var10, var5, this.byte_) : rpl_3.class_(var10, var5));
               var5 = var9;
               var6 = var8;
            }
         }

         if (var6 < var1 + var2) {
            String var11 = this.class_.substring(var6, var1 + var2);
            var4.add(var3 ? rpl_3.class_(var11, var5, this.byte_) : rpl_3.class_(var11, var5));
         }

         return (List<rpl_3>)(var3 ? Lists.reverse(var4) : var4);
      }
   }

   public String class_() {
      return this.class_;
   }
}
