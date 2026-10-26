package celestial;

import java.io.IOException;
import java.util.UUID;

public class rFv_1 implements ruS_2<At_1> {
   private UUID class_;
   private rFL break_;
   private rgP_2 byte_;
   private float protected_;
   private rRb_1 throws_;
   private rRM case_;
   private boolean catch_;
   private boolean private_;
   private boolean implements_;

   public rFL byte_() {
      return this.break_;
   }

   public rFv_1() {
   }

   public rFv_1(rFL var1, rRG var2) {
      this.break_ = var1;
      this.class_ = var2.private_();
      this.byte_ = var2.implements_();
      this.protected_ = var2.class_();
      this.throws_ = var2.finally_();
      this.case_ = var2.extends_();
      this.catch_ = var2.native_();
      this.private_ = var2.volatile_();
      this.implements_ = var2.final_();
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   private void class_(int var1) {
      this.catch_ = (var1 & 1) > 0;
      this.private_ = (var1 & 2) > 0;
      this.implements_ = (var1 & 4) > 0;
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.private_();
      this.break_ = var1.class_(rFL.class);
      switch (this.break_) {
         case ADD:
            this.byte_ = var1.throws_();
            this.protected_ = var1.readFloat();
            this.throws_ = var1.class_(rRb_1.class);
            this.case_ = var1.class_(rRM.class);
            this.class_(var1.readUnsignedByte());
         case REMOVE:
         default:
            break;
         case UPDATE_PCT:
            this.protected_ = var1.readFloat();
            break;
         case UPDATE_NAME:
            this.byte_ = var1.throws_();
            break;
         case UPDATE_STYLE:
            this.throws_ = var1.class_(rRb_1.class);
            this.case_ = var1.class_(rRM.class);
            break;
         case UPDATE_PROPERTIES:
            this.class_(var1.readUnsignedByte());
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.class_(this.class_);
      var1.class_(this.break_);
      switch (this.break_) {
         case ADD:
            var1.class_(this.byte_);
            var1.writeFloat(this.protected_);
            var1.class_(this.throws_);
            var1.class_(this.case_);
            var1.writeByte(this.extends_());
         case REMOVE:
         default:
            break;
         case UPDATE_PCT:
            var1.writeFloat(this.protected_);
            break;
         case UPDATE_NAME:
            var1.class_(this.byte_);
            break;
         case UPDATE_STYLE:
            var1.class_(this.throws_);
            var1.class_(this.case_);
            break;
         case UPDATE_PROPERTIES:
            var1.writeByte(this.extends_());
      }
   }

   public UUID break_() {
      return this.class_;
   }

   public float throws_() {
      return this.protected_;
   }

   public boolean finally_() {
      return this.implements_;
   }

   public rRM catch_() {
      return this.case_;
   }

   private int extends_() {
      byte var1 = 0;
      if (this.catch_) {
         var1 |= 1;
      }

      if (this.private_) {
         var1 |= 2;
      }

      if (this.implements_) {
         var1 |= 4;
      }

      return var1;
   }

   public rRb_1 case_() {
      return this.throws_;
   }

   public boolean implements_() {
      return this.private_;
   }

   public rgP_2 protected_() {
      return this.byte_;
   }

   public boolean private_() {
      return this.catch_;
   }
}
