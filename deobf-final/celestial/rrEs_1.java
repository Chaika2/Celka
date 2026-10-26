package celestial;

import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class rrEs_1 extends rrGc_1 {
   private final Map<Integer, rrEr_1> class_ = Maps.newHashMap();
   private final rrEm_1 break_;
   private int byte_;
   private int protected_;

   @Override
   public rcd_3 byte_(rcd_3 var1) {
      var1.break_("NextAvailableID", this.byte_);
      var1.break_("Tick", this.protected_);
      rcy_3 var2 = new rcy_3();

      for (rrEr_1 var4 : this.class_.values()) {
         rcd_3 var5 = new rcd_3();
         var4.class_(var5);
         var2.add(var5);
      }

      var1.class_("Raids", var2);
      return var1;
   }

   public rrEs_1(rrEm_1 var1) {
      super(class_(var1.default_()));
      this.break_ = var1;
      this.byte_ = 1;
      this.byte_();
   }

   private rrEr_1 class_(rrEm_1 var1, rfH_2 var2) {
      rrEr_1 var3 = var1.interface_(var2);
      return var3 != null ? var3 : new rrEr_1(this.break_(), var1, var2);
   }

   @Override
   public void class_(rcd_3 var1) {
      this.byte_ = var1.private_("NextAvailableID");
      this.protected_ = var1.private_("Tick");
      rcy_3 var2 = var1.protected_("Raids", 10);

      for (int var3 = 0; var3 < var2.size(); var3++) {
         rcd_3 var4 = var2.class_(var3);
         rrEr_1 var5 = new rrEr_1(this.break_, var4);
         this.class_.put(var5.super_(), var5);
      }
   }

   public rrEr_1 class_(rfH_2 var1, int var2) {
      rrEr_1 var3 = null;
      double var4 = (double)var2;

      for (rrEr_1 var7 : this.class_.values()) {
         double var8 = var7.continue_().private_(var1);
         if (var7.this_() && var8 < var4) {
            var3 = var7;
            var4 = var8;
         }
      }

      return var3;
   }

   public static String class_(rRJ var0) {
      return "raids" + var0.class_();
   }

   public rrEr_1 class_(int var1) {
      return this.class_.get(var1);
   }

   public void class_() {
      this.protected_++;
      Iterator var1 = this.class_.values().iterator();

      while (var1.hasNext()) {
         rrEr_1 var2 = (rrEr_1)var1.next();
         if (this.break_.B().break_(rRu_1.public_)) {
            var2.native_();
         }

         if (var2.protected_()) {
            var1.remove();
            this.byte_();
         } else {
            var2.volatile_();
         }
      }

      if (this.protected_ % 200 == 0) {
         this.byte_();
      }

      ruP_2.class_(this.break_, this.class_.values());
   }

   public static boolean class_(rEB var0, rrEr_1 var1) {
      return var0 != null && var1 != null && var1.catch_() != null
         ? var0.BM() && var0.L() && var0.BI() <= 2400 && ((rYB)var0.throws_[7]).default_() == var1.catch_().default_()
         : false;
   }

   public rrEr_1 class_(rhN_2 var1) {
      if (var1.native_()) {
         return null;
      } else if (this.break_.B().break_(rRu_1.public_)) {
         return null;
      } else {
         rRJ var2 = ((rYB)var1.throws_[7]).default_();
         if (!var2.finally_()) {
            return null;
         } else {
            rfH_2 var3 = var1.Bs();
            List var4 = this.break_.d().byte_(rRP.break_, var3, 64, rRr_1.IS_OCCUPIED).collect(Collectors.toList());
            int var5 = 0;
            rjU_2 var6 = rjU_2.class_;

            for (rgU_2 var8 : var4) {
               rfH_2 var9 = var8.throws_();
               var6 = var6.break_((double)var9.b_(), (double)var9.c_(), (double)var9.d_());
               var5++;
            }

            rfH_2 var11;
            if (var5 > 0) {
               var6 = var6.class_(1.0 / (double)var5);
               var11 = new rfH_2(var6);
            } else {
               var11 = var3;
            }

            rrEr_1 var12 = this.class_(var1.continue_(), var11);
            boolean var13 = false;
            if (!var12.private_()) {
               if (!this.class_.containsKey(var12.super_())) {
                  this.class_.put(var12.super_(), var12);
               }

               var13 = true;
            } else if (var12.extends_() < var12.finally_()) {
               var13 = true;
            } else {
               var1.protected_(rLD.char_);
               var1.class_.class_(new rvQ_2(var1, (byte)43));
            }

            if (var13) {
               var12.class_((rhd_3)var1);
               var1.class_.class_(new rvQ_2(var1, (byte)43));
               if (!var12.byte_()) {
                  var1.break_(rlB_2.H);
                  Oo_1.void_.class_(var1);
               }
            }

            this.byte_();
            return var12;
         }
      }
   }

   private int break_() {
      return ++this.byte_;
   }
}
