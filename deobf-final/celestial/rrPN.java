package celestial;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class rrPN {
   private rpa_3 class_ = rpa_3.NONE;
   private rqd_3 break_ = rqd_3.NONE;
   private rfH_2 byte_ = rfH_2.protected_;
   private boolean protected_;
   private rfj_3 throws_;
   private rfi_3 case_;
   private boolean catch_ = true;
   private Random private_;
   private int implements_;
   private final List<rrPA> finally_ = Lists.newArrayList();
   private boolean extends_;
   private boolean native_;

   public rpa_3 byte_() {
      return this.class_;
   }

   public rrPN byte_(boolean var1) {
      this.native_ = var1;
      return this;
   }

   public rrPN class_(Random var1) {
      this.private_ = var1;
      return this;
   }

   public rrPT class_(List<rrPT> var1, rfH_2 var2) {
      int var3 = var1.size();
      if (var3 == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return (rrPT)var1.get(this.break_(var2).nextInt(var3));
      }
   }

   public rrPN class_(rrPA var1) {
      this.finally_.add(var1);
      return this;
   }

   public rrPN class_(rpa_3 var1) {
      this.class_ = var1;
      return this;
   }

   public rrPN class_() {
      rrPN var1 = new rrPN();
      var1.class_ = this.class_;
      var1.break_ = this.break_;
      var1.byte_ = this.byte_;
      var1.protected_ = this.protected_;
      var1.throws_ = this.throws_;
      var1.case_ = this.case_;
      var1.catch_ = this.catch_;
      var1.private_ = this.private_;
      var1.implements_ = this.implements_;
      var1.finally_.addAll(this.finally_);
      var1.extends_ = this.extends_;
      var1.native_ = this.native_;
      return var1;
   }

   public rrPN class_(rqd_3 var1) {
      this.break_ = var1;
      return this;
   }

   public rrPN class_(rfH_2 var1) {
      this.byte_ = var1;
      return this;
   }

   public rrPN class_(boolean var1) {
      this.protected_ = var1;
      return this;
   }

   public rrPN class_(rfi_3 var1) {
      this.case_ = var1;
      return this;
   }

   public rrPN class_(rfj_3 var1) {
      this.throws_ = var1;
      return this;
   }

   private rfi_3 break_(rfj_3 var1) {
      if (var1 == null) {
         return this.case_;
      } else {
         int var2 = var1.break_ * 16;
         int var3 = var1.byte_ * 16;
         return new rfi_3(var2, 0, var3, var2 + 16 - 1, 255, var3 + 16 - 1);
      }
   }

   public rrPN break_() {
      this.finally_.clear();
      return this;
   }

   public Random break_(rfH_2 var1) {
      if (this.private_ != null) {
         return this.private_;
      } else {
         return var1 == null ? new Random(rqR_2.break_()) : new Random(rfU_2.class_(var1));
      }
   }

   public rrPN break_(boolean var1) {
      this.extends_ = var1;
      return this;
   }

   public rrPN break_(rrPA var1) {
      this.finally_.remove(var1);
      return this;
   }

   public rfH_2 throws_() {
      return this.byte_;
   }

   void finally_() {
      if (this.throws_ != null) {
         this.case_ = this.break_(this.throws_);
      }
   }

   public rfi_3 catch_() {
      if (this.case_ == null && this.throws_ != null) {
         this.finally_();
      }

      return this.case_;
   }

   public boolean extends_() {
      return this.catch_;
   }

   public boolean case_() {
      return this.protected_;
   }

   public List<rrPA> implements_() {
      return this.finally_;
   }

   public rqd_3 protected_() {
      return this.break_;
   }

   public boolean private_() {
      return this.extends_;
   }

   public boolean native_() {
      return this.native_;
   }
}
