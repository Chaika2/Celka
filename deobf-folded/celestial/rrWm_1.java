package celestial;

public class rrWm_1<E> {
   private E[] id_class;
   private int id_break;

   public rrWm_1(int var1) {
      this.id_class = (E[])(new Object[var1]);
   }

   public int id_class() {
      return this.id_break;
   }

   public E id_class(int var1) {
      return this.id_class[var1];
   }

   public void id_class(E var1) {
      this.id_class[this.id_break] = (E)var1;
      this.id_break++;
   }

   public void id_break() {
      this.id_break = 0;
   }
}
