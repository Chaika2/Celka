package celestial;

import com.google.common.collect.ImmutableSet;
import java.util.Locale;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rNN extends rzO_2 {
   static final Logger protected_ = LogManager.getLogger();
   public static final rrrZ<?> break_ = rrrZ.int_;
   public static final rrGh_1 byte_ = rrGh_1.MANSION;
   final rrrZ<?> throws_;
   final rrGh_1 case_;
   final byte catch_;
   final int private_;
   final boolean implements_;

   public static rNc_1 byte_() {
      return new rNc_1();
   }

   rNN(rQz_1[] var1, rrrZ<?> var2, rrGh_1 var3, byte var4, int var5, boolean var6) {
      super(var1);
      this.throws_ = var2;
      this.case_ = var3;
      this.catch_ = var4;
      this.private_ = var5;
      this.implements_ = var6;
   }

   @Override
   public Set<rzd_3<?>> class_() {
      return ImmutableSet.of(rzQ_2.case_);
   }

   @Override
   public rzx_3 break_() {
      return rNl_1.extends_;
   }

   @Override
   public rdn_3 break_(rdn_3 var1, rzr_3 var2) {
      if (var1.break_() != rdy_3.dM) {
         return var1;
      } else {
         rjU_2 var3 = var2.break_(rzQ_2.case_);
         if (var3 != null) {
            rrEm_1 var4 = var2.byte_();
            rfH_2 var5 = var4.class_(this.throws_, new rfH_2(var3), this.private_, this.implements_);
            if (var5 != null) {
               rdn_3 var6 = rxI_2.class_(var4, var5.b_(), var5.d_(), this.catch_, true, true);
               rxI_2.class_(var4, var6);
               rrGb_1.class_(var6, var5, "+", this.case_);
               var6.class_(new rgn_3("filled_map." + this.throws_.catch_().toLowerCase(Locale.ROOT)));
               return var6;
            }
         }

         return var1;
      }
   }
}
