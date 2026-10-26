package celestial;

import java.util.EnumSet;

public class rBK extends rBk_1 {
   private final rBk_1 class_;
   private final int break_;
   private boolean byte_;

   @Override
   public void byte_() {
      if (!this.byte_) {
         this.byte_ = true;
         this.class_.byte_();
      }
   }

   public rBK(int var1, rBk_1 var2) {
      this.break_ = var1;
      this.class_ = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return var1 != null && this.getClass() == var1.getClass() ? this.class_.equals(((rBK)var1).class_) : false;
      }
   }

   @Override
   public int hashCode() {
      return this.class_.hashCode();
   }

   @Override
   public void class_(EnumSet<rBW> var1) {
      this.class_.class_(var1);
   }

   public boolean class_(rBK var1) {
      return this.J_() && var1.private_() < this.private_();
   }

   @Override
   public boolean class_() {
      return this.class_.class_();
   }

   @Override
   public boolean break_() {
      return this.class_.break_();
   }

   @Override
   public void throws_() {
      this.class_.throws_();
   }

   public rBk_1 finally_() {
      return this.class_;
   }

   public boolean catch_() {
      return this.byte_;
   }

   @Override
   public EnumSet<rBW> implements_() {
      return this.class_.implements_();
   }

   @Override
   public void protected_() {
      if (this.byte_) {
         this.byte_ = false;
         this.class_.protected_();
      }
   }

   public int private_() {
      return this.break_;
   }

   @Override
   public boolean J_() {
      return this.class_.J_();
   }
}
