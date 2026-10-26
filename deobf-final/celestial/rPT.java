package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rPT extends rPm_1<aA_2> {
   private final il_3<rfK_2> class_;
   private final int byte_;
   private final int protected_;
   private final float throws_;
   private long case_;

   public rPT(il_3<rfK_2> var1, float var2, int var3, int var4) {
      super(ImmutableMap.of(il_3.volatile_, iC_2.REGISTERED, var1, iC_2.VALUE_PRESENT));
      this.class_ = var1;
      this.throws_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
   }

   protected void class_(rrEm_1 var1, aA_2 var2, long var3) {
      if (var3 > this.case_) {
         iZ_2 var5 = var2.SF();
         Optional var6 = var5.byte_(this.class_);
         var6.ifPresent(var2x -> var5.class_(il_3.volatile_, new iH_2(var2x.break_(), this.throws_, this.byte_)));
         this.case_ = var3 + 80L;
      }
   }

   protected boolean class_(rrEm_1 var1, aA_2 var2) {
      Optional var3 = var2.SF().byte_(this.class_);
      return var3.isPresent() && var1.E() == ((rfK_2)var3.get()).class_() && ((rfK_2)var3.get()).break_().class_(var2.Ps(), (double)this.protected_);
   }
}
