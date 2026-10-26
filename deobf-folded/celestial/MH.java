package celestial;

public final class MH {
   final rjV_2 id_class;
   final rjj_3 id_break;

   MH(rjV_2 var1, rjj_3 var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   @Override
   public String toString() {
      return this.id_class.toString() + this.id_break.toString();
   }

   public rjV_2 id_class() {
      return this.id_class;
   }

   public rjj_3 id_break() {
      return this.id_break;
   }
}
