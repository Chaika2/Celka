package celestial;

import com.google.common.collect.Lists;
import com.mojang.brigadier.context.StringRange;
import com.mojang.brigadier.suggestion.Suggestion;
import com.mojang.brigadier.suggestion.Suggestions;
import java.io.IOException;
import java.util.ArrayList;

public class rFQ implements ruS_2<At_1> {
   private int class_;
   private Suggestions break_;

   public Suggestions byte_() {
      return this.break_;
   }

   public rFQ() {
   }

   public rFQ(int var1, Suggestions var2) {
      this.class_ = var1;
      this.break_ = var2;
   }

   public void class_(At_1 var1) {
      var1.class_(this);
   }

   @Override
   public void class_(ruu_3 var1) throws IOException {
      this.class_ = var1.case_();
      int var2 = var1.case_();
      int var3 = var1.case_();
      StringRange var4 = StringRange.between(var2, var2 + var3);
      int var5 = var1.case_();
      ArrayList var6 = Lists.newArrayListWithCapacity(var5);

      for (int var7 = 0; var7 < var5; var7++) {
         String var8 = var1.throws_(32767);
         rgP_2 var9 = var1.readBoolean() ? var1.throws_() : null;
         var6.add(new Suggestion(var4, var8, var9));
      }

      this.break_ = new Suggestions(var4, var6);
   }

   @Override
   public void break_(ruu_3 var1) throws IOException {
      var1.protected_(this.class_);
      var1.protected_(this.break_.getRange().getStart());
      var1.protected_(this.break_.getRange().getLength());
      var1.protected_(this.break_.getList().size());

      for (Suggestion var3 : this.break_.getList()) {
         var1.class_(var3.getText());
         var1.writeBoolean(var3.getTooltip() != null);
         if (var3.getTooltip() != null) {
            var1.class_(rgv_3.class_(var3.getTooltip()));
         }
      }
   }

   public int break_() {
      return this.class_;
   }
}
