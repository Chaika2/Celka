package celestial;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class YJ {
   private final String id_class;
   private final Object2IntMap<YO> id_break;
   private final YO[] id_byte;

   public int id_byte(rcZ_2 var1) {
      List var2 = Collections.singletonList(var1);

      for (int var3 = 0; var3 < this.id_byte.length - 1; var3++) {
         var2 = this.id_byte[var3].id_class(var2);
      }

      YO var4 = this.id_byte[this.id_byte.length - 1];
      return id_class(var2, var4::id_class);
   }

   public YJ(String var1, YO[] var2, Object2IntMap<YO> var3) {
      this.id_class = var1;
      this.id_byte = var2;
      this.id_break = var3;
   }

   @Override
   public String toString() {
      return this.id_class;
   }

   private CommandSyntaxException id_class(YO var1) {
      int var2 = this.id_break.getInt(var1);
      return YE.id_break.create(this.id_class.substring(0, var2));
   }

   public List<rcZ_2> id_class(rcZ_2 var1) throws CommandSyntaxException {
      List var2 = Collections.singletonList(var1);

      for (YO var6 : this.id_byte) {
         var2 = var6.id_class(var2);
         if (var2.isEmpty()) {
            throw this.id_class(var6);
         }
      }

      return var2;
   }

   public List<rcZ_2> id_class(rcZ_2 var1, Supplier<rcZ_2> var2) throws CommandSyntaxException {
      List var3 = this.id_protected(var1);
      YO var4 = this.id_byte[this.id_byte.length - 1];
      return var4.id_class(var3, var2);
   }

   private static int id_class(List<rcZ_2> var0, Function<rcZ_2, Integer> var1) {
      return var0.stream().<Integer>map(var1).reduce(0, (var0x, var1x) -> var0x + var1x);
   }

   public int id_break(rcZ_2 var1, Supplier<rcZ_2> var2) throws CommandSyntaxException {
      List var3 = this.id_protected(var1);
      YO var4 = this.id_byte[this.id_byte.length - 1];
      return id_class(var3, var2x -> var4.id_class(var2x, var2));
   }

   public int id_break(rcZ_2 var1) {
      List var2 = Collections.singletonList(var1);

      for (YO var6 : this.id_byte) {
         var2 = var6.id_class(var2);
         if (var2.isEmpty()) {
            return 0;
         }
      }

      return var2.size();
   }

   private List<rcZ_2> id_protected(rcZ_2 var1) throws CommandSyntaxException {
      List var2 = Collections.singletonList(var1);

      for (int var3 = 0; var3 < this.id_byte.length - 1; var3++) {
         YO var4 = this.id_byte[var3];
         int var5 = var3 + 1;
         var2 = var4.id_class(var2, this.id_byte[var5]::id_class);
         if (var2.isEmpty()) {
            throw this.id_class(var4);
         }
      }

      return var2;
   }
}
