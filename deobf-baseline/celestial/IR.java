package celestial;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class IR implements IJ {
   protected final List<wK_2> id_class;
   protected final Map<rpr_3, List<wK_2>> id_break;
   protected final boolean id_byte;
   protected final boolean id_protected;
   protected final boolean id_throws;
   protected final fj_3 id_case;
   protected final Ik_1 id_catch;
   protected final IF id_private;

   @Override
   public boolean id_byte() {
      return this.id_throws;
   }

   public IR(List<wK_2> var1, Map<rpr_3, List<wK_2>> var2, boolean var3, boolean var4, boolean var5, fj_3 var6, Ik_1 var7, IF var8) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
      this.id_protected = var5;
      this.id_throws = var4;
      this.id_case = var6;
      this.id_catch = var7;
      this.id_private = var8;
   }

   @Override
   public List<wK_2> id_class(xc_3 var1, rpr_3 var2, Random var3) {
      return var2 == null ? this.id_class : this.id_break.get(var2);
   }

   @Override
   public boolean id_class() {
      return this.id_byte;
   }

   @Override
   public boolean id_break() {
      return this.id_protected;
   }

   @Override
   public fj_3 id_throws() {
      return this.id_case;
   }

   @Override
   public IF id_catch() {
      return this.id_private;
   }

   @Override
   public Ik_1 id_case() {
      return this.id_catch;
   }

   @Override
   public boolean id_protected() {
      return false;
   }
}
