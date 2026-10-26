package celestial;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;

public class rrxH_2 {
   private HU class_ = null;
   private int break_ = MT.new_();
   private int byte_ = 4096;
   private int protected_ = 0;
   private int throws_;
   private rrWR<rrxl_3> case_ = new rrWR<>();
   private rrxl_3 catch_ = null;
   private IntBuffer private_ = rrbb_3.break_(this.byte_);
   private IntBuffer implements_ = rrbb_3.break_(this.byte_);
   private final int finally_ = ju_3.private_.break_();
   private int extends_ = 7;
   private boolean native_ = rrbb_3.rs();

   private void byte_(int var1) {
      int var2 = this.byte_ * 6 / 4;

      while (var2 < var1) {
         var2 = var2 * 6 / 4;
      }

      long var3 = this.protected_(this.byte_);
      long var5 = this.protected_(var2);
      int var7 = MT.new_();
      MT.catch_(MT.catch_, var7);
      MT.class_(MT.catch_, var5, MT.private_);
      rrbb_3.catch_("Expand VBO");
      MT.catch_(MT.catch_, 0);
      MT.catch_(MT.throws_, this.break_);
      MT.catch_(MT.case_, var7);
      MT.class_(MT.throws_, MT.case_, 0L, 0L, var3);
      rrbb_3.catch_("Copy VBO: " + var5);
      MT.catch_(MT.throws_, 0);
      MT.catch_(MT.case_, 0);
      MT.finally_(this.break_);
      this.private_ = rrbb_3.break_(var2);
      this.implements_ = rrbb_3.break_(var2);
      this.break_ = var7;
      this.byte_ = var2;
   }

   public void byte_() {
      MT.catch_(MT.catch_, 0);
   }

   public rrxH_2(HU var1) {
      this.class_ = var1;
      this.class_();
      long var2 = this.protected_(this.byte_);
      MT.class_(MT.catch_, var2, MT.private_);
      this.byte_();
   }

   private int class_(long var1) {
      return (int)(var1 / (long)this.finally_);
   }

   public void class_() {
      MT.catch_(MT.catch_, this.break_);
   }

   public void class_(int var1, rrxl_3 var2) {
      if (this.extends_ != var1) {
         if (this.private_.position() > 0) {
            throw new IllegalArgumentException("Mixed region draw modes: " + this.extends_ + " != " + var1);
         }

         this.extends_ = var1;
      }

      this.private_.put(var2.class_());
      this.implements_.put(var2.break_());
   }

   public void class_(ByteBuffer var1, rrxl_3 var2) {
      if (this.break_ >= 0) {
         int var3 = var2.class_();
         int var4 = var2.break_();
         int var5 = this.class_((long)var1.limit());
         if (var5 <= 0) {
            if (var3 >= 0) {
               var2.class_(-1);
               var2.break_(0);
               this.case_.byte_(var2.protected_());
               this.throws_ -= var4;
            }
         } else {
            if (var5 > var4) {
               var2.class_(this.protected_);
               var2.break_(var5);
               this.protected_ += var5;
               if (var3 >= 0) {
                  this.case_.byte_(var2.protected_());
               }

               this.case_.break_(var2.protected_());
            }

            var2.break_(var5);
            this.throws_ += var5 - var4;
            this.break_(var2.byte_());
            long var6 = this.protected_(var2.class_());
            this.class_();
            MT.class_(MT.catch_, var6, var1);
            this.byte_();
            if (this.protected_ > this.throws_ * 11 / 10) {
               this.class_(1);
            }
         }
      }
   }

   private void class_(int var1) {
      if (!this.case_.throws_()) {
         rrxl_3 var2 = this.catch_;
         if (var2 == null || !this.case_.protected_(var2.protected_())) {
            var2 = this.case_.break_().class_();
         }

         int var3 = var2.class_();
         rrxl_3 var4 = var2.throws_();
         if (var4 == null) {
            var3 = 0;
         } else {
            var3 = var4.byte_();
         }

         int var5 = 0;

         while (var2 != null && var5 < var1) {
            var5++;
            if (var2.class_() == var3) {
               var3 += var2.break_();
               var2 = var2.case_();
            } else {
               int var6 = var2.class_() - var3;
               if (var2.break_() <= var6) {
                  this.class_(var2.class_(), var3, var2.break_());
                  var2.class_(var3);
                  var3 += var2.break_();
                  var2 = var2.case_();
               } else {
                  this.break_(this.protected_ + var2.break_());
                  this.class_(var2.class_(), this.protected_, var2.break_());
                  var2.class_(this.protected_);
                  this.protected_ = this.protected_ + var2.break_();
                  rrxl_3 var7 = var2.case_();
                  this.case_.byte_(var2.protected_());
                  this.case_.break_(var2.protected_());
                  var2 = var7;
               }
            }
         }

         if (var2 == null) {
            this.protected_ = this.case_.byte_().class_().byte_();
         }

         this.catch_ = var2;
      }
   }

   private void class_(int var1, int var2, int var3) {
      long var4 = this.protected_(var1);
      long var6 = this.protected_(var2);
      long var8 = this.protected_(var3);
      MT.catch_(MT.throws_, this.break_);
      MT.catch_(MT.case_, this.break_);
      MT.class_(MT.throws_, MT.case_, var4, var6, var8);
      rrbb_3.catch_("Copy VBO range");
      MT.catch_(MT.throws_, 0);
      MT.catch_(MT.case_, 0);
   }

   private void break_(int var1) {
      if (this.byte_ < var1) {
         this.byte_(var1);
      }
   }

   public void break_() {
      this.class_();
      ju_3.private_.class_(0L);
      if (this.native_) {
         rrdL.package_();
      }

      ((Buffer)this.private_).flip();
      ((Buffer)this.implements_).flip();
      MT.class_(this.extends_, this.private_, this.implements_);
      ((Buffer)this.private_).limit(this.private_.capacity());
      ((Buffer)this.implements_).limit(this.implements_.capacity());
      if (this.protected_ > this.throws_ * 11 / 10) {
         this.class_(1);
      }
   }

   public int throws_() {
      return this.protected_;
   }

   private void case_() {
      int var1 = 0;
      int var2 = 0;

      for (rrxl_3 var3 = this.case_.break_().class_(); var3 != null; var3 = var3.case_()) {
         var1++;
         var2 += var3.break_();
         if (var3.class_() < 0 || var3.break_() <= 0 || var3.byte_() > this.protected_) {
            throw new RuntimeException("Invalid range: " + var3);
         }

         rrxl_3 var4 = var3.throws_();
         if (var4 != null && var3.class_() < var4.byte_()) {
            throw new RuntimeException("Invalid range: " + var3);
         }

         rrxl_3 var5 = var3.case_();
         if (var5 != null && var3.byte_() > var5.class_()) {
            throw new RuntimeException("Invalid range: " + var3);
         }
      }

      if (var1 != this.case_.protected_()) {
         throw new RuntimeException("Invalid count: " + var1 + " <> " + this.case_.protected_());
      } else if (var2 != this.throws_) {
         throw new RuntimeException("Invalid size: " + var2 + " <> " + this.throws_);
      }
   }

   private long protected_(int var1) {
      return (long)var1 * (long)this.finally_;
   }

   public void protected_() {
      if (this.break_ >= 0) {
         MT.finally_(this.break_);
         this.break_ = -1;
      }
   }
}
