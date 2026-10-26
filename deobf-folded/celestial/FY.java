package celestial;

import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

public class FY extends Lf_1<Fo_1> {
   private final Fe_1 id_class;
   private final QY id_throws;
   private final List<Fo_1> id_case = Lists.newArrayList();
   private String id_catch;

   public FY(Fe_1 var1, QY var2, int var3, int var4, int var5, int var6, int var7) {
      super(var2, var3, var4, var5, var6, var7);
      this.id_class = var1;
      this.id_throws = var2;
      this.id_protected(false);
      this.id_throws(false);
   }

   public void id_class(Aw_1 var1, Lr_1 var2) {
      UUID var3 = var1.id_class().getId();

      for (Fo_1 var5 : this.id_case) {
         if (var5.id_break().equals(var3)) {
            var5.id_byte(false);
            return;
         }
      }

      if ((var2 == Lr_1.ALL || this.id_throws.id_volatile().id_byte(var3))
         && (Strings.isNullOrEmpty(this.id_catch) || var1.id_class().getName().toLowerCase(Locale.ROOT).contains(this.id_catch))) {
         Fo_1 var6 = new Fo_1(this.id_throws, this.id_class, var1.id_class().getId(), var1.id_class().getName(), var1::id_case);
         this.id_break(var6);
         this.id_case.add(var6);
      }
   }

   public void id_class(UUID var1) {
      for (Fo_1 var3 : this.id_case) {
         if (var3.id_break().equals(var1)) {
            var3.id_byte(true);
            return;
         }
      }
   }

   @Override
   public void id_class(Ml_1 var1, int var2, int var3, float var4) {
      double var5 = this.id_throws.id_else().id_return();
      RenderSystem.enableScissor(
         (int)((double)this.id_continue() * var5),
         (int)((double)(this.id_package - this.id_new) * var5),
         (int)((double)(this.id_protected() + 6) * var5),
         (int)((double)(this.id_package - (this.id_package - this.id_new) - this.id_int - 4) * var5)
      );
      super.id_class(var1, var2, var3, var4);
      RenderSystem.disableScissor();
   }

   public void id_class(Collection<UUID> var1, double var2) {
      this.id_case.clear();

      for (UUID var5 : var1) {
         Aw_1 var6 = ((Aq_1)((cb_3)this.id_throws.id_class[57]).id_break[0]).id_class(var5);
         if (var6 != null) {
            this.id_case.add(new Fo_1(this.id_throws, this.id_class, var6.id_class().getId(), var6.id_class().getName(), var6::id_case));
         }
      }

      this.id_implements();
      this.id_case.sort((var0, var1x) -> var0.id_class().compareToIgnoreCase(var1x.id_class()));
      this.id_class(this.id_case);
      this.id_class(var2);
   }

   public void id_class(String var1) {
      this.id_catch = var1;
   }

   private void id_implements() {
      if (this.id_catch != null) {
         this.id_case.removeIf(var1 -> !var1.id_class().toLowerCase(Locale.ROOT).contains(this.id_catch));
         this.id_class(this.id_case);
      }
   }

   public boolean id_private() {
      return this.id_case.isEmpty();
   }
}
