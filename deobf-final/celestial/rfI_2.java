package celestial;

public class rfI_2 implements rfD_2 {
   private final rfH_2 class_;
   private final rjU_2 break_;

   public rfI_2(rfH_2 var1) {
      this.class_ = var1;
      this.break_ = rjU_2.class_((rja_3)var1);
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.class_ + ", centerPosition=" + this.break_ + "}";
   }

   @Override
   public rjU_2 class_() {
      return this.break_;
   }

   @Override
   public boolean class_(iB_2 var1) {
      return true;
   }

   @Override
   public rfH_2 break_() {
      return this.class_;
   }
}
