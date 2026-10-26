package celestial;

public class rrWm_1<E> {
   private E[] class_;
   private int break_;

   public rrWm_1(int var1) {
      this.class_ = (E[])(new Object[var1]);
   }

   public int class_() {
      return this.break_;
   }

   public E class_(int var1) {
      return this.class_[var1];
   }

   public void class_(E var1) {
      this.class_[this.break_] = (E)var1;
      this.break_++;
   }

   public void break_() {
      this.break_ = 0;
   }
}
