package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class NI implements Nc_1<Nq_1> {
   private final List<Nc_1<Nq_1>> id_class = Lists.newArrayList();
   private final Random id_break = new Random();
   private final rqO_2 id_byte;
   private final rgP_2 id_protected;

   public Nq_1 id_byte() {
      int var1 = this.id_class();
      if (!this.id_class.isEmpty() && var1 != 0) {
         int var2 = this.id_break.nextInt(var1);

         for (Nc_1 var4 : this.id_class) {
            var2 -= var4.id_class();
            if (var2 < 0) {
               return (Nq_1)var4.id_break();
            }
         }

         return Nf_1.id_class;
      } else {
         return Nf_1.id_class;
      }
   }

   public NI(rqO_2 var1, String var2) {
      this.id_byte = var1;
      this.id_protected = var2 == null ? null : new rgn_3(var2);
   }

   @Override
   public void id_class(Nt_1 var1) {
      for (Nc_1 var3 : this.id_class) {
         var3.id_class(var1);
      }
   }

   public void id_class(Nc_1<Nq_1> var1) {
      this.id_class.add(var1);
   }

   @Override
   public int id_class() {
      int var1 = 0;

      for (Nc_1 var3 : this.id_class) {
         var1 += var3.id_class();
      }

      return var1;
   }

   public rgP_2 id_protected() {
      return this.id_protected;
   }
}
