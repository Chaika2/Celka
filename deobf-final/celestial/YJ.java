package celestial;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class YJ {
   private final String class_;
   private final Object2IntMap<YO> break_;
   private final YO[] byte_;

   public int byte_(rcZ_2 var1) {
      List var2 = Collections.singletonList(var1);

      for (int var3 = 0; var3 < this.byte_.length - 1; var3++) {
         var2 = this.byte_[var3].class_(var2);
      }

      YO var4 = this.byte_[this.byte_.length - 1];
      return class_(var2, var4::class_);
   }

   public YJ(String var1, YO[] var2, Object2IntMap<YO> var3) {
      this.class_ = var1;
      this.byte_ = var2;
      this.break_ = var3;
   }

   @Override
   public String toString() {
      return this.class_;
   }

   private CommandSyntaxException class_(YO var1) {
      int var2 = this.break_.getInt(var1);
      return YE.break_.create(this.class_.substring(0, var2));
   }

   public List<rcZ_2> class_(rcZ_2 var1) throws CommandSyntaxException {
      List var2 = Collections.singletonList(var1);

      for (YO var6 : this.byte_) {
         var2 = var6.class_(var2);
         if (var2.isEmpty()) {
            throw this.class_(var6);
         }
      }

      return var2;
   }

   public List<rcZ_2> class_(rcZ_2 var1, Supplier<rcZ_2> var2) throws CommandSyntaxException {
      List var3 = this.protected_(var1);
      YO var4 = this.byte_[this.byte_.length - 1];
      return var4.class_(var3, var2);
   }

   private static int class_(List<rcZ_2> var0, Function<rcZ_2, Integer> var1) {
      return var0.stream().<Integer>map(var1).reduce(0, (var0x, var1x) -> var0x + var1x);
   }

   public int break_(rcZ_2 var1, Supplier<rcZ_2> var2) throws CommandSyntaxException {
      List var3 = this.protected_(var1);
      YO var4 = this.byte_[this.byte_.length - 1];
      return class_(var3, var2x -> var4.class_(var2x, var2));
   }

   public int break_(rcZ_2 var1) {
      List var2 = Collections.singletonList(var1);

      for (YO var6 : this.byte_) {
         var2 = var6.class_(var2);
         if (var2.isEmpty()) {
            return 0;
         }
      }

      return var2.size();
   }

   private List<rcZ_2> protected_(rcZ_2 var1) throws CommandSyntaxException {
      List var2 = Collections.singletonList(var1);

      for (int var3 = 0; var3 < this.byte_.length - 1; var3++) {
         YO var4 = this.byte_[var3];
         int var5 = var3 + 1;
         var2 = var4.class_(var2, this.byte_[var5]::class_);
         if (var2.isEmpty()) {
            throw this.class_(var4);
         }
      }

      return var2;
   }
}
