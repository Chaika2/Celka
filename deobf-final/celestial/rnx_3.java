package celestial;

import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class rnx_3 extends rrEQ {
   private final rqO_2 class_;
   private final Set<UUID> break_ = Sets.newHashSet();
   private int finally_;
   private int extends_ = 100;

   public void byte_(rhN_2 var1) {
      if (this.break_.contains(var1.ro())) {
         this.class_(var1);
      }
   }

   @Override
   public void byte_() {
      super.byte_();
      this.break_.clear();
   }

   public rnx_3(rqO_2 var1, rgP_2 var2) {
      super(var2, rRb_1.WHITE, rRM.PROGRESS);
      this.class_ = var1;
      this.class_(0.0F);
   }

   public void class_(int var1) {
      this.finally_ = var1;
      this.class_(rfU_2.class_((float)var1 / (float)this.extends_, 0.0F, 1.0F));
   }

   public boolean class_(Collection<rhN_2> var1) {
      HashSet var2 = Sets.newHashSet();
      HashSet var3 = Sets.newHashSet();

      for (UUID var5 : this.break_) {
         boolean var6 = false;

         for (rhN_2 var8 : var1) {
            if (var8.ro().equals(var5)) {
               var6 = true;
               break;
            }
         }

         if (!var6) {
            var2.add(var5);
         }
      }

      for (rhN_2 var12 : var1) {
         boolean var15 = false;

         for (UUID var19 : this.break_) {
            if (var12.ro().equals(var19)) {
               var15 = true;
               break;
            }
         }

         if (!var15) {
            var3.add(var12);
         }
      }

      for (UUID var13 : var2) {
         for (rhN_2 var18 : this.int_()) {
            if (var18.ro().equals(var13)) {
               this.break_(var18);
               break;
            }
         }

         this.break_.remove(var13);
      }

      for (rhN_2 var14 : var3) {
         this.class_(var14);
      }

      return !var2.isEmpty() || !var3.isEmpty();
   }

   public static rnx_3 class_(rcd_3 var0, rqO_2 var1) {
      rnx_3 var2 = new rnx_3(var1, rgB_2.class_(var0.native_("Name")));
      var2.protected_(var0.new_("Visible"));
      var2.class_(var0.private_("Value"));
      var2.break_(var0.private_("Max"));
      var2.class_(rRb_1.class_(var0.native_("Color")));
      var2.class_(rRM.class_(var0.native_("Overlay")));
      var2.class_(var0.new_("DarkenScreen"));
      var2.break_(var0.new_("PlayBossMusic"));
      var2.byte_(var0.new_("CreateWorldFog"));
      rcy_3 var3 = var0.protected_("Players", 11);

      for (int var4 = 0; var4 < var3.size(); var4++) {
         var2.class_(rco_3.class_(var3.finally_(var4)));
      }

      return var2;
   }

   public void class_(UUID var1) {
      this.break_.add(var1);
   }

   @Override
   public void class_(rhN_2 var1) {
      super.class_(var1);
      this.break_.add(var1.ro());
   }

   public rqO_2 break_() {
      return this.class_;
   }

   @Override
   public void break_(rhN_2 var1) {
      super.break_(var1);
      this.break_.remove(var1.ro());
   }

   public void break_(int var1) {
      this.extends_ = var1;
      this.class_(rfU_2.class_((float)this.finally_ / (float)var1, 0.0F, 1.0F));
   }

   public int throws_() {
      return this.extends_;
   }

   public rcd_3 catch_() {
      rcd_3 var1 = new rcd_3();
      var1.class_("Name", rgB_2.class_(this.byte_));
      var1.class_("Visible", this.package_());
      var1.break_("Value", this.finally_);
      var1.break_("Max", this.extends_);
      var1.class_("Color", this.finally_().break_());
      var1.class_("Overlay", this.extends_().class_());
      var1.class_("DarkenScreen", this.native_());
      var1.class_("PlayBossMusic", this.volatile_());
      var1.class_("CreateWorldFog", this.final_());
      rcy_3 var2 = new rcy_3();

      for (UUID var4 : this.break_) {
         var2.add(rco_3.class_(var4));
      }

      var1.class_("Players", var2);
      return var1;
   }

   public final rgP_2 case_() {
      return rgv_3.class_(this.implements_())
         .class_(
            var1 -> var1.class_(this.finally_().class_()).class_(new rgy_3(rgp_3.class_, new rgN_2(this.break_().toString()))).class_(this.break_().toString())
         );
   }

   public int protected_() {
      return this.finally_;
   }

   public void protected_(rhN_2 var1) {
      super.break_(var1);
   }
}
