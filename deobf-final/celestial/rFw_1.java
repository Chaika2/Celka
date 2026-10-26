package celestial;

import java.io.IOException;

public class rFw_1 implements ruS_2<At_1> {
   private rFf_1 class_;
   private int break_;
   private double byte_;
   private double protected_;
   private double throws_;
   private double case_;
   private long catch_;
   private int private_;
   private int implements_;

   public rFw_1() {
   }

   public rFw_1(roE_2 var1, rFf_1 var2) {
      this.class_ = var2;
      this.byte_ = var1.class_();
      this.protected_ = var1.break_();
      this.case_ = var1.implements_();
      this.throws_ = var1.extends_();
      this.catch_ = var1.finally_();
      this.break_ = var1.volatile_();
      this.implements_ = var1.continue_();
      this.private_ = var1.new_();
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   public void class_(roE_2 var1) {
      switch (this.class_) {
         case SET_SIZE:
            var1.class_(this.throws_);
            break;
         case LERP_SIZE:
            var1.class_(this.case_, this.throws_, this.catch_);
            break;
         case SET_CENTER:
            var1.break_(this.byte_, this.protected_);
            break;
         case SET_WARNING_BLOCKS:
            var1.byte_(this.implements_);
            break;
         case SET_WARNING_TIME:
            var1.break_(this.private_);
            break;
         case INITIALIZE:
            var1.break_(this.byte_, this.protected_);
            if (this.catch_ > 0L) {
               var1.class_(this.case_, this.throws_, this.catch_);
            } else {
               var1.class_(this.throws_);
            }

            var1.class_(this.break_);
            var1.byte_(this.implements_);
            var1.break_(this.private_);
      }
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.class_(rFf_1.class);
      switch (this.class_) {
         case SET_SIZE:
            this.throws_ = var1.readDouble();
            break;
         case LERP_SIZE:
            this.case_ = var1.readDouble();
            this.throws_ = var1.readDouble();
            this.catch_ = var1.catch_();
            break;
         case SET_CENTER:
            this.byte_ = var1.readDouble();
            this.protected_ = var1.readDouble();
            break;
         case SET_WARNING_BLOCKS:
            this.implements_ = var1.case_();
            break;
         case SET_WARNING_TIME:
            this.private_ = var1.case_();
            break;
         case INITIALIZE:
            this.byte_ = var1.readDouble();
            this.protected_ = var1.readDouble();
            this.case_ = var1.readDouble();
            this.throws_ = var1.readDouble();
            this.catch_ = var1.catch_();
            this.break_ = var1.case_();
            this.implements_ = var1.case_();
            this.private_ = var1.case_();
      }
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
      switch (this.class_) {
         case SET_SIZE:
            var1.writeDouble(this.throws_);
            break;
         case LERP_SIZE:
            var1.writeDouble(this.case_);
            var1.writeDouble(this.throws_);
            var1.class_(this.catch_);
            break;
         case SET_CENTER:
            var1.writeDouble(this.byte_);
            var1.writeDouble(this.protected_);
            break;
         case SET_WARNING_BLOCKS:
            var1.protected_(this.implements_);
            break;
         case SET_WARNING_TIME:
            var1.protected_(this.private_);
            break;
         case INITIALIZE:
            var1.writeDouble(this.byte_);
            var1.writeDouble(this.protected_);
            var1.writeDouble(this.case_);
            var1.writeDouble(this.throws_);
            var1.class_(this.catch_);
            var1.protected_(this.break_);
            var1.protected_(this.implements_);
            var1.protected_(this.private_);
      }
   }
}
