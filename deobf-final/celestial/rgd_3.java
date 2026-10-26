package celestial;

import com.mojang.brigadier.StringReader;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import java.util.Objects;
import java.util.stream.Stream;

public class rgd_3 extends rgx_3 {
   private final String catch_;
   private final Rf_1 private_;

   private rgd_3(String var1, YJ var2, boolean var3, String var4, Rf_1 var5) {
      super(var1, var2, var3);
      this.catch_ = var4;
      this.private_ = var5;
   }

   public rgd_3(String var1, boolean var2, String var3) {
      super(var1, var2);
      this.catch_ = var3;
      this.private_ = this.class_(this.catch_);
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else {
         return !(var1 instanceof rgd_3 var2)
            ? false
            : Objects.equals(this.catch_, var2.catch_) && Objects.equals(this.protected_, var2.protected_) && super.equals(var1);
      }
   }

   @Override
   public String toString() {
      return "BlockPosArgument{pos='" + this.catch_ + "'path='" + this.protected_ + "', siblings=" + this.case_ + ", style=" + this.class_() + "}";
   }

   @Override
   protected Stream<rcd_3> class_(gy_3 var1) {
      if (this.private_ != null) {
         rrEm_1 var2 = var1.final_();
         rfH_2 var3 = this.private_.byte_(var1);
         if (var2.synchronized_(var3)) {
            ryO_2 var4 = var2.class_(var3);
            if (var4 != null) {
               return Stream.of(var4.class_(new rcd_3()));
            }
         }
      }

      return Stream.empty();
   }

   private Rf_1 class_(String var1) {
      try {
         return RM.class_().class_(new StringReader(var1));
      } catch (CommandSyntaxException var3) {
         return null;
      }
   }

   public String extends_() {
      return this.catch_;
   }

   public rgd_3 native_() {
      return new rgd_3(this.protected_, this.throws_, this.byte_, this.catch_, this.private_);
   }
}
