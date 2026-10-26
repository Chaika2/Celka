package celestial;

import java.io.IOException;

public class rFd_1 implements ruS_2<At_1> {
   private double class_;
   private double break_;
   private double byte_;
   private float protected_;
   private float throws_;
   private float case_;
   private float catch_;
   private int private_;
   private boolean implements_;
   private rLx_1 finally_;

   public double byte_() {
      return this.class_;
   }

   public rFd_1() {
   }

   public <T extends rLx_1> rFd_1(T var1, boolean var2, double var3, double var5, double var7, float var9, float var10, float var11, float var12, int var13) {
      this.finally_ = var1;
      this.implements_ = var2;
      this.class_ = var3;
      this.break_ = var5;
      this.byte_ = var7;
      this.protected_ = var9;
      this.throws_ = var10;
      this.case_ = var11;
      this.catch_ = var12;
      this.private_ = var13;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      Object var2 = rVL.switch_.class_(var1.readInt());
      if (var2 == null) {
         var2 = rLQ.byte_;
      }

      this.implements_ = var1.readBoolean();
      this.class_ = var1.readDouble();
      this.break_ = var1.readDouble();
      this.byte_ = var1.readDouble();
      this.protected_ = var1.readFloat();
      this.throws_ = var1.readFloat();
      this.case_ = var1.readFloat();
      this.catch_ = var1.readFloat();
      this.private_ = var1.readInt();
      this.finally_ = this.class_(var1, (rLz_1<rLx_1>)var2);
   }

   private <T extends rLx_1> T class_(ruu_3 var1, rLz_1<T> var2) {
      return (T)var2.case_().break_(var2, var1);
   }

   public boolean break_() {
      return this.implements_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeInt(rVL.switch_.class_(this.finally_.protected_()));
      var1.writeBoolean(this.implements_);
      var1.writeDouble(this.class_);
      var1.writeDouble(this.break_);
      var1.writeDouble(this.byte_);
      var1.writeFloat(this.protected_);
      var1.writeFloat(this.throws_);
      var1.writeFloat(this.case_);
      var1.writeFloat(this.catch_);
      var1.writeInt(this.private_);
      this.finally_.class_(var1);
   }

   public double throws_() {
      return this.byte_;
   }

   public int finally_() {
      return this.private_;
   }

   public float catch_() {
      return this.throws_;
   }

   public rLx_1 extends_() {
      return this.finally_;
   }

   public float case_() {
      return this.protected_;
   }

   public float implements_() {
      return this.catch_;
   }

   public double protected_() {
      return this.break_;
   }

   public float private_() {
      return this.case_;
   }
}
