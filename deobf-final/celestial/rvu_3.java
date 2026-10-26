package celestial;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;

public class rvu_3 implements ruS_2<At_1> {
   private double class_;
   private double break_;
   private double byte_;
   private float protected_;
   private List<rfH_2> throws_;
   private float case_;
   private float catch_;
   private float private_;

   public float byte_() {
      return this.catch_;
   }

   public void byte_(float var1) {
      this.private_ = var1;
   }

   public rvu_3() {
   }

   public rvu_3(double var1, double var3, double var5, float var7, List<rfH_2> var8, rjU_2 var9) {
      this.class_ = var1;
      this.break_ = var3;
      this.byte_ = var5;
      this.protected_ = var7;
      this.throws_ = Lists.newArrayList(var8);
      if (var9 != null) {
         this.case_ = (float)var9.break_;
         this.catch_ = (float)var9.byte_;
         this.private_ = (float)var9.protected_;
      }
   }

   public void class_(float var1) {
      this.case_ = var1;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = (double)var1.readFloat();
      this.break_ = (double)var1.readFloat();
      this.byte_ = (double)var1.readFloat();
      this.protected_ = var1.readFloat();
      int var2 = var1.readInt();
      this.throws_ = Lists.newArrayListWithCapacity(var2);
      int var3 = rfU_2.byte_(this.class_);
      int var4 = rfU_2.byte_(this.break_);
      int var5 = rfU_2.byte_(this.byte_);

      for (int var6 = 0; var6 < var2; var6++) {
         int var7 = var1.readByte() + var3;
         int var8 = var1.readByte() + var4;
         int var9 = var1.readByte() + var5;
         this.throws_.add(new rfH_2(var7, var8, var9));
      }

      this.case_ = var1.readFloat();
      this.catch_ = var1.readFloat();
      this.private_ = var1.readFloat();
   }

   public void break_(float var1) {
      this.catch_ = var1;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.writeFloat((float)this.class_);
      var1.writeFloat((float)this.break_);
      var1.writeFloat((float)this.byte_);
      var1.writeFloat(this.protected_);
      var1.writeInt(this.throws_.size());
      int var2 = rfU_2.byte_(this.class_);
      int var3 = rfU_2.byte_(this.break_);
      int var4 = rfU_2.byte_(this.byte_);

      for (rfH_2 var6 : this.throws_) {
         int var7 = var6.b_() - var2;
         int var8 = var6.c_() - var3;
         int var9 = var6.d_() - var4;
         var1.writeByte(var7);
         var1.writeByte(var8);
         var1.writeByte(var9);
      }

      var1.writeFloat(this.case_);
      var1.writeFloat(this.catch_);
      var1.writeFloat(this.private_);
   }

   public float break_() {
      return this.case_;
   }

   public double throws_() {
      return this.class_;
   }

   public double catch_() {
      return this.byte_;
   }

   public double case_() {
      return this.break_;
   }

   public List<rfH_2> implements_() {
      return this.throws_;
   }

   public float protected_() {
      return this.private_;
   }

   public float private_() {
      return this.protected_;
   }
}
