package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class rac_3 extends rax_3 {
   public raQ_2 id_class;
   public List<raQ_2> id_break;
   public List<raQ_2> id_byte;
   public final List<rrrn_1> id_protected = Lists.newArrayList();

   public rac_3(Random var1, int var2, int var3) {
      super(var1, var2, var3);
      this.id_break = Lists.newArrayList();

      for (raQ_2 var7 : ras_3.id_class) {
         var7.id_byte = 0;
         this.id_break.add(var7);
      }

      this.id_byte = Lists.newArrayList();

      for (raQ_2 var11 : ras_3.id_break) {
         var11.id_byte = 0;
         this.id_byte.add(var11);
      }
   }

   public rac_3(rrPt_1 var1, rcd_3 var2) {
      super(raF_2.id_super, var2);
   }
}
