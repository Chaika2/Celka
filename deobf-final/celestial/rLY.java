package celestial;

import com.google.common.collect.ComparisonChain;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rLY implements Comparable<rLY> {
   private static final Logger class_ = LogManager.getLogger();
   private final rLR break_;
   private int byte_;
   private int protected_;
   private boolean throws_;
   private boolean case_;
   private boolean catch_;
   private boolean private_;
   private boolean implements_;
   private String finally_;
   private rLY extends_;

   public int byte_(rLY var1) {
      return this.break_() > 32147 && var1.break_() > 32147 || this.protected_() && var1.protected_()
         ? ComparisonChain.start().compare(this.protected_(), var1.protected_()).compare(this.class_().case_(), var1.class_().case_()).result()
         : ComparisonChain.start()
            .compare(this.protected_(), var1.protected_())
            .compare(this.break_(), var1.break_())
            .compare(this.class_().case_(), var1.class_().case_())
            .result();
   }

   private void byte_(rcd_3 var1) {
      var1.class_("Amplifier", (byte)this.byte_());
      var1.break_("Duration", this.break_());
      var1.class_("Ambient", this.protected_());
      var1.class_("ShowParticles", this.throws_());
      var1.class_("ShowIcon", this.case_());
      if (this.extends_ != null) {
         rcd_3 var2 = new rcd_3();
         this.extends_.class_(var2);
         var1.class_("HiddenEffect", var2);
      }
   }

   public int byte_() {
      return this.protected_;
   }

   public rLY(rLR var1, int var2, int var3, boolean var4, boolean var5, boolean var6, rLY var7) {
      this.break_ = var1;
      this.byte_ = var2;
      this.protected_ = var3;
      this.case_ = var4;
      this.private_ = var5;
      this.implements_ = var6;
      this.extends_ = var7;
      this.finally_ = var1.protected_().byte_();
   }

   public rLY(rLY var1) {
      this.break_ = var1.break_;
      this.class_(var1);
   }

   public rLY(rLR var1) {
      this(var1, 0, 0);
   }

   public rLY(rLR var1, int var2) {
      this(var1, var2, 0);
   }

   public rLY(rLR var1, int var2, int var3) {
      this(var1, var2, var3, false, true);
   }

   public rLY(rLR var1, int var2, int var3, boolean var4, boolean var5) {
      this(var1, var2, var3, var4, var5, var5);
   }

   public rLY(rLR var1, int var2, int var3, boolean var4, boolean var5, boolean var6) {
      this(var1, var2, var3, var4, var5, var6, (rLY)null);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rLY var2)
            ? false
            : this.byte_ == var2.byte_
               && this.protected_ == var2.protected_
               && this.throws_ == var2.throws_
               && this.case_ == var2.case_
               && this.break_.equals(var2.break_);
      }
   }

   @Override
   public String toString() {
      String var1;
      if (this.protected_ > 0) {
         var1 = this.private_() + " x " + (this.protected_ + 1) + ", Duration: " + this.byte_;
      } else {
         var1 = this.private_() + ", Duration: " + this.byte_;
      }

      if (this.throws_) {
         var1 = var1 + ", Splash: true";
      }

      if (!this.private_) {
         var1 = var1 + ", Particles: false";
      }

      if (!this.implements_) {
         var1 = var1 + ", Show Icon: false";
      }

      return var1;
   }

   @Override
   public int hashCode() {
      int var1 = this.break_.hashCode();
      var1 = 31 * var1 + this.byte_;
      var1 = 31 * var1 + this.protected_;
      var1 = 31 * var1 + (this.throws_ ? 1 : 0);
      return 31 * var1 + (this.case_ ? 1 : 0);
   }

   public rcd_3 class_(rcd_3 var1) {
      var1.class_("Id", (byte)rLR.class_(this.class_()));
      this.byte_(var1);
      return var1;
   }

   public rLR class_() {
      return this.break_;
   }

   public void class_(iB_2 var1) {
      if (this.byte_ > 0) {
         this.break_.class_(var1, this.protected_);
      }
   }

   void class_(rLY var1) {
      this.byte_ = var1.byte_;
      this.protected_ = var1.protected_;
      this.case_ = var1.case_;
      this.private_ = var1.private_;
      this.implements_ = var1.implements_;
   }

   private static rLY class_(rLR var0, rcd_3 var1) {
      byte var2 = var1.case_("Amplifier");
      int var3 = var1.private_("Duration");
      boolean var4 = var1.new_("Ambient");
      boolean var5 = true;
      if (var1.byte_("ShowParticles", 1)) {
         var5 = var1.new_("ShowParticles");
      }

      boolean var6 = var5;
      if (var1.byte_("ShowIcon", 1)) {
         var6 = var1.new_("ShowIcon");
      }

      rLY var7 = null;
      if (var1.byte_("HiddenEffect", 10)) {
         var7 = class_(var0, var1.int_("HiddenEffect"));
      }

      return new rLY(var0, var3, var2 < 0 ? 0 : var2, var4, var5, var6, var7);
   }

   public boolean class_(iB_2 var1, Runnable var2) {
      if (this.byte_ > 0) {
         if (this.break_.class_(this.byte_, this.protected_)) {
            this.class_(var1);
         }

         this.catch_();
         if (this.byte_ == 0 && this.extends_ != null) {
            this.class_(this.extends_);
            this.extends_ = this.extends_.extends_;
            var2.run();
         }
      }

      return this.byte_ > 0;
   }

   public void class_(boolean var1) {
      this.catch_ = var1;
   }

   public boolean break_(rLY var1) {
      if (this.break_ != var1.break_) {
         class_.warn("This method should only be called for matching effects!");
      }

      boolean var2 = false;
      if (var1.protected_ > this.protected_) {
         if (var1.byte_ < this.byte_) {
            rLY var3 = this.extends_;
            this.extends_ = new rLY(this);
            this.extends_.extends_ = var3;
         }

         this.protected_ = var1.protected_;
         this.byte_ = var1.byte_;
         var2 = true;
      } else if (var1.byte_ > this.byte_) {
         if (var1.protected_ == this.protected_) {
            this.byte_ = var1.byte_;
            var2 = true;
         } else if (this.extends_ == null) {
            this.extends_ = new rLY(var1);
         } else {
            this.extends_.break_(var1);
         }
      }

      if (!var1.case_ && this.case_ || var2) {
         this.case_ = var1.case_;
         var2 = true;
      }

      if (var1.private_ != this.private_) {
         this.private_ = var1.private_;
         var2 = true;
      }

      if (var1.implements_ != this.implements_) {
         this.implements_ = var1.implements_;
         var2 = true;
      }

      return var2;
   }

   public static rLY break_(rcd_3 var0) {
      byte var1 = var0.case_("Id");
      rLR var2 = rLR.class_(var1);
      return var2 == null ? null : class_(var2, var0);
   }

   public int break_() {
      return this.byte_;
   }

   public boolean throws_() {
      return this.private_;
   }

   public boolean finally_() {
      return this.throws_;
   }

   public int catch_() {
      if (this.extends_ != null) {
         this.extends_.catch_();
      }

      return --this.byte_;
   }

   public boolean extends_() {
      return this.catch_;
   }

   public boolean case_() {
      return this.implements_;
   }

   public boolean implements_() {
      return this.catch_;
   }

   public boolean protected_() {
      return this.case_;
   }

   public String private_() {
      return this.break_.byte_();
   }

   public String final_() {
      return this.finally_;
   }

   public rLY volatile_() {
      return this.extends_;
   }

   public boolean native_() {
      return this.private_;
   }
}
