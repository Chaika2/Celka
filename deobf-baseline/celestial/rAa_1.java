package celestial;

import java.util.Comparator;

public class rAa_1 {
   public static final Comparator<rAa_1> id_class = (var0, var1) -> {
      if (var0.id_break() > var1.id_break()) {
         return 1;
      } else {
         return var0.id_break() < var1.id_break() ? -1 : var1.id_throws().compareToIgnoreCase(var0.id_throws());
      }
   };
   private final rns_3 id_break;
   private final rnP_2 id_byte;
   private final String id_protected;
   private int id_throws;
   private boolean id_case;
   private boolean id_catch;

   public void id_byte() {
      this.id_break(0);
   }

   public rAa_1(rns_3 var1, rnP_2 var2, String var3) {
      this.id_break = var1;
      this.id_byte = var2;
      this.id_protected = var3;
      this.id_case = true;
      this.id_catch = true;
   }

   public void id_class(int var1) {
      if (this.id_byte.id_byte().id_break()) {
         throw new IllegalStateException("Cannot modify read-only score");
      } else {
         this.id_break(this.id_break() + var1);
      }
   }

   public void id_class() {
      this.id_class(1);
   }

   public void id_class(boolean var1) {
      this.id_case = var1;
   }

   public int id_break() {
      return this.id_throws;
   }

   public void id_break(int var1) {
      int var2 = this.id_throws;
      this.id_throws = var1;
      if (var2 != var1 || this.id_catch) {
         this.id_catch = false;
         this.id_case().id_class(this);
      }
   }

   public String id_throws() {
      return this.id_protected;
   }

   public boolean id_catch() {
      return this.id_case;
   }

   public rns_3 id_case() {
      return this.id_break;
   }

   public rnP_2 id_protected() {
      return this.id_byte;
   }
}
