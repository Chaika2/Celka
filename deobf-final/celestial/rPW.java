package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rPW extends rPm_1<rsq_3> {
   private long class_;

   public rPW() {
      super(ImmutableMap.of(il_3.byte_, iC_2.VALUE_PRESENT, il_3.final_, iC_2.REGISTERED));
   }

   protected void class_(rrEm_1 var1, rsq_3 var2) {
   }

   protected void class_(rrEm_1 var1, rsq_3 var2, long var3) {
      iZ_2 var5 = var2.SF();
      var5.class_(il_3.float_, var3);
      var5.byte_(il_3.byte_).ifPresent(var1x -> var5.class_(il_3.final_, new rfI_2(var1x.break_())));
      var2.sc();
      this.class_(var1, var2);
      if (var2.sN()) {
         var2.sQ();
      }
   }

   protected boolean break_(rrEm_1 var1, rsq_3 var2, long var3) {
      Optional var5 = var2.SF().byte_(il_3.byte_);
      if (!var5.isPresent()) {
         return false;
      } else {
         rfK_2 var6 = (rfK_2)var5.get();
         return var6.class_() == var1.E() && var6.break_().class_(var2.Ps(), 1.73);
      }
   }

   protected boolean break_(rrEm_1 var1, rsq_3 var2) {
      if (var1.r() - this.class_ < 300L) {
         return false;
      } else if (var1.int_.nextInt(2) != 0) {
         return false;
      } else {
         this.class_ = var1.r();
         rfK_2 var3 = var2.SF().byte_(il_3.byte_).get();
         return var3.class_() == var1.E() && var3.break_().class_(var2.Ps(), 1.73);
      }
   }
}
