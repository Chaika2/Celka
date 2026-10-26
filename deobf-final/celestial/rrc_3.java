package celestial;

import com.google.common.collect.ImmutableMap;
import java.util.Optional;

public class rrc_3 extends rPm_1<iB_2> {
   private final int class_;
   private final int byte_;
   private int protected_;

   public rrc_3(int var1, int var2) {
      super(ImmutableMap.of(il_3.instanceof_, iC_2.VALUE_PRESENT, il_3.throw_, iC_2.VALUE_PRESENT));
      this.byte_ = var1 * 20;
      this.protected_ = 0;
      this.class_ = var2;
   }

   @Override
   protected void protected_(rrEm_1 var1, iB_2 var2, long var3) {
      iZ_2 var5 = var2.SF();
      Optional var6 = var5.byte_(il_3.throw_);
      boolean var7 = (Long)var6.get() + 300L <= var3;
      if (this.protected_ <= this.byte_ && !var7) {
         rfH_2 var8 = var5.byte_(il_3.instanceof_).get().break_();
         if (var8.class_(var2.Bs(), (double)this.class_)) {
            this.protected_++;
         }
      } else {
         var5.break_(il_3.throw_);
         var5.break_(il_3.instanceof_);
         var5.class_(var1.P(), var1.r());
         this.protected_ = 0;
      }
   }
}
