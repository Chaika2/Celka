package celestial;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class IO implements IJ {
   private final Ik_1 id_class;
   private final IF id_break;
   private final fj_3 id_byte;
   private final boolean id_protected;

   @Override
   public boolean id_byte() {
      return this.id_protected;
   }

   public IO(Ik_1 var1, IF var2, fj_3 var3, boolean var4) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var4;
   }

   @Override
   public List<wK_2> id_class(xc_3 var1, rpr_3 var2, Random var3) {
      return Collections.emptyList();
   }

   @Override
   public boolean id_class() {
      return false;
   }

   @Override
   public boolean id_break() {
      return true;
   }

   @Override
   public fj_3 id_throws() {
      return this.id_byte;
   }

   @Override
   public IF id_catch() {
      return this.id_break;
   }

   @Override
   public Ik_1 id_case() {
      return this.id_class;
   }

   @Override
   public boolean id_protected() {
      return true;
   }
}
