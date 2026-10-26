package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;

public class rgz_3 extends rgZ_2 implements rgr_3 {
   private final String id_byte;
   private final Rn_1 id_protected;
   private final String id_throws;

   private rgz_3(String var1, Rn_1 var2, String var3) {
      this.id_byte = var1;
      this.id_protected = var2;
      this.id_throws = var3;
   }

   public rgz_3(String var1, String var2) {
      this(var1, id_class(var1), var2);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rgz_3 var2) ? false : this.id_byte.equals(var2.id_byte) && this.id_throws.equals(var2.id_throws) && super.equals(var1);
      }
   }

   @Override
   public String toString() {
      return "ScoreComponent{name='" + this.id_byte + "'objective='" + this.id_throws + "', siblings=" + this.id_case + ", style=" + this.id_class() + "}";
   }

   @Override
   public rVi_1 id_class(gy_3 var1, an_3 var2, int var3) throws CommandSyntaxException {
      if (var1 == null) {
         return new rgN_2("");
      } else {
         String var4 = this.id_class(var1);
         String var5 = var2 != null && var4.equals("*") ? var2.i() : var4;
         return new rgN_2(this.id_class(var5, var1));
      }
   }

   private String id_class(String var1, gy_3 var2) {
      rnW_2 var3 = var2.id_super();
      if (var3 != null) {
         rnG_2 var4 = var3.R();
         rnP_2 var5 = var4.id_byte(this.id_throws);
         if (var4.id_class(var1, var5)) {
            rAa_1 var6 = var4.id_break(var1, var5);
            return Integer.toString(var6.id_break());
         }
      }

      return "";
   }

   private String id_class(gy_3 var1) throws CommandSyntaxException {
      if (this.id_protected != null) {
         List var2 = this.id_protected.id_break(var1);
         if (!var2.isEmpty()) {
            if (var2.size() != 1) {
               throw RZ.id_class.create();
            }

            return ((an_3)var2.get(0)).i();
         }
      }

      return this.id_byte;
   }

   private static Rn_1 id_class(String var0) {
      try {
         return new RC(new StringReader(var0)).id_super();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   public rgz_3 id_extends() {
      return new rgz_3(this.id_byte, this.id_protected, this.id_throws);
   }

   public String id_implements() {
      return this.id_throws;
   }

   public String id_private() {
      return this.id_byte;
   }
}
