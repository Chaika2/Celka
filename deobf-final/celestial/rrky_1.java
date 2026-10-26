package celestial;

import java.util.Arrays;
import org.lwjgl.opengl.ARBShaderObjects;

public abstract class rrky_1 {
   private String class_;
   private int break_ = 0;
   private int[] byte_ = new int[]{-1};
   private static final int protected_ = -1;
   private static final int throws_ = Integer.MIN_VALUE;

   public String byte_() {
      return this.class_;
   }

   public void byte_(int var1) {
      if (this.break_ != var1) {
         this.break_ = var1;
         this.class_();
         this.class_(var1);
      }
   }

   public rrky_1(String var1) {
      this.class_ = var1;
   }

   @Override
   public String toString() {
      return this.class_;
   }

   private void class_() {
      if (this.break_ >= this.byte_.length) {
         int[] var1 = new int[this.break_ * 2];
         Arrays.fill(var1, Integer.MIN_VALUE);
         System.arraycopy(this.byte_, 0, var1, 0, this.byte_.length);
         this.byte_ = var1;
      }
   }

   protected abstract void class_(int var1);

   protected abstract void break_();

   public int throws_() {
      if (this.break_ <= 0) {
         return -1;
      } else {
         int var1 = this.byte_[this.break_];
         if (var1 == Integer.MIN_VALUE) {
            var1 = ARBShaderObjects.glGetUniformLocationARB(this.break_, this.class_);
            this.byte_[this.break_] = var1;
         }

         return var1;
      }
   }

   protected static final void finally_() {
      rrdZ.rP();
   }

   public void catch_() {
      this.byte_[this.break_] = -1;
   }

   public boolean case_() {
      return this.throws_() >= 0;
   }

   protected void implements_() {
      if (rrdZ.catch_(this.class_) != 0) {
         this.catch_();
      }
   }

   public int protected_() {
      return this.break_;
   }

   public void private_() {
      this.break_ = 0;
      this.byte_ = new int[]{-1};
      this.break_();
   }
}
