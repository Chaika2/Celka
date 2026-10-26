package celestial;

import com.google.common.collect.Maps;
import java.util.EnumMap;
import java.util.Map;

public abstract class ev_3 {
   private final rXQ[] class_;
   private final eF_2 protected_;
   public final eC_2 break_;
   protected String byte_;

   public boolean byte_() {
      return false;
   }

   public static ev_3 byte_(int var0) {
      return rVL.boolean_.class_(var0);
   }

   protected ev_3(eF_2 var1, eC_2 var2, rXQ[] var3) {
      this.protected_ = var1;
      this.break_ = var2;
      this.class_ = var3;
   }

   public float class_(int var1, aL_2 var2) {
      return 0.0F;
   }

   protected boolean class_(ev_3 var1) {
      return this != var1;
   }

   public int class_(int var1, rye_3 var2) {
      return 0;
   }

   public boolean class_(rdn_3 var1) {
      return this.break_.class_(var1.break_());
   }

   public void class_(iB_2 var1, an_3 var2, int var3) {
   }

   public int class_() {
      return 1;
   }

   public int class_(int var1) {
      return 1 + var1 * 10;
   }

   public Map<rXQ, rdn_3> class_(iB_2 var1) {
      EnumMap var2 = Maps.newEnumMap(rXQ.class);

      for (rXQ var6 : this.class_) {
         rdn_3 var7 = var1.class_(var6);
         if (!var7.class_()) {
            var2.put(var6, var7);
         }
      }

      return var2;
   }

   public boolean break_() {
      return false;
   }

   public void break_(iB_2 var1, an_3 var2, int var3) {
   }

   public int break_(int var1) {
      return this.class_(var1) + 5;
   }

   public final boolean break_(ev_3 var1) {
      return this.class_(var1) && var1.class_(this);
   }

   public int throws_() {
      return 1;
   }

   public String catch_() {
      return this.case_();
   }

   protected String case_() {
      if (this.byte_ == null) {
         this.byte_ = rqR_2.class_("enchantment", rVL.boolean_.break_(this));
      }

      return this.byte_;
   }

   public boolean implements_() {
      return true;
   }

   public rgP_2 protected_(int var1) {
      rgn_3 var2 = new rgn_3(this.catch_());
      if (this.byte_()) {
         var2.class_(rgF_2.RED);
      } else {
         var2.class_(rgF_2.GRAY);
      }

      if (var1 != 1 || this.class_() != 1) {
         var2.break_(" ").class_(new rgn_3("enchantment.level." + var1));
      }

      return var2;
   }

   public eF_2 protected_() {
      return this.protected_;
   }

   public boolean private_() {
      return true;
   }
}
