package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rPz_1 extends rPm_1<rsq_3> {
   private final il_3<rfK_2> class_;
   private final float byte_;
   private final int protected_;
   private final int throws_;
   private final int case_;

   public rPz_1(il_3<rfK_2> var1, float var2, int var3, int var4, int var5) {
      super(ImmutableMap.of(il_3.interface_, iC_2.REGISTERED, il_3.volatile_, iC_2.VALUE_ABSENT, var1, iC_2.VALUE_PRESENT));
      this.class_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.throws_ = var4;
      this.case_ = var5;
   }

   private boolean class_(rsq_3 var1, rfK_2 var2) {
      return var2.break_().implements_(var1.Bs()) > this.throws_;
   }

   private boolean class_(rrEm_1 var1, rfK_2 var2) {
      return var2.class_() != var1.E();
   }

   private boolean class_(rrEm_1 var1, rsq_3 var2, rfK_2 var3) {
      return var3.class_() == var1.E() && var3.break_().implements_(var2.Bs()) <= this.protected_;
   }

   private void class_(rsq_3 var1, long var2) {
      iZ_2 var4 = var1.SF();
      var1.class_(this.class_);
      var4.break_(this.class_);
      var4.class_(il_3.interface_, var2);
   }

   protected void class_(rrEm_1 var1, rsq_3 var2, long var3) {
      iZ_2 var5 = var2.SF();
      var5.byte_(this.class_).ifPresent(var6 -> {
         if (this.class_(var1, var6) || this.class_(var1, var2)) {
            this.class_(var2, var3);
         } else if (this.class_(var2, var6)) {
            rjU_2 var7 = null;
            int var8 = 0;

            for (short var9 = 1000; var8 < 1000 && (var7 == null || this.class_(var2, rfK_2.class_(var1.E(), new rfH_2(var7)))); var8++) {
               var7 = iX_2.break_(var2, 15, 7, rjU_2.protected_(var6.break_()));
            }

            if (var8 == 1000) {
               this.class_(var2, var3);
               return;
            }

            var5.class_(il_3.volatile_, new iH_2(var7, this.byte_, this.protected_));
         } else if (!this.class_(var1, var2, var6)) {
            var5.class_(il_3.volatile_, new iH_2(var6.break_(), this.byte_, this.protected_));
         }
      });
   }

   private boolean class_(rrEm_1 var1, rsq_3 var2) {
      Optional var3 = var2.SF().byte_(il_3.interface_);
      return var3.isPresent() ? var1.r() - (Long)var3.get() > (long)this.case_ : false;
   }
}
