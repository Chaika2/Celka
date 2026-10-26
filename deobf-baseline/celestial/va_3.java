package celestial;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Supplier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class va_3 extends LV<vi_3> {
   static final Logger id_throws = LogManager.getLogger();
   static final DateFormat id_case = new SimpleDateFormat();
   static final rqO_2 id_catch = new rqO_2("textures/misc/unknown_server.png");
   public static final rqO_2 id_class = new rqO_2("textures/gui/world_selection.png");
   static final rgP_2 id_private = new rgn_3("selectWorld.tooltip.fromNewerVersion1").id_class(rgF_2.RED);
   static final rgP_2 id_implements = new rgn_3("selectWorld.tooltip.fromNewerVersion2").id_class(rgF_2.RED);
   static final rgP_2 id_finally = new rgn_3("selectWorld.tooltip.snapshot1").id_class(rgF_2.GOLD);
   static final rgP_2 id_extends = new rgn_3("selectWorld.tooltip.snapshot2").id_class(rgF_2.GOLD);
   static final rgP_2 id_return = new rgn_3("selectWorld.locked").id_class(rgF_2.RED);
   private final Fr_1 id_public;
   private List<rrGm_1> id_goto;

   public va_3(Fr_1 var1, QY var2, int var3, int var4, int var5, int var6, int var7, Supplier<String> var8, va_3 var9) {
      super(var2, var3, var4, var5, var6, var7);
      this.id_public = var1;
      if (var9 != null) {
         this.id_goto = var9.id_goto;
      }

      this.id_class(var8, false);
   }

   public void id_class(Supplier<String> var1, boolean var2) {
      this.id_native();
      rrGd_1 var3 = this.id_native.M();
      if (this.id_goto == null || var2) {
         try {
            this.id_goto = var3.id_class();
         } catch (QA var7) {
            id_throws.error("Couldn't load level list", var7);
            this.id_native.id_break(new ZC(new rgn_3("selectWorld.unable_to_load"), new rgN_2(var7.getMessage())));
            return;
         }

         Collections.sort(this.id_goto);
      }

      if (this.id_goto.isEmpty()) {
         this.id_native.id_break(mo_3.id_class((vm_3)null));
      } else {
         String var4 = ((String)var1.get()).toLowerCase(Locale.ROOT);

         for (rrGm_1 var6 : this.id_goto) {
            if (var6.id_break().toLowerCase(Locale.ROOT).contains(var4) || var6.id_class().toLowerCase(Locale.ROOT).contains(var4)) {
               this.id_break(new vi_3(this, this, var6));
            }
         }
      }
   }

   public void id_class(vi_3 var1) {
      super.id_class(var1);
      this.id_public.id_byte(var1 != null && !var1.id_protected.id_final());
   }

   @Override
   protected void id_class(Lw_1 var1) {
      this.id_class(var1, var0 -> !var0.id_protected.id_final());
   }

   @Override
   protected boolean id_class() {
      return this.id_public.id_catch() == this;
   }

   public Fr_1 id_implements() {
      return this.id_public;
   }

   @Override
   protected int id_protected() {
      return super.id_protected() + 20;
   }

   public Optional<vi_3> id_private() {
      return Optional.ofNullable(this.id_finally());
   }

   @Override
   public int F_() {
      return super.F_() + 50;
   }
}
