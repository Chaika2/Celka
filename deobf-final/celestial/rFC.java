package celestial;

import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;

public class rFC implements ruS_2<At_1> {
   private int class_;
   private int break_;
   private int byte_;
   private int protected_;
   private int throws_;
   private int case_;
   private List<byte[]> catch_;
   private List<byte[]> private_;
   private boolean implements_;

   public int byte_() {
      return this.break_;
   }

   public rFC() {
   }

   public rFC(rfj_3 var1, rrse_3 var2, int var3, int var4, boolean var5) {
      this.class_ = var1.break_;
      this.break_ = var1.byte_;
      this.implements_ = var5;
      this.byte_ = var3;
      this.protected_ = var4;
      this.catch_ = Lists.newArrayList();
      this.private_ = Lists.newArrayList();

      for (int var6 = 0; var6 < 18; var6++) {
         if ((this.byte_ & 1 << var6) != 0) {
            roH_2 var7 = var2.class_(rRo_1.SKY).class_(rjh_3.class_(var1, -1 + var6));
            if (var7 != null && !var7.byte_()) {
               this.catch_.add((byte[])var7.class_().clone());
            } else {
               this.byte_ &= ~(1 << var6);
               if (var7 != null) {
                  this.throws_ |= 1 << var6;
               }
            }
         }

         if ((this.protected_ & 1 << var6) != 0) {
            roH_2 var8 = var2.class_(rRo_1.BLOCK).class_(rjh_3.class_(var1, -1 + var6));
            if (var8 != null && !var8.byte_()) {
               this.private_.add((byte[])var8.class_().clone());
            } else {
               this.protected_ &= ~(1 << var6);
               if (var8 != null) {
                  this.case_ |= 1 << var6;
               }
            }
         }
      }
   }

   public rFC(rfj_3 var1, rrse_3 var2, boolean var3) {
      this.class_ = var1.break_;
      this.break_ = var1.byte_;
      this.implements_ = var3;
      this.catch_ = Lists.newArrayList();
      this.private_ = Lists.newArrayList();

      for (int var4 = 0; var4 < 18; var4++) {
         roH_2 var5 = var2.class_(rRo_1.SKY).class_(rjh_3.class_(var1, -1 + var4));
         roH_2 var6 = var2.class_(rRo_1.BLOCK).class_(rjh_3.class_(var1, -1 + var4));
         if (var5 != null) {
            if (var5.byte_()) {
               this.throws_ |= 1 << var4;
            } else {
               this.byte_ |= 1 << var4;
               this.catch_.add((byte[])var5.class_().clone());
            }
         }

         if (var6 != null) {
            if (var6.byte_()) {
               this.case_ |= 1 << var4;
            } else {
               this.protected_ |= 1 << var4;
               this.private_.add((byte[])var6.class_().clone());
            }
         }
      }
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
      this.break_ = var1.case_();
      this.implements_ = var1.readBoolean();
      this.byte_ = var1.case_();
      this.protected_ = var1.case_();
      this.throws_ = var1.case_();
      this.case_ = var1.case_();
      this.catch_ = Lists.newArrayList();

      for (int var2 = 0; var2 < 18; var2++) {
         if ((this.byte_ & 1 << var2) != 0) {
            this.catch_.add(var1.break_(2048));
         }
      }

      this.private_ = Lists.newArrayList();

      for (int var3 = 0; var3 < 18; var3++) {
         if ((this.protected_ & 1 << var3) != 0) {
            this.private_.add(var1.break_(2048));
         }
      }
   }

   public int break_() {
      return this.class_;
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      var1.protected_(this.break_);
      var1.writeBoolean(this.implements_);
      var1.protected_(this.byte_);
      var1.protected_(this.protected_);
      var1.protected_(this.throws_);
      var1.protected_(this.case_);

      for (byte[] var3 : this.catch_) {
         var1.class_(var3);
      }

      for (byte[] var5 : this.private_) {
         var1.class_(var5);
      }
   }

   public int throws_() {
      return this.throws_;
   }

   public boolean finally_() {
      return this.implements_;
   }

   public int catch_() {
      return this.protected_;
   }

   public List<byte[]> case_() {
      return this.catch_;
   }

   public List<byte[]> implements_() {
      return this.private_;
   }

   public int protected_() {
      return this.byte_;
   }

   public int private_() {
      return this.case_;
   }
}
