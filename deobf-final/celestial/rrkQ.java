package celestial;

import java.util.ArrayList;
import java.util.Map;

public class rrkQ {
   private rrkz_1[] class_;
   private rrXI[] break_;

   private void byte_() {
      for (int var1 = 0; var1 < this.break_.length; var1++) {
         rrXI var2 = this.break_[var1];
         var2.break_();
      }
   }

   public rrkQ(rrkz_1[] var1, Map<String, rrXt_1> var2) {
      this.class_ = var1;
      ArrayList var3 = new ArrayList();

      for (String var5 : var2.keySet()) {
         rrXt_1 var6 = (rrXt_1)var2.get(var5);
         if (var6 instanceof rrXI var7) {
            var3.add(var7);
         }
      }

      this.break_ = var3.toArray(new rrXI[var3.size()]);
   }

   public void class_() {
      this.byte_();

      for (int var1 = 0; var1 < this.class_.length; var1++) {
         rrkz_1 var2 = this.class_[var1];
         var2.class_();
      }
   }

   public void class_(int var1) {
      for (int var2 = 0; var2 < this.class_.length; var2++) {
         rrkz_1 var3 = this.class_[var2];
         var3.class_(var1);
      }
   }

   public void break_() {
      for (int var1 = 0; var1 < this.class_.length; var1++) {
         rrkz_1 var2 = this.class_[var1];
         var2.break_();
      }
   }
}
