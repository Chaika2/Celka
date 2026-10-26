package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;

public class rgk_3 extends rgx_3 {
   private final String catch_;
   private final Rn_1 private_;

   private rgk_3(String var1, YJ var2, boolean var3, String var4, Rn_1 var5) {
      super(var1, var2, var3);
      this.catch_ = var4;
      this.private_ = var5;
   }

   public rgk_3(String var1, boolean var2, String var3) {
      super(var1, var2);
      this.catch_ = var3;
      this.private_ = class_(var3);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rgk_3 var2)
            ? false
            : Objects.equals(this.catch_, var2.catch_) && Objects.equals(this.protected_, var2.protected_) && super.equals(var1);
      }
   }

   @Override
   public String toString() {
      return "EntityNbtComponent{selector='" + this.catch_ + "'path='" + this.protected_ + "', siblings=" + this.case_ + ", style=" + this.class_() + "}";
   }

   @Override
   protected Stream<rcd_3> class_(gy_3 var1) throws CommandSyntaxException {
      if (this.private_ != null) {
         List var2 = this.private_.break_(var1);
         return var2.stream().map(XC::break_);
      } else {
         return Stream.empty();
      }
   }

   private static Rn_1 class_(String var0) {
      try {
         RC var1 = new RC(new StringReader(var0));
         return var1.super_();
      } catch (CommandSyntaxException var2) {
         return null;
      }
   }

   public String extends_() {
      return this.catch_;
   }

   public rgk_3 native_() {
      return new rgk_3(this.protected_, this.throws_, this.byte_, this.catch_, this.private_);
   }
}
