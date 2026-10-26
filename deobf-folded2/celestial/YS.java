package celestial;

import com.mojang.brigadier.exceptions.CommandSyntaxException;

public class YS {
   private final int id_class;
   private final int id_break;
   private final Rn_1 id_byte;

   public YS(int var1, int var2, Rn_1 var3) {
      this.id_class = var1;
      this.id_break = var2;
      this.id_byte = var3;
   }

   public rgP_2 id_class(gy_3 var1) throws CommandSyntaxException {
      return Rn_1.id_class(this.id_byte.id_break(var1));
   }

   public int id_class() {
      return this.id_class;
   }

   public int id_break() {
      return this.id_break;
   }
}
