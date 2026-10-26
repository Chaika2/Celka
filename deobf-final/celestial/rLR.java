package celestial;

import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;
import java.util.Map.Entry;

public class rLR {
   private final Map<iJ_2, ix_3> class_ = Maps.newHashMap();
   private final rLo_1 break_;
   private final int byte_;
   private String protected_;

   public String byte_() {
      return this.break_();
   }

   protected rLR(rLo_1 var1, int var2) {
      this.break_ = var1;
      this.byte_ = var2;
   }

   public boolean class_() {
      return false;
   }

   public static rLR class_(int var0) {
      return rVL.const_.class_(var0);
   }

   public double class_(int var1, ix_3 var2) {
      return var2.protected_() * (double)(var1 + 1);
   }

   public rLR class_(iJ_2 var1, String var2, double var3, id_3 var5) {
      ix_3 var6 = new ix_3(UUID.fromString(var2), this::byte_, var3, var5);
      this.class_.put(var1, var6);
      return this;
   }

   public void class_(iB_2 var1, ik_3 var2, int var3) {
      for (Entry var5 : this.class_.entrySet()) {
         ic_3 var6 = var2.class_((iJ_2)var5.getKey());
         if (var6 != null) {
            var6.protected_((ix_3)var5.getValue());
         }
      }
   }

   public void class_(iB_2 var1, int var2) {
      if (this == rLD.finally_) {
         if (var1.Ss() < var1.SK()) {
            var1.protected_(1.0F);
         }
      } else if (this == rLD.super_) {
         if (var1.Ss() > 1.0F) {
            var1.break_(rye_3.package_, 1.0F);
         }
      } else if (this == rLD.this_) {
         var1.break_(rye_3.int_, 1.0F);
      } else if (this == rLD.new_ && var1 instanceof rhd_3) {
         ((rhd_3)var1).while_(0.005F * (float)(var2 + 1));
      } else if (this == rLD.return_ && var1 instanceof rhd_3) {
         if (!((rYB)var1.throws_[7]).continue_) {
            ((rhd_3)var1).sk().class_(var2 + 1, 1.0F);
         }
      } else if ((this != rLD.case_ || var1.BR()) && (this != rLD.catch_ || !var1.BR())) {
         if (this == rLD.catch_ && !var1.BR() || this == rLD.case_ && var1.BR()) {
            var1.break_(rye_3.package_, (float)(6 << var2));
         }
      } else {
         var1.protected_((float)Math.max(4 << var2, 0));
      }
   }

   public void class_(an_3 var1, an_3 var2, iB_2 var3, int var4, double var5) {
      if ((this != rLD.case_ || var3.BR()) && (this != rLD.catch_ || !var3.BR())) {
         if (this == rLD.catch_ && !var3.BR() || this == rLD.case_ && var3.BR()) {
            int var8 = (int)(var5 * (double)(6 << var4) + 0.5);
            if (var1 == null) {
               var3.break_(rye_3.package_, (float)var8);
            } else {
               var3.break_(rye_3.byte_(var1, var2), (float)var8);
            }
         } else {
            this.class_(var3, var4);
         }
      } else {
         int var7 = (int)(var5 * (double)(4 << var4) + 0.5);
         var3.protected_((float)var7);
      }
   }

   public boolean class_(int var1, int var2) {
      if (this == rLD.finally_) {
         int var5 = 50 >> var2;
         return var5 > 0 ? var1 % var5 == 0 : true;
      } else if (this == rLD.super_) {
         int var4 = 25 >> var2;
         return var4 > 0 ? var1 % var4 == 0 : true;
      } else if (this == rLD.this_) {
         int var3 = 40 >> var2;
         return var3 > 0 ? var1 % var3 == 0 : true;
      } else {
         return this == rLD.new_;
      }
   }

   public static int class_(rLR var0) {
      return rVL.const_.class_(var0);
   }

   public void break_(iB_2 var1, ik_3 var2, int var3) {
      for (Entry var5 : this.class_.entrySet()) {
         ic_3 var6 = var2.class_((iJ_2)var5.getKey());
         if (var6 != null) {
            ix_3 var7 = (ix_3)var5.getValue();
            var6.protected_(var7);
            var6.byte_(new ix_3(var7.class_(), this.byte_() + " " + var3, this.class_(var3, var7), var7.byte_()));
         }
      }
   }

   protected String break_() {
      if (this.protected_ == null) {
         this.protected_ = rqR_2.class_("effect", rVL.const_.break_(this));
      }

      return this.protected_;
   }

   public rLo_1 throws_() {
      return this.break_;
   }

   public Map<iJ_2, ix_3> catch_() {
      return this.class_;
   }

   public int case_() {
      return this.byte_;
   }

   public boolean implements_() {
      return this.break_ == rLo_1.HARMFUL;
   }

   public rgP_2 protected_() {
      return new rgn_3(this.byte_());
   }

   public boolean private_() {
      return this.break_ == rLo_1.BENEFICIAL;
   }
}
