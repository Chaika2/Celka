package celestial;

import java.util.ArrayList;

public class rrWh_1 {
   private ArrayList class_ = null;
   private int break_ = 0;
   private float byte_ = 1.0F;
   private int protected_ = 0;

   public boolean byte_() {
      return this.class_.isEmpty();
   }

   public rrWh_1() {
      this(10, 0.75F);
   }

   public rrWh_1(int var1, float var2) {
      this.class_ = new ArrayList(var1);
      this.break_ = var1;
      this.byte_ = var2;
   }

   public rrWh_1(int var1) {
      this(var1, 0.75F);
   }

   public void class_() {
      this.class_.clear();
      this.protected_ = 0;
   }

   public Object class_(int var1) {
      Object var2 = this.class_.remove(var1);
      if (var2 != null) {
         this.protected_--;
      }

      return var2;
   }

   public void class_(int var1, Object var2) {
      if (var2 != null) {
         this.protected_++;
      }

      this.class_.add(var1, var2);
   }

   public boolean class_(Object var1) {
      if (var1 != null) {
         this.protected_++;
      }

      return this.class_.add(var1);
   }

   public boolean break_(Object var1) {
      return this.class_.contains(var1);
   }

   public Object break_(int var1) {
      return this.class_.get(var1);
   }

   public void break_() {
      if (this.protected_ <= 0 && this.class_.size() <= 0) {
         this.class_();
      } else if (this.class_.size() > this.break_) {
         float var1 = (float)this.protected_ * 1.0F / (float)this.class_.size();
         if (!(var1 > this.byte_)) {
            int var2 = 0;

            for (int var3 = 0; var3 < this.class_.size(); var3++) {
               Object var4 = this.class_.get(var3);
               if (var4 != null) {
                  if (var3 != var2) {
                     this.class_.set(var2, var4);
                  }

                  var2++;
               }
            }

            for (int var5 = this.class_.size() - 1; var5 >= var2; var5--) {
               this.class_.remove(var5);
            }
         }
      }
   }

   public Object break_(int var1, Object var2) {
      Object var3 = this.class_.set(var1, var2);
      if (var2 != var3) {
         if (var3 == null) {
            this.protected_++;
         }

         if (var2 == null) {
            this.protected_--;
         }
      }

      return var3;
   }

   public int throws_() {
      return this.protected_;
   }

   public int protected_() {
      return this.class_.size();
   }
}
