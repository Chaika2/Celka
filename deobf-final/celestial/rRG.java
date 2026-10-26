package celestial;

import java.util.UUID;

public abstract class rRG {
   private final UUID class_;
   protected rgP_2 byte_;
   protected float protected_;
   protected rRb_1 throws_;
   protected rRM case_;
   protected boolean catch_;
   protected boolean private_;
   protected boolean implements_;

   public rRG byte_(boolean var1) {
      this.implements_ = var1;
      return this;
   }

   public rRG(UUID var1, rgP_2 var2, rRb_1 var3, rRM var4) {
      this.class_ = var1;
      this.byte_ = var2;
      this.throws_ = var3;
      this.case_ = var4;
      this.protected_ = 1.0F;
   }

   public void class_(rRb_1 var1) {
      this.throws_ = var1;
   }

   public void class_(float var1) {
      this.protected_ = var1;
   }

   public rRG class_(boolean var1) {
      this.catch_ = var1;
      return this;
   }

   public void class_(rRM var1) {
      this.case_ = var1;
   }

   public void class_(rgP_2 var1) {
      this.byte_ = var1;
   }

   public float class_() {
      return this.protected_;
   }

   public rRG break_(boolean var1) {
      this.private_ = var1;
      return this;
   }

   public rRb_1 finally_() {
      return this.throws_;
   }

   public rRM extends_() {
      return this.case_;
   }

   public rgP_2 implements_() {
      return this.byte_;
   }

   public UUID private_() {
      return this.class_;
   }

   public boolean final_() {
      return this.implements_;
   }

   public boolean volatile_() {
      return this.private_;
   }

   public boolean native_() {
      return this.catch_;
   }
}
