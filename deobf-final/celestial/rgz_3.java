package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;

public class rgz_3 extends rgZ_2 implements rgr_3 {
   private final String byte_;
   private final Rn_1 protected_;
   private final String throws_;

   private rgz_3(String var1, Rn_1 var2, String var3) {
      this.byte_ = var1;
      this.protected_ = var2;
      this.throws_ = var3;
   }

   public rgz_3(String var1, String var2) {
      this(var1, class_(var1), var2);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rgz_3 var2) ? false : this.byte_.equals(var2.byte_) && this.throws_.equals(var2.throws_) && super.equals(var1);
      }
   }

   @Override
   public String toString() {
      return "ScoreComponent{name='" + this.byte_ + "'objective='" + this.throws_ + "', siblings=" + this.case_ + ", style=" + this.class_() + "}";
   }

   @Override
   public rVi_1 class_(gy_3 var1, an_3 var2, int var3) throws CommandSyntaxException {
      if (var1 == null) {
         return new rgN_2("");
      } else {
         String var4 = this.class_(var1);
         String var5 = var2 != null && var4.equals("*") ? var2.i() : var4;
         return new rgN_2(this.class_(var5, var1));
      }
   }

   private String class_(String var1, gy_3 var2) {
      rnW_2 var3 = var2.super_();
      if (var3 != null) {
         rnG_2 var4 = var3.R();
         rnP_2 var5 = var4.byte_(this.throws_);
         if (var4.class_(var1, var5)) {
            rAa_1 var6 = var4.break_(var1, var5);
            return Integer.toString(var6.break_());
         }
      }

      return "";
   }

   private String class_(gy_3 var1) throws CommandSyntaxException {
      if (this.protected_ != null) {
         List var2 = this.protected_.break_(var1);
         if (!var2.isEmpty()) {
            if (var2.size() != 1) {
               throw RZ.class_.create();
            }

            return ((an_3)var2.get(0)).i();
         }
      }

      return this.byte_;
   }

   private static Rn_1 class_(String var0) {
      try {
         return new RC(new StringReader(var0)).super_();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   public rgz_3 extends_() {
      return new rgz_3(this.byte_, this.protected_, this.throws_);
   }

   public String implements_() {
      return this.throws_;
   }

   public String private_() {
      return this.byte_;
   }
}
