package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class rgQ_2 extends rgZ_2 implements rgr_3 {
   private static final Logger byte_ = LogManager.getLogger();
   private final String protected_;
   private final Rn_1 throws_;

   public rgQ_2(String var1) {
      this.protected_ = var1;
      Rn_1 var2 = null;

      try {
         RC var3 = new RC(new StringReader(var1));
         var2 = var3.super_();
      } catch (CommandSyntaxException var4) {
         byte_.warn("Invalid selector component: {}", var1, var4.getMessage());
      }

      this.throws_ = var2;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rgQ_2 var2) ? false : this.protected_.equals(var2.protected_) && super.equals(var1);
      }
   }

   @Override
   public String toString() {
      return "SelectorComponent{pattern='" + this.protected_ + "', siblings=" + this.case_ + ", style=" + this.class_() + "}";
   }

   @Override
   public rVi_1 class_(gy_3 var1, an_3 var2, int var3) throws CommandSyntaxException {
      return (rVi_1)(var1 != null && this.throws_ != null ? Rn_1.class_(this.throws_.break_(var1)) : new rgN_2(""));
   }

   @Override
   public String break_() {
      return this.protected_;
   }

   public rgQ_2 implements_() {
      return new rgQ_2(this.protected_);
   }

   public String private_() {
      return this.protected_;
   }
}
