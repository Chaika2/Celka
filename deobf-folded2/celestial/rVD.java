package celestial;

import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

class rVD {
   final List<rVK> id_class;
   private String id_break;

   public rVD(List<rVK> var1) {
      this.id_class = var1;
      this.id_break = var1.stream().map(var0 -> var0.id_byte).collect(Collectors.joining());
   }

   public rgS_2 id_class() {
      rgA_2 var1 = new rgA_2();
      this.id_class.forEach(var1::id_class);
      this.id_class.clear();
      return var1.id_class();
   }

   public rgS_2 id_class(int var1, int var2, rgc_3 var3) {
      rgA_2 var4 = new rgA_2();
      ListIterator var5 = this.id_class.listIterator();
      int var6 = var1;
      boolean var7 = false;

      while (var5.hasNext()) {
         rVK var8 = (rVK)var5.next();
         String var9 = var8.id_byte;
         int var10 = var9.length();
         if (!var7) {
            if (var6 > var10) {
               var4.id_class(var8);
               var5.remove();
               var6 -= var10;
            } else {
               String var11 = var9.substring(0, var6);
               if (!var11.isEmpty()) {
                  var4.id_class(rgS_2.id_class(var11, var8.id_protected));
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

      this.id_break = this.id_break.substring(var1 + var2);
      return var4.id_break();
   }

   public char id_class(int var1) {
      return this.id_break.charAt(var1);
   }
}
