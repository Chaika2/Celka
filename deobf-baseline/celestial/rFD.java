package celestial;

import java.util.UUID;

public class rFD implements gV_2 {
   private static final rgN_2 id_class = new rgN_2("Rcon");
   private final StringBuffer id_break = new StringBuffer();
   private final rnW_2 id_protected;

   public gy_3 id_byte() {
      rrEm_1 var1 = this.id_protected.id_abstract();
      return new gy_3(this, rjU_2.id_byte(var1.X()), rjK_2.id_class, var1, 4, "Rcon", id_class, this.id_protected, (an_3)null);
   }

   public rFD(rnW_2 var1) {
      this.id_protected = var1;
   }

   @Override
   public boolean C() {
      return true;
   }

   @Override
   public boolean l() {
      return true;
   }

   @Override
   public void id_class(rgP_2 var1, UUID var2) {
      this.id_break.append(var1.getString());
   }

   public void id_class() {
      this.id_break.setLength(0);
   }

   public String id_break() {
      return this.id_break.toString();
   }

   @Override
   public boolean H() {
      return this.id_protected.id_super();
   }
}
