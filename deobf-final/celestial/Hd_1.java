package celestial;

import com.google.common.collect.Sets;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Hd_1 implements Hx_1 {
   protected final lD_2 class_;
   protected final Map<HU, lD_2> break_;
   protected HU byte_ = null;
   protected final Set<lD_2> protected_ = Sets.newIdentityHashSet();
   private final Ok_1 throws_ = new rrxy_3(this);

   public HU byte_() {
      return this.byte_;
   }

   protected Hd_1(lD_2 var1, Map<HU, lD_2> var2) {
      this.class_ = var1;
      this.break_ = var2;
      this.class_.class_(this);

      for (lD_2 var4 : var2.values()) {
         var4.class_(this);
      }
   }

   @Override
   public void class_() {
      HU var1 = this.byte_;
      this.break_();
      if (var1 != null) {
         this.getBuffer(var1);
      }
   }

   public Ok_1 class_(rqO_2 var1, Ok_1 var2) {
      if (!(this.byte_ instanceof yr_3)) {
         return var2;
      } else {
         var1 = HU.continue_(var1);
         yr_3 var3 = (yr_3)this.byte_;
         yr_3 var4 = var3.super_(var1);
         return this.getBuffer(var4);
      }
   }

   public void class_(HU var1) {
      lD_2 var2 = this.break_(var1);
      boolean var3 = Objects.equals(this.byte_, var1);
      if ((var3 || var2 != this.class_) && this.protected_.remove(var2)) {
         var1.class_(var2, 0, 0, 0);
         if (var3) {
            this.byte_ = null;
         }
      }
   }

   public void break_() {
      if (!this.protected_.isEmpty()) {
         if (this.byte_ != null) {
            Ok_1 var1 = this.getBuffer(this.byte_);
            if (var1 == this.class_) {
               this.class_(this.byte_);
            }
         }

         if (!this.protected_.isEmpty()) {
            for (HU var2 : this.break_.keySet()) {
               this.class_(var2);
               if (this.protected_.isEmpty()) {
                  break;
               }
            }
         }
      }
   }

   private lD_2 break_(HU var1) {
      return this.break_.getOrDefault(var1, this.class_);
   }

   @Override
   public Ok_1 getBuffer(HU var1) {
      lD_2 var2 = this.break_(var1);
      if (!Objects.equals(this.byte_, var1)) {
         if (this.byte_ != null) {
            HU var3 = this.byte_;
            if (!this.break_.containsKey(var3)) {
               this.class_(var3);
            }
         }

         if (this.protected_.add(var2)) {
            var2.class_(var1);
            var2.class_(var1.try_(), var1.while_());
         }

         this.byte_ = var1;
      }

      return (Ok_1)(var1.float_() == rrzJ_2.while_ ? this.throws_ : var2);
   }

   public Ok_1 protected_() {
      return this.throws_;
   }
}
