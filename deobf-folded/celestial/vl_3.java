package celestial;

import java.util.List;
import java.util.Optional;

public class vl_3 extends vm_3 {
   protected final vm_3 id_case;
   protected final Qw_1 id_catch;

   public vl_3(vm_3 var1, Qw_1 var2, rgP_2 var3) {
      super(var3);
      this.id_case = var1;
      this.id_catch = var2;
   }

   public static List<rpl_3> id_class(Le_1 var0, int var1, int var2) {
      Optional var3 = var0.id_throws((double)var1, (double)var2);
      if (var3.isPresent() && var3.get() instanceof cn_3) {
         Optional var4 = ((cn_3)var3.get()).id_class();
         return (List<rpl_3>)var4.orElse((List)null);
      } else {
         return null;
      }
   }

   @Override
   public void id_volatile() {
      this.id_volatile.id_break(this.id_case);
   }

   @Override
   public void w_() {
      super.w_();
      ((Qw_1)this.id_volatile.id_class[20]).id_break();
   }
}
