package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rgQ_2 extends rgZ_2 implements rgr_3 {
   private static final Logger id_byte = LogManager.getLogger();
   private final String id_protected;
   private final Rn_1 id_throws;

   public rgQ_2(String var1) {
      this.id_protected = var1;
      Rn_1 var2 = null;

      try {
         RC var3 = new RC(new StringReader(var1));
         var2 = var3.id_super();
      } catch (CommandSyntaxException var4) {
         id_byte.warn("Invalid selector component: {}", var1, var4.getMessage());
      }

      this.id_throws = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rgQ_2 var2) ? false : this.id_protected.equals(var2.id_protected) && super.equals(var1);
      }
   }

   @Override
   public String toString() {
      return "SelectorComponent{pattern='" + this.id_protected + "', siblings=" + this.id_case + ", style=" + this.id_class() + "}";
   }

   @Override
   public rVi_1 id_class(gy_3 var1, an_3 var2, int var3) throws CommandSyntaxException {
      return (rVi_1)(var1 != null && this.id_throws != null ? Rn_1.id_class(this.id_throws.id_break(var1)) : new rgN_2(""));
   }

   @Override
   public String id_break() {
      return this.id_protected;
   }

   public rgQ_2 id_implements() {
      return new rgQ_2(this.id_protected);
   }

   public String id_private() {
      return this.id_protected;
   }
}
