package celestial;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public abstract class rHm_1 implements gV_2 {
   private static final SimpleDateFormat class_ = new SimpleDateFormat("HH:mm:ss");
   private static final rgP_2 break_ = new rgN_2("@");
   private long protected_ = -1L;
   private boolean throws_ = true;
   private int case_;
   private boolean catch_ = true;
   private rgP_2 private_;
   private String implements_ = "";
   private rgP_2 finally_ = break_;

   public abstract rjU_2 byte_();

   @Override
   public boolean C() {
      return this.class_().B().break_(rRu_1.final_) && this.catch_;
   }

   @Override
   public boolean l() {
      return this.catch_;
   }

   @Override
   public void class_(rgP_2 var1, UUID var2) {
      if (this.catch_) {
         this.private_ = new rgN_2("[" + class_.format(new Date()) + "] ").class_(var1);
         this.break_();
      }
   }

   public void class_(rgP_2 var1) {
      if (var1 != null) {
         this.finally_ = var1;
      } else {
         this.finally_ = break_;
      }
   }

   public abstract rrEm_1 class_();

   public void class_(int var1) {
      this.case_ = var1;
   }

   public void class_(boolean var1) {
      this.catch_ = var1;
   }

   public rcd_3 class_(rcd_3 var1) {
      var1.class_("Command", this.implements_);
      var1.break_("SuccessCount", this.case_);
      var1.class_("CustomName", rgB_2.class_(this.finally_));
      var1.class_("TrackOutput", this.catch_);
      if (this.private_ != null && this.catch_) {
         var1.class_("LastOutput", rgB_2.class_(this.private_));
      }

      var1.class_("UpdateLastExecution", this.throws_);
      if (this.throws_ && this.protected_ > 0L) {
         var1.class_("LastExecution", this.protected_);
      }

      return var1;
   }

   public void class_(String var1) {
      this.implements_ = var1;
      this.case_ = 0;
   }

   public boolean class_(rYB var1) {
      if (var1.continue_ || var1.r() == this.protected_) {
         return false;
      } else if ("Searge".equalsIgnoreCase(this.implements_)) {
         this.private_ = new rgN_2("#itzlipofutzli");
         this.case_ = 1;
         return true;
      } else {
         this.case_ = 0;
         rnW_2 var2 = this.class_().const_();
         if (var2.O() && !rql_3.break_(this.implements_)) {
            try {
               this.private_ = null;
               gy_3 var3 = this.throws_().class_((var1x, var2x, var3x) -> {
                  if (var2x) {
                     this.case_++;
                  }
               });
               var2.f().class_(var3, this.implements_);
            } catch (Throwable var6) {
               KY var4 = KY.class_(var6, "Executing command block");
               Ko_1 var5 = var4.class_("Command to be executed");
               var5.class_("Command", this::private_);
               var5.class_("Name", () -> this.implements_().getString());
               throw new KU(var4);
            }
         }

         if (this.throws_) {
            this.protected_ = var1.r();
         } else {
            this.protected_ = -1L;
         }

         return true;
      }
   }

   public ryZ_2 class_(rhd_3 var1) {
      if (!var1.sU()) {
         return ryZ_2.PASS;
      } else {
         if (var1.e().continue_) {
            var1.class_(this);
         }

         return ryZ_2.class_(((rYB)var1.throws_[7]).continue_);
      }
   }

   public void break_(rcd_3 var1) {
      this.implements_ = var1.native_("Command");
      this.case_ = var1.private_("SuccessCount");
      if (var1.byte_("CustomName", 8)) {
         this.class_(rgB_2.class_(var1.native_("CustomName")));
      }

      if (var1.byte_("TrackOutput", 1)) {
         this.catch_ = var1.new_("TrackOutput");
      }

      if (var1.byte_("LastOutput", 8) && this.catch_) {
         try {
            this.private_ = rgB_2.class_(var1.native_("LastOutput"));
         } catch (Throwable var3) {
            this.private_ = new rgN_2(var3.getMessage());
         }
      } else {
         this.private_ = null;
      }

      if (var1.throws_("UpdateLastExecution")) {
         this.throws_ = var1.new_("UpdateLastExecution");
      }

      if (this.throws_ && var1.throws_("LastExecution")) {
         this.protected_ = var1.implements_("LastExecution");
      } else {
         this.protected_ = -1L;
      }
   }

   public void break_(rgP_2 var1) {
      this.private_ = var1;
   }

   public abstract void break_();

   public abstract gy_3 throws_();

   @Override
   public boolean H() {
      return this.class_().B().break_(rRu_1.private_);
   }

   public boolean finally_() {
      return this.catch_;
   }

   public rgP_2 catch_() {
      return this.private_ == null ? rgN_2.byte_ : this.private_;
   }

   public int case_() {
      return this.case_;
   }

   public rgP_2 implements_() {
      return this.finally_;
   }

   public String private_() {
      return this.implements_;
   }
}
