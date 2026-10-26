package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.io.IOException;
import java.util.ArrayList;

public class rFQ implements ruS_2<At_1> {
   private int id_class;
   private Suggestions id_break;

   public Suggestions id_byte() {
      return this.id_break;
   }

   public rFQ() {
   }

   public rFQ(int var1, Suggestions var2) {
      this.id_class = var1;
      this.id_break = var2;
   }

   public void id_class(At_1 var1) {
      var1.id_class(this);
   }

   @Override
   public void id_class(ruu_3 var1) throws IOException {
      this.id_class = var1.id_case();
      int var2 = var1.id_case();
      int var3 = var1.id_case();
      StringRange var4 = StringRange.between(var2, var2 + var3);
      int var5 = var1.id_case();
      ArrayList var6 = Lists.newArrayListWithCapacity(var5);

      for (int var7 = 0; var7 < var5; var7++) {
         String var8 = var1.id_throws(32767);
         rgP_2 var9 = var1.readBoolean() ? var1.id_throws() : null;
         var6.add(new Suggestion(var4, var8, var9));
      }

      this.id_break = new Suggestions(var4, var6);
   }

   @Override
   public void id_break(ruu_3 var1) throws IOException {
      var1.id_protected(this.id_class);
      var1.id_protected(this.id_break.getRange().getStart());
      var1.id_protected(this.id_break.getRange().getLength());
      var1.id_protected(this.id_break.getList().size());

      for (Suggestion var3 : this.id_break.getList()) {
         var1.id_class(var3.getText());
         var1.writeBoolean(var3.getTooltip() != null);
         if (var3.getTooltip() != null) {
            var1.id_class(rgv_3.id_class(var3.getTooltip()));
         }
      }
   }

   public int id_break() {
      return this.id_class;
   }
}
