package celestial;

import java.io.IOException;
import java.util.UUID;

public class rFJ implements ruS_2<At_1> {
   private int class_;
   private UUID break_;
   private double byte_;
   private double protected_;
   private double throws_;
   private int case_;
   private int catch_;
   private int private_;
   private int implements_;
   private int finally_;
   private aI_2<?> extends_;
   private int native_;

   public UUID byte_() {
      return this.break_;
   }

   public rFJ(an_3 var1, aI_2<?> var2, int var3, rfH_2 var4) {
      this(
         var1.V(), var1.ro(), (double)var4.b_(), (double)var4.c_(), (double)var4.d_(), (Float)var1.throws_[16], (Float)var1.throws_[15], var2, var3, var1.rv()
      );
   }

   public rFJ(an_3 var1, int var2) {
      this(var1.V(), var1.ro(), var1.rx(), var1.re(), var1.BO(), (Float)var1.throws_[16], (Float)var1.throws_[15], var1.BC(), var2, var1.rv());
   }

   public rFJ() {
   }

   public rFJ(int var1, UUID var2, double var3, double var5, double var7, float var9, float var10, aI_2<?> var11, int var12, rjU_2 var13) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var5;
      this.throws_ = var7;
      this.implements_ = rfU_2.protected_(var9 * 256.0F / 360.0F);
      this.finally_ = rfU_2.protected_(var10 * 256.0F / 360.0F);
      this.extends_ = var11;
      this.native_ = var12;
      this.case_ = (int)(rfU_2.class_(var13.break_, -3.9, 3.9) * 8000.0);
      this.catch_ = (int)(rfU_2.class_(var13.byte_, -3.9, 3.9) * 8000.0);
      this.private_ = (int)(rfU_2.class_(var13.protected_, -3.9, 3.9) * 8000.0);
   }

   public rFJ(an_3 var1) {
      this(var1, 0);
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
      this.break_ = var1.private_();
      this.extends_ = rVL.transient_.class_(var1.case_());
      this.byte_ = var1.readDouble();
      this.protected_ = var1.readDouble();
      this.throws_ = var1.readDouble();
      this.implements_ = var1.readByte();
      this.finally_ = var1.readByte();
      this.native_ = var1.readInt();
      this.case_ = var1.readShort();
      this.catch_ = var1.readShort();
      this.private_ = var1.readShort();
   }

   public int break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      var1.class_(this.break_);
      var1.protected_(rVL.transient_.class_(this.extends_));
      var1.writeDouble(this.byte_);
      var1.writeDouble(this.protected_);
      var1.writeDouble(this.throws_);
      var1.writeByte(this.implements_);
      var1.writeByte(this.finally_);
      var1.writeInt(this.native_);
      var1.writeShort(this.case_);
      var1.writeShort(this.catch_);
      var1.writeShort(this.private_);
   }

   public double throws_() {
      return this.protected_;
   }

   public int finally_() {
      return this.implements_;
   }

   public double catch_() {
      return (double)this.case_ / 8000.0;
   }

   public int extends_() {
      return this.finally_;
   }

   public double case_() {
      return this.throws_;
   }

   public double implements_() {
      return (double)this.private_ / 8000.0;
   }

   public double protected_() {
      return this.byte_;
   }

   public double private_() {
      return (double)this.catch_ / 8000.0;
   }

   public int volatile_() {
      return this.native_;
   }

   public aI_2<?> native_() {
      return this.extends_;
   }
}
