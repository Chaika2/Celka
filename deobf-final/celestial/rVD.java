package celestial;

import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

class rVD {
   final List<rVK> class_;
   private String break_;

   public rVD(List<rVK> var1) {
      this.class_ = var1;
      this.break_ = var1.stream().map(var0 -> var0.byte_).collect(Collectors.joining());
   }

   public rgS_2 class_() {
      rgA_2 var1 = new rgA_2();
      this.class_.forEach(var1::class_);
      this.class_.clear();
      return var1.class_();
   }

   public rgS_2 class_(int var1, int var2, rgc_3 var3) {
      rgA_2 var4 = new rgA_2();
      ListIterator var5 = this.class_.listIterator();
      int var6 = var1;
      boolean var7 = false;

      while (var5.hasNext()) {
         rVK var8 = (rVK)var5.next();
         String var9 = var8.byte_;
         int var10 = var9.length();
         if (!var7) {
            if (var6 > var10) {
               var4.class_(var8);
               var5.remove();
               var6 -= var10;
            } else {
               String var11 = var9.substring(0, var6);
               if (!var11.isEmpty()) {
                  var4.class_(rgS_2.class_(var11, var8.protected_));
               }

               var6 += var2;
               var7 = true;
            }
         }

         if (var7) {
            if (var6 <= var10) {
               String var12 = var9.substring(var6);
               if (var12.isEmpty()) {
                  var5.remove();
               } else {
                  var5.set(new rVK(var12, var3));
               }
               break;
            }

            var5.remove();
            var6 -= var10;
         }
      }

      this.break_ = this.break_.substring(var1 + var2);
      return var4.break_();
   }

   public char class_(int var1) {
      return this.break_.charAt(var1);
   }
}
