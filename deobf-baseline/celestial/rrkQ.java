package celestial;

import java.util.ArrayList;
import java.util.Map;

public class rrkQ {
   private rrkz_1[] id_class;
   private rrXI[] id_break;

   private void id_byte() {
      for (int var1 = 0; var1 < this.id_break.length; var1++) {
         rrXI var2 = this.id_break[var1];
         var2.id_break();
      }
   }

   public rrkQ(rrkz_1[] var1, Map<String, rrXt_1> var2) {
      this.id_class = var1;
      ArrayList var3 = new ArrayList();

      for (String var5 : var2.keySet()) {
         rrXt_1 var6 = (rrXt_1)var2.get(var5);
         if (var6 instanceof rrXI var7) {
            var3.add(var7);
         }
      }

      this.id_break = var3.toArray(new rrXI[var3.size()]);
   }

   public void id_class() {
      this.id_byte();

      for (int var1 = 0; var1 < this.id_class.length; var1++) {
         rrkz_1 var2 = this.id_class[var1];
         var2.id_class();
      }
   }

   public void id_class(int var1) {
      for (int var2 = 0; var2 < this.id_class.length; var2++) {
         rrkz_1 var3 = this.id_class[var2];
         var3.id_class(var1);
      }
   }

   public void id_break() {
      for (int var1 = 0; var1 < this.id_class.length; var1++) {
         rrkz_1 var2 = this.id_class[var1];
         var2.id_break();
      }
   }
}
