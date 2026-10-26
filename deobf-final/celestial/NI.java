package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class NI implements Nc_1<Nq_1> {
   private final List<Nc_1<Nq_1>> class_ = Lists.newArrayList();
   private final Random break_ = new Random();
   private final rqO_2 byte_;
   private final rgP_2 protected_;

   public Nq_1 byte_() {
      int var1 = this.class_();
      if (!this.class_.isEmpty() && var1 != 0) {
         int var2 = this.break_.nextInt(var1);

         for (Nc_1 var4 : this.class_) {
            var2 -= var4.class_();
            if (var2 < 0) {
               return (Nq_1)var4.break_();
            }
         }

         return Nf_1.class_;
      } else {
         return Nf_1.class_;
      }
   }

   public NI(rqO_2 var1, String var2) {
      this.byte_ = var1;
      this.protected_ = var2 == null ? null : new rgn_3(var2);
   }

   @Override
   public void class_(Nt_1 var1) {
      for (Nc_1 var3 : this.class_) {
         var3.class_(var1);
      }
   }

   public void class_(Nc_1<Nq_1> var1) {
      this.class_.add(var1);
   }

   @Override
   public int class_() {
      int var1 = 0;

      for (Nc_1 var3 : this.class_) {
         var1 += var3.class_();
      }

      return var1;
   }

   public rgP_2 protected_() {
      return this.protected_;
   }
}
