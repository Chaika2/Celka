package celestial;

import com.google.common.collect.Sets;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;

public class rBq_1<T extends rEB> extends rBk_1 {
   private final T id_class;

   public rBq_1(T var1) {
      this.id_class = (T)var1;
      this.id_class(EnumSet.of(rBW.MOVE));
   }

   private void id_class(rrEr_1 var1) {
      if (var1.id_this()) {
         HashSet var2 = Sets.newHashSet();
         List var3 = ((rYB)this.id_class.id_throws[7])
            .id_class(rEB.class, this.id_class.rN().id_class(16.0), var1x -> !var1x.sd() && rrEs_1.id_class(var1x, var1));
         var2.addAll(var3);

         for (rEB var5 : var2) {
            var1.id_class(var1.id_implements(), var5, (rfH_2)null, true);
         }
      }
   }

   @Override
   public boolean id_class() {
      return this.id_class.I_() == null
         && !this.id_class.BP()
         && this.id_class.sd()
         && !this.id_class.sx().id_class()
         && !((rrEm_1)((rYB)this.id_class.id_throws[7])).id_throw(this.id_class.Bs());
   }

   @Override
   public boolean id_break() {
      return this.id_class.sd()
         && !this.id_class.sx().id_class()
         && (rYB)this.id_class.id_throws[7] instanceof rrEm_1
         && !((rrEm_1)((rYB)this.id_class.id_throws[7])).id_throw(this.id_class.Bs());
   }

   @Override
   public void id_throws() {
      if (this.id_class.sd()) {
         rrEr_1 var1 = this.id_class.sx();
         if ((Integer)this.id_class.id_throws[41] % 20 == 0) {
            this.id_class(var1);
         }

         if (!this.id_class.id_catch()) {
            rjU_2 var2 = iX_2.id_break(this.id_class, 15, 4, rjU_2.id_protected(var1.id_continue()));
            if (var2 != null) {
               this.id_class.id_public().id_class(var2.id_break, var2.id_byte, var2.id_protected, 1.0);
            }
         }
      }
   }
}
