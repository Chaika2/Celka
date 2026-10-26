package celestial;

import java.io.IOException;
import java.util.Collection;

public class rvF_2 implements ruS_2<At_1> {
   private int class_;
   private byte break_;
   private boolean byte_;
   private boolean protected_;
   private rrGO[] throws_;
   private int case_;
   private int catch_;
   private int private_;
   private int implements_;
   private byte[] finally_;

   public rvF_2() {
   }

   public rvF_2(int var1, byte var2, boolean var3, boolean var4, Collection<rrGO> var5, byte[] var6, int var7, int var8, int var9, int var10) {
      this.class_ = var1;
      this.break_ = var2;
      this.byte_ = var3;
      this.protected_ = var4;
      this.throws_ = var5.toArray(new rrGO[var5.size()]);
      this.case_ = var7;
      this.catch_ = var8;
      this.private_ = var9;
      this.implements_ = var10;
      this.finally_ = new byte[var9 * var10];

      for (int var11 = 0; var11 < var9; var11++) {
         for (int var12 = 0; var12 < var10; var12++) {
            this.finally_[var11 + var12 * var9] = var6[var7 + var11 + (var8 + var12) * 128];
         }
      }
   }

   public void class_(rrGb_1 var1) {
      var1.case_ = this.break_;
      var1.protected_ = this.byte_;
      var1.private_ = this.protected_;
      var1.finally_.clear();

      for (int var2 = 0; var2 < this.throws_.length; var2++) {
         rrGO var3 = this.throws_[var2];
         var1.finally_.put("icon-" + var2, var3);
      }

      for (int var4 = 0; var4 < this.private_; var4++) {
         for (int var5 = 0; var5 < this.implements_; var5++) {
            var1.catch_[this.case_ + var4 + (this.catch_ + var5) * 128] = this.finally_[var4 + var5 * this.private_];
         }
      }
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
      this.break_ = var1.readByte();
      this.byte_ = var1.readBoolean();
      this.protected_ = var1.readBoolean();
      this.throws_ = new rrGO[var1.case_()];

      for (int var2 = 0; var2 < this.throws_.length; var2++) {
         rrGh_1 var3 = var1.class_(rrGh_1.class);
         this.throws_[var2] = new rrGO(var3, var1.readByte(), var1.readByte(), (byte)(var1.readByte() & 15), var1.readBoolean() ? var1.throws_() : null);
      }

      this.private_ = var1.readUnsignedByte();
      if (this.private_ > 0) {
         this.implements_ = var1.readUnsignedByte();
         this.case_ = var1.readUnsignedByte();
         this.catch_ = var1.readUnsignedByte();
         this.finally_ = var1.class_();
      }
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      var1.writeByte(this.break_);
      var1.writeBoolean(this.byte_);
      var1.writeBoolean(this.protected_);
      var1.protected_(this.throws_.length);

      for (rrGO var5 : this.throws_) {
         var1.class_(var5.break_());
         var1.writeByte(var5.byte_());
         var1.writeByte(var5.protected_());
         var1.writeByte(var5.throws_() & 15);
         if (var5.catch_() != null) {
            var1.writeBoolean(true);
            var1.class_(var5.catch_());
         } else {
            var1.writeBoolean(false);
         }
      }

      var1.writeByte(this.private_);
      if (this.private_ > 0) {
         var1.writeByte(this.implements_);
         var1.writeByte(this.case_);
         var1.writeByte(this.catch_);
         var1.class_(this.finally_);
      }
   }

   public int break_() {
      return this.class_;
   }
}
