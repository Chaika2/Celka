package celestial;

import java.io.IOException;
import java.util.UUID;

public class rFh_1 implements ruS_2<At_1> {
   private int class_;
   private UUID break_;
   private int byte_;
   private double protected_;
   private double throws_;
   private double case_;
   private int catch_;
   private int private_;
   private int implements_;
   private byte finally_;
   private byte extends_;
   private byte native_;

   public UUID byte_() {
      return this.break_;
   }

   public rFh_1() {
   }

   public rFh_1(iB_2 var1) {
      this.class_ = var1.V();
      this.break_ = var1.ro();
      this.byte_ = rVL.transient_.class_(var1.BC());
      this.protected_ = var1.rx();
      this.throws_ = var1.re();
      this.case_ = var1.BO();
      this.finally_ = (byte)((int)((Float)var1.throws_[15] * 256.0F / 360.0F));
      this.extends_ = (byte)((int)((Float)var1.throws_[16] * 256.0F / 360.0F));
      this.native_ = (byte)((int)((Float)var1.private_[25] * 256.0F / 360.0F));
      double var2 = 3.9;
      rjU_2 var4 = var1.rv();
      double var5 = rfU_2.class_(var4.break_, -3.9, 3.9);
      double var7 = rfU_2.class_(var4.byte_, -3.9, 3.9);
      double var9 = rfU_2.class_(var4.protected_, -3.9, 3.9);
      this.catch_ = (int)(var5 * 8000.0);
      this.private_ = (int)(var7 * 8000.0);
      this.implements_ = (int)(var9 * 8000.0);
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
      this.break_ = var1.private_();
      this.byte_ = var1.case_();
      this.protected_ = var1.readDouble();
      this.throws_ = var1.readDouble();
      this.case_ = var1.readDouble();
      this.finally_ = var1.readByte();
      this.extends_ = var1.readByte();
      this.native_ = var1.readByte();
      this.catch_ = var1.readShort();
      this.private_ = var1.readShort();
      this.implements_ = var1.readShort();
   }

   public int break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      var1.class_(this.break_);
      var1.protected_(this.byte_);
      var1.writeDouble(this.protected_);
      var1.writeDouble(this.throws_);
      var1.writeDouble(this.case_);
      var1.writeByte(this.finally_);
      var1.writeByte(this.extends_);
      var1.writeByte(this.native_);
      var1.writeShort(this.catch_);
      var1.writeShort(this.private_);
      var1.writeShort(this.implements_);
   }

   public double throws_() {
      return this.protected_;
   }

   public int finally_() {
      return this.implements_;
   }

   public double catch_() {
      return this.case_;
   }

   public byte extends_() {
      return this.finally_;
   }

   public double case_() {
      return this.throws_;
   }

   public int implements_() {
      return this.private_;
   }

   public int protected_() {
      return this.byte_;
   }

   public int private_() {
      return this.catch_;
   }

   public byte volatile_() {
      return this.native_;
   }

   public byte native_() {
      return this.extends_;
   }
}
