package celestial;

public class rfI_2 implements rfD_2 {
   private final rfH_2 id_class;
   private final rjU_2 id_break;

   public rfI_2(rfH_2 var1) {
      this.id_class = var1;
      this.id_break = rjU_2.id_class((rja_3)var1);
   }

   @Override
   public String toString() {
      return "BlockPosTracker{blockPos=" + this.id_class + ", centerPosition=" + this.id_break + "}";
   }

   @Override
   public rjU_2 id_class() {
      return this.id_break;
   }

   @Override
   public boolean id_class(iB_2 var1) {
      return true;
   }

   @Override
   public rfH_2 id_break() {
      return this.id_class;
   }
}
