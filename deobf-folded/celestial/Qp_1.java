package celestial;

import java.io.File;

public class Qp_1 {
   public final File id_class;
   public final File id_break;
   public final File id_byte;
   public final String id_protected;

   public Qp_1(File var1, File var2, File var3, String var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   public jo_3 id_class() {
      return (jo_3)(this.id_protected == null ? new jT_2(this.id_byte) : new jo_3(this.id_byte, this.id_protected));
   }
}
