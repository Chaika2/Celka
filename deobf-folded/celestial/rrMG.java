package celestial;

import java.util.UUID;

public class rrMG implements rrbD_2 {
   private an_3 id_class;

   @Override
   public rYG id_byte() {
      return this.id_class.BQ().id_class;
   }

   public void id_class(an_3 var1) {
      this.id_class = var1;
   }

   @Override
   public int id_class() {
      UUID var1 = this.id_class.ro();
      long var2 = var1.getLeastSignificantBits();
      return (int)(var2 & 2147483647L);
   }

   @Override
   public rfH_2 id_break() {
      return this.id_class.BQ().id_break;
   }

   @Override
   public int id_throws() {
      return !(this.id_class instanceof iB_2 var1) ? 0 : (int)var1.Ss();
   }

   public an_3 id_catch() {
      return this.id_class;
   }

   @Override
   public int id_case() {
      return !(this.id_class instanceof iB_2 var1) ? 0 : (int)var1.SK();
   }

   @Override
   public String id_protected() {
      return this.id_class.Bk() ? this.id_class.rD().getString() : null;
   }
}
